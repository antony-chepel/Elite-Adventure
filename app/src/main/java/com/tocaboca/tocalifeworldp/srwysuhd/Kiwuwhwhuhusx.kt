package com.tocaboca.tocalifeworldp.srwysuhd
import androidx.navigation.fragment.findNavController
import android.view.ViewGroup
import android.content.Context
import android.view.View
import android.view.LayoutInflater
import com.tocaboca.tocalifeworldp.R
import com.tocaboca.tocalifeworldp.mcivjdhf.Qowoksijxc
import com.tocaboca.tocalifeworldp.ncjxijvhud.Mkxooicsdsdf.ixjcjiijzjs
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.android.ext.android.inject
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import org.koin.core.qualifier.named


class Kiwuwhwhuhusx : Fragment() {
    lateinit var zokpxkock: String
    private lateinit var xizkos: Context
    val zpllpxals: SharedPreferences by inject(named("SharedPreferences"))
    val pelplwsp by activityViewModel<Qowoksijxc>(named("MainModel"))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.nookkobijvfd, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pelplwsp.eplplwlps.observe(viewLifecycleOwner) {
            if (it!=null) {
                zokpxkock = it.jcnxvjnd
                zpllpxals.edit().putString(ixjcjiijzjs, zokpxkock).apply()
                findNavController().navigate(R.id.trueijdsifv)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        xizkos = context
    }










}