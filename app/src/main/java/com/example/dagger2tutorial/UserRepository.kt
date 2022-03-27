package com.example.dagger2tutorial

import android.util.Log
import javax.inject.Inject


interface UserRepository {
    fun saveUser(email: String, password: String) {
    }
}
@ActivityScope
class SQLRepository @Inject  constructor(val analyticsService: AnalyticsService):UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d("TAG","UserSaved in DB")
        analyticsService.trackEvent("Save User","CREATE")
    }
}

class  FireBaseRepository (val analyticsService: AnalyticsService): UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d("TAG","UserSaved in Firebase")
        analyticsService.trackEvent("SAVE USER","Create")
    }
}
