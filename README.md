# manyTOoneDATAJPA
#### manyTOone mapping (MANY EMPLOYEES CAN HAVE ONE DEPARTMENT)
### HERE i define employee class as parent
### here i define department class as child
### i used @manytoone mapping and joincolumn for joining the class of child
### i saved dummy departments in departmentRunner
### i set the many emloyees to one department in employeeRunner
### --------------------FETCHTYPE------------------------------
### Here i used fetch type to employee parent class
### such as EAGER &  LAZY
### EAGER can fetch the both records parent and child
### LAZY can fetch the parent records
### MANY-TO-MANY && ONE-TO-MANY mappings default is LAZY 
### ONE-TO-ONE   && MANY-TO-ONE mappings default is EAGER
