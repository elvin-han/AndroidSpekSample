package kr.elvin.androidspeksample

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.*
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Created by kyoung-hoonhan on 2016. 9. 20..
 */
@RunWith(JUnitPlatform::class)
class ExampleUnitSpec: Spek({
    describe("a example") {
        it("addition is correct") {
            assertEquals(4, 2 + 2)
        }
    }
})