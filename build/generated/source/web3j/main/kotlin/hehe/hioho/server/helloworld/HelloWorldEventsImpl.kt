package hehe.hioho.server.helloworld

import hehe.hioho.core.helloworld.HelloWorldEvents
import hehe.hioho.server.helloworld.eventsImpl.GreetingEventResourceImpl
import hehe.hioho.wrappers.HelloWorld
import javax.annotation.Generated
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.server.SubResourceImpl

@Generated
class HelloWorldEventsImpl(
    private val helloWorld: HelloWorld,
    uriInfo: ExtendedUriInfo
) : HelloWorldEvents, SubResourceImpl(uriInfo) {

    override val greetingEvents: GreetingEventResourceImpl = GreetingEventResourceImpl(helloWorld)
}
