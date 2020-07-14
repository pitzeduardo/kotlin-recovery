package com.pitzdev.boilerplate.dtos.recovery.save

import com.pitzdev.boilerplate.dtos.recovery.save.children.DebtorDTO
import java.math.BigDecimal
import java.util.*

class SaveRecoveryDTO(val value: BigDecimal,
                      val originDate: Date,
                      val description: String,
                      val debtor: DebtorDTO)