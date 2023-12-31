package com.vocaloid.miku.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.vocaloid.miku.androidsubmissions.R
import com.vocaloid.miku.activity.DetailActivity
import com.vocaloid.miku.model.VocaloidCharModel

class ListCharAdapter(private val listChar: ArrayList<VocaloidCharModel>) : RecyclerView.Adapter<ListCharAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_char, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val genshinChar = listChar[position]
        Glide.with(holder.itemView.context)
                .load(genshinChar.pic)
                .apply(RequestOptions())
                .into(holder.picture)
        holder.name.text = genshinChar.name
        holder.vision.text = genshinChar.sex
        holder.affiliation.text = genshinChar.age
        holder.itemView.setOnClickListener {
            val passItem = Intent(context, DetailActivity::class.java)
            passItem.putExtra(DetailActivity.EXTRA_NAME, genshinChar.name)
            passItem.putExtra(DetailActivity.EXTRA_VISION, genshinChar.sex)
            passItem.putExtra(DetailActivity.EXTRA_AFFILIATION, genshinChar.age)
            passItem.putExtra(DetailActivity.EXTRA_INTRO, genshinChar.bio)
            passItem.putExtra(DetailActivity.EXTRA_BIRTH, genshinChar.birth)
            passItem.putExtra(DetailActivity.EXTRA_WEAPON, genshinChar.voiceActor)
            passItem.putExtra(DetailActivity.EXTRA_PIC, genshinChar.pic)
            passItem.putExtra(DetailActivity.EXTRA_PICBG, genshinChar.background)
            passItem.putExtra(DetailActivity.EXTRA_ELEMENT, genshinChar.elementColor)
            passItem.putExtra(DetailActivity.EXTRA_LINK, genshinChar.wikiLink)
            context.startActivity(passItem)
        }
    }

    override fun getItemCount(): Int {
        return listChar.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.char_name)
        var vision: TextView = itemView.findViewById(R.id.char_vision)
        var affiliation: TextView = itemView.findViewById(R.id.char_affiliation)
        var picture: ImageView = itemView.findViewById(R.id.char_pic)
    }
}