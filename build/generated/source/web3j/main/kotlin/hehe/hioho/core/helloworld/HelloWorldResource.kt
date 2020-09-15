package hehe.hioho.core.helloworld

import hehe.hioho.core.helloworld.model.SayItParameters
import io.swagger.v3.oas.annotations.Operation
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface HelloWorldResource {

    @get:Path("events")
    val events: HelloWorldEvents

    @GET
    @Path("Hello")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["HelloWorld Methods"], summary = "Execute the Hello method")
    fun hello(): org.web3j.openapi.core.models.ResultModel<kotlin.String>

    @POST
    @Path("SayIt")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["HelloWorld Methods"], summary = "Execute the SayIt method")
    fun sayIt(sayItParameters: SayItParameters): org.web3j.openapi.core.models.TransactionReceiptModel
}
