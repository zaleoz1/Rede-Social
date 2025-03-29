package redesocial.classes;

import java.util.ArrayList;

public class Pessoa extends Usuario {
    public String nome = super.nomeUsuario;
    public String descr;
    public ArrayList<Usuario> lista_de_amigos = super.listaAmigo;
    //costrutor

    public Pessoa(String nomeUsuario, String email, String senha) {
        super(nomeUsuario, email, senha);
    }
    
    //teste
    
    public Pessoa(String descr, String nomeUsuario, String email, String senha) {
        super(nomeUsuario, email, senha);
        this.descr = descr;
    }
    //get e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getSenha() {
        return senha;
    }
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Usuario> getLista_de_amigos() {
        return lista_de_amigos;
    }

    public void setLista_de_amigos(ArrayList<Usuario> lista_de_amigos) {
        this.lista_de_amigos = lista_de_amigos;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", descr=" + descr +", amigos= {"+ getLista_de_amigos() +"}" +", email="+ super.email
                + ", nome usuario=" + super.nomeUsuario + ", senha=" + super.senha + '}';

    }

    
}
