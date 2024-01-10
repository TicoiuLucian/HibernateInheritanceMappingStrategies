package org.example.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Tiger extends Animal {

  private Integer foodNeededPerDay;
}
