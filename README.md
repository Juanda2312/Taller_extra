# 📚 Actividad: Genéricos y Estructuras de Datos

**Universidad del Quindío**  
**Espacio Académico:** Estructura de Datos  

---

## 📋 Descripción General

Esta actividad práctica abarca el uso de **tipos genéricos**, **estructuras de datos** (pilas y colas) y **principios de diseño orientado a objetos** en Java. Cada punto implementa un concepto específico del espacio académico.

---

## 📁 Estructura del Proyecto

```
src/main/java/co/edu/uniquindio/
├── Punto1/   → Sistema de gestión de tareas genérico
├── Punto2/   → Lista de pares clave-valor genérica
├── Punto3/   → Análisis de comportamiento de Set
├── Punto4/   → Repositorio genérico con iterador inverso
├── Punto5/   → spliceStack: extracción de rango en pila
├── Punto6/   → Método genérico maximo()
├── Punto7/   → Interfaz genérica Comparador<T>
├── Punto8/   → splitStack: división de pila en dos subpilas
├── Punto9/   → Sistema de alquiler de vehículos con comodines
└── Punto10/  → mergeQueues: intercalado de colas
```

---

## 🔍 Descripción por Punto

### Punto 1 — Sistema de Gestión de Tareas
Implementa una clase `Tarea` con descripción, prioridad y fecha de vencimiento, y una clase genérica `ListaDeTareas<T extends Tarea>` que permite:
- Agregar tareas
- Ordenar por prioridad (usando `Comparable`)
- Ordenar por fecha de vencimiento (usando `Comparator`)
- Filtrar tareas por nivel de prioridad específico

**Conceptos:** Genéricos con bounds (`extends`), `Comparable`, `Comparator`, `Collections.sort()`

---

### Punto 2 — PairList Genérica
Implementa una clase `PairList<K, V>` que almacena una lista de pares clave-valor con métodos para agregar (`add`), eliminar (`remove`) y obtener valores (`get`).

**Conceptos:** Genéricos con múltiples parámetros de tipo, `ArrayList`, `Stream API`

---

### Punto 3 — Comportamiento de LinkedHashSet
Análisis del comportamiento de `LinkedHashSet`: mantiene el orden de inserción y no admite elementos duplicados. La salida del programa es `[Chicago, Boston, Alabama]` ya que el segundo `"Chicago"` no se inserta.

**Conceptos:** `Set`, `LinkedHashSet`, unicidad de elementos, orden de inserción

---

### Punto 4 — Repositorio Genérico con Iterador Inverso
Implementa una clase `Repositorio<T>` que implementa `Iterable<T>` para permitir el recorrido con `for-each`. Incluye además un iterador personalizado `RepositorioIterator<T>` que recorre la lista de atrás hacia adelante.

**Conceptos:** `Iterable`, `Iterator`, patrón de diseño Iterator, recorrido inverso

---

### Punto 5 — spliceStack
Método que extrae un rango de elementos `[i, j)` desde el fondo de una pila, devuelve los elementos extraídos en una nueva pila y modifica la pila original eliminando ese rango. Implementado usando **solo operaciones de pila** (`push`, `pop`, `peek`).

**Conceptos:** ADT Stack, operaciones restringidas, preservación del orden

> ⚠️ **Importante:** Se usa `LinkedList` en lugar de `PriorityQueue` y operaciones de pila en lugar de acceso por índice para respetar el ADT.

---

### Punto 6 — Método Genérico `maximo()`
Método genérico que recibe una `List<T>` donde `T extends Comparable<T>` y retorna el elemento máximo de la lista. Lanza `IllegalArgumentException` si la lista está vacía.

**Conceptos:** Métodos genéricos, bounded type parameters, `Comparable<T>`

---

### Punto 7 — Interfaz Genérica `Comparador<T>`
Define una interfaz genérica `Comparador<T>` con el método `comparar(T a, T b)` que retorna un `int`. Se implementa para:
- `Numero`: compara dos enteros
- `Cadena`: compara dos cadenas de texto usando `String.compareTo()`

**Conceptos:** Interfaces genéricas, implementaciones de tipos específicos, contrato de comparación

---

### Punto 8 — splitStack
Método que divide una pila en dos subpilas en la posición `i`: la primera contiene los elementos desde el fondo hasta `i` (sin incluirlo), y la segunda desde `i` hasta el tope. Retorna un `Pair<Stack<Integer>, Stack<Integer>>`. Valida que `i` esté en el rango `[0, size]`.

**Conceptos:** ADT Stack, clase genérica `Pair<T1, T2>`, manejo de excepciones

---

### Punto 9 — Sistema de Alquiler de Vehículos
Implementa una jerarquía de clases (`Vehiculo`, `Auto`, `Moto`, `Camion`) con un método `alquilarVehiculos(List<? extends Vehiculo>)` que acepta listas de cualquier subtipo de vehículo gracias al uso del comodín `?`. Retorna un `HashMap<String, Float>` con la placa y el precio de alquiler de cada vehículo.

**Conceptos:** Herencia, polimorfismo, wildcard `? extends T`, `HashMap`

---

### Punto 10 — mergeQueues
Método que recibe dos colas `Queue<Integer>` e intercala sus elementos en una nueva cola, preservando el orden de inserción. Si una cola es más larga, los elementos restantes se agregan al final.

**Conceptos:** ADT Queue, `LinkedList` como implementación de `Queue`, intercalado de secuencias

> ⚠️ **Importante:** Se usa `LinkedList` en lugar de `PriorityQueue` para preservar el orden de inserción y no reordenar por valor.

---

## ▶️ Cómo Ejecutar

Cada punto tiene su propia clase `Main` con casos de prueba. Para ejecutar un punto específico, correr la clase `Main` del paquete correspondiente.

**Ejemplo con Maven:**
```bash
mvn compile
mvn exec:java -Dexec.mainClass="co.edu.uniquindio.Punto1.Main"
```

---

## 🧠 Conceptos Clave Trabajados

| Concepto | Puntos |
|---|---|
| Clases y métodos genéricos | 1, 2, 4, 6, 7, 8 |
| Bounded type parameters (`extends`) | 1, 6, 9 |
| Wildcard (`? extends T`) | 9 |
| ADT Stack (solo `push/pop/peek`) | 5, 8 |
| ADT Queue | 10 |
| `Comparable` / `Comparator` | 1, 6, 7 |
| Patrón Iterator personalizado | 4 |
| Colecciones Java (`Set`, `Map`, `List`) | 2, 3, 9 |
| Manejo de excepciones | 6, 8 |

---

## ✅ Aspectos a Destacar

- En los puntos de pilas (5 y 8) se respetan las **restricciones del ADT**, usando únicamente `push`, `pop` y `peek`, sin acceso directo por índice.
- En el punto 10 se usa `LinkedList` en lugar de `PriorityQueue` para **preservar el orden de inserción**.
- En el punto 7 la interfaz `Comparador<T>` recibe **dos parámetros** en el método `comparar`, siguiendo fielmente el enunciado.
