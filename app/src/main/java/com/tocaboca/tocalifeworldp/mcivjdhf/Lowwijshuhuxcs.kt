package com.tocaboca.tocalifeworldp.mcivjdhf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworldp.databinding.ActivityLowwijshuhuxcsBinding
import com.tocaboca.tocalifeworldp.wqqws.Iwetwwiosad

class Lowwijshuhuxcs : AppCompatActivity() {
    private lateinit var sudhw : ActivityLowwijshuhuxcsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sudhw = ActivityLowwijshuhuxcsBinding.inflate(layoutInflater)
        setContentView(sudhw.root)
        dopeokokwkosoad()
    }


    private fun dopeokokwkosoad() = with(sudhw){
        val vokfok = intent.getIntExtra("el_scrs",100)


        if(vokfok<=100){
            sokdkokxokcokzkkzxjiczji.text = "Bad try, should play more !"
        }
        fffpdppsdpsd.text = "Elite scores : $vokfok"

        aapspl.setOnClickListener {
            startActivity(Intent(this@Lowwijshuhuxcs, Iwetwwiosad::class.java))
        }
    }
}