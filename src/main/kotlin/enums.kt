package PlayingCardsGenerator

enum class CardFace(val abbr: Char, val value: String, val rankAceHigh: Int) {
    /*
        !!! Do not change order or rankAceHigh values !!!
        !!! Row values are based on it !!!
     */

    ACE('A', "A", 14),
    TWO('2', "2", 2),
    THREE('3', "3", 3),
    FOUR('4', "4", 4),
    FIVE('5', "5", 5),
    SIX('6', "6", 6),
    SEVEN('7', "7", 7),
    EIGHT('8', "8", 8),
    NINE('9', "9", 9),
    TEN('T', "10", 10),
    JACK('J', "J", 11),
    QUEEN('Q', "Q", 12),
    KING('K', "K", 13);
}

enum class CardSuit(val abbr: Char, val hexColor: String) {
    SPADES('s', "#000000"),         // black
    HEARTS('h', "#ff0000"),         // red
    DIAMONDS('d', "#0000ff"),       // blue
    CLUBS('c', "#00bb00");          // green
}