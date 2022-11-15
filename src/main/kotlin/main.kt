package playingCardsGenerator

import java.awt.Color
import java.awt.Font
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

const val DIRECTORY_PATH = "C:\\Users\\Miro\\playing_cards\\"
const val OUTPUT_DIRECTORY_PATH = "C:\\Users\\Miro\\playing_cards\\output\\"

const val TEMPLATE_FILE = "template.png"

const val SUIT_FONT_SIZE = 170
const val FACE_FONT_SIZE = 540

const val SUIT_POSITION_X = 30
const val SUIT_POSITION_Y = 180
const val CARD_POSITION_X = 130
const val CARD_POSITION_Y = 650

fun main() {
    var templateFile: File
    var image: BufferedImage
    var newFile: File

    val suitFont = Font("card characters", Font.PLAIN, SUIT_FONT_SIZE)
    val faceFont = Font("card characters", Font.PLAIN, FACE_FONT_SIZE)

    CardSuit.values().forEach { cardSuit ->
        val suitColor = Color.decode(cardSuit.hexColor)

        CardFace.values().forEach { cardFace ->
            templateFile = File(DIRECTORY_PATH + TEMPLATE_FILE)
            image = ImageIO.read(templateFile)

            with(image.graphics) {
                font = suitFont
                color = suitColor
                drawString(cardSuit.value, SUIT_POSITION_X, SUIT_POSITION_Y)
            }

            with(image.graphics) {
                font = faceFont
                color = suitColor
                drawString(cardFace.value, CARD_POSITION_X, CARD_POSITION_Y)
            }

            newFile = File(OUTPUT_DIRECTORY_PATH + "card_${cardFace.abbr}${cardSuit.abbr}.png")
            ImageIO.write(image, "png", newFile)
        }
    }
}