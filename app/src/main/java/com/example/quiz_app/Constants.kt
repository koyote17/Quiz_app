package com.example.quiz_app

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.bialorus,
            "Austria", "Australia", "Belarus", "Georgia",
            3
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.kamerun,
            "Nigeria", "Kongo", "Cameroon", "Cuba",
            3
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.kuba,
            "Tanzania", "Cuba", "Dominicana", "None of these",
            2
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.nigeria,
            "Czech Republic", "Niger", "RPA", "Nigeria",
            4
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.singapur,
            "Singapur", "Poland", "Indonesia", "Kuweit",
            1
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.tajlandia,
            "Philipines", "Ecuardor", "Vietnam", "Thailand",
            4
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.wenezuela,
            "Columbia", "Venezuela", "Ecuador", "Brasil",
            2
        )

        questionsList.add(que7)
        return questionsList
    }
}