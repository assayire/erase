import ConfigUpdate._

class ClientConfigRepo() extends ConfigUpdateExecutor[ClientConfig, ClientConfigUpdate[ClientConfig]] {


  /**
    * // FIXME: overriding method upsert in trait ConfigUpdateExecutor of 
    * type (config: ClientConfig) Int; method upsert has incompatible type
    */
  protected override def upsert(config: ClientConfig): Unit = {
    println(s"Upserting client config: $config")
  }
}

class ClientParentConfigRepo() extends ConfigUpdateExecutor[ClientParentConfig, ClientParentConfigUpdate[ClientParentConfig]] {

  /**
    * // FIXME: overriding method upsert in trait ConfigUpdateExecutor of 
    * type (config: ClientConfig) Int; method upsert has incompatible type
    */
  protected override def upsert(config: ClientParentConfig): Unit = {
    println(s"Upserting client parent config: $config")
  }
}
