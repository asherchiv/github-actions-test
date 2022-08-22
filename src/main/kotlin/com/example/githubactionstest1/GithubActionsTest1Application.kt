package com.example.githubactionstest1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.Scheduled

@SpringBootApplication
class GithubActionsTest1Application
    fun main(args: Array<String>) {
        runApplication<GithubActionsTest1Application>(*args)
    }
