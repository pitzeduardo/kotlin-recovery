package com.pitzdev.boilerplate

import com.pitzdev.boilerplate.models.recovery.Recovery
import com.pitzdev.boilerplate.models.payment.Payment
import com.pitzdev.boilerplate.models.debtor.Debtor
import com.pitzdev.boilerplate.services.recovery.UserService

import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MultiplicationServiceTests() {

    @Mock
    lateinit var multiplicationService : UserService

	@Test
	fun whenValidRandomNumber_returnValue() {
        val factorA = 15
        val factorB = 20
        val mockMultiplicationService = Mockito.mock(UserService::class.java)

        Mockito.`when`(mockMultiplicationService.createRandomMultiplication()).thenReturn(Recovery(factorA, factorB))
        val multiplication : Recovery = mockMultiplicationService.createRandomMultiplication()

        assert(multiplication.factorA == factorA)
        assert(multiplication.factorB == factorB)
        assert(multiplication.result == factorA * factorB)
    }

    @Test
    fun whenInvalidAttempt_returnFalse() {
        val multiplication : Recovery = Recovery(5, 5)
        val attempt  : Payment = Payment(Debtor("Pitz"), multiplication, 10)

        assert(!multiplicationService.checkAttempt(attempt))
    }

    @Test
    fun whenValidAttempt_returnTrue() {
        val multiplication : Recovery = Recovery(5, 5)
        val attempt  : Payment = Payment(Debtor("Pitz"), multiplication, 25)

        assert(attempt.multiplication.result == 25)
        assert(attempt.resultAttempt == attempt.multiplication.result)
    }
}
