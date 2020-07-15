package com.pitzdev.boilerplate.models.agreement

import com.pitzdev.boilerplate.models.base.BaseEntity
import com.pitzdev.boilerplate.models.debtor.Debtor
import com.pitzdev.boilerplate.models.recovery.Recovery

import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@Entity
data class Agreement(

        @ManyToOne
        val debtor: Debtor,

        @ManyToOne
        val recovery: Recovery,

        var value: BigDecimal,

        var entryValue: BigDecimal?,

        var originalValue: BigDecimal,

        var installmentCount: Int,

        var entryDueDate: Date?,

        var installmentDueDate: Date

) : BaseEntity()