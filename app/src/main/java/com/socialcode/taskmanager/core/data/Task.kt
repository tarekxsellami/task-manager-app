package com.socialcode.taskmanager.core.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "task")
data class Task(@PrimaryKey(autoGenerate = true) val id: Int)
