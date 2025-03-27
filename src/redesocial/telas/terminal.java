/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redesocial.telas;

import java.util.ArrayList;
import redesocial.classes.Empresa;
import redesocial.classes.Pessoa;
import redesocial.classes.Usuario;

/**
 *
 * @author gustavo
 */
public class terminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario adm = new Usuario();
        Pessoa junior = new Pessoa("Joselito", "Junior@gmail", "jun10r");
        Pessoa gustavo = new Pessoa("Gustavo", "Gustavo@gmail", "gust4v0");
        Empresa barzin = new Empresa("1231123", "Viagens_a_Lua", "Espasso", "LuaViagens@gmail", "123lua4lua321");
        adm.adicinar(junior);
        adm.adicionarPessoa("carlao", "carlao@", "carlao1234");
        adm.adicionar(barzin);
        System.out.println(adm.getListaPessoa());
        System.out.println(adm.getListaEmpresa());
        System.out.printf("\n\n\n");
        System.out.println(adm.getPessoa("Joselito"));
        System.out.println(adm.getEmpresa("Espasso"));
        System.out.printf("\n\n");
        adm.fazerAmizade(adm.getPessoa("Joselito"), adm.getEmpresa("Viagens_a_Lua"));
        System.out.println(adm.getListaPessoa().get(0).getLista_de_amigos());
        adm.atualizarE("Viagens_a_Lua", "LuaMarte@gmail", "Elon_muski", "Lua_e_Marte", "2324234", "foguetes");
        adm.listar();
        adm.fazerAmizade(adm.getPessoa("Joselito"), adm.getEmpresa("Lua_e_Marte"));
        adm.fazerAmizade(adm.getPessoa("Joselito"), adm.getEmpresa("carlao"));
        adm.listar();
    }
    
}
