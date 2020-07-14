package com.pitzdev.boilerplate.dtos.recovery.events

import java.math.BigDecimal

data class SavedRecoveryEventDTO(val debtorPublicId: String, val recoveryId: Long, val recoveryValue: BigDecimal)