package com.tocaboca.tocalifeworldp.ncjxijvhud
import org.koin.core.qualifier.named
import android.content.SharedPreferences
import android.view.ViewGroup
import com.tocaboca.tocalifeworldp.R
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.hchxyd
import android.view.LayoutInflater
import android.os.Bundle
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.rokokkocox
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import android.view.View
import androidx.fragment.app.Fragment
import android.content.Context
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldp.mcivjdhf.Qowoksijxc


class Nkwowosdxc : Fragment() {

    lateinit var hhcbxjidijfjie: String
    val jicjis: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var wiowokkos: String

    private lateinit var wywuhsud: Context
    val ckofkokovkocbkobko by activityViewModel<Qowoksijxc>(named("MainModel"))
    lateinit var wopqplqs: String




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.spwpwosxzcs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ckofkokovkocbkobko.rkoeko.observe(viewLifecycleOwner) {
            if (it != null) {
                val xjizijsjid = it.toString()
                jicjis.edit().putString("mainId", xjizijsjid).apply()
            }
        }

        ckofkokovkocbkobko.epwl.observe(viewLifecycleOwner) {
            if (it != null) {

                wopqplqs = it.gkofd
                wiowokkos = it.vockbko
                hhcbxjidijfjie = it.sposlsa

                jicjis.edit().putString(hchxyd, wopqplqs).apply()
                jicjis.edit().putString(Mkxooicsdsdf.rplepleplplskodkookx, wiowokkos).apply()
                jicjis.edit().putString(rokokkocox, hhcbxjidijfjie).apply()

                findNavController().navigate(R.id.vofoovijcbifd)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        wywuhsud = context
    }

}