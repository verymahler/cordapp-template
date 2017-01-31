package com.example.state

import com.example.contract.ExampleContract
import net.corda.core.contracts.ContractState
import net.corda.core.crypto.CompositeKey

/**
 * Define your state object here.
 */
class ExampleState(override val contract: ExampleContract): ContractState {
    /** The public keys of the involved parties. */
    override val participants: List<CompositeKey>
        get() = listOf()
}