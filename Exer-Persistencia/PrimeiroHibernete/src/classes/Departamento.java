package classes;
// Generated 15/05/2019 19:19:56 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Departamento generated by hbm2java
 */
public class Departamento  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private Set funcionarios = new HashSet(0);

    public Departamento() {
    }

	
    public Departamento(String nome) {
        this.nome = nome;
    }
    public Departamento(String nome, Set funcionarios) {
       this.nome = nome;
       this.funcionarios = funcionarios;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }




}


