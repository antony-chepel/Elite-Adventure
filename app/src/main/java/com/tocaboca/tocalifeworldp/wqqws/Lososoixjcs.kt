package com.tocaboca.tocalifeworldp.ncjxijvhud

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tocaboca.tocalifeworldp.mcivjdhf.Riwijisjixc
import com.tocaboca.tocalifeworldp.mcivjdhf.Qowoksijxc
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val ckxkvdo = module {

    single  <Gjssijjixic> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Gjssijjixic::class.java)
    }

    single <Reopwllslpx> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Reopwllslpx::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://eliteadventure.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Gppwpwposkkoxjic(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Jkskksx(get(named("HostInter")))
    }
    single{
        eeueiwioksdko()
    }
    single (named("SharedPreferences")) {
        apllzxkooksd(androidApplication())
    }
}

fun apllzxkooksd(cjnjnv: Application): SharedPreferences {
    return cjnjnv.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun eeueiwioksdko(): Gson {
    return GsonBuilder().create()
}

val kioocoivjjicd = module {
    viewModel (named("MainModel")){
        Qowoksijxc((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Riwijisjixc(get())
    }
}