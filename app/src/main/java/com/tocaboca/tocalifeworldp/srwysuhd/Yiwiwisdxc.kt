package com.tocaboca.tocalifeworldp.ncjxijvhud
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import org.koin.core.qualifier.named
import android.view.ViewGroup
import android.content.SharedPreferences
import android.view.View
import androidx.navigation.fragment.findNavController
import org.koin.android.ext.android.inject
import android.content.Context
import android.os.Bundle
import com.tocaboca.tocalifeworldp.R
import com.tocaboca.tocalifeworldp.mcivjdhf.Qowoksijxc
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.rplepleplplskodkookx
import org.koin.androidx.viewmodel.ext.android.activityViewModel



class Yiwiwisdxc : Fragment() {
    val dekoekor by activityViewModel<Qowoksijxc>(named("MainModel"))
    lateinit var sjiow: String
    private lateinit var lspsodkijxjic: Context
    val kmxcjnxcsihjcshu: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jckkcxiuhf, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ssoskokkkoxc = kmxcjnxcsihjcshu.getString(rplepleplplskodkookx, null)
        val eplqlpskodok = kmxcjnxcsihjcshu.getString("appCamp", null)

        if (ssoskokkkoxc=="1" &&eplqlpskodok == null) {
            dekoekor.uwhhshjjijjic(lspsodkijxjic)
            dekoekor.pallpslp.observe(viewLifecycleOwner) {
                if (it != null) {
                    sjiow = it.toString()
                    kmxcjnxcsihjcshu.edit().putString("appCamp", sjiow).apply()
                    findNavController().navigate(R.id.cwooqoooqwis)
                }
            }
        } else {
            findNavController().navigate(R.id.cwooqoooqwis)
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        lspsodkijxjic = context
    }

}