/*
NOME: GIOVANA LOPES - ADS 2401570 / LAVÍNIA BRAGA - SI 2400789
*/

/*2. (valor: 6,0) Sistema Bancário: Crie um sistema de contas bancárias em Kotlin, utilizando os
conceitos de OO vistos em aula, seguindo as diretrizes:
• Crie a classe ContaBancaria com os seguintes atributos: nome_titular e saldo_conta. A
classe também possui os métodos depositar(valor) e sacar(valor).
• Crie a subclasse ContaCorrente que contém o atributo taxaoperacao. Toda vez que o
cliente saca dinheiro da ContaCorrente é cobrada uma taxa de R$5,00.
• Crie a subclasse ContaPoupanca que contém o atributo rendimento. Toda vez que o
cliente deposita dinheiro na Conta Poupança, o dinheiro rende 2% a mais em relação a
quantia que foi depositado.
• Implemente o método exibirSaldo() na classe ContaBancaria e em suas respectivas
subclasses.
• Crie um cliente que possua uma ContaCorrente e faça a simulação do funcionamento
dessa subclasse.
• Crie um cliente que possua ContaPoupanca e faca a simulação do funcionamento dessa
subclasse.
• Faça todas as validações necessárias no programa.
• O saldo da conta precisa estar formatado com 2 casas decimais.*/

// kotlinc nome.kt -include-runtime -d ap.jar
// java -jar ap.jar

fun main() {
	val cliente1 = ContaCorrente("Giovana", 100.00)
    cliente1.depositar()
    cliente1.sacar()
    cliente1.exibirSaldo()
    val cliente2 = ContaPoupanca("Lavinia", 50.00)
    cliente2.depositar()
    cliente2.sacar()
    cliente2.exibirSaldo()
}

open class ContaBancaria(val nome_titular: String, var saldo_conta: Double){
    open fun depositar(){
		println("Digite o valor para depositar: ")
        val valor = readLine()!!.toDouble()
        saldo_conta += valor
    }
    
     open fun sacar(){
         println("Digite o valor para sacar: ")
         val valor = readLine()!!.toDouble()
         saldo_conta -= valor
        
    }

    open fun exibirSaldo(){
        println("saldo atual: $saldo_conta")
    }
    
}

class ContaCorrente(nome_titular: String, saldo_conta: Double, val taxaoperacao: Int=5): ContaBancaria(nome_titular, saldo_conta){
    override fun depositar(){
		println("Digite o valor para depositar: ")
        val valor = readLine()!!.toDouble()
        saldo_conta += valor
    }
    
     override fun sacar(){
         println("Digite o valor para sacar: ")
         val valor = readLine()!!.toDouble()
         saldo_conta -= valor
         saldo_conta -= taxaoperacao
    }

    override fun exibirSaldo(){
        println("saldo atual: $saldo_conta")
    }
    
}

class ContaPoupanca(nome_titular: String, saldo_conta: Double, val rendimento: Double=0.02): ContaBancaria(nome_titular, saldo_conta){
        override fun depositar(){
		println("Digite o valor para depositar: ")
        val valor = readLine()!!.toDouble()
        val rendimento = valor * rendimento
        saldo_conta += valor
        saldo_conta += rendimento
    }
    
     override fun sacar(){
         println("Digite o valor para sacar: ")
         val valor = readLine()!!.toDouble()
         saldo_conta -= valor
    }

    override fun exibirSaldo(){
        println("saldo atual: $saldo_conta")
    }
}