// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Median of list of 1 number should be the number itself" {
        median(listOf(1f)) shouldBe 1f
    }

    "Median of list of 2 numbers should be average of the two values" {
        median(listOf(1f, 2f)) shouldBe 1.5f
    }

    "Median of list of 3 numbers should be list[1]" {
        median(listOf(1f, 2f, 3f)) shouldBe 2f
        median(listOf(2f, 3f, 1f)) shouldBe 2f
        median(listOf(3f, 2f, 3f)) shouldBe 3f
    }

    "Median of list of 4 numbers should be average of list[1] and list[2]" {
        median(listOf(4f, 2f, 3f, 1f)) shouldBe 2.5f
        median(listOf(1f, 3f, 5f, 5f)) shouldBe 4f
    }
})
