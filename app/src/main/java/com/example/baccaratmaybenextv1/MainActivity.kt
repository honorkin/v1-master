package com.example.baccaratmaybenextv1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class MainActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this,
            "ca-app-pub-3940256099942544~3347511713")

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        val result1=" BANKER WIN \n Probability:"
        val result2=" PLAYER WIN \n Probability:"

        result.setOnClickListener {

         /*   val inputManager: InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

            val hideSoftInputFromWindow = inputManager.hideSoftInputFromWindow(
                currentFocus!!.windowToken,
                InputMethodManager.HIDE_NOT_ALWAYS
            ) */

            var ran = Math.random()
            var num08: kotlin.Int = Integer.parseInt(banker02.text.toString())
            var num02: kotlin.Int = Integer.parseInt(player02.text.toString())
            var num09: String? = (banker03.text.toString())

            val num10 : kotlin.Int?

            if( num09 != null && num09.length > 0)

            {
                num10 = Integer.parseInt(num09)

            } else

                num10  = num08

            var ran3 = Math.round(ran*1000)/1000.0

            if (num10 == 4 || num10 == 7 || num10 == 8 || num10 == 9) {
                textView.setText( "$result2"+(50 + ran3 *5 +num02/7))
            } else {
                textView.setText( "$result1"+ (50 + ran3 *5+num02/7))
            }

        }


        howtouse.setOnClickListener {
            var intent = Intent(this@MainActivity, SubActivity::class.java)
            startActivity(intent)
        }
    }


}