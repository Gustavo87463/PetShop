public class Paciente {
    
    double peso;
    double altura;

    IMC calculaindeceMasaCorporal(){

        IMC imc = new IMC();

        double indece = peso / (altura * altura);
        imc.indece = indece;

        if(indece < 18.5){
            imc.abaixoDoPeso = true;
        }else if(indece < 25){
            imc.pesoIdeal = true;
        }else{
            imc.obeso = true;
            if(indece < 30){
                System.out.println("Acima do peso.");
            }else if(indece < 35){
                System.out.println("Obesidade Grau I");
            }else if(indece < 40){
                System.out.println("Obesidade Grau II");
            }else {
                System.out.println("Obesidade Grau III");
            }
        }
        return imc;
    }   
        

    double calculaIndeceMassaCorporal(){
        double indece = peso / (altura * altura);

        if(indece < 18.5){
            System.out.println("Esta abaixo do peso");
        }else if(indece < 25){
            System.out.println("Esta no peso ideal.");
        }else{
            System.out.println("Esta obeso.");
            if(indece < 30){
                System.out.println("Acima do peso.");
            }else if(indece < 35){
                System.out.println("Obesidade Grau I");
            }else if(indece < 40){
                System.out.println("Obesidade Grau II");
            }else {
                System.out.println("Obesidade Grau III");
            }
        }
        return indece;
    }




}
