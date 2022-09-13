package com.teste.springbootteste;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CambioRepository extends JpaRepository<Cambio, Long>{
  List<Cambio> findByPriceLessThan(float price);
}
