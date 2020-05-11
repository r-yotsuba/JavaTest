class CheckType {
    public static void main(String[] args){
        int a = 1;
        double b = 2.0;

        Object aCheck = a;
        Object bCheck = b;

        System.out.println(aCheck.getClass().getName());
        System.out.println(bCheck.getClass().getName());
        System.out.println(aCheck.getClass().getSimpleName());
    }
}