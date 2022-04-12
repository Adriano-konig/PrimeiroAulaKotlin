fun main() {
    println("Digite temperatura como está: "+" °c")
    val temp = readln().toDouble()

//    if(temp <= 18){
//        println("O clima é frio")
//    }else if(temp >= 19 && temp <= 23){
//        println("O clima é agradável")
//    }else if(temp >= 24 && temp <= 35){
//        println("O clima é quente")
//    }else{
//        println("O clima é muito quente")
//    }
    when{
        temp <= 18 -> println("O clima é frio")
        temp >= 19 && temp <= 23 -> println("O clima é agradável")
        temp >= 24 && temp <= 35 -> println("O clima é quente")
    else->{
        println("O clima é muito quente")
    }
    }
}