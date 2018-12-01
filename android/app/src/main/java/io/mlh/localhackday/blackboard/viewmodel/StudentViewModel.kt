package io.mlh.localhackday.blackboard.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.mlh.localhackday.blackboard.data.Student
import io.mlh.localhackday.blackboard.repository.StudentRepository
import retrofit2.Call

class StudentViewModel(application: Application) : AndroidViewModel(application) {

    val studentRepository = StudentRepository();


    fun getLoginResults(email: String, password:String): Student? {
        return studentRepository.getLoginResults(email, password)
    }
}