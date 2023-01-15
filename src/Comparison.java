public class Comparison {
    private Comparison() {}

    public static Player result(Player player1, Player player2) {
        Player winner = player2;
        for (Combinations combination : Combinations.getCombinations().keySet()) {
            if (player1.getDices().containsAll(combination.getCurrency())) {
                player1.setCombination(combination);
            }
            if (player2.getDices().containsAll(combination.getCurrency())) {
                player2.setCombination(combination);
            }
        }
        if (player1.getCombination().getScore() >= player2.getCombination().getScore()) {
            winner = player1;
        }
        return winner;
    }
}
