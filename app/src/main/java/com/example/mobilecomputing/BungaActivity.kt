package com.example.mobilecomputing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BungaActivity : AppCompatActivity() {

    private lateinit var bungaRecyclerView: RecyclerView
    private lateinit var bungaAdapter: MyAdapter
    private lateinit var listBunga: ArrayList<ItemData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bunga)

        bungaRecyclerView = findViewById(R.id.bungaRecyclerView)
        listBunga = ArrayList()

        listBunga.add(ItemData(R.drawable.lily, "Lily", "Bunga lily dikenal karena keanggunannya dan aromanya yang khas. Melambangkan kemurnian dan kesucian, lily sering digunakan dalam upacara pernikahan dan pemakaman. Bunga ini memiliki berbagai warna, seperti putih, kuning, merah, dan oranye."))
        listBunga.add(ItemData(R.drawable.poppy, "Poppy", "Bunga poppy mencolok dengan kelopaknya yang tipis seperti kertas dan warnanya yang cerah, terutama merah. Di banyak budaya, poppy melambangkan ingatan dan penghormatan terhadap para pahlawan perang, terutama di Eropa dan Amerika."))
        listBunga.add(ItemData(R.drawable.lavender, "Lavender", "Lavender terkenal karena warna ungunya yang cantik dan aroma harumnya yang menenangkan. Sering digunakan dalam aromaterapi dan produk perawatan tubuh. Melambangkan ketenangan, kebersihan, dan keanggunan."))
        listBunga.add(ItemData(R.drawable.dahlia, "Dahlia", "Dahlia memiliki bentuk kelopak yang kompleks dan beragam warna. Bunga ini melambangkan kekuatan batin, kreativitas, dan keanggunan. Dahlia sangat populer dalam taman bunga karena keindahannya yang mencolok."))

        bungaRecyclerView.layoutManager = LinearLayoutManager(this)
        bungaRecyclerView.setHasFixedSize(true)

        bungaAdapter = MyAdapter(listBunga)
        bungaRecyclerView.adapter = bungaAdapter
    }
}
