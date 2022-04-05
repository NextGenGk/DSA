package BinaryTree.Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character, TrieNode> children;
    boolean endOfString;

    // Constructor
    public TrieNode(){
        children = new HashMap<>();
        endOfString = false;
    }
}
