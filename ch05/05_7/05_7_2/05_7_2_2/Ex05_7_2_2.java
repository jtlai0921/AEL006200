
class Ex05_7_2_2 {
    public static void main (String[] argv) {
       int a, b;

       a = 4;
       b = a>>1;
       System.out.println("���ƴ��եk���B�⤸ >>�G "+ b);

       a = 4;
       b = a>>33;
       System.out.println("���դj��32�줸���첾�G "+ b);

       a = -4;
       b = a>>1;
       System.out.println("�t�ƴ��եk���B�⤸ >>�G "+ b);

       a = -4;
       b = a>>33;
       System.out.println("���դj��32�줸���첾�G "+ b);

       a = 4;
       b = a<<1;
       System.out.println("���ƴ��ե����B�⤸ <<�G "+ b);

       a = 4;
       b = a<<33;
       System.out.println("���դj��32�줸���첾�G "+ b);


       a = -4;
       b = a<<1;
       System.out.println("�t�ƴ��ե����B�⤸ <<�G "+ b);

       a = -4;
       b = a<<33;
       System.out.println("���դj��32�줸���첾�G "+ b);

     }
 }
       