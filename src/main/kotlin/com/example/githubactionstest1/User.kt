package com.example.githubactionstest1

import java.lang.IllegalArgumentException
import java.util.IllegalFormatCodePointException
import javax.persistence.*

@Entity
class User constructor(
    var name: String,

    val age: Int?, //Null이 가능할 때 ? 추가

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id : Long ?=null,
){
    init {
        if( name.isBlank()){
            throw IllegalArgumentException("이름은 비어있을 수 없습니다")
        }
    }

    fun updateName(name: String){
        this.name = name
    }


}