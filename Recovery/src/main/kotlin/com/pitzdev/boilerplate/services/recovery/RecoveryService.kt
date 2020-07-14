package com.pitzdev.boilerplate.services.recovery

import com.pitzdev.boilerplate.dtos.recovery.save.SaveRecoveryDTO
import com.pitzdev.boilerplate.models.recovery.Recovery

interface RecoveryService {

    public fun save(saveRecoveryDTO: SaveRecoveryDTO): Recovery

}