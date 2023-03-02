package com.tocaboca.tocalifeworldp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworldp.mcivjdhf.Qowoksijxc
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val wososskkoxzcjix by viewModel<Qowoksijxc>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wososskkoxzcjix.hssiosakoxcji(this)
    }
}