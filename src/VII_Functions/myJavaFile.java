package VII_Functions;//public class VII_Functions.myJavaFile {
//    public static void VII_Functions.main(String args[]){
//        int sum = 10_Interoperability.VII_Functions.add(3, 4);
//        System.out.println("Printing result from java file "+ sum);
//    }
//    public static int area(int a, int b){
//        return a*b;
//    }
//}



//========================having custom name from the kotlin file================================================
public class myJavaFile {
    public static void main(String args[]){
        int sum = MyKotlinFile.add(3, 4);
        System.out.println("Printing result from java file "+ sum);
    }
    public static int area(int a, int b){
        return a*b;
    }
}