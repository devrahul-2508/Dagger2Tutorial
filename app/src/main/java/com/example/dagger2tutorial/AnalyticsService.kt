package com.example.dagger2tutorial

import android.nfc.Tag
import android.nfc.tech.TagTechnology
import android.util.Log
import com.google.android.material.tabs.TabLayout

interface AnalyticsService {
    fun trackEvent(eventName:String, eventType:String)
}
class MixPanel : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("MixPanel","$eventName-$eventType")
    }

}
class FireBaseAnalytics: AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("FireBase","User saved in firebase")
    }

}