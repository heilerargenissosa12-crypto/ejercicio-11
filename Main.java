package karlslanguages;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 11: Karl's Languages (Lists)");
        System.out.println("==================================================");

        LanguageList list = new LanguageList();

        // 1. Lista vacía
        System.out.println("1. Lista recien creada esta vacia? " + list.isEmpty() + " (Esperado: true)");

        // 2. Agregar lenguajes
        list.addLanguage("Java");
        list.addLanguage("Python");
        list.addLanguage("Ruby");

        System.out.println("2. Conteo de lenguajes: " + list.count() + " (Esperado: 3)");
        System.out.println("   Primer lenguaje: " + list.firstLanguage() + " (Esperado: Java)");
        System.out.println("   Contiene Python? " + list.containsLanguage("Python") + " (Esperado: true)");
        System.out.println("   Es emocionante (tiene Java o Kotlin)? " + list.isExciting() + " (Esperado: true)");

        // 3. Eliminar lenguaje
        list.removeLanguage("Python");
        System.out.println("\n3. Despues de remover Python:");
        System.out.println("   Conteo: " + list.count() + " (Esperado: 2)");
        System.out.println("   Contiene Python? " + list.containsLanguage("Python") + " (Esperado: false)");

        boolean ok = list.count() == 2 && list.firstLanguage().equals("Java") && !list.containsLanguage("Python") && list.isExciting();
        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
