package com.example.quizeapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var question1= QuestionData(
            "what is the capital of india ?",
            1,
            "UP",
            "MP",
            "Delhi",
            "Lucknow",
            3
            )
        var question2= QuestionData(
            "what is the capital of india ?",
            2,
            "UP",
            "MP",
            "Delhi",
            "Lucknow",
            3
        )
        var question3= QuestionData(
            "what is the capital of india ?",
            3,
            "UP",
            "MP",
            "Delhi",
            "Lucknow",
            3
        )
        var question4= QuestionData(
            "what is the capital of india ?",
            4,
            "UP",
            "MP",
            "Delhi",
            "Lucknow",
            3
        )
        var question5= QuestionData(
            "what is the capital of india ?",
            5,
            "UP",
            "MP",
            "Delhi",
            "Lucknow",
            3
        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}