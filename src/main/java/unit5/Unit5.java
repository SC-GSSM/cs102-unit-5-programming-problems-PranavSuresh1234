package unit5;

/**
 * A class demonstrating Unit 5 concepts: writing classes, constructors,
 * getters/setters, static variables, and toString override.
 *
 * <p>You need to implement:</p>
 * <ul>
 *   <li>Private instance variables: name (String) and age (int)</li>
 *   <li>A private static variable: count (int)</li>
 *   <li>Three constructors (default, parameterized, overloaded)</li>
 *   <li>Getter and setter methods for name and age</li>
 *   <li>A static getter for count</li>
 *   <li>A toString() override</li>
 * </ul>
 */
public class Unit5 {

    public static void main(String[] args) {
        // Test your class here by creating objects and calling methods

        Unit5 obj1 = new Unit5();
        System.out.println(obj1);

        Unit5 obj2 = new Unit5("Alice", 25);
        System.out.println("getName() = " + obj2.getName());
        System.out.println("getAge() = " + obj2.getAge());
        System.out.println("toString() = " + obj2);

        Unit5 obj3 = new Unit5("Bob");
        System.out.println(obj3);

        obj3.setAge(30);
        obj3.setName("Bobby");
        System.out.println(obj3);

        System.out.println("Total objects created: " + Unit5.getCount());
    }

    // Private instance variables
    private String name;
    private int age;

    // Private static variable
    private static int count = 0;

    /**
     * Default constructor. Sets name to "Unknown" and age to 0.
     * Must increment the static count variable.
     */
    public Unit5() {
        name = "Unknown";
        age = 0;
        count++;
    }

    /**
     * Parameterized constructor. Sets name and age to the given values.
     * Must increment the static count variable.
     */
    public Unit5(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    /**
     * Overloaded constructor. Takes only a name, sets age to 0.
     * Must increment the static count variable.
     */
    public Unit5(String name) {
        this.name = name;
        this.age = 0;
        count++;
    }

    /**
     * Returns the name of this Unit5 object.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this Unit5 object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age of this Unit5 object.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of this Unit5 object.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the total number of Unit5 objects created.
     */
    public static int getCount() {
        return count;
    }

    /**
     * Returns a string representation of this Unit5 object.
     * Format: Unit5{name='[name]', age=[age]}
     */
    @Override
    public String toString() {
        return "Unit5{name='" + name + "', age=" + age + "}";
    }
}