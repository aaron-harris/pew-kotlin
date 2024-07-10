package io.github.aaron_harris.pew.kotlin.cli

import com.github.ajalt.clikt.testing.test
import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeEmpty

class HelloCommandTests : FunSpec({
    val command = HelloCommand()

    test("Test hello") {
        val result = command.test()

        assertSoftly {
            result.stdout shouldBe "Hello, World!\n"
            result.stderr.shouldBeEmpty()
            result.statusCode shouldBe 0
        }
    }
})
