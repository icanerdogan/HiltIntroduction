package com.icanerdogan.daggerwithhiltintroduction

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// Bu sınıf ile giriş yapılarak başlatıldı!
// Bu sınıfı oluşturduktan sonra birdaha dönğlmese de olur
@HiltAndroidApp
class MyApplication : Application() {
}