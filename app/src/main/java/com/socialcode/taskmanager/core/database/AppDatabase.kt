package com.socialcode.taskmanager.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.socialcode.taskmanager.core.data.Task


@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
}