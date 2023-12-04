# manyTOoneDATAJPA
<pre>
&#8594; manyTOone mapping (MANY EMPLOYEES CAN HAVE ONE DEPARTMENT)
&#8594; HERE i define employee class as parent
&#8594; here i define department class as child
&#8594; i used @manytoone mapping and joincolumn for joining the class of child
&#8594; i saved dummy departments in departmentRunner
&#8594; i set the many emloyees to one department in employeeRunner
</pre>
### --------------------FETCHTYPE------------------------------
<pre>
&#8594; Here i used fetch type to employee parent class
&#8594; such as EAGER &  LAZY
&#8594; EAGER can fetch the both records parent and child
&#8594; LAZY can fetch the parent records
&#8594; MANY-TO-MANY && ONE-TO-MANY mappings default is LAZY 
&#8594; ONE-TO-ONE   && MANY-TO-ONE mappings default is EAGER
</pre>
