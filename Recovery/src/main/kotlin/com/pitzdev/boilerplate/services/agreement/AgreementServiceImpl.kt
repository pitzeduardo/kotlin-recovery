package com.pitzdev.boilerplate.services.agreement

import com.pitzdev.boilerplate.dtos.agreement.save.SaveAgreementDTO
import com.pitzdev.boilerplate.models.agreement.Agreement
import com.pitzdev.boilerplate.models.recovery.Recovery
import com.pitzdev.boilerplate.repositories.agreement.AgreementRepository
import com.pitzdev.boilerplate.repositories.recovery.RecoveryRepository
import org.springframework.data.repository.findByIdOrNull

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class AgreementServiceImpl(val recoveryRepository: RecoveryRepository,
                           val agreementRepository: AgreementRepository) : AgreementService {

    public override fun save(recoveryId: Long, saveAgreementDto: SaveAgreementDTO): Agreement {
        val recovery: Recovery = recoveryRepository.findByIdOrNull(recoveryId) ?: throw Exception("Recuperação não encontrada.")

        val agreement: Agreement = Agreement(recovery.debtor,
                                             recovery,
                                             saveAgreementDto.value,
                                             saveAgreementDto.entryValue,
                                             saveAgreementDto.originalValue,
                                             saveAgreementDto.installmentCount,
                                             saveAgreementDto.entryDueDate,
                                             saveAgreementDto.installmentDueDate)

        agreementRepository.save(agreement)
        return agreement
    }
}