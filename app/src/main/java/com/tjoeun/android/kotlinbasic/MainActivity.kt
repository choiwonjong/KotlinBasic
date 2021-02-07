package com.tjoeun.android.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBtn.setOnClickListener {
   // Ctrl + / 로 한줄 주석
            Log.d("메인화면", "d로그 - 전송버튼이  눌림")
            Log.e("메인화면", "e로그 - 전송버튼이  눌림")
            Log.wtf("메인화면", "wtf로그 - 전송버튼이  눌림")

            // Toast : 사용자에게 심각하지안은 알림
            // 심각  : 데이터삭제, 로그아웃 -> AlertDialog

            // toast 만 -> 소문자 자동완성기능
            Toast.makeText(this, "전송버튼 눌림", Toast.LENGTH_SHORT).show()
        }
    }
}