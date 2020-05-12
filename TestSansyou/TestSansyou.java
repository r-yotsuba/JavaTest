class TestSansyou {
    public static void main(String[] args) {
        
        Car car1 = new Car(); //car1のインスタンスを生成
        Car car2 = new Car(); //car2のインスタンスを生成

        car1.setCarName("アクア");
        car2.setCarName("N-Box");

        System.out.print("car1 : ");
        car1.dispCarName();

        System.out.print("car2 : ");
        car2.dispCarName();

    }
}