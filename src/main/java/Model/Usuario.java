package Model;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private int cpf;
    private int senha_hash;

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public int getSenha_hash() {
        return senha_hash;
    }

    public void setSenha_hash(int senha_hash){
        this.senha_hash = senha_hash;
    }

}
