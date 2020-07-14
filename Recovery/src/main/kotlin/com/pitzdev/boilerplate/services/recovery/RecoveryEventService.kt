package com.pitzdev.boilerplate.services.recovery

import com.pitzdev.boilerplate.models.recovery.Recovery

interface RecoveryEventService {

    public fun dispatchCreatedRecoveryEvent(recovery: Recovery)

}