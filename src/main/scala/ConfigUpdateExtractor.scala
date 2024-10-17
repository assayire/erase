import ConfigUpdate._

trait ConfigUpdateExecutor[U <: ConfigUpdate, C <: Config] {
  def executeUpdate(update: U): Unit = {
    update match {
      // FIXME: abstract type C in type pattern ConfigUpdate.Upsert[C]
      // is unchecked since it is eliminated by erasure
      case u: Upsert[C] => upsert(u.config)
      case _ =>
        println(s"Unsupported update type: $update")
    }
  }

  protected def upsert(config: C): Int
}
