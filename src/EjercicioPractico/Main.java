/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioPractico;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Alumno alumno1 = new Alumno(1, "Juan", "Perez", "Masculino", "III");
        Alumno alumno2 = new Alumno(2, "Maria", "Gomez", "Femenino", "IV");
        Alumno alumno3 = new Alumno(3, "Pedro", "Lopez", "Masculino", "V");
        Alumno alumno4 = new Alumno(4, "Ana", "Martinez", "Femenino", "VI");
        Alumno alumno5 = new Alumno(5, "Carlos", "Rodriguez", "Masculino", "III");

        // a. Crear colecciones
        List<Alumno> listaAlumnos = new ArrayList<>();
        Set<Alumno> setAlumnos = new HashSet<>();
        Map<Integer, Alumno> mapaAlumnos = new HashMap<>();
        Stack<Alumno> pilaAlumnos = new Stack<>();
        Queue<Alumno> colaAlumnos = new LinkedList<>();

        // 1. Agregar objetos
        listaAlumnos.addAll(Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5));
        setAlumnos.addAll(Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5));
        for (Alumno alumno : Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5)) {
            mapaAlumnos.put(alumno.getCodigo(), alumno);
            pilaAlumnos.push(alumno);
            colaAlumnos.add(alumno);
        }

        // 2. Buscar objetos
        Alumno alumnoEncontrado = mapaAlumnos.get(3);
        System.out.println("Alumno encontrado: " + alumnoEncontrado);

        // 3. Insertar objetos (ya se insertaron al agregar)

        // 4. Eliminar objetos
        listaAlumnos.remove(alumno1);
        setAlumnos.remove(alumno2);
        mapaAlumnos.remove(3);
        pilaAlumnos.pop();
        colaAlumnos.poll();

        // 5. Saber si un objeto existe
        boolean existeEnLista = listaAlumnos.contains(alumno1);
        boolean existeEnSet = setAlumnos.contains(alumno2);
        boolean existeEnMapa = mapaAlumnos.containsValue(alumno3);
        boolean existeEnPila = pilaAlumnos.contains(alumno4);
        boolean existeEnCola = colaAlumnos.contains(alumno5);
        System.out.println("¿El alumno 1 existe en la lista? " + existeEnLista);
        System.out.println("¿El alumno 2 existe en el set? " + existeEnSet);
        System.out.println("¿El alumno 3 existe en el mapa? " + existeEnMapa);
        System.out.println("¿El alumno 4 existe en la pila? " + existeEnPila);
        System.out.println("¿El alumno 5 existe en la cola? " + existeEnCola);

        // b. Recorrer un objeto de tipo List
        System.out.println("Recorrido de la lista usando for tradicional:");
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i));
        }
        System.out.println("Recorrido de la lista usando foreach:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
        System.out.println("Recorrido de la lista usando while:");
        Iterator<Alumno> iterator = listaAlumnos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Recorrido de la lista usando do/while:");
        iterator = listaAlumnos.iterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());

        // c. Ordenar objetos en una lista
        Collections.sort(listaAlumnos, Comparator.comparing(Alumno::getApellido));
        System.out.println("Lista de alumnos ordenada por apellido:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }

        // d. Recorrer un objeto de tipo Set
        System.out.println("Recorrido del set usando for tradicional:");
        for (Alumno alumno : setAlumnos) {
            System.out.println(alumno);
        }
        System.out.println("Recorrido del set usando foreach:");
        setAlumnos.forEach(System.out::println);
        System.out.println("Recorrido del set usando while:");
        Iterator<Alumno> setIterator = setAlumnos.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
        System.out.println("Recorrido del set usando do/while:");
        setIterator = setAlumnos.iterator();
        do {
            System.out.println(setIterator.next());
        } while (setIterator.hasNext());

        // e. Recorrer un objeto de tipo Map
        System.out.println("Recorrido del mapa usando for tradicional:");
        for (Map.Entry<Integer, Alumno> entry : mapaAlumnos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", Alumno: " + entry.getValue());
        }
        System.out.println("Recorrido del mapa usando foreach:");
        mapaAlumnos.forEach((key, value) -> System.out.println("Código: " + key + ", Alumno: " + value));
        System.out.println("Recorrido del mapa usando while:");
        Iterator<Map.Entry<Integer, Alumno>> mapIterator = mapaAlumnos.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, Alumno> entry = mapIterator.next();
            System.out.println("Código: " + entry.getKey() + ", Alumno: " + entry.getValue());
        }
        System.out.println("Recorrido del mapa usando do/while:");
        mapIterator = mapaAlumnos.entrySet().iterator();
        do {
            Map.Entry<Integer, Alumno> entry = mapIterator.next();
            System.out.println("Código: " + entry.getKey() + ", Alumno: " + entry.getValue());
        } while (mapIterator.hasNext());

        // f. Recorrer un objeto de tipo List usando stream
        System.out.println("Recorrido de la lista usando stream:");
        listaAlumnos.forEach(System.out::println);

        // g. Recorrer un objeto de tipo Set usando stream
        System.out.println("Recorrido del set usando stream:");
        setAlumnos.forEach(System.out::println);

        // h. Recorrer un objeto de tipo Map usando stream
        System.out.println("Recorrido del mapa usando stream:");
        mapaAlumnos.entrySet().stream()
                .forEach(entry -> System.out.println("Código: " + entry.getKey() + ", Alumno: " + entry.getValue()));

        // i. Recorrer un objeto de tipo List usando una función flecha o función lambda
        System.out.println("Recorrido de la lista usando lambda:");
        listaAlumnos.forEach(alumno -> System.out.println(alumno));

        // j. Recorrer un objeto de tipo Set usando una función flecha o función lambda
        System.out.println("Recorrido del set usando lambda:");
        setAlumnos.forEach(alumno -> System.out.println(alumno));

        // k. Recorrer un objeto de tipo Map usando una función flecha o función lambda
        System.out.println("Recorrido del mapa usando lambda:");
        mapaAlumnos.entrySet().forEach(entry -> System.out.println("Código: " + entry.getKey() + ", Alumno: " + entry.getValue()));

        // l. Convertir un array en un objeto List
        Alumno[] arrayAlumnos = {alumno1, alumno2, alumno3, alumno4, alumno5};
        List<Alumno> nuevaListaAlumnos = Arrays.asList(arrayAlumnos);
        System.out.println("Nueva lista de alumnos creada a partir de un array:");
        nuevaListaAlumnos.forEach(System.out::println);

        // m. Convertir un objeto List a un array
        Alumno[] nuevoArrayAlumnos = listaAlumnos.toArray(new Alumno[0]);
        System.out.println("Nuevo array de alumnos creado a partir de una lista:");
        for (Alumno alumno : nuevoArrayAlumnos) {
            System.out.println(alumno);
        }

        // n. Dos formas de unir unas dos listas en una sola
        List<Alumno> nuevaLista = new ArrayList<>(listaAlumnos);
        nuevaLista.addAll(nuevaListaAlumnos);
        System.out.println("Lista combinada de alumnos (método 1):");
        nuevaLista.forEach(System.out::println);

        nuevaLista = Stream.concat(listaAlumnos.stream(), nuevaListaAlumnos.stream())
                .collect(Collectors.toList());
        System.out.println("Lista combinada de alumnos (método 2):");
        nuevaLista.forEach(System.out::println);

        // o. Desordenar una Lista
        Collections.shuffle(listaAlumnos);
        System.out.println("Lista de alumnos desordenada:");
        listaAlumnos.forEach(System.out::println);

        // p. Cómo ordenar colecciones de objetos usando los métodos de Stream
        List<Alumno> listaAlumnosOrdenadaPorApellido = listaAlumnos.stream()
                .sorted(Comparator.comparing(Alumno::getApellido))
                .collect(Collectors.toList());
        System.out.println("Lista de alumnos ordenada por apellido usando Stream:");
        listaAlumnosOrdenadaPorApellido.forEach(System.out::println);

        // q. Como obtener una sublista de alumnos de una colección de objetos de tipo alumnos, pero solo aquellos que se encuentren en III semestre usando los métodos de Stream
        List<Alumno> subListaAlumnosEnTercerSemestre = listaAlumnos.stream()
                .filter(alumno -> alumno.getSemestre().equals("III"))
                .collect(Collectors.toList());
        System.out.println("Sublista de alumnos en tercer semestre usando Stream:");
        subListaAlumnosEnTercerSemestre.forEach(System.out::println);

        // r. Cómo agrupar la colección de alumnos por género y semestre usando los métodos de Stream
        Map<String, Map<String, List<Alumno>>> alumnosPorGeneroYSemestre = listaAlumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getGenero, Collectors.groupingBy(Alumno::getSemestre)));
        System.out.println("Alumnos agrupados por género y semestre usando Stream:");
        System.out.println(alumnosPorGeneroYSemestre);

        // s. Como obtener de la colección de alumnos el primer alumno que se encuentre en III semestre, usando los métodos de Stream
        Optional<Alumno> primerAlumnoEnTercerSemestre = listaAlumnos.stream()
                .filter(alumno -> alumno.getSemestre().equals("III"))
                .findFirst();
        System.out.println("Primer alumno en tercer semestre usando Stream:");
        primerAlumnoEnTercerSemestre.ifPresent(System.out::println);

        // t. Como obtener de la colección de alumnos el alumno cuyo nombre contiene la palabra "John", usando los métodos de Stream
        Optional<Alumno> alumnoConNombreJohn = listaAlumnos.stream()
                .filter(alumno -> alumno.getNombre().contains("John"))
                .findFirst();
        System.out.println("Alumno cuyo nombre contiene 'John' usando Stream:");
        alumnoConNombreJohn.ifPresent(System.out::println);

        // u. Como obtener de la colección de alumnos aquellos que se encuentren cursando de III a VI semestre, usando los métodos de Stream
        List<Alumno> alumnosEnSemestresIIIaVI = listaAlumnos.stream()
                .filter(alumno -> alumno.getSemestre().equals("III") || alumno.getSemestre().equals("IV")
                        || alumno.getSemestre().equals("V") || alumno.getSemestre().equals("VI"))
                .collect(Collectors.toList());
        System.out.println("Alumnos en semestres III a VI usando Stream:");
        alumnosEnSemestresIIIaVI.forEach(System.out::println);
    }
}