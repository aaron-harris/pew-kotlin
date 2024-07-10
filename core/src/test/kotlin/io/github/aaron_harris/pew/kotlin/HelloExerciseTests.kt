package io.github.aaron_harris.pew.kotlin

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.property.Arb
import io.kotest.property.arbitrary.string
import io.kotest.property.checkAll

class HelloExerciseTests : FunSpec({

    test("Solution for default input") {
        HelloExercise.solve() shouldBe "Hello, World!"
    }

    test("Solution with parametrization") {
        checkAll(
            Arb.string(),
        ) { name ->
            HelloExercise.solve(input = name) shouldBe "Hello, $name!"
        }
    }
})
