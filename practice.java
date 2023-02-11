public class practice {
    public static void main(String[] args) {
        System.out.println("Hello");

        int size = 5;

        System.out.println("Pattern 01"); pattern1(size);
        System.out.println("Pattern 02"); pattern2(size);
        System.out.println("Pattern 03"); pattern3(size);
        System.out.println("Pattern 04"); pattern4(size);
        System.out.println("Pattern 05"); pattern5(size);
        System.out.println("Pattern 06"); pattern6(size);
        System.out.println("Pattern 07"); pattern7(size);
        System.out.println("Pattern 08"); pattern8(size);
        System.out.println("Pattern 09"); pattern9(size);
        System.out.println("Pattern 10"); pattern10(size);
    }

    static void pattern10(int n){
        for(int i=0;i<n;i++){
            for(int s=n-1;s>i;s--){
                System.out.print("  ");
            }

            for(int j=0;j<=i;j++){
                if(j%2==0){
                    continue;
                }
                else{
                    System.out.print("* ");
                }
                
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int s=0;s<i;s++){
                System.out.print("  ");
            }
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            for(int j=n-1;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i-1;s++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int s=i;s>0;s--){
                System.out.print("  ");
            }
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=0;i<2*n;i++){
            int totalcols = i<n ? i : 2*n-i;
            for(int j=0;j<totalcols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
