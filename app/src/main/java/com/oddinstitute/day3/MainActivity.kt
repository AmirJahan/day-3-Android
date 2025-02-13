package com.oddinstitute.day3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val myData = AppData ()
//        myData.populateTasks()

        AppData.populateTasks()

        AppData.addTask(Task("Potato"))
    }

    fun classTests() {
        // Jenny, green, 165, 58
        val jennyMap: HashMap<String, String> = hashMapOf("name" to "Jenny",
                                                         "eyeColor" to "green",
                                                         "height" to "${165}",
                                                         "weight" to "${58}")
        val jennyHuman = User(jennyMap)

        val test = jennyHuman.eyeColor // ?

        val steve = User("Steve", "Blue", 235, 85f)
        val sarah = User("Sarah", "Brown")
        val john = User(180, 68f, UUID.randomUUID().toString())
        val adam = User()

        val eyeColor = steve.eyeColor

        Log.d(MainActivity::class.java.simpleName, "steve's eyeColor is: ")

        val newuser = NewUser("sgsrg@gmail.com")
    }
}
