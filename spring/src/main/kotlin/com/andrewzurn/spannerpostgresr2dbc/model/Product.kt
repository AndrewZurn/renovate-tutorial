package com.andrewzurn.spannerpostgresr2dbc.model

import org.springframework.data.relational.core.mapping.Table

@Table("products")
data class Product(val id: Long, val name: String, val price: Double)
