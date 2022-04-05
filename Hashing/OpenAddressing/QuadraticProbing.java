package Hashing.OpenAddressing;

import java.util.ArrayList;

public class QuadraticProbing {
    String[] hashTable;
    int usedCellNumber;

    public QuadraticProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    // Hash Function
    public int modASCIIHashFunction(String word, int cellNumber) {
        char ch[];
        ch = word.toCharArray();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % cellNumber;
    }

    //Returns LoadFactor of HashTable
    public double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }

    // Rehash
    public void rehashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
        }
        data.add(word);
        hashTable = new String[hashTable.length * 2];
        for (String s : data) {
            insertInHashTable(s);
        }
    }

    // Insert in HashTable
    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCIIHashFunction(word, hashTable.length);
            int counter = 0;
            for (int i = 0; i < index + hashTable.length; i++) {
                int newIndex = (index + (counter * counter) % hashTable.length);
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println(word + " has been inserted successfully");
                    break;
                } else {
                    System.out.println(newIndex + " is already occupied. Trying next one...");
                }
                counter++;
            }
        }
        usedCellNumber++;
    }

    // Displaying Hash Table
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("HashTable does not exists");
            return;
        } else {
            System.out.println("----------HashTable----------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key:" + hashTable[i]);
            }
        }
    }

    // Search in HashTable
    public boolean searchHashTable(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        for (int i = index; i < index+hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                System.out.println("[" + word + "]" + " found at location: "+ newIndex);
                return true;
            }
        }
        System.out.println("[" + word + "]" + " not found in hashTable");
        return false;
    }

    // Delete Key in HashTable
    public void deleteKeyHashTable(String word){
        int index = modASCIIHashFunction(word, hashTable.length);
        for (int i=index; i<index+hashTable.length; i++){
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                System.out.println(word + " has been deleted successfully from HashTable");
                return;
            }
//            System.out.println(word + " not found in HashTable");
        }
    }

    public static void main(String[] args) {
        QuadraticProbing quadraticProbing = new QuadraticProbing(13);
        quadraticProbing.insertInHashTable("The");
        quadraticProbing.insertInHashTable("quick");
        quadraticProbing.insertInHashTable("brown");
        quadraticProbing.insertInHashTable("fox");
        quadraticProbing.insertInHashTable("over");
        quadraticProbing.displayHashTable();
        quadraticProbing.deleteKeyHashTable("fox");
        quadraticProbing.searchHashTable("fox");
    }
}

