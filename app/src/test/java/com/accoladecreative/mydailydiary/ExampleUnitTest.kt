package com.accoladecreative.mydailydiary

import com.accoladecreative.mydailydiary.welcomeFragments.QuizFragment.quiz
import junit.framework.TestCase
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test_Quiz(){
        val expected = true

        val q2 = "Mango"
        val q1 = "Apple"

        val actual = quiz(q1,q2)

        TestCase.assertEquals(expected, actual)


    }
}