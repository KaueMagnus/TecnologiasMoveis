package com.example.barnmanager

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.barnmanager.R
import com.example.barnmanager.data.model.Barn

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Detalhes"

        val item = intent.getSerializableExtra("item") as? Barn

        item?.let {
            findViewById<TextView>(R.id.tvNome).text = it.nome
            findViewById<TextView>(R.id.tvDescricao).text = it.descricao
            findViewById<TextView>(R.id.tvQuantidade).text = "Quantidade: ${it.quantidade}"
            findViewById<TextView>(R.id.tvCategoria).text = "Categoria: ${it.categoria}"
        }

        findViewById<Button>(R.id.btnDelete).setOnClickListener {
            // Aqui você implementa a exclusão real (exemplo simplificado)
            finish()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}