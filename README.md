# Glosario de Términos de Mockito
### Mock
Objeto simulado que reemplaza una dependencia real en una prueba.

### Mockito
Biblioteca de código abierto para la creación de mocks en Java. Facilita la simulación de objetos y la verificación de interacciones en pruebas unitarias.

### Stub
Un tipo de mock que simula el comportamiento de un método devolviendo valores predefinidos.

### Spy
Objeto que permite interactuar con objetos reales y espiar ciertas llamadas.

### @Mock
Anotación que se utiliza para crear mocks automáticamente en una clase de prueba.

### @Spy
Anotación que permite crear un spy, es decir, un objeto real que puede ser espiado.

### @InjectMocks
Anotación utilizada para inyectar los mocks en el objeto bajo prueba.

### verify()
Método utilizado para verificar que un mock o spy haya interactuado de la manera esperada.

### when()
Método utilizado para definir el comportamiento esperado de un mock cuando se invoca un método específico.

### thenReturn()
Método que define el valor que un mock debe devolver cuando se le invoca.

### doReturn()
Variante de thenReturn() utilizada para stubs en objetos espías (spy).

### mockito-inline
Versión de la biblioteca que permite la simulación de métodos final, static y private.

### ArgumentCaptor
Permite capturar los argumentos pasados a un mock para su posterior análisis.

### @Before / @After
Anotaciones de JUnit (o TestNG) que se usan para ejecutar métodos antes o después de cada prueba.

### @BeforeEach / @AfterEach
Anotaciones de JUnit 5 equivalentes a @Before y @After.

### MockitoAnnotations.initMocks()
Método utilizado para inicializar los mocks creados con la anotación @Mock.

### Mocking de excepciones
Funcionalidad que permite simular que un método lanza una excepción utilizando when().thenThrow().

### Matchers
Herramientas que permiten hacer comparaciones más flexibles en las verificaciones, como any(), eq(), isNull(), entre otras.

### verifyNoMoreInteractions()
Método que verifica que no haya más interacciones con un mock después de las verificadas.

### @RunWith(MockitoJUnitRunner.class)
Anotación utilizada para inicializar los mocks automáticamente sin necesidad de invocar MockitoAnnotations.initMocks().

### @Captor
Anotación usada para capturar los valores de los argumentos pasados a los mocks.
