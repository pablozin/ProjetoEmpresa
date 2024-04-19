package projetoempresa;

import projetoempresa.Interfaces.Motivacao;

public abstract class Funcionario implements Motivacao{
    String nome;
    String setor;
    
    double horasTrabalhadas;
    int itensProduzidos;
    
    
  
    public Funcionario(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
        this.horasTrabalhadas = 0;
        this.itensProduzidos = 0;
    }
   
    
    void registrarHoras (double horas){
        this.horasTrabalhadas += horas;
    }
   
    void registrarProducao (int itens){
        this.itensProduzidos += itens;
    }
    
    void sistemadeMetas(String sistemaMetas){
        
    }
    public abstract void mostrarDetalhes ();

}
