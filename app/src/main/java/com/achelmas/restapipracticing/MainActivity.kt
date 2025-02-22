package com.achelmas.restapipracticing
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var title: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = findViewById(R.id.titleId)

        var data = mapOf(
            "body" to "Hello World"
        )

        val call = ApiClient.instance.updatePost(1 , data)

        call.enqueue( object: Callback<Post> {
            override fun onResponse(p0: Call<Post>, p1: Response<Post>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(p0: Call<Post>, p1: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}
