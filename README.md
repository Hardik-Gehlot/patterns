```java
package logical.Patterns;
class Triangle{
    public void leftBottom(int num){
        /*
        *
        * *
        * * *
        * * * *
         */
        for(int row=1; row<=num; row++){
            for(int col=1; col<=row; col++){
                System.out.print ("* ");
            }
            System.out.println ("");
        }
    }
    public void leftTop(int num){
        /*
        * * * *
        * * *
        * *
        *
         */
        for(int row=1; row<=num; row++){
            for(int col=1; col<=num+1-row; col++){
                System.out.print ("* ");
            }
            System.out.println ("");
        }
    }
    public void rightBottom(int num){
        /*
              *
            * *
          * * *
        * * * *
         */
        for(int row=1; row<=num; row++){
            for(int colBlank=1; colBlank<=num-row; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill=1; colFill<=row; colFill++){
                System.out.print (" *");
            }
            System.out.println ("");
        }
    }
    public void rightTop(int num){
        /*
         * * * *
           * * *
             * *
               *
         */
        for(int row=1; row<=num; row++){
            for(int colBlank=1; colBlank<=row-1; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill=num; colFill>=row; colFill--){
                System.out.print (" *");
            }
            System.out.println ("");
        }
    }
    public void leftBottomTop(int num){
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
         */
        leftBottom (num);
        leftTop (num-1);
    }
    public void rightBottomTop(int num){
        /*
              *
            * *
          * * *
        * * * *
          * * *
            * *
              *
         */
        rightBottom (num);
        for(int row=1; row<=num-1; row++){
            System.out.print("  ");
            for(int colBlank=1; colBlank<=row-1; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill=num-1; colFill>=row; colFill--){
                System.out.print (" *");
            }
            System.out.println ("");
        }
    }
    public void leftTopBottom(int num){
    /*    * * * * * *
          * * * * *
          * * * *
          * * *
          * *
          *
          * *
          * * *
          * * * *
          * * * * *
          * * * * * *
     */
        leftTop (num);
        for(int row=2; row<=num; row++){
            for(int col=1; col<=row; col++){
                System.out.print ("* ");
            }
            System.out.println ("");
        }
    }
    public void rightTopBottom(int num){
        /*
         * * * * * *
           * * * * *
             * * * *
               * * *
                 * *
                   *
                 * *
               * * *
             * * * *
           * * * * *
         * * * * * *
         */
        rightTop (num);
        for(int row=2; row<=num; row++){
            for(int colBlank=1; colBlank<=num-row; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill=1; colFill<=row; colFill++){
                System.out.print (" *");
            }
            System.out.println ("");
        }
    }
    public void arrowUp(int num){
        /*
         *********
         **** ****
         ***   ***
         **     **
         *       *
         */
        for(int row=1; row<=num; row++){
            for(int colFill1=1; colFill1<=num+1-row; colFill1++){
                System.out.print ("* ");
            }
            for(int colBlank=1; colBlank<=2*(row-1)-1; colBlank++){
                System.out.print ("  ");
            }
            //After filling colFill1 and colBlank we will start filling colFill2 in remaining position
            //which we get by adding both the colFill1 and colBlank
            //i.e.  colFill2 =     colFill1       +        colBlank       +        1
            //      colFill2 =     num+1-row      +        2*(row-1)
            //      colFill2 =     num+1-row      +        2row-2
            //      colFill2 =     num+row-1
            for(int colFill2=num+row-1; colFill2<=2*num-1; colFill2++){
                if(colFill2!=num){
                    System.out.print ("* ");
                }
                else{
                    System.out.print ("");
                }
            }
            System.out.println ("");
        }
    }
    public void arrowDown(int num){
        /*
         *     *
         **   **
         *** ***
         *******
         */
        for(int row=1; row<=num; row++){
            for(int colFill1=1; colFill1<=row; colFill1++){
                System.out.print ("* ");
            }
            for(int colBlank=1; colBlank<=2*(num-row)-1; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill2=2*num-row; colFill2<=2*num-1; colFill2++){
                if(colFill2!=num){
                    System.out.print ("* ");
                }
                else{
                    System.out.print ("");
                }
            }
            System.out.println ("");
        }
    }
    public void rhombus(int num){
        /*
         * * * * * * *
         * * *   * * *
         * *       * *
         *           *
         * *       * *
         * * *   * * *
         * * * * * * *
         */
        arrowUp (num);
        for(int row=2; row<=num; row++){
            for(int colFill1=1; colFill1<=row; colFill1++){
                System.out.print ("* ");
            }
            for(int colBlank=1; colBlank<=2*(num-row)-1; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill2=2*num-row; colFill2<=2*num-1; colFill2++){
                if(colFill2!=num){
                    System.out.print ("* ");
                }
                else{
                    System.out.print ("");
                }
            }
            System.out.println ("");
        }
    }
}
class Pyramid{
    public void bottom(int num){
        /*
              *
             * *
            * * *
           * * * *
         */
        for(int row=1; row<=num; row++){
            for(int colBlank=1; colBlank<=num-row; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill=1; colFill<=row; colFill++){
                if(colFill==row){
                    System.out.print ("* ");
                }
                else{
                    System.out.print ("*   ");
                }
            }
            System.out.println ("");
        }
    }
    public void bottom2(int num){
        /*
            *
           ***
          *****
         *******
         */
        for(int row=1; row<=num; row++){
            for(int colBlank=1; colBlank<=num-row; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill=1; colFill<=(2*row-1); colFill++){
                System.out.print ("* ");
            }
            System.out.println ("");
        }
    }
    public void top(int num){
        /*
         * * * *
          * * *
           * *
            *
         */
        for(int row=1; row<=num; row++){
            for(int colBlank=1; colBlank<=row-1; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill=num-row+1; colFill>=1; colFill--){
                if(colFill==1){
                    System.out.print ("* ");
                }
                else{
                    System.out.print ("*   ");
                }
            }
            System.out.println ("");
        }
    }
    public void top2(int num){
        /*
         *******
          *****
           ***
            *
         */
        for(int row=1; row<=num; row++){
            for(int colBlank=1; colBlank<=row-1; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill=1; colFill<=(2*(num+1-row)-1); colFill++){
                System.out.print ("* ");
            }
            System.out.println ("");
        }
    }
    public void rhombus(int num){
        /*
                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
           * * * * * * *
             * * * * *
               * * *
                 *
         */
        bottom2 (num);
        for(int row=2; row<=num; row++){
            for(int colBlank=1; colBlank<=row-1; colBlank++){
                System.out.print ("  ");
            }
            for(int colFill=1; colFill<=(2*(num+1-row)-1); colFill++){
                System.out.print ("* ");
            }
            System.out.println ("");
        }

    }
}
class Line{
    public void fromLeft(int num){
        /*
        *
         *
          *
           *
         */
        for(int row=1; row<=num; row++){
            for(int col=1; col<=row; col++){
                if(col==row){
                    System.out.print ("*");
                }
                else{
                    System.out.print (" ");
                }
            }
            System.out.println ("");
        }
    }
    public void fromRight(int num){
        /*
           *
          *
         *
        *
         */
        for(int row=1; row<=num; row++){
            for(int col=1; col<=num-row; col++){
                    System.out.print (" ");
            }
            System.out.print ("*");
            System.out.println ("");
        }
    }
    public void fromRightLeft(int num){
        /*
           *
          * *
         *   *
        *     *
         */
        for(int row=1; row<=num; row++){
            for(int colBlank=1; colBlank<=num-row; colBlank++){
                System.out.print (" ");
            }
            for(int colFill=1; colFill<=(2*row-1); colFill++){
                if(colFill==1 || colFill==2*row-1){
                    System.out.print ("*");
                }
                else {
                    System.out.print (" ");
                }
            }
            System.out.println ("");
        }
    }
    public void fromLeftRight(int num){
        /*
        *     *
         *   *
          * *
           *
         */
        for(int row=1; row<=num; row++){
            for(int colBlank=1; colBlank<=row-1; colBlank++){
                System.out.print (" ");
            }
            for(int colFill=1; colFill<=(2*(num+1-row)-1); colFill++){
                if(colFill==1 || colFill==2*(num+1-row)-1){
                    System.out.print ("*");
                }
                else {
                    System.out.print (" ");
                }
            }
            System.out.println ("");
        }
    }
    public void cross(int num){
        /*
        *     *
         *   *
          * *
           *
          * *
         *   *
        *     *
         */
        fromLeftRight (num);
        for(int row=2; row<=num; row++){
            for(int colBlank=1; colBlank<=num-row; colBlank++){
                System.out.print (" ");
            }
            for(int colFill=1; colFill<=(2*row-1); colFill++){
                if(colFill==1 || colFill==2*row-1){
                    System.out.print ("*");
                }
                else {
                    System.out.print (" ");
                }
            }
            System.out.println ("");
        }
    }
    public void arrowRight(int num){
        /*
        *
          *
            *
              *
                *
              *
            *
          *
        *
         */
        fromLeft (num);
        fromRight (num-1);
    }
    public void arrowLeft(int num){
        /*
              *
            *
          *
        *
          *
            *
              *
         */
        fromRight (num);
        for(int row=2; row<=num; row++){
            for(int col=1; col<=row; col++){
                if(col==row){
                    System.out.print ("*");
                }
                else{
                    System.out.print (" ");
                }
            }
            System.out.println ("");
        }

    }
}
public class Star_Pattern {
    public static void main (String[] args) {
    }
}
```
```java
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
```
