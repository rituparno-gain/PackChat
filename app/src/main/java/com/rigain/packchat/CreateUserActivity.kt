package com.rigain.packchat

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profileDefault"
    var avatarBGColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar (view: View){
        val randomValue = Random()
        val avatarTheme = randomValue.nextInt(2)
        val avatarImage = randomValue.nextInt(28)

        if ( avatarTheme == 0 ) {
            userAvatar = "light$avatarImage"
        } else {
            userAvatar = "dark$avatarImage"
        }

        val avatarResourceID = resources.getIdentifier(userAvatar,"drawable", packageName)
        createAvatarImageView.setImageResource(avatarResourceID)

    }

    fun generateBGColorClicked ( view: View ) {
        val randomValue = Random()
        val r = randomValue.nextInt(255)
        val g = randomValue.nextInt(255)
        val b = randomValue.nextInt(255)

        createAvatarImageView.setBackgroundColor(Color.rgb(r,g,b))

        val savedR = r.toDouble() / 255
        val savedG = g.toDouble() / 255
        val savedB = b.toDouble() / 255

        avatarBGColor = "[$savedR, $savedG, $savedB, 1]"

    }

    fun createUserClicked ( view: View ) {


    }
}
