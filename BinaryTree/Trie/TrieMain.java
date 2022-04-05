package BinaryTree.Trie;

public class TrieMain {
    TrieNode root;

    // Constructor
    public TrieMain(){
        root = new TrieNode();
        System.out.println("The Trie has been created");
    }

    // Insert Method
    public void insert(String word){
        TrieNode currentNode = root;
        for (int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null){
                node = new TrieNode();
                currentNode.children.put(ch, node);
            }
            currentNode = node;
        }
        currentNode.endOfString = true;
        System.out.println("Successfully Inserted " + word + " in Trie");
    }

    // Search Method
    public boolean search(String word){
        TrieNode currentNode = root;
        for (int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null){
                System.out.println("Word: "+word+ " does not exist in Trie");
                return false;
            }
            currentNode = node;
        }
        if (currentNode.endOfString == true){
            System.out.println("Word: "+word+ " exists in Trie");
            return true;
        }
        else {
            System.out.println("Word: "+word+ " does not exist in Trie. But it is a prefix of another string");
        }
        return currentNode.endOfString;
    }

    // Delete Method
    public boolean delete(TrieNode parentNode, String word, int index){
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;

        // 1st case
        if (currentNode.children.size() > 1){
            delete(currentNode, word, index + 1);
            return false;
        }

        // 2nd case
        if (index == word.length() - 1){
            if (currentNode.children.size() >= 1){
                currentNode.endOfString = false;
                return false;
            }
            else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        // 3rd case
        if (currentNode.endOfString == true){
            delete(currentNode, word, index + 1);
            return false;
        }

        // 4th case
        canThisNodeBeDeleted = delete(currentNode, word, index + 1);
        if (canThisNodeBeDeleted == true){
            parentNode.children.remove(ch);
            return true;
        }
        else {
            return false;
        }
    }

    // Delete
    public void delete(String word){
        if (search(word) == true){
            delete(root, word, 0);
        }
    }


    // Main Class
    public static void main(String[] args) {
        TrieMain trieMain = new TrieMain();
        trieMain.insert("API");
        trieMain.insert("APIS");
        trieMain.search("APIS");
//        trieMain.search("AP");
        trieMain.delete("APIS");
        trieMain.search("APIS");
    }
}
