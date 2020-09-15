package hehe.hioho.server

import javax.annotation.Generated
import org.web3j.openapi.server.spi.OpenApiResourceProvider

@Generated
class SimpleProjectResourceProvider : OpenApiResourceProvider {
    override fun get() = SimpleProjectApiImpl::class.java
}
