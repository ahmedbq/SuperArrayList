public class Application {
    public static void main(String[] args) {
        SuperArrayList<Integer> numbers = new SuperArrayList();

        numbers.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for(int x = 0; x < numbers.size(); x++) {
            System.out.println(numbers.get(x));
        }
    }
}
