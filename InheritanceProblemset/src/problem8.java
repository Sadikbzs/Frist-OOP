public class problem8 {
    public static void main(String[] args) {

    }
}
class shape {
    void draw(){
        System.out.println("draw");
    }
}
class circle extends shape {
    @Override
    void draw() {
        super.draw();
        System.out.println("Circle drawed");
    }
}
class square extends shape {
    @Override
    void draw() {
        super.draw();
        System.out.println("Square drawed");
    }
}

