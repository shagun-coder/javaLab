/*5. File Reading with Exception Handling 
Read data from a file. Handle file not found and ensure file is closed properly. 
Concepts: IOException, finally 
 */
public class S5p5 {
    public void main(String[] args){
        java.io.BufferedReader reader = null;
        try{
            reader = new java.io.BufferedReader(new java.io.FileReader("data.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }

        catch(java.io.FileNotFoundException e){
            System.out.print("File not found");
        }
        catch(java.io.IOException e){
            System.out.print("Error reading file");
        }
        finally{
            try{
                if(reader != null){
                    reader.close();
                }
            }
            catch(java.io.IOException e){
                System.out.print("Error closing file");
            }
        
       
          
        }
    }
}
    

