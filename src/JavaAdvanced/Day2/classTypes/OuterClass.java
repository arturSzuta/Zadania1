package JavaAdvanced.Day2.classTypes;

public class OuterClass {
    private static int outreClassStaticField;
    private int outerClassField;

    void outerClassMethod() {
        System.out.println("Im in  OuterClass");
    }

    static void outerClassStaticMethod() {
        System.out.println("Im in OuterClass static method");
    }

    static class NestedStaticClass {
        String name;

        void useOuterClassField() {
            System.out.println(outreClassStaticField);
//          outerClassMethod(); // no access to field (not static)
//          System.out.println(outerClassField); // no access to field (not static)
        }

    }

    class InnerClass {
        String name2;

        void useOuterClassField() {
            System.out.println(outreClassStaticField);
            outerClassMethod();
            System.out.println(outerClassField);
        }
    }
}
