package com.oddinstitute.day3

class AppData {
    companion object MyObject {
        var allTasks: ArrayList<Category> = arrayListOf()

        fun populateTasks() {
            // personal
            val task0 = Task("Buy Bread")
            task0.isDone = true
            val task4 = Task("Clean the Room")
            val cat1 = Category("personal", arrayListOf<Task>(task0, task4))

            // family
            val task1 = Task("Call Mom", true)
            val task2 = Task("Do Homework")
            val task3 = Task("Go to Gym")
            val cat2 = Category("family", arrayListOf<Task>(task1, task2, task3))

            // office
            val task5 = Task("Go to the Zoo")
            val cat3 = Category("office", arrayListOf<Task>(task5))

            allTasks = arrayListOf<Category>(cat1, cat2, cat3)
        }

        fun addTask(task: Task) {
            allTasks[0].tasks.add(task)
        }
    }
}
