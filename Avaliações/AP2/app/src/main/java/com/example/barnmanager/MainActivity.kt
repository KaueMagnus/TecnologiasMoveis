package com.example.barnmanager

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import com.example.barnmanager.data.BarnRepository
import com.example.barnmanager.data.model.Barn
import com.example.barnmanager.DetailsActivity
import com.example.barnmanager.ui.adapter.BarnAdapter
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val repository = BarnRepository()
    private lateinit var adapter: BarnAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rc = findViewById<RecyclerView>(R.id.recyclerView)
        adapter = BarnAdapter(
            onDelete = { item -> deleteItem(rc, item) },
            onDetails = { item -> goToDetails(item) }
        )
        rc.adapter = adapter

        adapter.submitList(repository.itemList)
    }

    private fun deleteItem(recyclerView: RecyclerView, item: Barn) {
        val newList = repository.itemList.filter { it.id != item.id }
        adapter.submitList(newList)

        Snackbar.make(recyclerView, "Deletado com Sucesso", Snackbar.LENGTH_LONG).show()
    }

    private fun goToDetails(item: Barn) {
        val intent = Intent(this, DetailsActivity::class.java).apply {
            this.putExtras(bundleOf("item" to item))
        }
        startActivity(intent)
    }
}