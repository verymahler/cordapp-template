package com.example.contract

import net.corda.core.contracts.Contract
import net.corda.core.contracts.TransactionForContract
import net.corda.core.crypto.SecureHash

/**
 * Define your contract here.
 */
open class ExampleContract : Contract {
    /**
     * The verify() function of the contract of each of the transaction's input and output states must not throw an
     * exception for a transaction to be considered valid.
     */
    override fun verify(tx: TransactionForContract) {
        return
    }

    /** A reference to the underlying legal contract template and associated parameters. */
    override val legalContractReference: SecureHash = SecureHash.sha256("Prose contract.")
}