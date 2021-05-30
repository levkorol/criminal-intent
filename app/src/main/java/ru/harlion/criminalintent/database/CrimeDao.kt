package ru.harlion.criminalintent.database

import androidx.room.Dao
import androidx.room.Query
import ru.harlion.criminalintent.Crime
import java.util.*

@Dao
interface CrimeDao {
    //@Query - извлечение из базы данных

    @Query("SELECT * FROM crime")
    fun getCrimes(): List<Crime>

    @Query("SELECT * FROM crime WHERE id = (:id)")
    fun getCrime(id: UUID): Crime?
}