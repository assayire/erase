sealed abstract class Config(val code: String)

final case class ClientConfig(
  override val code: String,
  token: Int
) extends Config(code)

final case class ClientParentConfig(
  override val code: String,
  isProxy: Boolean,
  parentCode: String
) extends Config(code)
