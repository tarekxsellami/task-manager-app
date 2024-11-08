package com.socialcode.taskmanager.core.repositories

import com.socialcode.taskmanager.core.data.Task

class TaskRepository : ITaskRepository{

    override fun getAllTasks(): List<Task> {
        TODO("Not yet implemented")
    }

    override fun addNewTask(task: Task) {
        TODO("Not yet implemented")
    }

    override fun editTask(task: Task) {
        TODO("Not yet implemented")
    }

    override fun deleteTask(taskId: String) {
        TODO("Not yet implemented")
    }

}

interface ITaskRepository {
    fun getAllTasks(): List<Task>
    fun addNewTask(task: Task)
    fun editTask(task: Task)
    fun deleteTask(taskId: String)
}