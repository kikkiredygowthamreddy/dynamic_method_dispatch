class A {
  public void exe() {
      System.out.println("in A show");
}
}
class B extends A {
  public void exe(){
      System.out.println("in show");
}
}
class C extends A {
  public void exe() {
      System.out.println("in show");
}
}
      public class good{
        public static void main(String args[]){
A ion = new A();
ion.exe();

ion = new B();
ion.exe();

ion = new C();
ion.exe();

        }
    }