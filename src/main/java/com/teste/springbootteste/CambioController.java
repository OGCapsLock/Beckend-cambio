package com.teste.springbootteste;

import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "/cambio")
public class CambioController(){

     CambioRepository cambioRepository;

     @Autowired
     public CambioController(CambioRepository cambioRepository){
      this.cambioRepository=cambioRepository;
     }


     @RequestMapping(value="/all", method = RequestMethod.GET)
     public List<Cambio> getAll(){
      return cambioRepository.findALL();
     }


     @RequestMapping(value="/affordable/{price}", method = RequestMethod.GET)
     public List<Cambio> getAffordable(@PathVariable double price){
      return cambioRepository.findByPriceLessThan(price);
}


     @RequestMapping(value="/create", method = RequestMethod.POST)
     public List<Cambio> create(@RequestBody Cambio cambio){
      cambioRepository.save(cambio);
      return cambioRepository.findAll();

}

@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
     public List<Cambio> remove(@PathVariable long id){
      cambioRepository.delete(cambio);
      return cambioRepository.findAll();
}
