package chia.androidassignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MovieRater : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_rater)




    }
    fun btnClick(v: View){
        var theText = "title = Venom\nMovieRating=5"

        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, theText, duration)
        toast.show()
    }





}
