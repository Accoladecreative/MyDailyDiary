package com.accoladecreative.mydailydiary.welcomeFragments
import com.accoladecreative.mydailydiary.welcomeFragments.QuizFragment.quiz
import junit.framework.TestCase
import org.junit.Test

class QuizFragmentTest : TestCase() {

    //fun testOnCreateView() {}
    @Test
    fun test_Quiz(){
        val expected = true

        val q2 = "Mango"
        val q1 = "Apple"

        val actual = quiz(q1,q2)

        TestCase.assertEquals(expected, actual)


    }
}