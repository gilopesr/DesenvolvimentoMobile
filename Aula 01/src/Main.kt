//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var name = "Giovana" //var é mutavel
    var name2:String = " Lopes"
    val birthyear = 2005
    val birthyear2:Int = 1999
    val firstName = "Leighton"
    val lastName = " Murray"
    val fullName = firstName + lastName

    println("Parabéns "+name+" sobrenome:"+name2)
    println("Você nasceu em: "+birthyear)
    println(fullName)

    //template string
    val name3 = "bela"
    println("olá $name3")
    println("$name3 possui ${name3.length} letras")
    ////////////////

    var i = 18
    ++i

    var j = 78
    --j

    var x = 9
    x+=3

    println("incremento mais um: $i")
    println("DECREMENTO: $j")
    println("Valor de x atualizado: $x")

    // operadores logicos: &&(e), || (ou), !(negação)
    //comparação: >,<, >=, <=, ==, !=

    var t = 8
    println(t>0 || 9<t)

    var chuva = true
    println(!chuva)

    var txt = "aespa rainhas da 4th gen"
    println("Tamanho: ${txt.length}")

    var txt2 = "te amo beomgyu"
    println(txt2.uppercase())

    var txt3 = "OVER THE MOON"
    println(txt3.lowercase())

}