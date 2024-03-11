package com.example.babiloneapp3.ui.home
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.babiloneapp3.R
import com.example.babiloneapp3.databinding.FragmentHomeBinding
import com.example.babiloneapp3.ui.notifications.NotificationsViewModel

@Suppress("UNREACHABLE_CODE")
class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root

//        _binding.cvMarket.setOnClickListener {
//            findNavController().navigate(R.id.marketFragment)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}