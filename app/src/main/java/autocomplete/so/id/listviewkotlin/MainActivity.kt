package autocomplete.so.id.listviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.R.layout.simple_list_item_1
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sayuran = listOf("wortel", "kol", "buncis", "bayam", "kangkung", "pete", " jengkol", "cabe", "timun", "tomat", "terong")
        lv_languages.adapter = ArrayAdapter(this, simple_list_item_1, sayuran)

        // menangani item saat dilklik
        lv_languages.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Anda memilih: ${sayuran[position]}",Toast.LENGTH_SHORT).show()
        }    }
}
