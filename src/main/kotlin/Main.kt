fun main() {
oddNumber(100)
names(arrayOf("MercyGrace","Mary","Clarine","Maryann"))
    robot(3)
    robot(12)
    robot(23)
    wholeNumber()

}
fun oddNumber(odd:Int){
for(numb in 1..100){
    if (numb %2 != 0)
        println(numb)

}
}
fun names(name:Array<String>){
    for (i in name) {

        if (i.length > 5) {

            println(i)
        }

    }
}
fun robot(age:Int){
if (age  in 1..6){
    println("milk")
}
    else if (age in 6..15){
        println("fanta")
    }
    else{
        println("Cocacola")
    }
}
fun wholeNumber(){
   for (num in 1..100) {
       if (num%3==0){
           println("Fizz")
   }
     else if (num%5==0){
        println("Buzz")
    }
       else if(num%5==0 &&num%3==0){
           println("FizzBuzz")
       }


}}

