public class Test {
    public static void main(String[] args) throws InterruptedException {
        OddNumber oddNumber = new OddNumber("Long odd");
        EvenNumber evenNumber = new EvenNumber("Long even");
        oddNumber.start();
        oddNumber.join();
        evenNumber.start();
    }
}
