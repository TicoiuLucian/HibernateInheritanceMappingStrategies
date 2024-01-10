package org.example.joinedtable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long animalId;
  private String species;

}
