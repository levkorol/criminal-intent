package ru.harlion.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel() {

    var crimes = mutableListOf<Crime>()

    init {
        
    }
}