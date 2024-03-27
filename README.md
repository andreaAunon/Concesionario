# concesionario
- Queria aplicar un patron Factory Method para la creacion de 
vehiculos y piezas pero no me dio tiempo.
- He hecho un Singleton de la clase BaseData 

- El PRU se cumple en las clases del model. No se deberían tener que editar 
si se quisiera añadir una pieza o tipo de coche mas (a salvo de que haya que añadir algun parametro
a la clase base porque me falto a mi, pero solo se tendria que editar las abstract).
Este principio también se cumple en el Menu porque solo imprime por pantalla datos.
- PA/C se cumple en los services y controllers ya que no deberían tener que editarse lo que ya 
esta construido, si no añdir cosas nuevas (aunque igual el menu si lo hubiera optimizado más para este
principio).
- PSL se cumple en las clases del model tanto las de vehículos como las de piezas ya que se pueden implementar
las clases independientemente de las otras y sin afectarse entre sí.
- PSI se cumple en las interfaces del Service, solo son exclusivas para un tipo de operaciones
  (una es para facturas y otra para el tema de gestión de vehículos).