/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Testa_Funcionario {
    public static void main(String[] args){
        FuncionarioV1 t1 = new FuncionarioV1();
        t1.Salario = 1000;
        t1.bonifica(10);
        
        System.out.println(t1.Salario);
        
    }
}
