package com.example.passobjusingnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.passobjusingnavigation.databinding.FragmentEmployeeBinding


class EmployeeFragment : Fragment() {
    private lateinit var binding: FragmentEmployeeBinding
    private lateinit var employee: Employee

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmployeeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        employee = Employee()
        binding.employeeName.text = employee.name
        binding.employeeTitle.text = employee.title
        binding.button.setOnClickListener {
            val action =
                EmployeeFragmentDirections.actionEmployeeFragmentToEmployeeDetailsFragment(employee)
            findNavController().navigate(action)
        }
    }


}