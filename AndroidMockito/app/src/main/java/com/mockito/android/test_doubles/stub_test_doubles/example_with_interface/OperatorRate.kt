package com.mockito.android.test_doubles.stub_test_doubles.example_with_interface

interface OperatorRate {
    fun feeRate(operator: String): Int
}

/*
The stub will always return the value that is passed in the constructor and we have full control of
the stub and it's completely isolated from the production code.

public class OperatorRateStub (int rate) : OperatorRate {

    @Override
    public int feeRate(String operator) {
        return rate;
    }
}

 */