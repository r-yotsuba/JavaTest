class MakeCar {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setSpeed(60);
        car1.setName("すごそうな車");

        System.out.println("speed : "+car1.getSpeed());
        System.out.println("Name : "+car1.getName());

    }
}