package box;

public class TestBox {
    public static void main(String[] args) {
        Box<Orange> firstOrangeBox = new Box<Orange>();
        Box<Orange> secondOrangeBox = new Box<Orange>();

        Orange firstOrange = new Orange();
        Orange secondOrange = new Orange();
        Orange thirdOrange = new Orange();
        Orange fourthOrange = new Orange();

        firstOrangeBox.put(firstOrange);
        firstOrangeBox.put(secondOrange);
        secondOrangeBox.put(thirdOrange);
        secondOrangeBox.put(fourthOrange);

        print("firstOrangeBox", firstOrangeBox);
        print("secondOrangeBox", secondOrangeBox);

        Box<Apple> firstAppleBox = new Box<Apple>();
        Box<Apple> secondAppleBox = new Box<Apple>();

        Apple firstApple = new Apple();
        Apple secondApple = new Apple();

        firstAppleBox.put(firstApple);
        firstAppleBox.put(secondApple);

        print("firstAppleBox", firstAppleBox);
        print("secondAppleBox", secondAppleBox);

        // cant resolved method for put apples in orange box
        // firstOrangeBox.put(firstAppleBox);

        firstOrangeBox.put(secondOrangeBox);
        firstAppleBox.put(secondAppleBox);

        System.out.println("Compare first boxes: " + firstOrangeBox.compare(firstAppleBox));

        System.out.println("Put all fruits in one box");

        print("firstOrangeBox", firstOrangeBox);
        print("secondOrangeBox", secondOrangeBox);
        print("firstAppleBox", firstAppleBox);
        print("secondAppleBox", secondAppleBox);

        System.out.println("Compare first boxes: " + firstOrangeBox.compare(firstAppleBox));
    }

    public static void print(String name, Box<?> box) {
        System.out.println(name + " weight is " + box.weight());
    }
}
