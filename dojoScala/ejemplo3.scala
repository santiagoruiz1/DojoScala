object funcional {
	def main(args: Array[String]) {

		val lista = List(1,2,3)
		lista.map((x:Int) => println(x+4))
		println(suma2(3,10))
	}

	def suma(x:Int,y:Int) = x+y

	val suma2 = (x:Int,y:Int) => x+y
	
}