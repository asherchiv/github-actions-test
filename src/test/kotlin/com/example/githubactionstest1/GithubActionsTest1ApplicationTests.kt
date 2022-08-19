package com.example.githubactionstest1

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GithubActionsTest1ApplicationTests {

    @Test
    fun test1(){
        val test= Test(42)

        val answer=test.generateAnswerString()

        assertThat(answer).isEqualTo("answer")
    }

}
