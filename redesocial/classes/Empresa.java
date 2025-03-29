
package redesocial.classes;

import java.util.ArrayList;

public class Empresa extends Usuario{
    public String nome = super.nomeUsuario;
    public String CNPJ;
    public String ramo;
    public ArrayList<String> produtos = new ArrayList();
    //construtor
    public Empresa(){
    }

    public Empresa(String CNPJ, String ramo, String nomeUsuario, String email,
            String senha) {
        super(nomeUsuario, email, senha);
        this.CNPJ = CNPJ;
        this.ramo = ramo;
    }
    
    //metodos
    public void adicionar(String prod){
        produtos.add(prod);
    }
    //get e setters

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    

    public ArrayList<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<String> produtos) {
        this.produtos = produtos;
    }
    @Override
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    @Override
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
    /*@Override
    public int getTipoConta() {
        return tipoConta;
    }
    @Override
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    */
    @Override
    public String toString() {
        return "Empresa{" + "CNPJ=" + CNPJ + ", produtos=" + produtos + ", email="+ super.email
                + ", nome usuario=" + super.nomeUsuario + ", senha=" + super.senha + '}';
    }
    
}
