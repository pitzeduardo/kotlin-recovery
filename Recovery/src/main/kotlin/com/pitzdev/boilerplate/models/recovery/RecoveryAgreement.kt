package com.pitzdev.boilerplate.models.recovery

import com.pitzdev.boilerplate.enum.recovery.RecoveryAgreementStatus
import javax.persistence.*
import com.pitzdev.boilerplate.models.base.BaseEntity
import com.pitzdev.boilerplate.models.debtor.Debtor
import java.math.BigDecimal
import java.util.*

@Entity
data class RecoveryAgreement(

        @ManyToOne
        val debtor: Debtor,

        @ManyToOne
        val recovery: Recovery,

        var status: RecoveryAgreementStatus = RecoveryAgreementStatus.PENDING,

        var value: BigDecimal,

        var fee: BigDecimal,

        var monthlyTax: BigDecimal,

        var entry: BigDecimal,

        var entryDueDate: Date,

        var installmentCount: Int,

        var installmentFirstDueDate: Date,

        var observation: String) : BaseEntity()