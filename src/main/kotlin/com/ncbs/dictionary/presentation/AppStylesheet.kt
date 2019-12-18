package com.ncbs.dictionary.presentation

import javafx.scene.text.FontPosture
import tornadofx.*

class AppStylesheet : Stylesheet() {

    companion object {
        val title by cssclass()
        val subtitle by cssclass()
        val content by cssclass()
    }

    init {
        title {
            fontSize = 48.px
        }
        subtitle {
            fontSize = 14.px
            fontStyle = FontPosture.ITALIC
        }
        content {
            fontSize = 18.px
        }
    }
}