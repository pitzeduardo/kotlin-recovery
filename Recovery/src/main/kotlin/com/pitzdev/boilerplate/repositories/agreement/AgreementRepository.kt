package com.pitzdev.boilerplate.repositories.agreement

import com.pitzdev.boilerplate.models.agreement.Agreement
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AgreementRepository : CrudRepository<Agreement, Long>