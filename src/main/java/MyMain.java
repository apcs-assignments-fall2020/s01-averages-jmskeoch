public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double sum = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
        }
        return (double) (sum / (mat.length * mat[0].length));
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int size = mat.length * mat[0].length;
        if((mat[0].length % 2 == 0) && !(mat.length % 2 == 0)) 
        {
            return ((mat[(mat.length/2)][(mat[0].length/2)-1] + mat[(mat.length/2)][mat[0].length/2]) / 2);
        }
        if(size % 2 == 0) 
        {
            return ((mat[(mat.length/2)-1][mat[0].length-1] + mat[(mat.length/2)][0]) / 2);
        } 
        else 

        {
            int idx1 = (mat.length/2);
            int idx2 = (mat[0].length/2);
            return mat[idx1][idx2];
        }
    }
    

    // Returns the mode of the 2D array mat
    /*
        Worked on this assign for over 45 minutes.
    */
    public static double mode(double[][] mat) { 
       int size = mat.length * mat[0].length;
       int[] counters = new int[size];
       int count = 0;
       int cc = 0;
       double placeholder;

       for(int a = 0; a < mat.length; a++) {
           for(int b = 0; b < mat[0].length; b++) {
               placeholder = mat[a][b];           
               for(int i = 0; i < mat.length; i++) {
                   for(int j = 0; j < mat[0].length; j++) {
                       count += (mat[i][j] == placeholder) ? 1 : 0;
                   }
               }
               counters[cc] = count;
               cc++;
               count = 0;
            }
        }
        System.out.println(counters.toString());
        return -1.0;
       
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
