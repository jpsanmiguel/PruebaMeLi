package sanmiguel.juan.pruebatecnicameli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import sanmiguel.juan.pruebatecnicameli.network.MeLiRestApi

class MainActivity : AppCompatActivity() {
    private var viewModelJob = Job()
    private var coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSearchQuery()
    }

    fun getSearchQuery() {
        coroutineScope.launch {
            val searchQuery =
                MeLiRestApi.MeLiApiService.meLiApiService.searchAsync("iPhone", 25, 0).await()
            findViewById<TextView>(R.id.textView).text = searchQuery.toString()
            println("Resuuuuuuuult:\n$searchQuery")
        }
    }
}