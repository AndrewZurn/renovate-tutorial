package com.andrewzurn.spannerpostgresr2dbc.controller

import com.andrewzurn.spannerpostgresr2dbc.model.Product
import com.andrewzurn.spannerpostgresr2dbc.repository.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

/**
 * @author andrew.zurn@dexcom.com - 9/16/22.
 */
@RestController
class ProductController(val productRepository: ProductRepository) {

    @GetMapping("/products")
    fun getProducts(): Flux<Product> {
        return this.productRepository.findAll()
    }
}
