package com.tocaboca.tocalifeworldp.wqqws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworldp.databinding.ActivityIwetwwiosadBinding
import com.tocaboca.tocalifeworldp.srwysuhd.Uosksoxjizcsd

class Iwetwwiosad : AppCompatActivity() {
    private lateinit var isdjjiiasdjokxockkoz : ActivityIwetwwiosadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isdjjiiasdjokxockkoz = ActivityIwetwwiosadBinding.inflate(layoutInflater)
        setContentView(isdjjiiasdjokxockkoz.root)
        isdjjiiasdjokxockkoz.dodfk.setOnClickListener {
            startActivity(Intent(this, Uosksoxjizcsd::class.java))
        }

        isdjjiiasdjokxockkoz.oxkzkockoslk.setOnClickListener {
            finish()
        }
    }
}