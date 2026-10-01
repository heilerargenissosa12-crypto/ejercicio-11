package karlslanguages;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 11: Karl's Languages
 * Concepto: Lists / Generic Types (Manejo de colecciones de tipo List y ArrayList)
 *
 * Karl está aprendiendo a programar y quiere llevar el registro
 * de los lenguajes de programación que va conociendo.
 */
public class LanguageList {

    private final List<String> languages = new ArrayList<>();

    /**
     * Verifica si la lista está vacía.
     */
    public boolean isEmpty() {
        return languages.isEmpty();
    }

    /**
     * Añade un nuevo lenguaje al final de la lista.
     */
    public void addLanguage(String language) {
        languages.add(language);
    }

    /**
     * Elimina un lenguaje específico de la lista.
     */
    public void removeLanguage(String language) {
        languages.remove(language);
    }

    /**
     * Retorna el primer lenguaje que aprendió Karl.
     */
    public String firstLanguage() {
        return languages.get(0);
    }

    /**
     * Retorna cuántos lenguajes hay en la lista.
     */
    public int count() {
        return languages.size();
    }

    /**
     * Verifica si un lenguaje ya se encuentra en la lista.
     */
    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    /**
     * Para Karl, una lista es emocionante ("exciting") si incluye "Java" o "Kotlin".
     */
    public boolean isExciting() {
        return containsLanguage("Java") || containsLanguage("Kotlin");
    }
}
