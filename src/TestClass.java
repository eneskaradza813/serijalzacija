
public class TestClass {
    
    public static void main(String[] arr){
        
        getPerimeter(13, 13, 13);
        
    }
    public static void getPerimeter(int...corners){
        int perimeter = 0;
        if(corners.length < 2){
            System.out.println("Polygon must have more than one side");
        }else
            for (int i = 0; i < corners.length; i++) {
                perimeter += corners[i];
                System.out.println(perimeter);
                
            }
    }
}
