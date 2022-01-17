package PlayingCardsGenerator

import java.awt.Color
import java.awt.Font
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main() {
    var file: File
    var image: BufferedImage
    var newFile: File

    val suitFont = Font("card characters", Font.PLAIN, 170)
    val faceFont = Font("card characters", Font.PLAIN, 540)

    CardSuit.values().forEach { cardSuit ->
        val suitColor = Color.decode(cardSuit.hexColor)

        CardFace.values().forEach { cardFace ->
            file = File("C:\\Users\\Miro\\playing_cards\\sablona.png")
            image = ImageIO.read(file)

            with(image.graphics) {
                font = suitFont
                color = suitColor
                drawString(cardSuit.value, 30, 180)
            }

            with(image.graphics) {
                font = faceFont
                color = suitColor
                drawString(cardFace.value, 130, 650)
            }

            newFile = File("C:\\Users\\Miro\\playing_cards\\output\\card_${cardFace.abbr}${cardSuit.abbr}.png")
            ImageIO.write(image, "png", newFile)
        }
    }
}