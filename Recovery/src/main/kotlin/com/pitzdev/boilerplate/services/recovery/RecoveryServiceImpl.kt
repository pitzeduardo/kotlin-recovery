package com.pitzdev.boilerplate.services.recovery

import com.pitzdev.boilerplate.dtos.recovery.save.SaveRecoveryDTO
import com.pitzdev.boilerplate.models.recovery.Recovery
import com.pitzdev.boilerplate.models.debtor.Debtor
import com.pitzdev.boilerplate.repositories.recovery.RecoveryRepository
import com.pitzdev.boilerplate.services.debtor.DebtorService

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class RecoveryServiceImpl(val recoveryEventService: RecoveryEventServiceImpl,
                          val debtorService: DebtorService,
                          val recoveryRepository: RecoveryRepository) : RecoveryService {

    public override fun save(saveRecoveryDTO: SaveRecoveryDTO) : Recovery {
        val debtor: Debtor = debtorService.saveOrUpdate(saveRecoveryDTO.debtor)
        val recovery: Recovery = Recovery(debtor, saveRecoveryDTO.value, saveRecoveryDTO.originDate, saveRecoveryDTO.description)

        recoveryRepository.save(recovery)
        // recoveryEventService.dispatchCreatedRecoveryEvent(recovery)

        return recovery
    }
}