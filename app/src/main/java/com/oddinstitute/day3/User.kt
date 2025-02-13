package com.oddinstitute.day3

import java.util.*
import kotlin.collections.HashMap

// arguments ~= attributes
// without var OR val, they are just arguments
// with var or val, they are attributes as well
class User(val id: String = UUID.randomUUID().toString()) {
    // constructor (arguments) : this (the default constructors paramters)
    var name: String = ""
    var eyeColor: String = ""
    var height: Int = 0
    var weight: Float = 0f
    var email: String = ""

    init {

    }

    constructor(name: String, eyeColor: String, height: Int, weight: Float) : this() {
        this.name = name
        this.eyeColor = eyeColor
        this.height = height
        this.weight = weight
    }

    constructor(name: String, eyeColor: String) : this() {
        this.name = name
        this.eyeColor = eyeColor
    }

    constructor(height: Int, weight: Float, id: String) : this() {
        this.height = height
        this.weight = weight
    }

    // char, int, float, string, bool
    // string // "amir", "6187127267863", "c", "false", "574.54654564"
    constructor(map: HashMap<String, String>) : this() {
        map["name"]?.let { this.name = it }
        map["eyeColor"]?.let { this.eyeColor = it }
        map["height"]?.let { this.height = (it).toInt() }
        map["weight"]?.let { this.weight = (it).toFloat() }
        map["email"]?.let { this.email = it }
    }
}
