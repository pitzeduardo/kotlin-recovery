package com.pitzdev.boilerplate.services.agreement

import com.pitzdev.boilerplate.dtos.agreement.save.SaveAgreementDTO
import com.pitzdev.boilerplate.models.agreement.Agreement

interface AgreementService {

    public fun save(recoveryId: Long, saveAgreementDto: SaveAgreementDTO): Agreement

}