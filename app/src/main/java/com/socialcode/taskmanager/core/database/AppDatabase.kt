package com.socialcode.taskmanager.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.socialcode.taskmanager.core.data.Task


/**
 * Created by Tarek Sellami (tarek@evenly.io) on 08.11.2024
 *
 * Copyright (c) 2024 Evenly GmbH,
 * all rights reserved
 */
@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
}