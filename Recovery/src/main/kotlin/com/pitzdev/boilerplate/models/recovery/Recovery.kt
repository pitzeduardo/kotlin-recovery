package com.pitzdev.boilerplate.models.recovery

import javax.persistence.*
import com.pitzdev.boilerplate.models.base.BaseEntity
import com.pitzdev.boilerplate.models.debtor.Debtor
import java.math.BigDecimal
import java.util.*

@Entity
data class Recovery(
        @ManyToOne
        val debtor: Debtor,

        var value: BigDecimal,

        var originDate: Date,

        var description: String) : BaseEntity()