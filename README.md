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
                System.out.print (" ");
            }
            for(int colFill=1; colFill<=row; colFill++){
                if(colFill==row){
                    System.out.print ("*");
                }
                else{
                    System.out.print ("* ");
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
                System.out.print (" ");
            }
            for(int colFill=1; colFill<=(2*row-1); colFill++){
                System.out.print ("*");
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
                System.out.print (" ");
            }
            for(int colFill=num-row+1; colFill>=1; colFill--){
                if(colFill==1){
                    System.out.print ("*");
                }
                else{
                    System.out.print ("* ");
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
                System.out.print (" ");
            }
            for(int colFill=1; colFill<=(2*(num+1-row)-1); colFill++){
                System.out.print ("*");
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