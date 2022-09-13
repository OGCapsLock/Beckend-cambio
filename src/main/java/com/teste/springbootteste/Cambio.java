package com.teste.springbootteste;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
public class Cambio(){
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long id;
  private String moeda;
  private float price;

  public Cambio(){}

  public Cambio(long id, String moeda, float price){
    this.id=id;
    this.moeda=moeda;
    this.price=price;
  }

  public long getId(){
    return id;
  }

  public String getMoeda(){
    return moeda;
  }

  public float getPrice(){
    return price;
  }

}

