package com.example.schema

import net.corda.core.schemas.MappedSchema
import net.corda.core.schemas.PersistentState
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

object IOUSchema

object IOUSchemaV1 : MappedSchema(
        schemaFamily = IOUSchema.javaClass,
        version = 1,
        mappedTypes = listOf(PersistentIOU::class.java)) {
    @Entity
    @Table(name = "purchase_order_states")
    class PersistentIOU(
            @Column(name = "sender_name")
            var senderName: String,

            @Column(name = "recipient_name")
            var recipientName: String,

            @Column(name = "delivery_date")
            var value: Int
    ) : PersistentState()
}