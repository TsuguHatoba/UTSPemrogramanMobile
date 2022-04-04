package com.example.uts.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uts.R
import com.example.uts.model.Olahraga

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Olahraga] data object.
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Olahraga>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val textView2: TextView = view.findViewById(R.id.item_subtitle)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val imageView2: ImageView = view.findViewById(R.id.item_image2)
    }

    //View baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //ganti view
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.textView2.text = context.resources.getString(item.stringResourceId2)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.imageView2.setImageResource(item.imageResourceId2)
    }

    //kembali ke dataset
    override fun getItemCount() = dataset.size
}
