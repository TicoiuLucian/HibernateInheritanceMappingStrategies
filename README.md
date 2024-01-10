**Hibernate inheritance strategies:** <br/>  <br/>
**MappedSuperclass** – the parent classes, can’t be entities  <br/>
**Single** **Table** – The entities from different classes with a common ancestor are placed in a single table.  <br/>
**Joined** **Table** – Each class has its table, and querying a subclass entity requires joining the tables.  <br/>
**Table** **per** **Class** – All the properties of a class are in its table, so no join is required.  <br/>
