package com.example.dagger2tutorial

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to:String,from:String,body:String)
}
@ActivityScope
class EmailService @Inject constructor() :NotificationService{
    override fun send(to:String, from:String, body:String){
        Log.d("TAG","email Sent")
    }

}

class MessageService(private val retryCount:Int):NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("TAG","message Sent $retryCount times")

    }

}