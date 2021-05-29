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
