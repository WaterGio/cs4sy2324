public class Move {
    private final String name;
    private Move strongAgainst;

    public Move(String name) {
        this.name = name;
        this.strongAgainst = null;
    }

    public String getName() {
        return this.name;
    }

    public Move getStrongAgainst() {
        return this.strongAgainst;
    }

    public void setStrongAgainst(Move strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public static int compareMoves(Move move1, Move move2) {
        if (move1.getStrongAgainst() == move2)
            return 0;
        else if (move2.getStrongAgainst() == move1)
            return 1;
        else
            return 2;
    }
}
