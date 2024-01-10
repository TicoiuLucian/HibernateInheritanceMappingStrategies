package org.example.tableperclass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;
  private String manufacturer;

}
