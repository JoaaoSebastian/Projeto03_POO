package br.com.fatecpg.oo;

import java.util.ArrayList;

public class Clientes {
   private String nome;
   private String rg;
   private String cpf;
   private String email;
   private String telefone;
   private String endereco;
   
   public static ArrayList<Clientes> list;
public static ArrayList<Clientes> getList(){
    if(list==null){
    list = new ArrayList<>();
    Clientes c1 =new Clientes();
    c1.setNome("fulano");
    c1.setRg("88.888.888-8");
    c1.setEmail("fulano@gmail.com");
    c1.setTelefone("13 9 8888-8888");
    c1.setEndereco("Rua-888");
    list.add(c1);
    Clientes c2 =new Clientes();
    c2.setNome("fulano");
    c2.setRg("88.888.888-8");
    c2.setEmail("fulano@gmail.com");
    c2.setTelefone("13 9 8888-8888");
    c2.setEndereco("Rua-888");
    list.add(c2);
    Clientes c3 =new Clientes();
    c3.setNome("fulano");
    c3.setRg("88.888.888-8");
    c3.setEmail("fulano@gmail.com");
    c3.setTelefone("13 9 8888-8888");
    c3.setEndereco("Rua-888");
    list.add(c3);
    }
return list;
}

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   
}
