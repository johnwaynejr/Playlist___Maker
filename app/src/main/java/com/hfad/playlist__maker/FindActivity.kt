package com.hfad.playlist___maker

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class FindActivity : AppCompatActivity() {

    companion object {
        const val ET_VALUE = "ET_VALUE"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val inputEditText = findViewById<EditText>(R.id.et_find)
        val strValET=inputEditText.text.toString()
        outState.putString(ET_VALUE,strValET)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val inputEditText = findViewById<EditText>(R.id.et_find)
        val strValET=savedInstanceState.getString(ET_VALUE)
        inputEditText.setText(strValET)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find)

        val inputEditText = findViewById<EditText>(R.id.et_find)
        val clearButton = findViewById<Button>(R.id.btn_clear)
        clearButton.visibility= View.INVISIBLE

        clearButton.setOnClickListener {
            inputEditText.text.clear()
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(clearButton.windowToken, 0)
        }
        val simpleTextWatcher = object:TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // empty
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) =

                if (s.isNullOrEmpty()) {
                    clearButton.visibility= View.INVISIBLE
                } else {
                    clearButton.visibility= View.VISIBLE
                }

            override fun afterTextChanged(p0: Editable?) {
                //empty
            }
        }

        //добавляем созданный simpleTextWatcher к EditText
        inputEditText.addTextChangedListener(simpleTextWatcher)

        //Обработка нажатия на кнопку "Назад"
        val btnBack = findViewById<ImageView>(R.id.find_activity_arrow_back)
        btnBack.setOnClickListener{
            //val displayIntent = Intent(this, MainActivity::class.java)
            //startActivity(displayIntent)
            onBackPressed()
        }


    }

val trOne = Track("Smells Like Teen Spirit","Nirvana","5:01","https://is5-ssl.mzstatic.com/image/thumb/Music115/v4/7b/58/c2/7b58c21a-2b51-2bb2-e59a-9bb9b96ad8c3/00602567924166.rgb.jpg/100x100bb.jpg")
val trTwo = Track("John Wayne","Michael Johnson","4:35","https://is5-ssl.mzstatic.com/image/thumb/Music125/v4/3d/9d/38/3d9d3811-71f0-3a0e-1ada-3004e56ff852/827969428726.jpg/100x100bb.jpg")
val trThree = Track("Stayin' Alive","Bee Gees","4:10","https://is4-ssl.mzstatic.com/image/thumb/Music115/v4/1f/80/1f/1f801fc1-8c0f-ea3e-d3e5-387c6619619e/16UMGIM86640.rgb.jpg/100x100bb.jpg")
val trFour = Track("Whole Lotta Love","Led Zeppelin","5:33","https://is2-ssl.mzstatic.com/image/thumb/Music62/v4/7e/17/e3/7e17e33f-2efa-2a36-e916-7f808576cf6b/mzm.fyigqcbs.jpg/100x100bb.jpg")
val trFive = Track("Sweet Child O'Mine","Guns N' Roses","5:03","https://is5-ssl.mzstatic.com/image/thumb/Music125/v4/a0/4d/c4/a04dc484-03cc-02aa-fa82-5334fcb4bc16/18UMGIM24878.rgb.jpg/100x100bb.jpg")

val trackList: ArrayList<Track> = arrayListOf(trOne,trTwo,trThree,trFour,trFive)

}