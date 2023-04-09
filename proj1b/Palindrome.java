public class Palindrome {
    public Deque<Character> wordToDeque(String word) {
        Deque<Character> str = new LinkedListDeque<>();
        for (int i = 0; i < word.length(); ++i) {
            str.addLast(word.charAt(i));
        }
        return str;
    }

    public boolean isPalindrome(String word) {
        Deque test = wordToDeque(word);
        int tsize = test.size();
        if (tsize == 0 || tsize == 1) {
            return true;
        } else {
            for (int i = 0; i < tsize / 2; i++) {
                if (test.removeFirst() != test.removeLast()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isPalindrome(String word, CharacterComparator cc) {
        Deque go = wordToDeque(word);
        int gosize = go.size();
        for (int i = 0; i < gosize / 2; i++) {
            char a = (char) go.removeFirst();
            char b = (char) go.removeLast();
            if (!(cc.equalChars(a, b))) {
                return false;
            }
        }
        return true;
    }
}
