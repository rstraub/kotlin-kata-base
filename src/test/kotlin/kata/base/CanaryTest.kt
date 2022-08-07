package kata.base

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

class CanaryTest : WordSpec({
    "Canary" should {
        "fail" {
            true shouldBe false
        }

        "mock" {
            val mock = mockk<App>()
            every { mock.hello() } returns "Goodbye, World!"

            mock.hello() shouldBe "Hello, World!"
        }
    }
})
