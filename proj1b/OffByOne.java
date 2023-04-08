public class OffByOne implements CharacterComparator {

    //Returns true if characters are equal
    // by the rules of the implementing class.
    //rule : 两个字符相差1，返回true
    @Override
    public boolean equalChars(char x, char y) {
        int result = Math.abs(x-y);
        if(result == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void equalChars() {

    }

    @Override
    public void isPalindrime() {

    }
}
