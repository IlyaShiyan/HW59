import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> goods= new HashMap<>();
        goods.put(100,"Car");
        goods.put(10,"Pen");
        goods.put(45,"Bike");
        goods.put(10,"Pencil");
        goods.put(15,"Toy");
        goods.put(12,"Scooter");

        System.out.println(goods);

    }
}
