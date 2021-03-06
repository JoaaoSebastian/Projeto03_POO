package br.com.fatecpg.oo;

import java.util.ArrayList;

public class Fornecedores {
   private String nome;
   private String razao;
   private String cnpj;
   private String email;
   private String telefone;
   private String endereco;
   
   public static ArrayList<Fornecedores> list;
public static ArrayList<Fornecedores> getList(){
    if(list==null){
    list = new ArrayList<>();
    Fornecedores f1 =new Fornecedores();
    f1.setNome("fulano");
    f1.setRazao("razaofulano");
    f1.setCnpj("88.888.888/0001-88");
    f1.setEmail("fulano@gmail.com");
    f1.setTelefone("13 9 8888-8888");
    f1.setEndereco("Rua-888");
    list.add(f1);
    Fornecedores f2 =new Fornecedores();
    f2.setNome("fulano");
    f2.setCnpj("razaofulano");
    f2.setCnpj("88.888.888/0001-88");
    f2.setEmail("fulano@gmail.com");
    f2.setTelefone("13 9 8888-8888");
    f2.setEndereco("Rua-888");
    list.add(f2);
    Fornecedores f3 =new Fornecedores();
    f3.setNome("fulano");
    f3.setRazao("Razaofulano");
    f3.setCnpj("88.888.888/0001-88");
    f3.setEmail("fulano@gmail.com");
    f3.setTelefone("13 9 8888-8888");
    f3.setEndereco("Rua-888");
    list.add(f3);
    }
return list;
}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getNome() {
        return nome;
    }

    public String getRazao() {
        return razao;
    }

    public String getCnpj() {
        return cnpj;
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
}
