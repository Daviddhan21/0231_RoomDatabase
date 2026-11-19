package com.example.myapplication.uicontroller

import com.example.myapplication.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}