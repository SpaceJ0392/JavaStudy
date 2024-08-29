public class GenericExam {

    public static void main(String[] args) {
//        GenericClass generic = new GenericClass();
//        generic.setObj(new Object());
//        Object obj = generic.getObj();
//
//        generic.setObj("Hello"); // Object를 상속 받는 모든 객체가 들어올 수 있음 (UpCasting)
//        String str = (String) generic.getObj();// 그러나, 반환은 무조건 Object -> 따라서 형변환 필요
//        System.out.println(str);
//
//        generic.setObj(1);
//        System.out.println(generic.getObj());

        //JAVA 5 이후, Generic이 나와 인스턴스 생성 시, 타입을 지정할 수 있게 되었다.
        //기존에는 Object로 다 받을 수는 있으나, 사용시 형변환이 필요했다.

        GenericClass<Object> generic = new GenericClass<>();
        generic.setObj(new Object());
        Object obj = generic.getObj();

        GenericClass<String> stringGeneric = new GenericClass<>();
        stringGeneric.setObj("hello");
        System.out.println(stringGeneric.getObj());

        GenericClass<Integer> integerGeneric = new GenericClass<>();
        integerGeneric.setObj(1);
        System.out.println(integerGeneric.getObj());
    }
}
