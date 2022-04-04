package com.example.uts.data

import com.example.uts.R
import com.example.uts.model.Olahraga

class Datasource {

    fun loadOlahraga(): List<Olahraga> {
        return listOf<Olahraga>(
            //Mengambil dari package model dan diteruskan ke res/values/strings.xml
            Olahraga(R.string.Olahraga1,R.string.Desk01, R.drawable.image1,R.drawable.basket),
            Olahraga(R.string.Olahraga2,R.string.Desk02, R.drawable.image2,R.drawable.bola),
            Olahraga(R.string.Olahraga3,R.string.Desk03, R.drawable.image3,R.drawable.tenis),
            Olahraga(R.string.Olahraga4,R.string.Desk04, R.drawable.image4,R.drawable.tenis),
            Olahraga(R.string.Olahraga5,R.string.Desk05, R.drawable.image5,R.drawable.badminton),
            Olahraga(R.string.Olahraga6,R.string.Desk06, R.drawable.image6,R.drawable.vole),
            Olahraga(R.string.Olahraga7,R.string.Desk07, R.drawable.image7,R.drawable.bola),
            Olahraga(R.string.Olahraga8,R.string.Desk08, R.drawable.image8,R.drawable.baseball),
            Olahraga(R.string.Olahraga9,R.string.Desk09, R.drawable.image9,R.drawable.baseball),
            Olahraga(R.string.Olahraga10,R.string.Desk10, R.drawable.image10,R.drawable.amfoot),
        )
    }
}