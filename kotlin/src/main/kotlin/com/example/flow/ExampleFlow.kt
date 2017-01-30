package com.example.flow

import co.paralleluniverse.fibers.Suspendable
import net.corda.core.flows.FlowLogic

/**
 * Define your flow here.
 */
object ExampleFlow {
    /**
     * You can add a constructor to each FlowLogic subclass to pass objects into the flow.
     */
    class Initiator: FlowLogic<ExampleFlowResult>() {
        /**
         * Define the initiator's flow logic here.
         */
        @Suspendable
        override fun call(): ExampleFlowResult {
            return ExampleFlowResult.Failure("")
        }
    }

    class Acceptor : FlowLogic<ExampleFlowResult>() {
        /**
         * Define the acceptor's flow logic here.
         */
        @Suspendable
        override fun call(): ExampleFlowResult {
            return ExampleFlowResult.Failure("")
        }
    }
}

/**
 * Helper classes for returning results from flows.
 */
sealed class ExampleFlowResult {
    class Success(val message: String?): ExampleFlowResult() {
        override fun toString(): String = "Success($message)"
    }

    class Failure(val message: String?): ExampleFlowResult() {
        override fun toString(): String = "Failure($message)"
    }
}