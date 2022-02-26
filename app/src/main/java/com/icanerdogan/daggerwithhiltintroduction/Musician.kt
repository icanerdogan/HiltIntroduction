package com.icanerdogan.daggerwithhiltintroduction

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped // Bu sınıf MainActiviy içinde çağrıldığından dolayı Activity veya üst scopeları alması lazım!
// Musician sınıfının instrument ve band sınıfına bağımlılığı var yani depend ediyor!
class Musician
// Constructor kullanımı ile beraber yapıldığında Constructor Injection oluyor ve aNNOTİON DEĞİŞMEZ!
@Inject
constructor(instrument: Instrument, band: Band) {
    fun sing() {
        println("singing!")
    }
}