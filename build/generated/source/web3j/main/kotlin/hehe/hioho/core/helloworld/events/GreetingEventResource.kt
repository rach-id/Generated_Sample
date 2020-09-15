package hehe.hioho.core.helloworld.events

import hehe.hioho.core.helloworld.model.GreetingEventResponse
import io.swagger.v3.oas.annotations.Operation
import java.util.concurrent.CompletableFuture
import javax.annotation.Generated
import javax.ws.rs.POST
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.web3j.openapi.core.EventResource

@Generated
interface GreetingEventResource : EventResource<GreetingEventResponse> {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
        tags = ["HelloWorld Events"],
        summary = "Get the Greeting event"
    )
    override fun findBy(transactionReceiptModel: org.web3j.openapi.core.models.TransactionReceiptModel):
    List<GreetingEventResponse>

    override fun onEvent(onEvent: (GreetingEventResponse) -> Unit): CompletableFuture<Void> =
        CompletableFuture.completedFuture(null)
}
