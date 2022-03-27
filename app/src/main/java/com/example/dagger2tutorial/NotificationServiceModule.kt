package com.example.dagger2tutorial

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Qualifier

@Module
class NotificationServiceModule() {

        @ActivityScope
        @Named("message")
        @Provides
        fun getMessageService():NotificationService{
            return MessageService(3)
        }
   /* @Provides
    fun getEmailService():NotificationService{
        return EmailService()
    }*/
    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}