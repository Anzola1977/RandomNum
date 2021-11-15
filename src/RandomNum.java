public class RandomNum {
    double num;

    public double calculateNum() {
        double num = Math.pow(Math.random() * 5, 3);
        return num;
    }

    public static void main(String[] args) {
        RandomNum randomNum = new RandomNum();

        System.out.println(randomNum.calculateNum());
    }
}
