package com.example.exercise5

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    var countLike: Int = 0
    var countDislike: Int = 0

    override fun onCleared() {
        super.onCleared()
    }
}