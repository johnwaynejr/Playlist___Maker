package com.hfad.playlist___maker

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SettigsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        //Обработка нажатия на кнопку "Поделиться приложением"
        val btnShareId = findViewById<ImageView>(R.id.iV_Share)
        btnShareId.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT, "https://practicum.yandex.ru/android-developer/")
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }
        //Обработка нажатия на кнопку "Написать в поддержку"
        val btnSupportId = findViewById<ImageView>(R.id.iV_Support)
        btnShareId.setOnClickListener{
            val message = "Спасибо разработчикам и разработчицам за крутое приложение!"
            val supportIntent = Intent(Intent.ACTION_SENDTO)
            supportIntent.data = Uri.parse("Сообщение разработчикам и разработчицам приложения Playlist Maker")
            supportIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("for_mail_box@mail.ru"))
            supportIntent.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(supportIntent)
        }

        //Обработка нажатия на кнопку "Написать в поддержку"
        val btnUserAgreementId = findViewById<ImageView>(R.id.iV_Support)
        btnUserAgreementId.setOnClickListener{
            val url = "http://www.example.com";
            val agreementIntent = Intent(Intent.ACTION_VIEW);
            agreementIntent.setData(Uri.parse(url));
            startActivity(agreementIntent)
        }


    }
}