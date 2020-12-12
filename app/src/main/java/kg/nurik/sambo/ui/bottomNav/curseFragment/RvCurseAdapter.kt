package kg.nurik.sambo.ui.bottomNav.curseFragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.nurik.sambo.R
import kg.nurik.sambo.data.model.CurseListCategories

class RvCurseAdapter() : RecyclerView.Adapter<ViewHolder>() {

    private val list = arrayListOf<CurseListCategories<Any?>>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_curse, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = list.size

    fun update(list: List<CurseListCategories<Any?>>?) {
        if (list != null) {
            this.list.clear()
            this.list.addAll(list)
            notifyDataSetChanged()
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(point: CurseListCategories<Any?>) {

    }
}