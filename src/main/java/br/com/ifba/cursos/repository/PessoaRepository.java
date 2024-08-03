/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.cursos.repository;

import br.com.ifba.cursos.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hmart
 */
public interface PessoaRepository extends JpaRepository<Curso, Long>{
    
}
