package com.andrewzurn.spannerpostgresr2dbc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
@EnableR2dbcRepositories
class SpannerPostgresR2dbcApplication

fun main(args: Array<String>) {
	runApplication<SpannerPostgresR2dbcApplication>(*args)
}
