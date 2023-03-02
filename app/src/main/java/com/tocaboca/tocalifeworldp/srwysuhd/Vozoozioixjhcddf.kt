package com.tocaboca.tocalifeworldp.srwysuhd
import android.net.Uri
import org.koin.core.qualifier.named
import java.io.File
import android.content.Intent
import java.text.SimpleDateFormat
import android.widget.Toast
import android.webkit.*
import android.util.Log
import android.os.Bundle
import android.os.Handler
import com.tocaboca.tocalifeworldp.mcivjdhf.Riwijisjixc
import android.os.Environment
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.oxocvidisif
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.vbopopn
import java.io.IOException
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.splalpplx
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.os.Looper
import android.provider.MediaStore










class Vozoozioixjhcddf : AppCompatActivity() {
    private var rokoe = false
    var ovobivib = ""
    private var isjdjjwjisuhhuxc: String? = null
    private val apooowsd by viewModel<Riwijisjixc>(
        named("BeamModel")
    )
    lateinit var okzxkoc: WebView

    private var copxovkdkfodg: ValueCallback<Array<Uri>>? = null
    private  val dpwpwpwos = 1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        okzxkoc = WebView(this)
        setContentView(okzxkoc)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(okzxkoc, true)
        apooowsd.jncxjnvid(okzxkoc)

        okzxkoc.webViewClient = Toroeowoowwosdoax()
        okzxkoc.webChromeClient = Yowokwkoskoksodx()
        okzxkoc.loadUrl(cioboboovijic())
    }

    override fun onActivityResult(cjixvjidjifikofokd: Int, fvoocovb: Int, epqpqpqposksdko: Intent?) {

        if (cjixvjidjifikofokd != dpwpwpwos || copxovkdkfodg == null) {
            super.onActivityResult(cjixvjidjifikofokd, fvoocovb, epqpqpqposksdko)
            return
        }
        var boofoodij: Array<Uri>? = null

        if (fvoocovb == RESULT_OK) {
            if (epqpqpqposksdko == null) {
                if (isjdjjwjisuhhuxc != null) {
                    boofoodij = arrayOf(Uri.parse(isjdjjwjisuhhuxc))
                }
            } else {
                val ssjiwdjis = epqpqpqposksdko.dataString
                if (ssjiwdjis != null) {
                    boofoodij = arrayOf(Uri.parse(ssjiwdjis))
                }
            }
        }
        copxovkdkfodg!!.onReceiveValue(boofoodij)
        copxovkdkfodg = null
        return
    }

    override fun onBackPressed() {

        if (okzxkoc.canGoBack()) {
            if (rokoe) {
                okzxkoc.stopLoading()
                okzxkoc.loadUrl(ovobivib)
            }
            this.rokoe = true
            okzxkoc.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                rokoe = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
    private fun cioboboovijic(): String {
        val rppelds = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val nucuvhv = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val sdwjioiijjicx = rppelds.getString(oxocvidisif, null)
        val xcjiviixjcvjijijiidf = rppelds.getString(splalpplx, null)
        val woksdko = rppelds.getString(vbopopn, null)
        when (rppelds.getString("WebInt", null)) {
            "campaign" -> {
                apooowsd.iwwokwkosdjix(xcjiviixjcvjijijiidf.toString())
            }
            "deepLink" -> {
                apooowsd.iwwokwkosdjix(xcjiviixjcvjijijiidf.toString())
            }
            "deepLinkNOApps" -> {
                apooowsd.iwwokwkosdjix(sdwjioiijjicx.toString())
            }
            "geo" -> {
                apooowsd.iwwokwkosdjix(sdwjioiijjicx.toString())
            }
        }
        return nucuvhv.getString("SAVED_URL", woksdko).toString()
    }

    inner class Toroeowoowwosdoax: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (apooowsd.iosjjidwij(url)) {

                    val xcjis = Intent(Intent.ACTION_VIEW)
                    xcjis.data = Uri.parse(url)
                    startActivity(xcjis)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            dokkodkofw(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Vozoozioixjhcddf, description, Toast.LENGTH_SHORT).show()
        }
    }

    fun dokkodkofw(xcjivdi: String?) {
        if (!xcjivdi!!.contains("t.me")) {

            if (ovobivib == "") {
                ovobivib = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    xcjivdi
                ).toString()

                val ystdwwudhhsud = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val cnncvidjjif = ystdwwudhhsud.edit()
                cnncvidjjif.putString("SAVED_URL", xcjivdi)
                cnncvidjjif.apply()
            }
        }
    }

    inner class Yowokwkoskoksodx : WebChromeClient() {

        override fun onShowFileChooser(
            hucv: WebView?,
            spwlslpdlwlps: ValueCallback<Array<Uri>>?,
            uzxhchu: FileChooserParams?
        ): Boolean {
            copxovkdkfodg?.onReceiveValue(null)
            copxovkdkfodg = spwlslpdlwlps
            var okkoskoxijcjixjics: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (okkoskoxijcjixjics!!.resolveActivity(packageManager) != null) {
                var sjidwjidjijisjiad: File? = null
                try {
                    sjidwjidjijisjiad = rokekoeokkowkokoskod()
                    okkoskoxijcjixjics.putExtra("PhotoPath", isjdjjwjisuhhuxc)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (sjidwjidjijisjiad != null) {
                    isjdjjwjisuhhuxc = "file:" + sjidwjidjijisjiad.absolutePath
                    okkoskoxijcjixjics.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(sjidwjidjijisjiad)
                    )
                } else {
                    okkoskoxijcjixjics = null
                }
            }
            val llxzcok = Intent(Intent.ACTION_GET_CONTENT)
            llxzcok.addCategory(Intent.CATEGORY_OPENABLE)
            llxzcok.type = "image/*"
            val fpelsad: Array<Intent?> = okkoskoxijcjixjics?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val uncvncijifji = Intent(Intent.ACTION_CHOOSER)
            uncvncijifji.putExtra(Intent.EXTRA_INTENT, llxzcok)
            uncvncijifji.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            uncvncijifji.putExtra(Intent.EXTRA_INITIAL_INTENTS, fpelsad)
            startActivityForResult(uncvncijifji, dpwpwpwos)
            return true
        }

        fun rokekoeokkowkokoskod(): File? {
            val huxc = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val sopaakokoskookzxokc = "JPEG_" + huxc + "_"
            val wuwijisjidjiijx = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                sopaakokoskookzxokc,
                ".jpg",
                wuwijisjidjiijx
            )
        }
    }




}

