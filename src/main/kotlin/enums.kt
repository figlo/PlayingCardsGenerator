package playingCardsGenerator

enum class CardFace(val abbr: Char, val value: String) {
    /*
        Must be installed Card Characters font:
        https://haroldsfonts.com/font/card-characters/
     */

    ACE('A', "A"),
    TWO('2', "2"),
    THREE('3', "3"),
    FOUR('4', "4"),
    FIVE('5', "5"),
    SIX('6', "6"),
    SEVEN('7', "7"),
    EIGHT('8', "8"),
    NINE('9', "9"),
    TEN('T', "="),
    JACK('J', "J"),
    QUEEN('Q', "Q"),
    KING('K', "K");
}

enum class CardSuit(val abbr: Char, val hexColor: String, val value: String) {
    SPADES('s', "#000000", "}"),         // black
    HEARTS('h', "#ff3322", "{"),         // red
    DIAMONDS('d', "#0051d8", "["),       // blue
    CLUBS('c', "#119251", "]");          // green (original green: #35654d
}