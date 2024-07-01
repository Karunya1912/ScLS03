object demo extends App{
    var num1=36
    var num2=98

    def func(num1:Int,num2:Int):Float={
        var mean=(num1+num2).toFloat/2

        math.round(mean*100)/100.0f
    }
    println(func(num1,num2))
}