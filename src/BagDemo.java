
public class BagDemo {
    public static void main(String[] args) {
        Bag<String> bag1 = new Bag<>();
        Bag<String> bag2 = new Bag<>();

        // This is the first bag, includes a duplicate of the fruit
        bag1.add("Dates");
        bag1.add("Dates");
        bag1.add("Bananas");
        bag1.add("Watermelon");

        // This is the second bag and includes a duplicate of the fruit
        bag2.add("Banana");
        bag2.add("Oranges");
        bag2.add("Strawberries");
        bag2.add("Banana");

        // Displats the size of Bag 1 and Bag 2
        System.out.println("Size of Bag #1: " + bag1.size());
        System.out.println("Size of Bag #2: " + bag2.size());

        // Combines both bags
        bag1.merge(bag2);

        // Display the combination of the bags
        System.out.println("Content of both bag put together:");
        bag1.printBagContents();

        // Create a new bag containing only the distinct elements
        Bag<String> distinctBag = bag1.distinct();

        // Print the distinct bag contents
        System.out.println("Contents of bag difference:");
        distinctBag.printBagContents();
    }
}

