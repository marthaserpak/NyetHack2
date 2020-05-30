fun main(args: Array<String>) {
    val userName = "Vovan"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = true

    //Users Health
    val healthStatus = when (healthPoints) {
        100 -> if (isImmortal) {
            " He is an Immortal!"
        } else {
            " Is in excellent condition!"
        }
        in 90..99 -> " has a few scratches."
        in 75..89 -> if (isBlessed) {
            " has some minor wounds but is healing quickly!"
        } else {
            " has some minor wounds."
        }
        in 15..74 -> " looks pretty hurt."
        else -> " is in awful condition"
    }

    //Karma and aura
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) *
            20).toInt()

    val auraColor = if (karma in 0..5) {
        "Red"
    } else if (karma in 6..10) {
        "Orange"
    } else if (karma in 11..15) {
        "Purple"
    } else {
        "Green"
    }

    //Users fraction
    val race = "gnome"
    val fraction = when (race) {
        "dwarf" -> "Keepers of the Mines."
        "gnome" -> "Keepers of the Mines."
        "orc" -> "Free People from Rolling Hills"
        "human" -> "Free People from Rolling Hills"
        else -> "Aliens from the space"
    }

    //Player Status
    val statusFormattingString = "(HP: $healthPoints)(A: $auraColor)" +
            "(B: $isBlessed) -> $userName $healthStatus"
    println(statusFormattingString)
}




