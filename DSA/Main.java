mport java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();


    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Kotlin");
    System.out.println("LinkedList: " + languages);

 
    String str = languages.remove(1);
    System.out.println("Removed Element: " + str);

    System.out.println("Updated LinkedList: " + languages);
  }
}
