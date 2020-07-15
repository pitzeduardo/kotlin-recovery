package com.pitzdev.boilerplate.controllers.recovery

import com.pitzdev.boilerplate.dtos.agreement.save.SaveAgreementDTO
import com.pitzdev.boilerplate.dtos.recovery.save.SaveRecoveryDTO
import com.pitzdev.boilerplate.dtos.recovery.save.SaveRecoveryResponseDTO
import com.pitzdev.boilerplate.services.agreement.AgreementService
import com.pitzdev.boilerplate.services.recovery.RecoveryService

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/recovery")
class RecoveryController(private val recoveryService: RecoveryService,
                         private val agreementService: AgreementService) {

    @PostMapping()
    fun save(@RequestBody saveRecoveryDTO: SaveRecoveryDTO): SaveRecoveryResponseDTO {

        return try {
            val recovery = recoveryService.save(saveRecoveryDTO)
            SaveRecoveryResponseDTO(recovery.id!!)
        }
        catch (e: Exception) {
            val errorResponse = SaveRecoveryResponseDTO(0)
            errorResponse.error = "Um erro desconhecido ocorreu."
            errorResponse
        }
    }

    @PostMapping("/{id}/agreement")
    fun saveAgreement(@PathVariable id: Long, @RequestBody saveAgreementDto: SaveAgreementDTO): Long {
        return try {
            val recovery = agreementService.save(id, saveAgreementDto)
            recovery.id!!
        }
        catch (e: Exception) {
            return 0
        }
    }

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