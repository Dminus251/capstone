package com.example.secondcapstone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class plan_adpater(val itemList: ArrayList<plan_items>):
    RecyclerView.Adapter<plan_adpater.plan_Viewholder>() { //어댑터 상속

    inner class plan_Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val day = itemView.findViewById<TextView>(R.id.day)
        val date = itemView.findViewById<TextView>(R.id.date)
        val addBtn = itemView.findViewById<Button>(R.id.add)

        init { // 클릭 이벤트를 init때 생성해야 함 이유는 모르겠다..
            addBtn.setOnClickListener {
                Toast.makeText(itemView.context, "clicked.", Toast.LENGTH_SHORT).show()
                val clickedPosition = adapterPosition
                // 여기에 클릭 이벤트에 대한 로직을 추가하세요.
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): plan_adpater.plan_Viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plan_list_layout, parent, false)
        return plan_Viewholder(view)
    }

    override fun onBindViewHolder(holder: plan_Viewholder, position: Int) {
        //return itemList.count() //itemList는 class의 매개변수로 줌
        holder.day.text = itemList[position].day
        holder.date.text = itemList[position].date

    }

    override fun getItemCount(): Int {
        return itemList.count()

    }

}