package pe.devpicon.android.kotlindevs


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val fruits = listOf<String>("banana", "apple", "strawberry", "kiwi",
            "watermelon", "pineapple", "orange", "peach")

    private var myKotlinAdapter: MyKotlinAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.my_recyclerview) as RecyclerView
        myKotlinAdapter = MyKotlinAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myKotlinAdapter

    }

    override fun onResume() {
        super.onResume()

        myKotlinAdapter?.items = fruits
        myKotlinAdapter?.notifyDataSetChanged()
    }
}
