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

    val newFont = Font("arial", Font.BOLD, 550)

    CardSuit.values().forEach { cardSuit ->
        file = File("C:\\Users\\Miro\\playing_cards\\${cardSuit.name.lowercase()}_sablona.png")
        CardFace.values().forEach { cardFace ->
            image = ImageIO.read(file)
            with(image.graphics) {
                font = newFont
                color = when (cardSuit) {
                    SPADES -> Color.BLACK
                    CLUBS -> Color.decode("#35654d")
                    HEARTS -> Color.decode("#ff3322")
                    DIAMONDS -> Color.decode("#0051d8")
                }
                val value = cardFace.value
                val x = when(value) {
                    "10" -> {
                        drawString("1", -20, 650)
                        drawString("0", 200, 650)
                        return@with
                    }
                    "K", "Q", "A" -> 60
                    else -> 170
                }
                drawString(value, x, 650)
            }
            newFile = File("C:\\Users\\Miro\\playing_cards\\output\\card_${cardFace.abbr}${cardSuit.abbr}.png")
            ImageIO.write(image, "png", newFile)
        }
    }
}