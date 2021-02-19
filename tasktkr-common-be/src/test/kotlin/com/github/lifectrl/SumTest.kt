package com.github.lifectrl

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SumTest : StringSpec({
    "it can sum arguments" {
        sum(1, 5, 4, -10) shouldBe 0
    }
})
