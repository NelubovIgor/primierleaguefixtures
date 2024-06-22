package com.example.primierleaguefixtures

class FootballMatch(var team1Goals: Int = 0, var team2Goals: Int = 0) {
    fun setGoals(team1: Int, team2: Int) {
        team1Goals = team1
        team2Goals = team2
    }

    companion object {
        fun processMatches() {
            val matches = createMatches()

            println("Исходные матчи:")
            matches.forEach { println("Команда 1: ${it.team1Goals}, Команда 2: ${it.team2Goals}") }

            val nonDrawMatches = filterDraws(matches)
            println("\nМатчи без ничьих:")
            nonDrawMatches.forEach { println("Команда 1: ${it.team1Goals}, Команда 2: ${it.team2Goals}") }

            val maxGoalDifference = findMaxGoalDifference(nonDrawMatches)

            println("\nМатчи с максимальным разрывом в голах:")
            maxGoalDifference.forEach { println("Команда 1: ${it.team1Goals}, Команда 2: ${it.team2Goals}") }

        }

        private fun createMatches(): List<FootballMatch> {
            return List(10) { FootballMatch((0..5).random(), (0..5).random()) }
        }

        private fun filterDraws(matches: List<FootballMatch>): List<FootballMatch> {
            return matches.filter { it.team1Goals != it.team2Goals }
        }

        private fun findMaxGoalDifference(matches: List<FootballMatch>): Set<FootballMatch> {
            val maxDiff = matches.maxOfOrNull { kotlin.math.abs(it.team1Goals - it.team2Goals) } ?: return emptySet()
            return matches.filter { kotlin.math.abs(it.team1Goals - it.team2Goals) == maxDiff }.toSet()
        }

    }
}



