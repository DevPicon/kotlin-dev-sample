package pe.devpicon.android.kotlindevs

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import java.util.*

/**
 * Created by Armando on 11/26/2016.
 */
class MyKotlinAdapter() : RecyclerView.Adapter<MyKotlinAdapter.ViewHolder>() {

    var items: List<String>? = ArrayList<String>()

    fun setDataSource (items: List<String>){
        this.items = items
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.textView?.text = items?.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent?.context))
    }

    override fun getItemCount(): Int {
        return items?.size?: 0
    }


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView);
}