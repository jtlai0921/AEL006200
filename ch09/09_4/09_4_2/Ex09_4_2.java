class myNumber {
      private int number;

      myNumber (int number) {this.number = number;}
      public int getNumber() { return number; }
}

class E extends myNumber {
      E() {super(5);}
}

class Ex09_4_2 {
      public static void main(String[] args) {
             E a = new E();

             System.out.println("number= "+a.getNumber());
      }
}
