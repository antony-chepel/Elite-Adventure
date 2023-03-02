package com.tocaboca.tocalifeworldp.mcivjdhf
import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.oxocvidisif
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.nnbjij
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.uhchuv
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.aapaplsplxlpc
import com.tocaboca.tocalifeworldp.ncjxijvhud.ckxkvdo
import com.tocaboca.tocalifeworldp.ncjxijvhud.kioocoivjjicd
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Jnvbvoobsdf: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(nnbjij)

        val jxkzkoxcxsd = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val apsow = getSharedPreferences("PREFS_NAME", 0)

        val uyxjzxis = MyTracker.getTrackerParams()
        val klkcxokvkkd = MyTracker.getTrackerConfig()
        val tokrko = MyTracker.getInstanceId(this)
        klkcxokvkkd.isTrackingLaunchEnabled = true
        val uxziikckoksjic = UUID.randomUUID().toString()

        if (apsow.getBoolean("my_first_time", true)) {
            uyxjzxis.setCustomUserId(uxziikckoksjic)
            jxkzkoxcxsd.edit().putString(oxocvidisif, uxziikckoksjic).apply()
            jxkzkoxcxsd.edit().putString(uhchuv, tokrko).apply()
            apsow.edit().putBoolean("my_first_time", false).apply()
        } else {
            val dplwlpw = jxkzkoxcxsd.getString(oxocvidisif, uxziikckoksjic)
            uyxjzxis.setCustomUserId(dplwlpw)
        }
        MyTracker.initTracker(aapaplsplxlpc, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Jnvbvoobsdf)
            modules(
                listOf(
                    kioocoivjjicd, ckxkvdo
                )
            )
        }
    }
}