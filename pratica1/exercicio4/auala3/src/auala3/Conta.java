
package auala3;

public class Conta {
  int numero;
  String titular;
  String cpf;
  double saldo;
  
  void visualizarSaldo () {
      System.out.println("Saldo = " + this.saldo);
  }
 
  void depositar (int a) {
       this.saldo=this.saldo+a;
  }
  
void sacar () {
    
}

void transferirDinheiro () {
    
}
}
