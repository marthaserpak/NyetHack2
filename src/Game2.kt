fun main(args: Array<String>) {
    val userName = "Vovan"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = true

    //Users Health
    val healthStatus = formatHealthStatus(healthPoints, isImmortal, isBlessed)

    //Karma and aura
    val auraColor = auraColor(healthPoints)

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
    printPlayerStatus(healthPoints, auraColor, isBlessed, userName, healthStatus)

    castFireball()
}

private fun printPlayerStatus(healthPoints: Int, auraColor: String, isBlessed: Boolean, userName: String, healthStatus: String) {
    val statusFormattingString = "(HP: $healthPoints)(A: $auraColor)" +
            "(B: ${if (isBlessed) "Is Blessed" else "No"} -> $userName $healthStatus"
    println(statusFormattingString)
}

private fun auraColor(healthPoints: Int): String {
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
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, isImmortal: Boolean, isBlessed: Boolean) =
        when (healthPoints) {
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


private fun castFireball(numFireballs: Int = 2) =
        println("A glass of Fireball springs into existence. (x$numFireballs)")





