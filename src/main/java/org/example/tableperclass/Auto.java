package org.example.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Auto extends Vehicle {
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;
  private int numberOfDoors;

}
