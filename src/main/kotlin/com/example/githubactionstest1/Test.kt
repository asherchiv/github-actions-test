package com.example.githubactionstest1

class Test(
    private var count : Int,
){
    fun generateAnswerString():String{
        val answerString = if(count == 42){
            "answer"
        }else{
            "wrong"
        }
        return answerString
    }
}