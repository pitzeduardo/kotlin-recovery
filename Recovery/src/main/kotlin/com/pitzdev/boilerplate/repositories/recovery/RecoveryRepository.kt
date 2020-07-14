package com.pitzdev.boilerplate.repositories.recovery

import com.pitzdev.boilerplate.models.recovery.Recovery
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RecoveryRepository : CrudRepository<Recovery, Long>