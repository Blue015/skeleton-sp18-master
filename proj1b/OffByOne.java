public class OffByOne implements CharacterComparator {

    @Override
    public boolean equalChars(char x, char y) {
        int result = Math.abs(x - y);
//        if (result == 1) {
//            return true;
//        } else {
//            return false;
//        }
        return result == 1;
    }
}
