package com.andrewzurn.spannerpostgresr2dbc.repository

import com.andrewzurn.spannerpostgresr2dbc.model.Product
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : ReactiveCrudRepository<Product, Long>
