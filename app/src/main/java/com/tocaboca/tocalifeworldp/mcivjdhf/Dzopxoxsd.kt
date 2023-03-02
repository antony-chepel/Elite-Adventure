package com.tocaboca.tocalifeworldp.ncjxijvhud

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


@Keep
data class Uowowkkosjixhuchuxygsd(
    @SerializedName("el_adven_gudijeijsaas")
    val gkofd: String,
    @SerializedName("el_adven_vbniiivuu")
    val sposlsa: String,
    @SerializedName("el_adven_arewwssadxc")
    val vockbko: String,
)


class Jkskksx(private val xuhcsok: Gjssijjixic) {
    suspend fun vpclvb() = xuhcsok.oxksijd()
}

interface Gjssijjixic {
    @GET("el_adven.json")
    suspend fun oxksijd(): Response<Uowowkkosjixhuchuxygsd>
}
class Gppwpwposkkoxjic(private val bvcijjbf: Reopwllslpx) {
    suspend fun wowoplsd() = bvcijjbf.cvnjnjdkof()
}
@Keep
data class Fpappaps(
    @SerializedName("countryCode")
    val jcnxvjnd: String,
)

interface Reopwllslpx {
    @GET("json/?key=LbwKKoO9eF4GLMz")
    suspend fun cvnjnjdkof(): Response<Fpappaps>
}












