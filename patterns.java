
class patterns{
    public static void main(String[] args) {
        System.out.println("Pattern Printing in JAVA");
        System.out.println("Pattern 1");
        pattern1(5);
        System.out.println("Pattern 2");
        pattern2(5);
        System.out.println("Pattern 3");
        pattern3(5);
        System.out.println("Pattern 4");
        pattern4(5);
        System.out.println("Pattern 5");
        pattern5(10);
        System.out.println("Pattern 6");
        pattern6(10);
        System.out.println("Pattern 7");
        pattern7(5);
        System.out.println("Pattern 8");
    }

    static void pattern7(int n){
        for(int rows=1;rows<=n;rows++){

            for(int s=0;s<(n-rows);s++){
                System.out.print("  ");
            }

            for(int cols=rows;cols>=1;cols--){
                System.out.print(cols+" ");
            }

            for(int cols=2;cols<=rows;cols++){
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }


    static void pattern1(int n){
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=n;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=(n-rows+1);cols++){
                System.out.print("* ");
            }
            System.out.println();
      }
    }

    static void pattern4(int n){
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=rows;cols++){
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int rows=0;rows<2*n;rows++){
            int totalCols = rows > n ? 2*n-rows : rows ;
            for(int cols=0;cols<totalCols;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int rows=0;rows<2*n;rows++){
            int totalCols = rows > n ? 2*n-rows : rows ;

            //need spaces before stars
            int totalSpaces = n-totalCols;
            for(int s=0;s<totalSpaces;s++){
                System.out.print(" ");
            }

            for(int cols=0;cols<totalCols;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}