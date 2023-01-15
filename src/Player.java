import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Player {
    private final List<Integer> dices = new ArrayList<>();
    Combinations combination;

    Random random = new Random();
    public Player() {}

    public void rollDice() {
        for (int i = 1; i <= 5; i++) {
            dices.add(random.nextInt(6) + 1);
        }
        dices.sort(Comparator.naturalOrder());
    }

    public List<Integer> getDices() {
        return dices.stream().sorted().collect(Collectors.toList());
    }

    public void setCombination(Combinations combination) {
        this.combination = combination;
    }

    public Combinations getCombination() {
        return this.combination;
    }
}
