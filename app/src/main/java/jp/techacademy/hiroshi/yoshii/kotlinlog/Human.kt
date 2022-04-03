package jp.techacademy.hiroshi.yoshii.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {

     constructor(name: String, age: Int, hobby: String): super(name, age, hobby) {
     }

     override fun say() {
       Log.d("kotlintest", this.name + "(" + this.age + "歳)" )
       }

      override fun think() {
       Log.d("kotlintest","私は"+""+this.hobby +"について考える。")
       }
}