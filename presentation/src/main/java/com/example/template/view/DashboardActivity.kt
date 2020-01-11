package com.example.template.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.template.R
import com.example.util.base.BaseActivity

class DashboardActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, DashboardActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
        }
    }
}
