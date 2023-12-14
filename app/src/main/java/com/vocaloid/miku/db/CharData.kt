package com.vocaloid.miku.db

import com.vocaloid.miku.androidsubmissions.R
import com.vocaloid.miku.model.VocaloidCharModel

object CharData {
    private val database = arrayOf(
            arrayOf(
                    "Hatsune Miku",
                    "Sex: Female",
                    "Age: 16",
                    "Hatsune Miku (初はつ音ねミク?) is the titular character of Hatsune Miku: Project DIVA who has starred in every game in the series. She is based off the avatar of the voicebank of the same name produced by Crypton Future Media and originally released for VOCALOID 2, a singing synthesizer software.",
                    "8/31",
                    "Saki Fujita",
                    R.drawable.miku,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/Hatsune_Miku"
            ),
            arrayOf(
                    "Kagamine Rin",
                    "Sex: Female",
                    "Age: 14",
                    "Kagamine Rin (鏡かがみ音ねリン?) is a character in the Hatsune Miku: Project DIVA series.",
                    "N/A",
                    "Asami Shimoda",
                    R.drawable.rin,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/Kagamine_Rin"
            ),
            arrayOf(
                    "Kagamine Len",
                    "Sex: Male",
                    "Age: 14",
                    "As the wealthiest gentleman in Mondstadt, the ever-dapper Diluc always presents himself as the epitome of perfection. But behind the courteous visage burns a zealous soul that has sworn to protect Mondstadt at all costs, allowing him to mercilessly vanquish all who threaten his city. ",
                    "N/A",
                    "Asami Shimoda",
                    R.drawable.len,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/Kagamine_Len"
            ),
            arrayOf(
                    "Kanase Teto",
                    "Sex: Female",
                    "Age: 31",
                    "Kasane Teto (重かさ音ねテト?) is a character in Hatsune Miku: Project DIVA. Unlike the other characters, she is neither a VOCALOID character nor a Derivative but rather, she hails from UTAU, a free singing synthesiser software similar to the commercially-released VOCALOID.\n" +
                            "\n" +
                            "Teto made her debut in the series in Hatsune Miku: Project DIVA 2nd as DLC, although she used Hatsune Miku's voice responses. Her subsequent appearances do not depict her having a voice.",
                    "N/A",
                    "Mayo Oyamono",
                    R.drawable.teto,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/Kasane_Teto"
            ),
            arrayOf(
                    "Kaito",
                    "Sex: Male",
                    "Age: N/A",
                    "KAITO (カイト?) is a character in the Hatsune Miku: Project DIVA series.",
                    "N/A",
                    "Naoto Fūga",
                    R.drawable.kaito,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/KAITO"
            ),
            arrayOf(
                    "Megurine Luka",
                    "Sex: Female",
                    "Age: 20",
                    "Megurine Luka (巡めぐり音ねルカ Megurine Ruka?) is one of the main characters in the Hatsune Miku: Project DIVA series who has appeared in every title to date.\n" +
                            "\n",
                    "N/A",
                    "\n" +
                            "Yū Asakawa",
                    R.drawable.luka,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/Megurine_Luka"
            ),
            arrayOf(
                    "Meiko",
                    "Sex: Female",
                    "Age: N/A",
                    "MEIKO (メイコ?) is a character who appears in the Hatsune Miku: Project DIVA series. She is based off the avatar of the voicebank of the same name produced by YAMAHA Corporation and released for VOCALOID, a series of singing synthesizer software.\n" +
                            "\n",
                    "N/A",
                    "Meiko Haigō",
                    R.drawable.meiko,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/MEIKO"
            ),
            arrayOf(
                    "Gumi",
                    "Sex: Female",
                    "Age: N/A",
                    "GUMI (グミ?) is a guest character that has appeared in the Project Mirai series.\n" +
                            "\n",
                    "N/A",
                    "Megumi Nakajima",
                    R.drawable.gumi,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/GUMI"
            ),
            arrayOf(
                    "Hatsune Miku_2",
                    "Sex: Female",
                    "Age: 16",
                    "Hatsune Miku (初はつ音ねミク?) is the titular character of Hatsune Miku: Project DIVA who has starred in every game in the series. She is based off the avatar of the voicebank of the same name produced by Crypton Future Media and originally released for VOCALOID 2, a singing synthesizer software.",
                    "8/31",
                    "Saki Fujita",
                    R.drawable.miku,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/Hatsune_Miku"
            ),
            arrayOf(
                    "Kagamine Rin_2",
                    "Sex: Female",
                    "Age: 14",
                    "Kagamine Rin (鏡かがみ音ねリン?) is a character in the Hatsune Miku: Project DIVA series.",
                    "N/A",
                    "Asami Shimoda",
                    R.drawable.rin,
                    R.drawable.vocaloid_logo,
                    0,
                    "https://project-diva.fandom.com/wiki/Kagamine_Rin"
            ),
    )

    val listData: ArrayList<VocaloidCharModel>
        get(){
                val list = ArrayList<VocaloidCharModel>()
                for (data in database) {
                        val vocaloidChar = VocaloidCharModel()
                        vocaloidChar.name = data[0] as String
                        vocaloidChar.sex = data[1] as String
                        vocaloidChar.age = data[2] as String
                        vocaloidChar.bio = data[3] as String
                        vocaloidChar.birth = data[4] as String
                        vocaloidChar.voiceActor = data[5] as String
                        vocaloidChar.pic = data[6] as Int
                        vocaloidChar.background = data[7] as Int
                        vocaloidChar.elementColor = data[8] as Int
                        vocaloidChar.wikiLink = data[9] as String

                        list.add(vocaloidChar)
                }
                return list
        }
}