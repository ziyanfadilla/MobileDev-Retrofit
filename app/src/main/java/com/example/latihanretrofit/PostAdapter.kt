package com.example.latihanretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter (private val list: ArrayList<PostResponse>): RecyclerView.Adapter<>(){
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(postResponse: PostResponse) {
            with(itemView) {
                val text =  "id: ${postResponse.id}\n" +
                        "title: ${postResponse.title}\n" +
                        "text: ${postResponse.text}"

                tvText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(list[position])
    }
}
