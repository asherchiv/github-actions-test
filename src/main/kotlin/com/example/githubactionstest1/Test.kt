package com.example.githubactionstest1

class Test {
    fun generateAnswerString(count: Int):String{
        val answerString = if(count == 42){
            "I have the answer"
        }else{
            "The answer eludes me"
        }
        return answerString
    }
}