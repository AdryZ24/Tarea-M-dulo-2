# Gestor de Usuarios – Tarea Módulo 2

## 📌 Descripción

Este proyecto implementa una interfaz gráfica en **Java Swing** usando el **GUI Designer de IntelliJ**. Se practica el uso de distintos **Layouts (BorderLayout, FlowLayout, GridLayout, GridBagLayout)** en una misma ventana, junto con un **JDialog modal** de confirmación.

El objetivo es diseñar y construir un **Gestor de Usuarios**, partiendo de un wireframe y un árbol de contenedores, aplicando buenas prácticas en el uso de paneles y distribución.

---

## 📑 Planificación (RA1 y RA4)

### Wireframe inicial

Diseñado en papel con distribución de zonas:

* **Header (NORTH):** título + icono.
* **Lateral izquierdo (WEST):** menú de navegación con 5 botones.
* **Centro (CENTER):** formulario de datos con etiquetas y campos.
* **Lateral derecho (EAST):** previsualización con pestañas (Resumen/Logs).
* **Pie (SOUTH):** botonera de acciones.

### Árbol de contenedores

```
JFrame (BorderLayout)
 ├─ NORTH: headerPanel (FlowLayout)
 │    └─ JLabel (icono + título)
 │
 ├─ WEST: navPanel (GridLayout 5x1)
 │    ├─ JButton Dashboard
 │    ├─ JButton Usuarios
 │    ├─ JButton Informes
 │    ├─ JButton Ajustes
 │    └─ JButton Ayuda
 │
 ├─ CENTER: formPanel (GridBagLayout)
 │    ├─ JLabel + JTextField Nombre
 │    ├─ JLabel + JTextField Email
 │    ├─ JLabel + JComboBox Rol
 │    ├─ JLabel + JCheckBox Activo
 │    └─ JLabel + JTextArea (con JScrollPane) Notas
 │
 ├─ EAST: previewPanel (BorderLayout)
 │    └─ JTabbedPane
 │        ├─ Tab 1: JTextArea Resumen (read-only)
 │        └─ Tab 2: JTextArea Logs
 │
 └─ SOUTH: buttonBar (FlowLayout RIGHT)
      ├─ JButton Cancelar
      ├─ JButton Limpiar
      └─ JButton Guardar
```

### Propiedades clave

| Componente | Propiedades                                                                     |
| ---------- | ------------------------------------------------------------------------------- |
| Header     | Font Bold 18, icono opcional                                                    |
| NavPanel   | GridLayout(5x1), vgap=5, botones mismo ancho                                    |
| FormPanel  | GridBagLayout, insets=5, anchor=WEST, fill=HORIZONTAL/BOTH, weightx=1 en campos |
| Preview    | BorderLayout + JTabbedPane, preferred width=260 px                              |
| ButtonBar  | FlowLayout(RIGHT), botones mismo tamaño, defaultButton=Guardar                  |

---

## ⚙️ Construcción

* Proyecto creado en **IntelliJ IDEA** → *New GUI Form*.
* Layout raíz: **BorderLayout**.
* Se añadieron paneles con el layout adecuado en cada zona.
* Se configuraron las propiedades de cada componente para un comportamiento correcto al redimensionar.

### Comportamiento esperado

* El formulario (CENTER) y el área de notas crecen al redimensionar.
* El panel de previsualización (EAST) mantiene su ancho fijo.
* La botonera se mantiene alineada a la derecha.

---

## 🔲 Diálogo Modal (JDialog)

Se implementa un `DialogConfirmacion` con:

* JLabel: "¿Guardar cambios?"
* JButton: "Aceptar" y "Cancelar".

Se abre desde el botón Guardar en la ventana principal:

```java
dialog.setModal(true);
dialog.pack();
dialog.setVisible(true);
```

---

## 📷 Capturas (incluidas en la entrega)

* Wireframe dibujado en papel.
* Árbol de contenedores.
* Vista general de la aplicación.
* Vista redimensionada (para comprobar el crecimiento del CENTER y Notas).
* Pestañas del JTabbedPane.
* JDialog modal abierto.

---

## 📂 Estructura del proyecto

```
TareaModulo2/
 ├─ src/main/java/org/example/TareaModulo2.java   # Código principal
 ├─ src/main/java/org/example/TareaModulo2.form   # Formulario GUI Designer
 ├─ src/main/resources/icon.jpg                   # Recurso gráfico
 ├─ src/test/java/org/example/AppTest.java        # Pruebas
 ├─ pom.xml                                       # Proyecto Maven
 └─ Tarea Módulo 2.pdf                            # Planificación inicial
```

---

## ✅ Criterios de evaluación alcanzados

* **Estructura y layouts (3 pts):** Border + Flow + Grid + GridBag correctamente aplicados.
* **Propiedades de distribución (3 pts):** uso de insets, gaps, anchor, fill, weightx/weighty.
* **Comportamiento al redimensionar (2 pts):** correcto.
* **Presentación (2 pts):** wireframe, árbol de paneles, capturas y README.

---

## 🚀 Retos opcionales

* Añadido `JMenuBar` con opciones Archivo/Editar/Ayuda.
* Comparación entre FlowLayout(RIGHT) y GridLayout(1x3) en la botonera.
* Variación con `gridwidth=2` en Notas para practicar spans.

---

👤 Autor: *[Adrián Bautista Ramos]*
📅 Curso: *Interfaces – Tema 2: Paneles y Layouts como profesionales*
