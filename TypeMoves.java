public enum TypeMoves {
    WALK("пошел"),
    RUN("побежал"),
    STOP_AND_STAY_STILL("остановился");

    private final String move;

    TypeMoves(String move) { this.move = move; }
    public String getMove() {return move;}
}
