package com.skrser.surefire.test

import com.skrser.surefire.Calculator
import spock.lang.Specification
import spock.lang.Unroll

class CalculatorSpockTest extends Specification {

    @Unroll
    def "Multiply: #a * #b = #expectedResult"() {

        given: "Calculator"
        def calc = new Calculator()

        when: "multiply"
        def result = calc.multiply(a, b)

        then: "result is as expected"
        result == expectedResult

        where:
        a | b | expectedResult
        3 | 4 | 12
        4 | 5 | 20

    }
}
