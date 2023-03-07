package com.example.lottery_program

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = findViewById<TextView>(R.id.results)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            calculate(result)
        }
    }

    fun calculate(results: TextView) {
        var res = mutableListOf<Int>()

        var gen: Random = Random()
        var newNum = 1 + gen.nextInt(49)

        while (res.size < 6) {
            if (newNum !in res)
                res.add(newNum)
            else
                newNum = 1 + gen.nextInt(49)
        }
        results.setText(" ")

        for (i in res) {
            results.append("" + i + " ")
        }
    }
}