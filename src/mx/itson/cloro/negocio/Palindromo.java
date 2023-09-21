
package mx.itson.cloro.negocio;

/**
 * Contiene un metodo para detectar palindromos
 * @author alexi
 */
public class Palindromo {
    
    
    /**
     * Indica si una oracion es palindromo
     * @param oracion Cadena de texto a analizar
     * @return String que indica si la oracion es un palindromo
     */
    public String esPalindromo(String oracion){
    
    String formato = oracion.toLowerCase().replace(" ", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace("!", "").replace("¡", "").replace(",", "");
        
        int numCaracteres = formato.length()-1;
        
        char[] caracteres = formato.toCharArray();
        
        String union = "";
        String esPalindromo = "";
        for(char i: caracteres){
            int posicion = numCaracteres--;
            char h = caracteres[posicion];
            String caracter =String.valueOf(h);
            union +=caracter;
            if(posicion==0){
                if(formato.equals(union)){
                    esPalindromo = "Es un palindromo";
                }else{
                    esPalindromo = "No es un palindromo";
                }
            }
            
        }
        return esPalindromo;
    }
    
    
    
    
}
