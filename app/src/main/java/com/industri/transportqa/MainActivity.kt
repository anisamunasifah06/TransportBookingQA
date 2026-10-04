package com.industri.transportqa

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNik = findViewById<EditText>(R.id.etNik)
        val etName = findViewById<EditText>(R.id.etName)
        val btnSubmitBooking = findViewById<Button>(R.id.btnSubmitBooking)
        val tvBookingStatus = findViewById<TextView>(R.id.tvBookingStatus)

        btnSubmitBooking.setOnClickListener {
            val nik = etNik.text.toString()
            val name = etName.text.toString()

            if (nik.isEmpty()) {
                tvBookingStatus.text = "NIK tidak boleh kosong"
            } else if (name.isEmpty()) {
                tvBookingStatus.text = "Data belum lengkap"
            } else if (nik.length == 16) {
                tvBookingStatus.text = "Pemesanan Tiket Berhasil Diverifikasi"
            } else {
                tvBookingStatus.text = "Data belum lengkap"
            }
        }
    }
}