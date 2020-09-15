package hehe.hioho.server

import hehe.hioho.core.SimpleProjectResource
import hehe.hioho.server.helloworld.HelloWorldLifecycleImpl
import javax.annotation.Generated
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.server.SubResourceImpl
import org.web3j.openapi.server.config.ContractAddresses
import org.web3j.protocol.Web3j
import org.web3j.tx.TransactionManager
import org.web3j.tx.gas.ContractGasProvider

@Generated
class SimpleProjectResourceImpl(
    web3j: Web3j,
    transactionManager: TransactionManager,
    defaultGasProvider: ContractGasProvider,
    contractAddresses: ContractAddresses,
    uriInfo: ExtendedUriInfo
) : SimpleProjectResource, SubResourceImpl(uriInfo) {

    override val helloWorld = HelloWorldLifecycleImpl(
        web3j,
        transactionManager,
        defaultGasProvider,
        contractAddresses["HelloWorld"],
        uriInfo
    )
}
