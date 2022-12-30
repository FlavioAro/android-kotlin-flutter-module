package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flutterModuleButton = findViewById<Button>(R.id.flutter_module_button)
        flutterModuleButton.setOnClickListener {
            startActivity(
                FlutterActivity
                    .withNewEngine()
                    .initialRoute("/first")
                    .build(this)
            )
        }

    }
}