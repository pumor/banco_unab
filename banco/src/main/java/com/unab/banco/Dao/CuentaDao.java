package com.unab.banco.Dao;
import com.unab.banco.Models.Cuenta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaDao  extends CrudRepository<Cuenta, String> {
}