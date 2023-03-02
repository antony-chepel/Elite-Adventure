package com.tocaboca.tocalifeworldp.srwysuhd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.content.ContextCompat
import com.tocaboca.tocalifeworldp.R
import com.tocaboca.tocalifeworldp.databinding.ActivityUosksoxjizcsdBinding
import com.tocaboca.tocalifeworldp.mcivjdhf.Lowwijshuhuxcs
import kotlin.random.Random

class Uosksoxjizcsd : AppCompatActivity() {
    val fowokkokoskoda = listOf(
        50,
        70,
        150,
        350,
        550,
        100,
        180,
        300,
        )
    var saioaskodkoas = 0
    private lateinit var foksdkoaoskd: ActivityUosksoxjizcsdBinding
    private var pwlplwpq: CountDownTimer? = null

    private fun lsosdkwijiashud() = with(foksdkoaoskd) {

        val aisuhuahuxc = fowokkokoskoda[Random.nextInt(8)]
        val xizjcjizixhushu: MutableList<Int> =
            mutableListOf(
                R.drawable.el_adv_4, R.drawable.el_adv_8, R.drawable.el_adv_3, R.drawable.el_adv_6, R.drawable.el_adv_5,
                R.drawable.el_adv_6, R.drawable.el_adv_7,R.drawable.el_adv_8,R.drawable.el_adv_9,R.drawable.el_adv_3,R.drawable.el_adv_5,R.drawable.el_adv_7,)

        val ooflxcovkxc = arrayOf(button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button10, button11, button12)

        val xgzgcyuhzxuhushuhuasc = R.drawable.el_adv_4
        var pzplzlpxokkozck = 0
        var eokkowko = false
        var sokdokwok = -1

        for(i in 0..11){
            ooflxcovkxc[i].setImageResource(xgzgcyuhzxuhushuhuasc)
            ooflxcovkxc[i].setOnClickListener {
                if (ooflxcovkxc[i].drawable.constantState == ContextCompat.getDrawable(this@Uosksoxjizcsd, xgzgcyuhzxuhushuhuasc)?.constantState && !eokkowko) {
                    ooflxcovkxc[i].setImageResource(xizjcjizixhushu[i])
                    if (pzplzlpxokkozck == 0) {
                        sokdokwok = i
                    }
                    pzplzlpxokkozck++
                } else if (ooflxcovkxc[i].drawable.constantState != ContextCompat.getDrawable(this@Uosksoxjizcsd, xgzgcyuhzxuhushuhuasc)?.constantState) {
                    ooflxcovkxc[i].setImageResource(xgzgcyuhzxuhushuhuasc)
                    pzplzlpxokkozck--
                }

                if (pzplzlpxokkozck == 2) {
                    eokkowko = true
                    if (ooflxcovkxc[i].drawable.constantState == ooflxcovkxc[sokdokwok].drawable.constantState) {
                        ooflxcovkxc[i].isClickable = false
                        ooflxcovkxc[sokdokwok].isClickable = false
                        eokkowko = false
                        saioaskodkoas +=aisuhuahuxc
                        sokdkooxkc.text = "Your elite scores : $saioaskodkoas"
                        pzplzlpxokkozck = 0
                    }
                } else if (pzplzlpxokkozck == 0) {
                    eokkowko = false
                }
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        foksdkoaoskd = ActivityUosksoxjizcsdBinding.inflate(layoutInflater)
        setContentView(foksdkoaoskd.root)
        osospsdlpxkoczxji()
        lsosdkwijiashud()
    }

    private fun osospsdlpxkoczxji(){
        pwlplwpq?.cancel()
        pwlplwpq = object : CountDownTimer(30000,100){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                startActivity(
                    Intent(this@Uosksoxjizcsd, Lowwijshuhuxcs::class.java)
                    .putExtra("el_scrs",saioaskodkoas)
                )

            }

        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        pwlplwpq?.cancel()
    }




}