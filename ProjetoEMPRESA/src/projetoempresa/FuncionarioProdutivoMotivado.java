package projetoempresa;

import java.util.Arrays;
import java.util.List;
import projetoempresa.Interfaces.Motivacao;
import projetoempresa.Interfaces.Produtivo;
import java.util.Random;

public class FuncionarioProdutivoMotivado extends Funcionario implements Produtivo, Motivacao {
    double salario;

    
    FuncionarioProdutivoMotivado(String nome, String setor, double salario){
        super(nome, setor);
        
        this.salario = salario;
        double aumento;
    }
    
   
    
    List<String> FRASEStrings = Arrays.asList(
            "Um dia voce vai calar a boca de todos que te elogiaram, pae!",
            "Daqui pra frente e so pra tras!", 
            "2 reais ou uma demissao misteriosa? Trabaia rapaz", 
            "Feio, burro e liso. Um desses voce pode mudar..."
    );
    
    List<String> METAStrings = Arrays.asList(
            "A meta é um sonho com prazo!",
            "Aumentar o numero de producao", 
            "Fazer as compras do mes para o patrao",
            "Você atingiu a meta, parabéns querido funcionário!"
    );
    
    Random r = new Random();
    
    @Override
    public double calcularProdutividade(){
        int n = (int) (itensProduzidos / horasTrabalhadas);
        return n;
    }
    
    
    
    @Override
    public String motivacaoDiaria(){
        int randomfrase = r.nextInt(FRASEStrings.size());
        String randomElement = FRASEStrings.get(randomfrase);
        
        return randomElement;
    }
    
    @Override
    public String sistemaMetas(){
        int randometa = r.nextInt(METAStrings.size());
        String randomElementt = METAStrings.get(randometa);
        
        return randomElementt;
    }
    
    double aumentoSalario(double aumento){
        if(salario < 1420 && calcularProdutividade() > 4){
            aumento = (salario*1.15)-aumento;
            return aumento;
        } else {
            return 0;
        }
        
    }
    
    
    @Override
    public void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: R$" + salario);
        System.out.println("Bonificacao: R$" + aumentoSalario(salario));
        System.out.println("Setor: " + setor);
        System.out.println("Metas: " + sistemaMetas());
        System.out.println("Produtividade: " + calcularProdutividade()+"%");
        System.out.println("Mensagem motivacional: " + motivacaoDiaria());
        System.out.println();
        
        
    }
}
