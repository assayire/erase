sealed trait ConfigUpdate {
  val code: String
}

object ConfigUpdate {
  sealed trait Upsert[C <: Config] extends ConfigUpdate {
    val config: C
    override val code: String = config.code
  }

  sealed trait ClientConfigUpdate extends ConfigUpdate

  final case class ClientConfigUpsert(config: ClientConfig)
      extends ClientConfigUpdate
      with Upsert[ClientConfig]

  sealed trait ClientParentConfigUpdate extends ConfigUpdate

  final case class ClientParentConfigUpsert(config: ClientParentConfig)
      extends ClientParentConfigUpdate
      with Upsert[ClientParentConfig]
}
