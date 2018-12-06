package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Lists {

    Integer[] list = new Integer[generateRandomInt()];

    Scanner scan = new Scanner(System.in);

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }

    //Fill in list with random numbers
    public void includeInListFullRandom(){
        for (int i = 0; i < list.length; i++){
            list[i] = generateRandomInt();
        }
    }

    //Complete list with random numbers
    public void includeInListPartiallyRandom(){
        for (int i = 0; i < list.length; i++){
            if ( list[i] == null ){
                list[i] = generateRandomInt();
            }
        }
    }

    //deletes an element by index
    public void deleteAnElement(){
        System.out.println("Introduce index of element to delete: ");
        int indexToDelete = scan.nextInt();
        list[indexToDelete] = null;
    }

    //deletes all elements from the list
    public void clearList(){
        list = null;
    }

    //deletes the end of the list beginning from an element
    public void clearListFromAnElement(int startElement){
        for (int i = startElement; i < list.length; i++){
            if ( list[i] != null ){
                list[i] = null;
            }
        }
    }

    public void print(){
        for (int i = 0; i < list.length; i++){
            System.out.println("Your List is: " + list[i]);
        }
    }

}
