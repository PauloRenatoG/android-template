package com.example.template.view.splash

import android.os.Bundle
import com.example.template.view.DashboardActivity
import com.example.util.base.BaseActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.startActivity(DashboardActivity.createIntent(this))
    }
}