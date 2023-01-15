import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Combinations {
    CHANCE_WITHOUT_TWO(new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6)), 1),
    CHANCE_WITHOUT_THREE(new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6)), 2),
    CHANCE_WITHOUT_FOUR(new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6)), 3),
    CHANCE_WITHOUT_FIVE(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6)), 4),

    DOUBLE_OF_ONE(new ArrayList<>(Arrays.asList(1, 1)), 5),
    DOUBLE_OF_TWO(new ArrayList<>(Arrays.asList(2, 2)), 6),
    DOUBLE_OF_THREE(new ArrayList<>(Arrays.asList(3, 3)), 7),
    DOUBLE_OF_FOUR(new ArrayList<>(Arrays.asList(4, 4)), 8),
    DOUBLE_OF_FIVE(new ArrayList<>(Arrays.asList(5, 5)), 9),
    DOUBLE_OF_SIX(new ArrayList<>(Arrays.asList(6, 6)), 10),

    DOUBLES_OF_ONE_AND_TWO(Stream
            .of(DOUBLE_OF_ONE.currency, DOUBLE_OF_TWO.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 11),
    DOUBLES_OF_ONE_AND_THREE(Stream
            .of(DOUBLE_OF_ONE.currency, DOUBLE_OF_THREE.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 12),
    DOUBLES_OF_ONE_AND_FOUR(Stream
            .of(DOUBLE_OF_ONE.currency, DOUBLE_OF_FOUR.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 13),
    DOUBLES_OF_ONE_AND_FIVE(Stream
            .of(DOUBLE_OF_ONE.currency, DOUBLE_OF_FIVE.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 14),
    DOUBLES_OF_ONE_AND_SIX(Stream
            .of(DOUBLE_OF_ONE.currency, DOUBLE_OF_SIX.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 15),
    DOUBLES_OF_TWO_AND_THREE(Stream
            .of(DOUBLE_OF_TWO.currency, DOUBLE_OF_THREE.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 16),
    DOUBLES_OF_TWO_AND_FOUR(Stream
            .of(DOUBLE_OF_TWO.currency, DOUBLE_OF_FOUR.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 17),
    DOUBLES_OF_TWO_AND_FIVE(Stream
            .of(DOUBLE_OF_TWO.currency, DOUBLE_OF_FIVE.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 18),
    DOUBLES_OF_TWO_AND_SIX(Stream
            .of(DOUBLE_OF_TWO.currency, DOUBLE_OF_SIX.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 19),
    DOUBLES_OF_THREE_AND_FOUR(Stream
            .of(DOUBLE_OF_THREE.currency, DOUBLE_OF_FOUR.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 20),
    DOUBLES_OF_THREE_AND_FIVE(Stream
            .of(DOUBLE_OF_THREE.currency, DOUBLE_OF_FIVE.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 21),
    DOUBLES_OF_THREE_AND_SIX(Stream
            .of(DOUBLE_OF_THREE.currency, DOUBLE_OF_SIX.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 22),
    DOUBLES_OF_FOUR_AND_FIVE(Stream
            .of(DOUBLE_OF_FOUR.currency, DOUBLE_OF_FIVE.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 23),
    DOUBLES_OF_FOUR_AND_SIX(Stream
            .of(DOUBLE_OF_FOUR.currency, DOUBLE_OF_SIX.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 24),
    DOUBLES_OF_FIVE_AND_SIX(Stream
            .of(DOUBLE_OF_FIVE.currency, DOUBLE_OF_SIX.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 25),
    SET_OF_ONE(new ArrayList<>(Arrays.asList(1, 1, 1)), 26),
    SET_OF_TWO(new ArrayList<>(Arrays.asList(2, 2, 2)), 27),
    SET_OF_THREE(new ArrayList<>(Arrays.asList(3, 3, 3)), 28),
    SET_OF_FOUR(new ArrayList<>(Arrays.asList(4, 4, 4)), 29),
    SET_OF_FIVE(new ArrayList<>(Arrays.asList(5, 5, 5)), 30),
    SET_OF_SIX(new ArrayList<>(Arrays.asList(6, 6, 6)), 31),

    FLASH_OF_ONE_AND_TWO(Stream
            .of(SET_OF_ONE.currency, DOUBLE_OF_TWO.currency)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList()), 25),







    SQUARE_OF_ONE(new ArrayList<>(Arrays.asList(1, 1, 1, 1)), 15),
    SQUARE_OF_TWO(new ArrayList<>(Arrays.asList(2, 2, 2, 2)), 15),
    SQUARE_OF_THREE(new ArrayList<>(Arrays.asList(3, 3, 3, 3)), 15),
    SQUARE_OF_FOUR(new ArrayList<>(Arrays.asList(4, 4, 4, 4)), 15),
    SQUARE_OF_FIVE(new ArrayList<>(Arrays.asList(5, 5, 5, 5)), 15),
    SQUARE_OF_SIX(new ArrayList<>(Arrays.asList(6, 6, 6, 6)), 15),

    SMALL_STRAIGHT_OF_FOUR(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), 15),
    SMALL_STRAIGHT_OF_FIVE(new ArrayList<>(Arrays.asList(2, 3, 4, 5)), 15),
    SMALL_STRAIGHT_OF_SIX(new ArrayList<>(Arrays.asList(3, 4, 5, 6)), 15),

    LARGE_STRAIGHT_OF_FIVE(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 15),
    LARGE_STRAIGHT_OF_SIX(new ArrayList<>(Arrays.asList(2, 3, 4, 5 , 6)), 15),

    YAHTZEE_OF_ONE(new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1)), 15),
    YAHTZEE_OF_TWO(new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2)), 15),
    YAHTZEE_OF_THREE(new ArrayList<>(Arrays.asList(3, 3, 3, 3, 3)), 15),
    YAHTZEE_OF_FOUR(new ArrayList<>(Arrays.asList(4, 4, 4, 4, 4)), 15),
    YAHTZEE_OF_FIVE(new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5)), 15),
    YAHTZEE_OF_SIX(new ArrayList<>(Arrays.asList(6, 6, 6, 6, 6)), 15);

    private final List<Integer> currency;
    private final Integer score;

    Combinations(List<Integer> currency, Integer score) {
        this.currency = currency;
        this.score = score;
    }

    public List<Integer> getCurrency() {
        return currency;
    }

    public Integer getScore() {
        return score;
    }

    public static TreeMap<Combinations, Integer> getCombinations() {
        TreeMap<Combinations, Integer> combinations = new TreeMap<>();
        for (Combinations value : Combinations.values()) {
            combinations.put(value, value.score);
        }
        return combinations;
    }
}
