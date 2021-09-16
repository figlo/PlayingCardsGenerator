package PlayingCardsGenerator

import PlayingCardsGenerator.CardSuit.*
import java.awt.Color
import java.awt.Font
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main() {
    var file: File
    var image: BufferedImage
    var newFile: File
    val newFont = Font("Arial", Font.BOLD, 250)
    CardSuit.values().forEach { cardSuit ->
        file = File("C:\\Users\\Miro\\playing_cards\\${cardSuit.name.lowercase()}_final.png")
        CardFace.values().forEach { cardFace ->
            image = ImageIO.read(file)
            with(image.graphics) {
                font = newFont
                color = when (cardSuit) {
                    SPADES, CLUBS -> Color.BLACK
                    HEARTS, DIAMONDS -> Color.RED
                }
                drawString(cardFace.value, 30, 220)
            }
            newFile = File("C:\\Users\\Miro\\playing_cards\\output\\${cardFace.abbr}${cardSuit.abbr}.png")
            ImageIO.write(image, "png", newFile)
        }
    }
}