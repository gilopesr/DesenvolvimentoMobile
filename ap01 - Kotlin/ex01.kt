/*
NOME: GIOVANA LOPES - ADS 2401570 / LAVÍNIA BRAGA - SI 2400789
*/

/*1. (valor: 4,0) Sistema de Funcionários: Você foi contratado pela empresa IMPACTA DEVS para
desenvolver o novo sistema de funcionários da empresa. Para isso as seguintes orientações devem
ser seguidas:
• Crie a classe Funcionários com os seguintes atributos: nome do funcionário e salário.
Também deve ser implementado o método exibirInformacoes( ) responsável por imprimir o
nome e salário de cada funcionário.
• Crie a subclasse Gerente que herda de Funcionário e possui o atributo bônus: Double. O
salário total do gerente deve considerar o bônus.
• Crie a subclasse Desenvolvedor que herda de funcionário e possui o atributo
linguagemProgramacao: String.
• Aplique o polimorfismo no método exibirInformacoes( ) nas subclasses.
• Por fim crie uma lista com 2 funcionários, 2 gerentes e 2 desenvolvedores, e chame
exibirInformacoes() para cada um deles.*/

fun main() {
	val funcionarios: List<Funcionario> = listOf(
    	Funcionario("Bruna", 1500.50),
        Funcionario("Lavinia", 1500.49),
        Gerente("Giovana", 3000.50, 500.00),
        Gerente("Bruce Wayne", 3000.50, 500.00),
        Desenvolvedor("Arrascaeta", 2000.20, "Java"),
        Desenvolvedor("Neymar", 2000.20, "Kotlin")
    )
    
    for (funcionario in funcionarios){
        println(funcionario.exibirInformacoes())
    }
}

open class Funcionario(val nome: String, val salario: Double){
    open fun exibirInformacoes():String{
		return "Nome: $nome, Salario: $salario"
    }
}

class Gerente(nome: String, salario: Double, val bonus: Double): Funcionario(nome, salario){
    override fun exibirInformacoes():String{
        return "${super.exibirInformacoes()}, Bônus: $bonus"
    }
}

class Desenvolvedor(nome: String, salario: Double, val linguagemProgramacao: String): Funcionario(nome, salario){
	override fun exibirInformacoes():String{ 
		return "${super.exibirInformacoes()}, Linguagem de Programção: $linguagemProgramacao"
	}
}
