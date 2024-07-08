package controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     * 
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
    
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    
    public static boolean areAnagrams(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Si las longitudes de las cadenas son diferentes, no pueden ser anagramas
        if (str1.length() != str2.length()) {
            return false;
        }

        // Crear mapas de frecuencia para ambas cadenas
        Map<Character, Integer> mapaFrecuencia1 = construirMapaFrecuencia(str1);
        Map<Character, Integer> mapaFrecuencia2 = construirMapaFrecuencia(str2);

        // Comparar los mapas de frecuencia
        return mapaFrecuencia1.equals(mapaFrecuencia2);
    }

    private static Map<Character, Integer> construirMapaFrecuencia(String str) {
        Map<Character, Integer> mapaFrecuencia = new HashMap<>();
        for (char c : str.toCharArray()) {
            mapaFrecuencia.put(c, mapaFrecuencia.getOrDefault(c, 0) + 1);
        }
        return mapaFrecuencia;
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */

    //public int[] sumatoriaDeDos(int[] nums, int objetivo) {
       // return sumatoriaDeDos(nums, objetivo);
    //}
}

