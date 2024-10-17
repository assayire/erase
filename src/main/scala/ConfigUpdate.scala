sealed trait ConfigUpdate[C <: Config] {
  val code: String
}

object ConfigUpdate {
  sealed trait Upsert[C <: Config] extends ConfigUpdate[C] {
    val config: C
    override val code: String = config.code
  }

  sealed trait ClientConfigUpdate[C <: Config] extends ConfigUpdate[C]

  final case class ClientConfigUpsert(config: ClientConfig)
    extends ClientConfigUpdate[ClientConfig]
    with Upsert[ClientConfig]

  sealed trait ClientParentConfigUpdate[C <: Config] extends ConfigUpdate[C]

  final case class ClientParentConfigUpsert(config: ClientParentConfig)
      extends ClientParentConfigUpdate[ClientParentConfig]
      with Upsert[ClientParentConfig]
}
