package com.oddinstitute.day3


enum class RGB (val r: Int, g: Int, b: Int)
{
    RED (200, 236, 210)
}



enum class Direction
{
    NORTH, SOUTH, WEST, SOUTHWEST, EAST
}

fun test ()
{
    val myDir = Direction.EAST


    when (myDir)
    {
        Direction.NORTH -> { }

        Direction.SOUTH -> { }
    }

}