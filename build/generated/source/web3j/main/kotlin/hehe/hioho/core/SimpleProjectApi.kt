package hehe.hioho.core

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.tags.Tag
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.web3j.openapi.core.Web3jOpenApi

@Path("/SimpleProject")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@OpenAPIDefinition(
    info = Info(
        title = "Web3j OpenApi",
        version = "0.0.3.2",
        contact = Contact(
            name = "Web3 Labs",
            email = "hi@web3labs.com",
            url = "http://web3labs.com"
        )
    ),
    tags = [
        Tag(name = "default", description = "Lists existing contracts and events"),
        Tag(name = "HelloWorld Methods", description = "List HelloWorld method&#39;s calls"),
        Tag(name = "HelloWorld Events", description = "List HelloWorld event&#39;s calls")
    ]
)
@Generated
interface SimpleProjectApi : Web3jOpenApi {

    @get:Path("contracts")
    override val contracts: SimpleProjectResource
}
