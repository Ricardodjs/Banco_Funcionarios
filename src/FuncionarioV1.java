/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class FuncionarioV1 {
  String Nome;
  String Departamento;
  double Salario;
  String Entrada;
  String RG;
  boolean ativo;
  
//criar um metodo que bonifica o salario do funcionario
     void bonifica (double aumento){
     
     double res;
     
     res = (Salario * aumento) / 100;
     
     Salario = Salario + res;
     
     }
}
