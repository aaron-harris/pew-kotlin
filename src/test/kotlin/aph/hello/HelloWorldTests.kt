package aph.hello

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.kotest.property.Arb
import io.kotest.property.arbitrary.default
import io.kotest.property.checkAll

class HelloWorldTests : AnnotationSpec() {

    @Test
    suspend fun `Greeting is dynamic`() {
        checkAll(Arb.default<String>()) { name ->
            greeting(name) shouldBe "Hello, $name!"
        }
    }
}
