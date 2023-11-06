package com.sangvaleap.lab3_table_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import com.sangvaleap.lab3_table_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            addNewTableRow()
        }
    }

    private fun addNewTableRow(){
        println("addNewTableRow")
        val tableRow = TableRow(this)
        println("addNewTableRow 2")
        val textView1 = TextView(this)
        textView1.text = binding.etVersion.text
        textView1.layoutParams = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f)
        val textView2 = TextView(this)
        textView2.text =  binding.etCodeName.text
        textView2.layoutParams = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f)
        println("addNewTableRow 3")
        tableRow.addView(textView1)
        tableRow.addView(textView2)

        binding.tbLayout.addView(tableRow)
        println("addNewTableRow 4")
    }
}