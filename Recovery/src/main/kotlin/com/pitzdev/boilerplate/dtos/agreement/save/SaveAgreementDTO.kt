package com.pitzdev.boilerplate.dtos.agreement.save

import java.math.BigDecimal
import java.util.*

class SaveAgreementDTO(val value: BigDecimal,
                       val originalValue: BigDecimal,
                       val entryValue: BigDecimal?,
                       val installmentCount: Int,
                       val entryDueDate: Date?,
                       val installmentDueDate: Date)