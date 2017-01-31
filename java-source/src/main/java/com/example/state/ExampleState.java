package com.example.state;

import com.example.contract.ExampleContract;
import net.corda.core.contracts.ContractState;
import net.corda.core.crypto.CompositeKey;

import java.util.Collections;
import java.util.List;

/**
 * Define your state object here.
 */
public class ExampleState implements ContractState {
    private final ExampleContract contract;

    public ExampleState(ExampleContract contract) { this.contract = contract; }

    @Override public ExampleContract getContract() { return contract; }

    /** The public keys of the involved parties. */
    @Override public List<CompositeKey> getParticipants() { return Collections.emptyList(); }
}