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

        human.think()

    val human2 = Human("大山倍達", 74, "空手")

        human2.say()

        human2.think()
    }

  }

