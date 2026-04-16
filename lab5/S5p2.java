
//2. Handle Invalid Array Index 
// Create an array of size 5 and try to access an invalid index. Handle the exception gracefully. 
// Concepts: ArrayIndexOutOfBoundsException

public class S5p2 {
    public static void main(String[] args){
    int arr[] = {1,2,3,4,5};
    try{
        System.out.print(arr[7]);

    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.print("Invalid index");
    }
}

}
