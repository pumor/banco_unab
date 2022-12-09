package com.unab.banco.Dao;
import com.unab.banco.Models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDao extends CrudRepository< Cliente, String>  {
}