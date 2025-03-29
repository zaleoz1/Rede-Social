package redesocial.classes;

import java.util.ArrayList;

public class Usuario {

    public String nomeUsuario;
    public String email;
    protected String senha;
    public int tipoConta;// 0 usuario , 1 pessoa, 2 empresa
    //coisas de adm//
    private Pessoa Pessoa_sessao;
    private Empresa Empresa_sessao;

    public ArrayList<Usuario> listaAmigo = new ArrayList<>();

    private ArrayList<Pessoa> listaPessoa = new ArrayList();
    private ArrayList<Empresa> listaEmpresa = new ArrayList();
    //construtor//

    

    public Usuario(String nomeUsuario, String email, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        //construtor basico
    }

    //metodos//
    public void listar() { //lista todas as pessoas do sistema no terminal
        System.out.print("Pessoas = [\n");
        for (int i = 0; i < listaPessoa.size(); i++) {
            System.out.println(i + " " + listaPessoa.get(i).toString());
        }
        System.out.println("]");

        System.out.print("Empresas = [");
        for (int i = 0; i < listaEmpresa.size(); i++) {
            System.out.println(i + " " + listaEmpresa.get(i).toString());
        }
        System.out.println("]");
    }

    //metodo para fazer amizade//
    public void adicionarAmizade(Usuario usuario, Usuario usuario2) {
        usuario.listaAmigo.add(usuario2);
        usuario2.listaAmigo.add(usuario);
    }

    public void excluirAmizade(Usuario usuario, Usuario usuario2) {
        usuario.listaAmigo.remove(usuario2);
        usuario.listaAmigo.remove(usuario);
    }

    //metodos pessoas//
    public Usuario getPessoa(String nome) {
        for (int i = 0; i < listaPessoa.size(); i++) {
            if (listaPessoa.get(i).nomeUsuario.equals(nome)) {
                Pessoa esse = listaPessoa.get(i);
                return esse;
            }
        }
        return null;
    }

    public int getPessoaIndex(String nome) {
        for (int i = 0; i < listaPessoa.size(); i++) {
            if (listaPessoa.get(i).nomeUsuario.equals(nome)) {
                return i;
            }
        }
        return 0;
    }

    public Pessoa getPessoaEmail(String email) {
        for (int i = 0; i < listaPessoa.size(); i++) {
            if (listaPessoa.get(i).email.equals(email)) {
                Pessoa esse = listaPessoa.get(i);
                return esse;
            }
        }
        return null;
    }

    public void adicinar(Pessoa pessoa) {
        listaPessoa.add(pessoa);
    }

    public void adicionarPessoa(String descricao, String nomeUsuario, String email, String senha) {
        Pessoa pessoa = new Pessoa(descricao, nomeUsuario, email, senha);
        listaPessoa.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoaRM) {
        listaPessoa.remove(pessoaRM);
    }

    public void atualizarP(String perfilMOD, String email, String senha,
            String nome_perfil, String descricao) {
        Pessoa novo = new Pessoa(descricao, nome_perfil, email, senha);
        System.out.println(this.listaPessoa.get(getPessoaIndex(nome_perfil)) + " <--- " + novo.toString());
        this.listaPessoa.set(this.getPessoaIndex(perfilMOD), novo);
    }

    //metodos para empresas//
    public Usuario getEmpresa(String nome) {
        for (int i = 0; i < listaEmpresa.size(); i++) {
            if (listaEmpresa.get(i).nomeUsuario.equals(nome)) {
                Empresa esse = listaEmpresa.get(i);
                return esse;
            }
        }
        return null;
    }

    public int getEmpresaIndex(String nome) {
        for (int i = 0; i < listaEmpresa.size(); i++) {
            if (listaEmpresa.get(i).nomeUsuario.equals(nome)) {
                return i;
            }
        }
        return 0;
    }

    public Empresa getEmpresaEmail(String email) {
        for (int i = 0; i < listaEmpresa.size(); i++) {
            if (listaEmpresa.get(i).email.equals(email)) {
                Empresa esse = listaEmpresa.get(i);
                return esse;
            }
        }
        return null;
    }

    public void adicionar(Empresa empresa) {
        listaEmpresa.add(empresa);
    }

    public void adicionarEmpresa(String cnpj, String ramo, String nomeUsuario,
            String email, String senha) {
        Empresa empresa = new Empresa(cnpj, ramo, nomeUsuario, email, senha);
        listaEmpresa.add(empresa);
    }

    public void atualizarE(String perfilMOD, String email, String senha,
            String nome_perfil, String CNPJ, String ramo) {
        Empresa novo = new Empresa(CNPJ, nome_perfil, ramo, email, senha);
        System.out.println(this.listaEmpresa.get(getEmpresaIndex(nome_perfil)) + " <--- " + novo.toString());
        this.listaEmpresa.set(this.getEmpresaIndex(perfilMOD), novo);
    }

    public void removerEmpresa(Empresa empresaRM) {
        listaEmpresa.remove(empresaRM);
    }

    public void adicionarProduto(String nome_da_empresa, String[] PRO) {
        System.out.println(PRO.toString());
        for (int i = 0; i < listaEmpresa.size(); i++) {
            if (nome_da_empresa.equals(listaEmpresa.get(i).nomeUsuario)) {
                for (int j = 0; j < PRO.length; j++) {
                    String isso = PRO[j];
                    System.out.println(isso);
                    listaEmpresa.get(i).produtos.add(isso);
                }//adiciona os produtos na empresa
            }
        }
    }

    //arraylist metodos//
    public ArrayList<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }

    public ArrayList<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(ArrayList<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }

    //gets e setters//
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Pessoa getPessoa_sessao() {
        return Pessoa_sessao;
    }

    public void setPessoa_sessao(Pessoa Pessoa_sessao) {
        this.Pessoa_sessao = Pessoa_sessao;
    }

    public Empresa getEmpresa_sessao() {
        return Empresa_sessao;
    }

    public void setEmpresa_sessao(Empresa Empresa_sessao) {
        this.Empresa_sessao = Empresa_sessao;
    }

    public Usuario getUsuario(String email) {
        for (int i = 0; i < listaPessoa.size(); i++) {
            if (listaPessoa.get(i).email.equals(email)) {
                Usuario esse = listaPessoa.get(i);
                return esse;
            }
        }
        return null;
    }
}
