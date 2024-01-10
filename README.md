**Hibernate inheritance strategies:**
**MappedSuperclass** – the parent classes, can’t be entities
**Single** **Table** – The entities from different classes with a common ancestor are placed in a single table.
**Joined** **Table** – Each class has its table, and querying a subclass entity requires joining the tables.
**Table** **per** **Class** – All the properties of a class are in its table, so no join is required.
