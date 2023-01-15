public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        player1.rollDice();
        player2.rollDice();

        System.out.println(Comparison.result(player1, player2));
    }
}