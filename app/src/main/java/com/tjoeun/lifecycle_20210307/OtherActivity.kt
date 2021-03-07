package com.tjoeun.lifecycle_20210307

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        setValues()
        setupEvents()

    }

    override fun setupEvents() {

    }

    override fun setValues() {
        Log.d("다른화면","onCreate가 실행됨")
    }


}