public class NoVisualPlayerSkeleton {
    public static void main(String[] args) {
        PlayerSkeleton p = new PlayerSkeleton();
        NoVisualState s = new NoVisualState();
        while(!s.hasLost()) s.makeMove(p.pickMoveImpl(s.getField(), s.legalMoves(), s.getTop(), s.getpOrients(), s.getpWidth(), s.getpHeight(), s.getpBottom(), s.getpTop(), s.getNextPiece()));
        System.out.println(s.getRowsCleared());
    }
}
