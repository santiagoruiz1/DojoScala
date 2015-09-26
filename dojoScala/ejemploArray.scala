import Array._

object dojo{
     def main(args: Array[String]) {
        
        var array1 = new Array[Int](2)
        suma2()
        array1(0) = 1
        array1(1) = 2
        println("Arreglo:")
        for( i <- 0 to (array1.length-1)) {
        	println(array1(i))
        }

        var nombre = "Scala"
        var matriz = ofDim[Int](2,2)
        println("Matriz: ")
        for(i <- 0 to 1){
        	for( j <- 0 to 1) {
        		println(matriz(i)(j))
        	}
        }
        var array2=("Hola","Mundo")
        var array3=(1.2,1.4)
      
    }
    def suma(x:Int,y:Int)=x+y
    val suma2 = (x:Int,y:Int) => x+y

}

println("El valor de la suma es: " + dojo.suma(2,3))