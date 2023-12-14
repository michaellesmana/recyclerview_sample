package com.vocaloid.miku.model

data class VocaloidCharModel(
    var name: String = "",
    var sex: String = "",
    var age: String = "",
    var bio: String = "",
    var birth: String = "",
    var voiceActor: String = "",
    var pic: Int = 0,
    var background: Int = 0,
    var elementColor: Int = 0,
    var wikiLink: String = ""
)
