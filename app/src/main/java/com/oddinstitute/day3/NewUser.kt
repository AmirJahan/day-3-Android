package com.oddinstitute.day3


class NewUser()
{
    val id: String = ""
    var name: String? = null
    var eyeColor: String? = null
    var height: Int = 170
    var weight: Float? = null
    var email: String? = null


    constructor(id: String,
                name: String? = null,
                eyeColor: String? = null,
                height: Int,
                weight: Float? = null,
                email: String? = null) : this ()
    {

    }

    constructor(email: String) : this ()
    {

    }

}
