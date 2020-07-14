package com.pitzdev.boilerplate.repositories.debtor

import com.pitzdev.boilerplate.models.debtor.Debtor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DebtorRepository : CrudRepository<Debtor, Long> {

    //fun findTop5ByUserAliasOrderByIdDesc(userAlias : String) : List<Payment>?

    fun findByPublicId(publicId: String) : Debtor?

}