public static void main(String[] args) {
    // Create the original book
    Book original = new Book("Maze Runner", "James Dashner", 400);

    // Create a copy using the copy constructor
    Book copy = new Book(original);

    System.out.println("Before changes:");
    System.out.print("  Original: ");
    original.display();
    System.out.print("  Copy:     ");
    copy.display();

    // Bonus: change fields on the copy only
    copy.setTitle("Maze Runner, 4th Ed.");
    copy.setPages(375);

    System.out.println();
    System.out.println("After changing the copy:");
    System.out.print("  Original: ");
    original.display();
    System.out.print("  Copy:     ");
    copy.display();

    System.out.println();
    System.out.println("The original is unchanged, so the copy is independent.");
    }

}
