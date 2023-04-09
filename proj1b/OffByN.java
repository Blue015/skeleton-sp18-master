public class OffByN implements CharacterComparator {

    private int N;

    public OffByN(int N) {
        this.N = N;
    }

    @Override
    public boolean equalChars(char x, char y) {
        int result = Math.abs(x - y);
        if (result == N) {
            return true;
        } else {
            return false;
        }
    }
}
