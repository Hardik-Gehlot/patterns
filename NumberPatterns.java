package logical.Patterns;
class NumberPyramid{
    public void bottom(int num){
        /*
           1
          2 2
         3 3 3
        4 4 4 4
         */
        for(int row=1; row<=num; row++){
            for(int colBlank=1; colBlank<=num-row; colBlank++){
                System.out.print (" ");
            }
            for(int colFill=1; colFill<=row; colFill++){
                if(colFill==row){
                    System.out.print (row);
                }
                else{
                    System.out.print (row+" ");
                }
            }
            System.out.println ("");
        }
    }
    public void bottom2(int num){
        /*
             0
            101
           21012
          3210123
         432101234
        54321012345
         */
        for(int row=0; row<=num; row++){
            for(int colBlank=1; colBlank<=num-row; colBlank++){
                System.out.print (" ");
            }
            for(int colFill=row; colFill>=0; colFill--){
                System.out.print (colFill);
            }
            for(int colFill=1;colFill<=row;colFill++){
                System.out.print (colFill);
            }
            System.out.println ("");
        }
    }
    public void top1a(int num){
        /*
            5 4 3 2 1
             4 3 2 1
              3 2 1
               2 1
                1
         */
        for(int row=1;row<=num; row++){
            for(int colBlank=1; colBlank<=row-1; colBlank++){
                System.out.print (" ");
            }
            for(int colFill=num-row+1; colFill>=1; colFill--){
                if(colFill==1){
                    System.out.print (colFill);
                }
                else{
                    System.out.print (colFill+" ");
                }
            }
            System.out.println ("");
        }
    }
    public void top1b(int num){
        /*
            5 5 5 5 5
             4 4 4 4
              3 3 3
               2 2
                1
    In line number 90 and 93 if we change num-row+1 into row then it will print
               1 1 1 1 1
                2 2 2 2
                 3 3 3
                  4 4
                   5
         */
        for(int row=1;row<=num; row++){
            for(int colBlank=1; colBlank<=row-1; colBlank++){
                System.out.print (" ");
            }
            for(int colFill=num-row+1; colFill>=1; colFill--){
                if(colFill==1){
                    System.out.print (num-row+1);
                }
                else{
                    System.out.print (num-row+1+" ");
                }
            }
            System.out.println ("");
        }
    }
    public void top2(int num){
        /*
        54321012345
         432101234
          3210123
           21012
            101
             0
         */
        for(int row=0;row<=num; row++){
            for(int colBlank=1; colBlank<=row; colBlank++){
                System.out.print (" ");
            }
            for(int colFill=num-row; colFill>=0; colFill--){
                System.out.print (colFill);
            }
            for(int colFill=1; colFill<=num-row; colFill++){
                System.out.print (colFill);
            }
            System.out.println ("");
        }
    }
    public void rhombus(int num){
        /*
                0
              1 0 1
            2 1 0 1 2
          3 2 1 0 1 2 3
        4 3 2 1 0 1 2 3 4
          3 2 1 0 1 2 3
            2 1 0 1 2
              1 0 1
                0
         */
        bottom2 (num);
        for(int row=1;row<=num; row++){
            for(int colBlank=1; colBlank<=row; colBlank++){
                System.out.print (" ");
            }
            for(int colFill=num-row; colFill>=0; colFill--){
                System.out.print (colFill);
            }
            for(int colFill=1; colFill<=num-row; colFill++){
                System.out.print (colFill);
            }
            System.out.println ("");
        }
    }
}
public class NumberPatterns {
    public static void main (String[] args) {
    }
}