
class Ex05_6_2 {
    public static void main (String[] argv) {
       int a;

       a = 3;
       System.out.println("���� (true && (++a > 0)) = "+ (true && (++a > 0)));
       System.out.println("���լO�_������ ++a�G "+ a);

       a = 3;
       System.out.println("���� (false && (++a > 0)) = "+ (false && (++a > 0)));
       System.out.println("���լO�_������ ++a�G "+ a);


       a = 3;
       System.out.println("���� (true || (++a > 0)) = "+ (true || (++a > 0)));
       System.out.println("���լO�_������ ++a�G "+ a);

       a = 3;
       System.out.println("���� (false || (++a > 0)) = "+ (false || (++a > 0)));
       System.out.println("���լO�_������ ++a�G "+ a);
     }
 }
       