package co.cyclopsapps.passfromactivitytofragmentdatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import co.cyclopsapps.passfromactivitytofragmentdatabinding.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: MyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.myViewModelFragment = viewModel
        initObserver()
        binding.lifecycleOwner = this
        return binding.root
    }

    private fun initObserver() {
        viewModel.showMessage.observe(viewLifecycleOwner, Observer {
            it?.let {
                if (it) {
                    Toast.makeText(requireContext(), "Mensaje de binding", Toast.LENGTH_SHORT).show()
                }
                viewModel.endShowMessage()
            }
        })
    }

}