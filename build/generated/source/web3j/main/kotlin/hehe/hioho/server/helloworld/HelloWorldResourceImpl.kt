package hehe.hioho.server.helloworld

import hehe.hioho.core.helloworld.HelloWorldEvents
import hehe.hioho.core.helloworld.HelloWorldResource
import hehe.hioho.core.helloworld.model.SayItParameters
import hehe.hioho.wrappers.HelloWorld
import kotlin.String
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.core.models.ResultModel
import org.web3j.openapi.core.models.TransactionReceiptModel

class HelloWorldResourceImpl(
    private val helloWorld: HelloWorld,
    private val uriInfo: ExtendedUriInfo
) : HelloWorldResource {
    override val events: HelloWorldEvents = HelloWorldEventsImpl(helloWorld, uriInfo)

    override fun hello(): ResultModel<String> =
        org.web3j.openapi.core.models.ResultModel(helloWorld.hello().send())
    override fun sayIt(sayItParameters: SayItParameters): TransactionReceiptModel =
        TransactionReceiptModel(
            helloWorld.sayIt(
                sayItParameters.greeting
            ).send()
        )
}
