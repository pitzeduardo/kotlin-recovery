package com.pitzdev.boilerplate.services.debtor

import com.pitzdev.boilerplate.dtos.recovery.save.children.DebtorDTO
import com.pitzdev.boilerplate.models.debtor.Debtor
import com.pitzdev.boilerplate.repositories.debtor.DebtorRepository

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class DebtorServiceImpl(val debtorRepository: DebtorRepository) : DebtorService {

    public override fun saveOrUpdate(debtorDTO: DebtorDTO): Debtor {
        var debtor: Debtor? = debtorRepository.findByPublicId(debtorDTO.publicId)
        if (debtor == null) debtor = Debtor()

        debtor.name = debtorDTO.name
        debtor.address = debtorDTO.address
        debtor.addressNumber = debtorDTO.addressNumber
        debtor.neighborhood = debtorDTO.neighborhood
        debtor.postalCode = debtorDTO.postalCode
        debtor.complement = debtorDTO.complement
        debtor.ibgeCityCode = debtorDTO.ibgeCityCode
        debtor.state = debtorDTO.state

        return debtorRepository.save(debtor)
    }
}