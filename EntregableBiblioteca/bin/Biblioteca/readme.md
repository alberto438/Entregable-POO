# Gestion de recursos de una biblioteca

/* 
Para esta gestión usaremos una superclase que los reuna a todos como clase padre
que será recursosBiblioteca, sera de tipo abstracto ya que de ella no borataran
objetos, sino que surgiran clases hijas que abarcaran los tipos de recursos que
broten de la misma. Estos recursos serán
1. Libros
2. Revistas
3. Dvds
Los atributos comunes de ambos recursos serán incluidos en la clase padre 
recursosBiblioteca y estos serán:
	- nombre
	- autor
	- año
	- editorial
	- disponibilidad
Y cada subclase tendra los atributos correspondientes al tipo de producto que se ha
elegido;
		Libros
			- pasta ( dura o blanda )
			- volumen ( cantidad de hojas)
		Revistas 
			- temtica ( 
			