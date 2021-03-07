package com.tjoeun.lifecycle_20210307

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        moveToOtherBtn.setOnClickListener {

        val myIntent = Intent(this, OtherActivity::class.java)
        startActivity(myIntent)

        }
    }

    override fun setValues() {
        Log.d("메인화면","onCreate 실행됨")
    }



    override fun onResume() {
        super.onResume()
        
        Log.d("메인화면","onResume 실행됨")
        
//        가정 : 리스트뷰로 => 게시판이 구현된 상황
//        게시글 목록을 자동 새로고침 : onResume에 새로고침 코드 작성
    }

    override fun onPause() {
        super.onPause()
        
        Log.d("메인화면","onPause 실행됨")
        
//        자원소모가 많은 기능 (ex. GPS 위치 추적) => 화면에 안보여줘도 될때 일시 중지
//        어떤 기능들은 사용하려고하면 onPause 편집을 강제 시킴
        
    }
}