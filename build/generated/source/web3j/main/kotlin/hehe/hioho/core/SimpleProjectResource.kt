package hehe.hioho.core

import hehe.hioho.core.helloworld.HelloWorldLifecycle
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.web3j.openapi.core.SubResource

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface SimpleProjectResource : SubResource {

    @get:Path("helloworld")
    val helloWorld: HelloWorldLifecycle
}
