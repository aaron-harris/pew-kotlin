package io.github.aaron_harris.pew.kotlin.cli

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.property.Arb
import io.kotest.property.arbitrary.string
import io.kotest.property.checkAll

class HelloTests : FunSpec({

    test("Test hello") {
        checkAll(
            Arb.string(),
        ) { name ->
            hello(name) shouldBe "Hello, $name!"
        }
    }
})
