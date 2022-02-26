package com.icanerdogan.daggerwithhiltintroduction


import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFunction() : String
}

/*
// Burada hangi Generated Component verildiyse ona göre scope aşağıda verilir
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{

    // Scoped yukarıdaki ActivityComponent'a ait olan Scope annoation olmalıdır!
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor : InterfaceImplementor) : MyInterface
}
 */

@InstallIn(SingletonComponent::class)
@Module
abstract class MyModule{

    // Scoped yukarıdaki ActivityComponent'a ait olan Scope annoation olmalıdır!
    @Singleton
    @Provides
    fun providerFunction() : MyInterface {
        return InterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gSonProvider() : Gson {
        return Gson()
    }
}