package ru.harlion.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel() {

   private val crimeRepository = CrimeRepository.get()
   var crimeListLiveData = crimeRepository.getCrimes()

   fun addCrime(crime: Crime) {
      crimeRepository.addCrime(crime)
   }
}