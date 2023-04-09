package com.example.ausapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val imgAlphabet = view.findViewById<ImageView>(R.id.imgAlphabet)
        imgAlphabet.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(activity, "Belajar Huruf Alfabet", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, AlphabetActivity::class.java)
                startActivity(intent)
            }
        })

        val imgNumber = view.findViewById<ImageView>(R.id.imgNumber)
        imgNumber.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(activity, "Belajar Angka", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, NumberActivity::class.java)
                startActivity(intent)
            }
        })

        val imgAnimal = view.findViewById<ImageView>(R.id.imgAnimals)
        imgAnimal.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(activity, "Mengenal Hewan", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, AnimalActivity::class.java)
                startActivity(intent)
            }
        })

        val imgPlant = view.findViewById<ImageView>(R.id.imgPlants)
        imgPlant.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(activity, "Mengenal Tumbuhan", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, PlantActivity::class.java)
                startActivity(intent)
            }
        })

        val imgAnimalVoice = view.findViewById<ImageView>(R.id.imgAnimalvoice)
        imgAnimalVoice.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(activity, "Mendengar Suara Hewan", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, AnimalVoiceActivity::class.java)
                startActivity(intent)
            }
        })

        val imgHumanVoice = view.findViewById<ImageView>(R.id.imgHumanvoice)
        imgHumanVoice.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(activity, "Menonton Percakapan", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, HumanVoiceActivity::class.java)
                startActivity(intent)
            }
        })

        val imgSpellingReading = view.findViewById<ImageView>(R.id.imgSpellread)
        imgSpellingReading.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(activity, "Belajar Mengeja dan Membaca", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, SpellingReadingActivity::class.java)
                startActivity(intent)
            }
        })

        val imgPuzzle = view.findViewById<ImageView>(R.id.imgPuzzle)
        imgPuzzle.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(activity, "Main Puzzle Yuk", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, PuzzleActivity::class.java)
                startActivity(intent)
            }
        })

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}