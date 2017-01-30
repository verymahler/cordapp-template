package com.example.plugin

import com.esotericsoftware.kryo.Kryo
import com.example.api.ExampleApi
import com.example.flow.ExampleFlow
import com.example.flow.ExampleFlowResult
import com.example.service.ExampleService
import net.corda.core.messaging.CordaRPCOps
import net.corda.core.node.CordaPluginRegistry
import net.corda.core.node.PluginServiceHub
import java.util.function.Function

class ExamplePlugin : CordaPluginRegistry() {
    /** A list of classes that expose web APIs. */
    override val webApis: List<Function<CordaRPCOps, out Any>> = listOf(Function(::ExampleApi))

    /**
     * A list of flows required for this CorDapp.
     */
    override val requiredFlows: Map<String, Set<String>> = mapOf(
            ExampleFlow.Initiator::class.java.name to setOf()
    )
    /**
     * A list of long lived services to be hosted within the node.
     */
    override val servicePlugins: List<Function<PluginServiceHub, out Any>> = listOf(Function(ExampleService::Service))

    /** A list of directories in the resources directory that will be served by Jetty under /web */
    override val staticServeDirs: Map<String, String> = mapOf(
            // This will serve the exampleWeb directory in resources to /web/example
            "example" to javaClass.classLoader.getResource("exampleWeb").toExternalForm()
    )

    /**
     * Registering the required types with Kryo, Corda's serialisation framework.
     */
    override fun registerRPCKryoTypes(kryo: Kryo): Boolean {
        kryo.register(ExampleFlowResult.Success::class.java)
        kryo.register(ExampleFlowResult.Failure::class.java)
        return true
    }
}
