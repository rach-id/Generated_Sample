package hehe.hioho.server.helloworld.eventsImpl

import hehe.hioho.core.helloworld.events.GreetingEventResource
import hehe.hioho.core.helloworld.model.GreetingEventResponse
import hehe.hioho.wrappers.HelloWorld
import hehe.hioho.wrappers.HelloWorld.GREETING_EVENT
import javax.annotation.Generated
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.sse.Sse
import javax.ws.rs.sse.SseEventSink
import org.web3j.openapi.core.models.TransactionReceiptModel
import org.web3j.openapi.server.SseUtils
import org.web3j.protocol.core.methods.request.EthFilter

@Generated
class GreetingEventResourceImpl(
    private val helloWorld: HelloWorld
) : GreetingEventResource {

    override fun findBy(transactionReceiptModel: TransactionReceiptModel):
    List<GreetingEventResponse> {
        val eventResponse = helloWorld.getGreetingEvents(
            transactionReceiptModel.toTransactionReceipt()
        )
        return eventResponse.map { GreetingEventResponse(it.greet) }
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    fun subscribe(@Context eventSink: SseEventSink, @Context sse: Sse) {
        val flowable = helloWorld.greetingEventFlowable(EthFilter())
        val eventClass = HelloWorld.GreetingEventResponse::class.java
        SseUtils.subscribe(GREETING_EVENT, eventClass, flowable, eventSink, sse) {
            GreetingEventResponse(it.greet)
        }
    }
}
