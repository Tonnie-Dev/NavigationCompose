package com.example.compose.rally

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RallyNavHostTest{

    @get:Rule
    val composeTestRule = createComposeRule()
    lateinit var navContoller:NavHostController



    /*public fxn annotated with @Test - set the content you wanna test here*/


    @Before
    fun setUpRallyNavHost(){

        composeTestRule.setContent {

            navContoller = rememberNavController()
            RallyNavHost(navController = navContoller)
        }

    }

    @Test
    fun rallyNavHost(){



        composeTestRule.onNodeWithContentDescription("Overview Screen").assertIsDisplayed()
        /*ensure your test fails until there is an actual assertion made
        it serves as a reminder to finish implementing the test*/
        //fail()
    }
}