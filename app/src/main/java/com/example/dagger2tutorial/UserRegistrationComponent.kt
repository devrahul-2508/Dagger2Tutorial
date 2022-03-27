package com.example.dagger2tutorial

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent( modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {


    fun inject(mainActivity: MainActivity)

    fun getEmailService():EmailService

    @Subcomponent.Builder
    interface Builder{

        fun build():UserRegistrationComponent

        fun retryCount(@BindsInstance retryCount: Int):Builder

/*
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
*/


    //Component.Builder
        //Build---> Component
        //Methods---?Builder
    }
}