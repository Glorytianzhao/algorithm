package design.create.prototype;

public class Client {

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        try {
            Monkey clone = (Monkey) monkey.clone();
            System.out.println("monkey1=monkey?" + (monkey == clone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
