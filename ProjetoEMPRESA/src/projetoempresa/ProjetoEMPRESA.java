
package projetoempresa;

public class ProjetoEMPRESA {

    public static void main(String[] args) {
        System.out.println("BANCO DE DADOS - GRUPO:");
        System.out.println();
        Empresa grupo = new Empresa();
        FuncionarioProdutivoMotivado func1 = new FuncionarioProdutivoMotivado("Pablo", "Limpeza", 1100);
        func1.registrarHoras(50);
        func1.registrarProducao(3500);
        grupo.adicionarFuncionario(func1);
        func1.mostrarDetalhes();
    }
    
}
