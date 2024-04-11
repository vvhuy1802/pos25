package com.atom.core.model

data class Settlement (
 //   val icon: Int,
    val amount: String,
    val dateTime: String,
    val checkNumber: String,
    val state : String,
    val bankId: String
)