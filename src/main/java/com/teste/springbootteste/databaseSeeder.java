

package com.teste.springbootteste;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import java.util.ArrayList;
import java.util.List;
 @Component
public class DatabaseSeeder implements ComandLineRunner{
  private CambioRepository cambioRepository;

  @Autowired
  public DatabaseSeeder (CambioRepository cambioRepository){
    this.cambioRepository=CambioRepository;
  }

  @Overrider
  public void run(String... strings) throws Exception{
    List<Cambio> cambio = new ArrayList<>();
      camb.add(new Cambio(1,"USD", 94));
      camb.add(new Cambio(1,"YEN", 81));
      camb.add(new Cambio(1,"EUR", 97));
      camb.add(new Cambio(1,"MT", 43));

      cambioRepository.save(cambio);

  }

}
