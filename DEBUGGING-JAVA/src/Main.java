public class Main {
    public static void main(String[] args){
        System.out.println("Iniciou o método main");
        a();
        System.out.println("finalizou o método main");
        }

    static void a(){
        System.out.println("entrou no método a.");
        b();
        System.out.println("finalizou o método a");
        }

    static void b(){
        System.out.println("entrou no b");
        for(int i = 0; i <= 4; i++)
        System.out.println(i);
        c();
        System.out.println("saiu do método b");
    }

    static void c(){
        System.out.println("entrou no c");

        System.out.println("finalizou o métedo c");
    }

}
