package kg.nurik.sambo.ui.registration

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.nurik.sambo.R
import kg.nurik.sambo.ui.main.MainActivity
import kotlinx.android.synthetic.main.fragment_registration.*

class RegistrationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnSambo.setOnClickListener {
            startActivity(Intent(requireContext(),
                MainActivity::class.java))
        }
        btnTrening.setOnClickListener {
            startActivity(Intent(requireContext(),
                MainActivity::class.java))
        }
        btnParent.setOnClickListener {
            startActivity(Intent(requireContext(),
                MainActivity::class.java))
        }
    }
}