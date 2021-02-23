package singletondesignpattern;
import java.util.HashMap;
import java.util.Map;

/**
 * Holds books for people to check in and out
 * @author Ivon Nguyen
 */
public class Library {
    private static Library library;

    private HashMap<String,Integer> books = new HashMap<String,Integer>();

    private Library(){
        System.out.println("Creating our Library. Time to begin reading");
    }

    /**
     * Creates new Library if there is not one
     * @return new or existing library
     */
    public static Library getInstance(){
        if(library == null)
            library = new Library();
        return library;
    }

    /**
     * Check for a book in the library and check the book out
     * @param bookName
     * @return boolean for the book so that it is checked out
     */
    public boolean checkoutBook(String bookName){
        if(books.containsKey(bookName)){
            int count=books.get(bookName);
            if(count>0){
                books.put(bookName, count-1);
                System.out.println(bookName+" was successfully checked out");
                return true;
            }
            else{
                System.out.println("Sorry "+bookName+" is not in stock");
            }
        }
        return false;
    }

    /**
     * Adds a book backinto the map or increases number of copies in the library 
     * @param bookName
     * @param numToAdd
     */
    public void checkInBook(String bookName, int numToAdd){
        if(books.containsKey(bookName)){
            int count=books.get(bookName);
            books.put(bookName,count+numToAdd);
        }
        else{
            books.put(bookName, numToAdd);
        }
        System.out.println(bookName+" was added to the library");
    }

    /**
     * Shows the books that are in the library
     */
    public void displayBooks(){
        System.out.println("Inventory: ");
        for(Map.Entry<String,Integer> entry : books.entrySet()){
            System.out.println("- "+entry.getKey()+", copies: "+entry.getValue());
        }
    }
}
