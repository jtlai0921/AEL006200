class Number {
     int n = 0; 
	
     void addN(int i) { n = i; } 
     int  getN() { return n; } 
}

class Ex08_3_1 {	
     public static void main(String[] args) {
          Number N = new Number( );

          N.addN(10);
          System.out.println("�ϥΤ�k�{�� N.getN: "+ N.getN( ));

          N.n = 20;
          System.out.println("�ϥ��ܼ� N.n: "+ N.n);
      }
}
