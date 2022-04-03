package jp.techacademy.hiroshi.yoshii.kotlinlog

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val human = Human("吉井寛", 53, "オートバイ")

        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。"+"年は" + human.age + "歳です。")

        human.think()

    val human2 = Human("大山倍達", 74, "空手")

        human2.say()
        Log.d("kotlintest", "私の名前は" + human2.name + "です。"+"年は" + human2.age + "歳です。")

        human2.think()
    }

  }

