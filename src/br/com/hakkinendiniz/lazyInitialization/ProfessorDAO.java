/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.lazyInitialization;

import java.util.ArrayList;

/**
 *
 * @author santo
 */
public class ProfessorDAO {
        
//    public static Professor getProfessor(int id) throws Exception {
//         statement= ConexaoBancoDados.conect.prepareStatement("SELECT id, nome FROM professor WHERE professor_id='"+id+"'");
//         resultSet=statement.executeQuery();
//         resultSet.next();
//        //VERIFICA SE RETORNOU ALGUM RESULTADO SE NÃO RETORNA NULL
//        if (!resultSet.isFirst()) {
//           return null;
//        }
//        return new Professor();
//    }
//   
 
    public static Professor getProf(int id) throws Exception{
            return new Professor(id,"Glauber Pires");
    };
    
}
