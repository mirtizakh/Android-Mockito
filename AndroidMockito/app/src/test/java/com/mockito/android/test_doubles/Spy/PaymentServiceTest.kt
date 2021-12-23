package com.mockito.android.test_doubles.Spy

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class PaymentServiceTest {
    private lateinit var operatorRate: IOperatorRate
    private lateinit var emailSender: PaymentEmailSpy
    private lateinit var paymentService: PaymentService
    private lateinit var loggerDummy: ILogger
    private val customerName = "Bob"

    @Before
    fun setUp() {
        loggerDummy = LoggerDummy()
        operatorRate = OperatorRateStub(10)
        emailSender = PaymentEmailSpy()
        paymentService = PaymentService(loggerDummy, operatorRate, emailSender)
    }


    @Test
    fun notSendEmailForSalesUnder1000() {
        val spiedPaymentService = PaymentService(loggerDummy, operatorRate, emailSender)
        spiedPaymentService.createPaymentRequest(500, customerName)
        assertEquals(0, emailSender.timesCalled())
    }
}