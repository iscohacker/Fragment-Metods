package uz.iskandarbek.fragment_metods

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.iskandarbek.fragment_metods.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    lateinit var birinchiFragment: BirinchiFragment
    lateinit var ikkinchiFragment: IkkinchiFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        birinchiFragment = BirinchiFragment()
        ikkinchiFragment = IkkinchiFragment()


        binding.add.setOnClickListener {
            val manager = supportFragmentManager
            manager.beginTransaction()
                .add(R.id.container, birinchiFragment)
                .commit()
        }
        binding.remove.setOnClickListener {
            val manager = supportFragmentManager
            manager.beginTransaction()
                .remove(birinchiFragment)
                .commit()
        }
        binding.replace.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ikkinchiFragment)
                .addToBackStack("ISCO Developer")
                .commit()
        }
        binding.hide.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .hide(birinchiFragment)
                .commit()
        }
        binding.show.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .show(birinchiFragment)
                .commit()
        }
        binding.detach.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .detach(birinchiFragment)
                .commit()
        }
        binding.attach.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .attach(birinchiFragment)
                .commit()
        }
        binding.pop.setOnClickListener {
            supportFragmentManager.popBackStack()
        }
    }
}
