package com.example.motivation.infra

/**
 * Chaves usadas pela aplicação
 * Definir em variáveis para remover o risco de digitar incorretamente
 * */
class MotivationConstants private constructor() {

    object KEY {
        const val PERSON_NAME = "personName"
    }

    object PHRASEFILTER {
        const val ALL = 0
        const val HAPPY = 1
        const val SUNNY = 2
    }

    object LANGUAGE {
        const val PORTUGUESE = "pt"
        const val ENGLISH = "en"
        const val FRENCH = "fr"
    }
}