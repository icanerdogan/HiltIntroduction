package com.icanerdogan.daggerwithhiltintroduction

import javax.inject.Inject

// Bu diğer Musician içinde olduğundan dolayı Inject alır ve constructor olmadığı halde constructor koyulur!
class Band @Inject constructor(){
}