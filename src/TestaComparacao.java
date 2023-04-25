public class TestaComparacao {
    public static void main(String[] args){

        //Comparacao - sempre retorna valor boolean - true or false
        //Toda comparação envolvendo valores numéricos não considera o tipo do valor. Confira somente se eles têm o mesmo valor ou não, independente de seu tipo

        // == ou !=
        System.out.println(1 == 1); // retorna true
        System.out.println(1 != 1); // retorna false

        System.out.println(2 >= 1); //true
        System.out.println(2 <= 1); //false
        System.out.println(2 > 1);  //true
        System.out.println(2 < 1); //false

        //nao há itnerferencia na comparacao caso o tipo de uma variavel seja diferente da outro
        //exemplo: comparando int 1 com int double
        System.out.println(1 == 1.0d); // true, embora estejamos comparando 1 int com 1 double, ambos sao iguais, por tanto 1 é igual a 1
        System.out.println(2.0f  == 2.0d); // true, embora um tipo de dado seja float e o outro seja double, 2 é igual a 2
        System.out.println(1.0f ==1l); //float com long, retorna true


        //comparacao entre dois boolean
        System.out.println(true == true); //retorna true, pois verdadeiro é igual a verdadeiro
        System.out.println(true != false); //retorna true, pois verdadeiro é diferente de false


        //cuidado ao confudir == com =
        // = é atribuicao, ou seja eu atribuo algo para alguma variável
        int idade = 25;
        System.out.println(idade = 25); // estou atribuindo idade igual a 25, e nao comparando, entao aqui o o print retornará 25

       
        System.out.println(idade == 25); // agora sim estou comparando se idade é igual a tal numero, neste caso, ela retorna true, pois como declarado, idade é igual a 25

        // não compila, tipo não primitivo só aceita != e ==
        System.out.println("Mario" > "Guilherme"); 

        // não compila, boolean só aceita != e ==
        System.out.println(true < false);


        //Não podemos comparar tipos incomparáveis, como um boolean com um valor numérico. Mas podemos comparar chars com numéricos.

        // não compila, boolean é boolean
        System.out.println(true == 1); 
        // compila, 'a' tem valor numérico também
        System.out.println('a' > 1);





    }
}
