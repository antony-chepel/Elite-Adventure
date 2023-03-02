package com.tocaboca.tocalifeworldp.mcivjdhf
import android.content.Context
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.launch
import android.app.Application
import android.content.SharedPreferences
import com.appsflyer.AppsFlyerLib
import kotlinx.coroutines.Dispatchers
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tocaboca.tocalifeworldp.ncjxijvhud.Gppwpwposkkoxjic
import com.tocaboca.tocalifeworldp.ncjxijvhud.Fpappaps
import com.tocaboca.tocalifeworldp.ncjxijvhud.Jkskksx
import com.tocaboca.tocalifeworldp.ncjxijvhud.Uowowkkosjixhuchuxygsd


class Qowoksijxc(private val jjsijjixc: Gppwpwposkkoxjic, private val bhxzhchuhsud: Jkskksx, private val wookwlsldkox: SharedPreferences, val ekokosd: Application): ViewModel() {



    private val zpxppxocid = MutableLiveData<String?>()
    val rkoeko: LiveData<String?>
        get() = zpxppxocid

    suspend fun smksijdijhuzxhuc() {
        gxygsji.postValue(jjsijjixc.wowoplsd().body())
        koxkozpckocx()
    }

    private val gxygsji = MutableLiveData<Fpappaps>()
    val eplplwlps: LiveData<Fpappaps>
        get() = gxygsji





    suspend fun koxkozpckocx() {
        hdsufhij.postValue(bhxzhchuhsud.vpclvb().body())
    }

    private val hdsufhij = MutableLiveData<Uowowkkosjixhuchuxygsd>()
    val epwl: LiveData<Uowowkkosjixhuchuxygsd>
        get() = hdsufhij

    fun hssiosakoxcji(sdjwi: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            sdjwi
        ) { sokkowo: AppLinkData? ->
            sokkowo?.let {
                val mxzkkokocijduhf = sokkowo.targetUri?.host.toString()
                wookwlsldkox.edit().putString("deepSt", mxzkkokocijduhf).apply()
            }
        }
    }

    private val yusidijx = MutableLiveData<String>()
    val pallpslp: LiveData<String>
        get() = yusidijx

    init {
        viewModelScope.launch (Dispatchers.IO){
            ysjxncjnzjncijsjid()
        }
        viewModelScope.launch (Dispatchers.Main){
            smksijdijhuzxhuc()
        }
    }

    fun ysjxncjnzjncijsjid() {
        val kxizijcs = AdvertisingIdClient(ekokosd)
        kxizijcs.start()
        val dpellpwplsplasdppxclp = kxizijcs.info.id.toString()
        zpxppxocid.postValue(dpellpwplsplasdppxclp)
    }


    private val uzxhcuhxzs  = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(wijsokkoxkoco: MutableMap<String, Any>?) {
            val hucxjidjif = wijsokkoxkoco?.get("campaign").toString()
            yusidijx.postValue(hucxjidjif)


        }
        override fun onConversionDataFail(error: String?) {
        }
        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }
        override fun onAttributionFailure(error: String?) {
        }
    }





    fun uwhhshjjijjic(qppaooskxc: Context) {
        AppsFlyerLib.getInstance()
            .init("ZsV6k3wYXEBLqGHeoEtTcF", uzxhcuhxzs, ekokosd)
        AppsFlyerLib.getInstance().start(qppaooskxc)

    }





}