package com.github.kotyabuchi.integratedtech.Utility

fun String.beginWithUpperCase(): String {
    return when (this.length) {
        0 -> ""
        1 -> this.uppercase()
        else -> {
            var result = ""
            this.split("_").forEach {
                result += it[0].uppercase() + it.substring(1).uppercase() + " "
            }
            result.trim()
        }
    }
}