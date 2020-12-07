package kg.nurik.sambo.ui.registration

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kg.nurik.sambo.R
import kg.nurik.sambo.ui.main.MainActivity
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (RegistrationFinished())
            startActivity(Intent(requireContext(), MainActivity::class.java))

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnIn.setOnClickListener {
            startActivity(Intent(requireContext(), MainActivity::class.java))
            registrationFinished()
        }
        btnRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_registrationFragment)
            registrationFinished()
        }
    }

    private fun registrationFinished() {
        val sharedPref =
            requireActivity().getSharedPreferences("Registration", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finishedd", true)
        editor.apply()
    }

    private fun RegistrationFinished(): Boolean {
        val sharedPref =
            requireActivity().getSharedPreferences("Registration", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finishedd", false)
    }


}