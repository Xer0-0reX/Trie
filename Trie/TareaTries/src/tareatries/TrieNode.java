/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tareatries;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rgonzaleto
 */
class TrieNode {
    private final Map<Character, TrieNode> children = new HashMap<>();
    private boolean endOfWord;

    Map<Character, TrieNode> getChildren() {
        return children;
    }

    boolean isEndOfWord() {
        return endOfWord;
    }

    void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}