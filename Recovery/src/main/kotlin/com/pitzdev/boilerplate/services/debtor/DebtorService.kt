package com.pitzdev.boilerplate.services.debtor

import com.pitzdev.boilerplate.dtos.recovery.save.children.DebtorDTO
import com.pitzdev.boilerplate.models.debtor.Debtor

interface DebtorService {

    public fun saveOrUpdate(debtorDTO: DebtorDTO): Debtor

}