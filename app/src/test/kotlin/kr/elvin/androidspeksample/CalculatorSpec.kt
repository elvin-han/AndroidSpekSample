package kr.elvin.androidspeksample

import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.subject.SubjectSpek
import org.junit.Assert.assertEquals
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Created by kyoung-hoonhan on 2016. 9. 20..
 */
@RunWith(JUnitPlatform::class)
class CalculatorSpec : SubjectSpek<Calculator>({
    subject {
        Calculator()
    }

    describe("addition") {
        it("is correct") {
            assertEquals(4, subject.add(2,2))
        }
    }

    describe("subtraction") {
        it("is correct") {
            assertEquals(2, subject.minus(4,2))
        }
    }
})