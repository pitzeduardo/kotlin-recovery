package com.pitzdev.boilerplate.controllers.recovery

import com.pitzdev.boilerplate.dtos.recovery.save.SaveRecoveryDTO
import com.pitzdev.boilerplate.services.recovery.RecoveryServiceImpl
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/recovery")
class RecoveryController(private val recoveryService: RecoveryServiceImpl) {

    @PostMapping("/save")
    fun save(@RequestBody saveRecoveryDTO: SaveRecoveryDTO): Long {
        val recovery = recoveryService.save(saveRecoveryDTO)
        return recovery.id!!
    }
//
//    @PostMapping("/attempt")
//    fun save(@RequestBody saveAttemptDTO : SaveAttemptDTO): SaveAttemptResponseDTO {
//        val attempt: Payment = multiplicationService.checkAttempt(saveAttemptDTO)
//        return SaveAttemptResponseDTO(attempt.multiplication.id!!, attempt.correct)
//    }
//
//    @GetMapping("/list")
//    fun list(@RequestParam("alias") alias : String): List<Payment>? {
//        return multiplicationService.getLastUserAttemptList(alias)
//    }
}