package jp.techacademy.hiroshi.yoshii.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {

    constructor(name: String, age: Int, hobby: String): super(name, age,hobby) {
    }

    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    override fun move() {
       Log.d("kotlintest",this.name +"("+ this.age + "歳）" +"は全力で走った。")

    }

}

