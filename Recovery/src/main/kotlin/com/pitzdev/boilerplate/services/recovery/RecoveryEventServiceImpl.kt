package com.pitzdev.boilerplate.services.recovery

import com.google.gson.Gson
import com.pitzdev.boilerplate.dtos.recovery.events.SavedRecoveryEventDTO
import com.pitzdev.boilerplate.events.publisher.EventPublisher
import com.pitzdev.boilerplate.models.recovery.Recovery

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class RecoveryEventServiceImpl() : RecoveryEventService {

    public override fun dispatchCreatedRecoveryEvent(recovery: Recovery) {
        val eventInfo = SavedRecoveryEventDTO(recovery.debtor.publicId, recovery.id!!, recovery.value)
        val eventInfoJson = Gson().toJson(eventInfo)

        val eventPublisher = EventPublisher()
        eventPublisher.publish("recovery.created", eventInfoJson)
    }
}