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
            val sendIntent = Intent(Intent.ACTION_SEND)
            sendIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.link))
            sendIntent.type = getString(R.string.send_intent_type)
            startActivity(sendIntent)
        }
        //Обработка нажатия на кнопку "Написать в поддержку"
        val btnSupportId = findViewById<ImageView>(R.id.iV_Support)
        btnSupportId.setOnClickListener{
            val subject = getString(R.string.mail_subject)
            val message = getString(R.string.mail_message)
            val supportIntent = Intent(Intent.ACTION_SENDTO)
            supportIntent.data = Uri.parse(getString(R.string.uri_parse))
            supportIntent.putExtra(Intent.EXTRA_EMAIL,getString(R.string.email))
            supportIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
            supportIntent.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(supportIntent)
        }

        //Обработка нажатия на кнопку "Написать в поддержку"
        val btnUserAgreementId = findViewById<ImageView>(R.id.iV_UserAgreement)
        btnUserAgreementId.setOnClickListener{
            val url = getString(R.string.offer);
            val agreementIntent = Intent(Intent.ACTION_VIEW);
            agreementIntent.setData(Uri.parse(url));
            startActivity(agreementIntent)
        }

        //Обработка нажатия на кнопку "Назад"
        val btnBackId = findViewById<ImageView>(R.id.iV_ArrowBack)
        btnBackId.setOnClickListener{
            val displayIntent = Intent(this, MainActivity::class.java)
            startActivity(displayIntent)
        }

    }
}