package com.example.repechajecristianrodriguez

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.repechajecristianrodriguez.Model.Local.Dao.LocalDao
import com.example.repechajecristianrodriguez.Model.Local.Entities.LocalDetails
import com.example.repechajecristianrodriguez.Model.Remote.RemoteRetrofit


//liberra desde el enunciado hasta el final una vez se complete el Mapper
class Repository/* (private val localDao: LocalDao){

    private val networkService = RemoteRetrofit.retrofitInstance()

    val itemListLiveData = localDao.getAllElements()

    //API
    suspend fun fetchList() {
        val service = kotlin.runCatching { networkService.fetchRemoteList() }

        service.onSuccess {

            when (it.code()) {
                in 200..299 -> it.body()?.let {

                    Log.d("Elementos", it.toString())

                    localDao.insertAllElements(fromInternetItemList(it)) //Mapper

                }

                else -> Log.d("Repo", "${it.code()}-${it.errorBody()}")
            }
            service.onFailure {
                Log.e("Error", "${it.message}")
            }


        }
    }
    suspend fun fetchElementsDetails (id: Int): LocalDetails? {

        val service = kotlin.runCatching { networkService.fetchRemoteDetail(id)}

        return service.getOrNull()?.body()?.let { Details ->

            val itemDetails = fromInternetItemDetails(Details) //completar Mapper

            localDao.insertElementsDetails(itemDetails)
            itemDetails

        }

    }

    fun getElementDetailsById(id: Int): LiveData<LocalDetails> {
        return localDao.getElementsDetailById(id)

    }

}*/