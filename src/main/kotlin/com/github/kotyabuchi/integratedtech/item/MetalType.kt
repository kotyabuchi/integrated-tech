package com.github.kotyabuchi.integratedtech.item

import com.github.kotyabuchi.integratedtech.Utility.beginWithUpperCase

enum class MetalType(val enName: String = toString().beginWithUpperCase(), val isAlloy: Boolean = false) {
    COPPER,
    TIN,
    LEAD,
    ALUMINUM,
    SILVER,
    NICKEL,
    TITANIUM,
    BRONZE(isAlloy = true)
}