package com.mockito.android.test_doubles.dummy_test_doubles

import java.lang.AssertionError

class DummyEmailService : IEmailService {
    override fun sendEmail(message: String) {
        throw AssertionError("Implementation of sendEmail method is not completed")
    }
}