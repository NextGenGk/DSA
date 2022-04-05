package Hashing.DirectChaining;

import java.util.LinkedList;

public class DirectChaining {

    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    // Constructor
    public DirectChaining(int size){
        hashTable = new LinkedList[size];
    }

    // Mod of ASCII Values
    public int modASCIIHashFunction(String word, int cellNumber){
        char ch[];
        ch = word.toCharArray();
        int sum = 0;
        for (int i=0; i<word.length(); i++ ){
            sum = sum + ch[i];
        }
        return sum % cellNumber;
    }

    // Insert in Hash Table
    public void insertHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashTable.length);
        if (hashTable[newIndex] == null){
            hashTable[newIndex] = new LinkedList<>();
            hashTable[newIndex].add(word);
        }
        else {
            hashTable[newIndex].add(word);
        }
    }

    // Display Hash Table
    public void displayHashTable(){
        if (hashTable == null){
            System.out.println("HashTable doesn't exist");
            return;
        }
        else {
            System.out.println("--------Hash Table--------");
            for (int i=0; i<hashTable.length; i++){
                System.out.println("Index " + i + ", Key : " + hashTable[i]);
            }
        }
    }

    // Search in Hash Table
    public boolean searchHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        if (hashTable[newIndex] != null && hashTable[newIndex].contains(word)) {
            System.out.println("[" + word + "]" + " found in Hashtable at location: " +newIndex);
            return true;
        } else {
            System.out.println("[" + word + "]" + " not found in HashTable");
            return false;
        }
    }

    // Delete in Hash Table
    public void deleteKeyInHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        boolean result = searchHashTable(word);
        if (result == true) {
            hashTable[newIndex].remove(word);
            System.out.println("[" + word + "]" + " has been deleted from HashTable ");
        }
    }

    // Main Class
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        // Insert
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("quick");
        directChaining.insertHashTable("brown");
        directChaining.insertHashTable("brown");
        directChaining.insertHashTable("over");

        // Display
        directChaining.displayHashTable();

        // Search
        directChaining.searchHashTable("over");

        // Delete
        directChaining.deleteKeyInHashTable("over");

    }
}
