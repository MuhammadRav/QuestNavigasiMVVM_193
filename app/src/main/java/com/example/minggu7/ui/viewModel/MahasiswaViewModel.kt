package com.example.minggu7.ui.viewModel

import androidx.lifecycle.ViewModel
import com.example.minggu7.Model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel: ViewModel() { //view model ": ViewModel()"
    private val _uiState = MutableStateFlow(Mahasiswa())
    val uiState: StateFlow<Mahasiswa> = _uiState.asStateFlow()

    fun saveDataMahasiswa (
        ls :MutableList<String>
    ){
        _uiState.update { data ->
            data.copy(          // ditampung dalam array "[]"
                nama = ls[0],
                gender = ls[1],
                alamat = ls[2]
            )
        }
    }
}