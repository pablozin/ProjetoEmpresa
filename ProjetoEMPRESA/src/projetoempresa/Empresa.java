
package projetoempresa;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
    List<Funcionario> funcionarios;
    
    Empresa(){
        this.funcionarios = new ArrayList<>();
    }
    
    void adicionarFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }
    
    
    
}
