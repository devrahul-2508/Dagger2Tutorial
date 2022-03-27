package com.example.dagger2tutorial

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

   /* @Provides
    fun getSqlRepository(sqlRepository: SQLRepository):UserRepository{
        return sqlRepository
    }*

    */
    @Binds
    @ActivityScope
    abstract fun getSqLRepository(sqlRepository: SQLRepository):UserRepository
   /* @Provides
    fun getSqlRepository():UserRepository{
        return SQLRepository()
    }*/

}