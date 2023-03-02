package com.tocaboca.tocalifeworldp.mcivjdhf
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import android.app.Application
import android.webkit.WebSettings
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel







class Riwijisjixc(ksoosoxijzc: Application): ViewModel() {
    val dydsuiijw = ksoosoxijzc.packageManager

    fun iwwokwkosdjix(mcmxkvfjjfi: String) {
        OneSignal.setExternalUserId(
            mcmxkvfjjfi,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(plrlodskf: JSONObject) {
                    try {
                        if (plrlodskf.has("push") && plrlodskf.getJSONObject("push").has("success")) {
                            val dxokzokc = plrlodskf.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $dxokzokc"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (plrlodskf.has("email") && plrlodskf.getJSONObject("email").has("success")) {
                            val pzllpalpsoksd =
                                plrlodskf.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $pzllpalpsoksd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (plrlodskf.has("sms") && plrlodskf.getJSONObject("sms").has("success")) {
                            val ywuwisjad = plrlodskf.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $ywuwisjad"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    fun jncxjnvid(fokke: WebView): WebSettings{
        val soposaodk = fokke.settings
        soposaodk.setSupportMultipleWindows(false)
        soposaodk.allowFileAccess = true
        soposaodk.allowFileAccess = true
        soposaodk.javaScriptEnabled = true
        soposaodk.userAgentString = soposaodk.userAgentString.replace("; wv", "")
        soposaodk.allowContentAccess = true
        soposaodk.loadWithOverviewMode = true
        soposaodk.setSupportZoom(true)
        soposaodk.pluginState = WebSettings.PluginState.ON
        soposaodk.javaScriptCanOpenWindowsAutomatically = true
        soposaodk.useWideViewPort = true
        soposaodk.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        soposaodk.domStorageEnabled = true
        soposaodk.allowContentAccess = true
        soposaodk.mediaPlaybackRequiresUserGesture = false
        soposaodk.builtInZoomControls = true
        soposaodk.displayZoomControls = false
        soposaodk.cacheMode = WebSettings.LOAD_DEFAULT

        return soposaodk
    }

    fun iosjjidwij(nicxjdji: String): Boolean {
        try {
            dydsuiijw.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

}