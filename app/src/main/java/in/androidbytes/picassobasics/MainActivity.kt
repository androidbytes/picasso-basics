package `in`.androidbytes.picassobasics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.MemoryPolicy
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the picasso instance
        val picasso = Picasso.get()

        //load the image
        picasso.load("https://cdn.pixabay.com/photo/2018/09/23/20/56/sparrow-3698507__340.jpg")
                //.resize(300, 300)
                .fit()
                //.placeholder(R.drawable.placeholder)
                //.error(R.drawable.error)
                //.memoryPolicy(MemoryPolicy.NO_CACHE)
                //.networkPolicy(NetworkPolicy.NO_CACHE)
                .into(imageView)
    }

}
