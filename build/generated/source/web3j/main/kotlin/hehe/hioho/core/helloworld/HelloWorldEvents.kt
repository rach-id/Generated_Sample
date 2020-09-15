package hehe.hioho.core.helloworld

import hehe.hioho.core.helloworld.events.GreetingEventResource
import javax.annotation.Generated
import javax.ws.rs.Path
import org.web3j.openapi.core.SubResource

@Generated
interface HelloWorldEvents : SubResource {
    @get:Path("GreetingEvents")
    val greetingEvents: GreetingEventResource
}
