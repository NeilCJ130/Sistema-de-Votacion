package clases;

import TDAA.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sistema {
    private Lista<Usuario> usuarios;
    private Cola<Voto> votoPendientes;
    private Pila<Voto> votosFinalizados;
    private Lista<Voto> todosvotos; 
    private int nextVotoId;
    private Set<Integer> idsUtilizados;
    private Random random;
    private final static int MAX = 100;  
    private Candidato[] array;  
    private int num;  
    private MiembroDeMesa[] array1;  
    private Lista<Candidato> listaCandidatos;
    private Lista<MesaElectoral> mesas;
    private Lista<MiembroDeMesa> listaMiembros;
    private Lista<Eleccion> listaEleccion;
      private MesaElectoral[] array2;
      private Eleccion[] array4;
 

    public Sistema() {
    this.usuarios = new Lista<>();
    this.votoPendientes = new Cola<>();
    this.votosFinalizados = new Pila<>();
    this.todosvotos = new Lista<>();
    this.nextVotoId = 1;
    this.idsUtilizados = new HashSet<>();
    this.random = new Random();
    crearAdministradorPorDefecto();  
    this.array = new Candidato[MAX];
    this.num = 0;
    this.array1 = new MiembroDeMesa[MAX];
    this.num = 0;
    this.listaCandidatos = new Lista<>();
    this.mesas = new Lista<>();
    this.listaMiembros = new Lista<>();
    this.listaEleccion=new Lista<>();
    this.array2 = new MesaElectoral[MAX];
     this.array4 = new Eleccion[MAX];
        
    }
    
    
    private int generarIdUnico() {
        int id;
        do {
            id = 1000 + random.nextInt(9000);
        } while (!idsUtilizados.add(id)); 
        return id;
    }

    public boolean login(String username, String password) {
        for (int i = 1; i <= usuarios.longitud(); i++) {
            Usuario usuario = usuarios.iesimo(i);
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
                System.out.println("Login exitoso para " + usuario.getNombre());
                return true;
            }
        }
        System.out.println("Login fallido");
        return false;
    }
 
  
        

   

    public void registrarUsuario(Usuario usuario) {
        usuarios.agregar(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    public Voto crearVoto(Candidato candidato, MesaElectoral mesaElectoral,  TIPOVOTO estado,Participante votante) {
    int id = generarIdUnico(); // Genera un identificador único para el voto

    // Crear el voto con los datos proporcionados
    Voto voto = new Voto(id, candidato, mesaElectoral,estado, votante);

    // Configurar el estado del voto según el tipo
    if (estado != null) {
        voto.setEstado(estado);
    }

    // Registrar el voto en las estructuras correspondientes
    if (voto.getEstado() == TIPOVOTO.VALIDO) {
        votoPendientes.encolar(voto); // Agregar a votos pendientes solo si es válido
    }
    todosvotos.agregar(voto); // Agregar a la lista de todos los votos

    return voto; // Retornar el voto creado
}
public boolean haVotado(Participante participante) {
    Lista<Voto> votosEmitidos = obtenerVotos();
    Nodo<Voto> nodoActual = votosEmitidos.getCabeza();
    while (nodoActual != null) {
        if (nodoActual.getElemento().getVotante().equals(participante)) {
            return true;
        }
        nodoActual = nodoActual.getSgteNodo();
    }
    return false;
}
 public void agregarVoto(Voto nuevoVoto) {
        if (todosvotos == null) {
            this.todosvotos = new Lista<>();
        }
        this.todosvotos.agregar(nuevoVoto); // Agrega el voto a la lista principal
        
        if (nuevoVoto.getEstado() == TIPOVOTO.VALIDO) {
            votoPendientes.encolar(nuevoVoto); // Solo agregar a pendientes si el voto es válido
        }
        
        System.out.println("Voto registrado exitosamente: " + nuevoVoto);
    }
    
    public Lista<Voto> obtenerVotos() {
        if (this.todosvotos == null) {
            return new Lista<>(); // Retorna una lista vacía si no hay votos
        }
        return this.todosvotos;
    }
    
public Voto registrarVoto(Participante participante, Candidato candidato, MesaElectoral mesa, TIPOVOTO tipoVoto) {
    int idVoto = generarIdUnico();
    Voto nuevoVoto = new Voto(idVoto, candidato,mesa, tipoVoto, participante);
    agregarVoto(nuevoVoto); // Método para agregar el voto a la lista del sistema
    return nuevoVoto;
}

  
    public Usuario getUsuarioPorUsername(String username) {
        for (int i = 1; i <= usuarios.longitud(); i++) {
            Usuario usuario = usuarios.iesimo(i);
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null;
    }
    
    public Lista<MiembroDeMesa> buscarVotosPorInteresado(MiembroDeMesa miembro) {
    Lista<MiembroDeMesa> expedientesInteresado = new Lista<>();
    for (int i = 1; i <= listaMiembros.longitud(); i++) {
        MiembroDeMesa exp = listaMiembros.iesimo(i);
        if (exp.getNombre().equals(miembro)) {
            expedientesInteresado.agregar(exp);
        }
    }
    return expedientesInteresado;
}

    public Lista<Usuario> getUsuarios() {
        return usuarios;
    }
   
       

    public void mostrarEstadisticas() {
        System.out.println("Total de usuarios: " + usuarios.longitud());
        System.out.println("Expedientes pendientes: " + votoPendientes.longitud());
        System.out.println("Expedientes finalizados: " + votosFinalizados.longitud());
    }

    private void crearAdministradorPorDefecto() {
        Operador admin = new Operador("Admin", "admin", "admin123","","","");
        registrarUsuario(admin);
    }
    
    
    public Voto buscarVotoPorId(int id) {
    for (int i = 1; i <= todosvotos.longitud(); i++) {
        Voto exp = todosvotos.iesimo(i);
        if (exp.getId() == id) {
            return exp;
        }
    }
    return null;
}

      public boolean agregar(Candidato candidato) {
    if (num < MAX) {
        array[num] = candidato;  
        num++;  
        return true;
    } else {
        return false;  
    }
}

    
   public int ubicacion(String dni) {
    for (int i = 0; i < num; i++) {
        if (array[i].getDni().equals(dni)) {  
            return i;
        }
    }
    return -1;
}

public void eliminar(String dni) {
    int pos = ubicacion(dni);
    if (pos >= 0) {  
        for (int i = pos; i < num - 1; i++) {
            array[i] = array[i + 1];
        }
        array[num - 1] = null;
        num--;
    }
}

   
    public int longitud() {
        return num;
    }


    public Candidato iesimo(int pos) {
        if (pos >= 0 && pos < num) {
            return array[pos];
        }
        return null; 
    }    
    

    public Candidato[] getListaCandidato() {
    int numCandidatos = 0;
    

    for (int i = 0; i < num; i++) {
        if (array[i] instanceof Candidato) {
            numCandidatos++;
        }
    }
    
    Candidato[] listaCandidatos = new Candidato[numCandidatos];
    int j = 0;

    for (int i = 0; i < num; i++) {
        if (array[i] instanceof Candidato) {
            listaCandidatos[j] = (Candidato) array[i];
            j++;
        }
    }

    return listaCandidatos;
}
    public Lista<Candidato> obtenerCandidato() {
    Lista<Candidato> listaCandidatos = new Lista<>();
    for (int i = 0; i < num; i++) {
        if (array[i] instanceof Candidato) {
            listaCandidatos.agregar((Candidato) array[i]);
        }
    }
    return listaCandidatos;
}
    
       public Candidato obtenerCandidatoporNombre(String nombre) {

    for (int i = 1; i <= listaCandidatos.longitud(); i++) {
        Candidato candidato = listaCandidatos.iesimo(i);
       
        if (candidato.getNombre().equals(nombre)) {
            return candidato; 
        }
    }
    return null; 
}
   
    
 // Para los miembros de mesa
 public boolean agregar(MiembroDeMesa miembrodemesa) {
    if (num < MAX) {
        array1[num] = miembrodemesa;  
        num++;  
        return true;
    } else {
        return false;  
    }
}
    
    public int ubicacion1(String dni) {
    for (int i = 0; i < num; i++) {
        if (array1[i].getDni().equals(dni)) {  
            return i;
        }
    }
    return -1;
}

   
   public void eliminar1(String dni) {
    int pos = ubicacion(dni);
    if (pos >= 0) {  
        for (int i = pos; i < num - 1; i++) {
            array1[i] = array1[i + 1];
        }
        array1[num - 1] = null;
        num--;
    }
}

   
   //Mesa electoral


    public MiembroDeMesa iesimo1(int pos) {
        if (pos >= 0 && pos < num) {
            return array1[pos];
        }
        return null; 
    }    
    

    public MiembroDeMesa[] getListaMiembrodeMesa() {
    int numMiembros = 0;
    

    for (int i = 0; i < num; i++) {
        if (array1[i] instanceof MiembroDeMesa) {
            numMiembros++;
        }
    }
    
    MiembroDeMesa[] listaMiembroDeMesa = new MiembroDeMesa[numMiembros];
    int j = 0;

    for (int i = 0; i < num; i++) {
        if (array1[i] instanceof MiembroDeMesa) {
            listaMiembroDeMesa[j] = ( MiembroDeMesa) array1[i];
            j++;
        }
    }

    return  listaMiembroDeMesa;
}
       public Lista<MiembroDeMesa> obtenerMiembrosDeMesa() {
    Lista<MiembroDeMesa> miembros = new Lista<>();
    for (int i = 0; i < num; i++) {
        if (array1[i] instanceof MiembroDeMesa) {
            miembros.agregar((MiembroDeMesa) array1[i]);
        }
    }
    return miembros;
}
    
   
 public boolean agregar(MesaElectoral mesa) {
        for (int i = 1; i <= mesas.longitud(); i++) {
            if (mesas.iesimo(i).getNumeroMesa().equals(mesa.getNumeroMesa())) {
                return false; // La mesa ya existe
            }
        }
        mesas.agregar(mesa);
        return true;
    }
    
    public int ubicacion2(String dni) {
    for (int i = 0; i < num; i++) {
        if (array2[i].getDni().equals(dni)) {  
            return i;
        }
    }
    return -1;
}

    public MesaElectoral iesimo2(int pos) {
        if (pos >= 0 && pos < num) {
            return array2[pos];
        }
        return null; 
    }    
    

    public MesaElectoral[] getListaMesaElectoral() {
    int numMiembros = 0;
    

    for (int i = 0; i < num; i++) {
        if (array2[i] instanceof MesaElectoral) {
            numMiembros++;
        }
    }
    
    MesaElectoral[] listaMesaElectoral = new MesaElectoral[numMiembros];
    int j = 0;

    for (int i = 0; i < num; i++) {
        if (array2[i] instanceof MesaElectoral) {
            listaMesaElectoral[j] = ( MesaElectoral) array2[i];
            j++;
        }
    }

    return  listaMesaElectoral;
    }
    
    
    
    
     

     
    public Lista<MesaElectoral> getListaMesas() {
        return mesas;
    }

    
    public boolean eliminarMesa(String numero) {
        for (int i = 1; i <= mesas.longitud(); i++) {
            MesaElectoral mesa = mesas.iesimo(i);
            if (mesa.getNumeroMesa().equals(numero)) {
                mesas.eliminar(mesa);
                return true;
            }
        }
        return false; 
    }
 public MesaElectoral obtenerMesaPorNumeroOUbicacion(String numeroMesa, String ubicacion) {
   
    for (int i = 1; i <= mesas.longitud(); i++) {
        MesaElectoral mesa = mesas.iesimo(i);
        
        
        if (mesa.getNumeroMesa().equals(numeroMesa) || mesa.getUbicacion().equals(ubicacion)) {
            return mesa; 
        }
    }
    return null;
}
    //Eleccion
    
      public boolean agregarEleccion(Eleccion eleccion) {
    if (num < MAX) {
        array4[num] = eleccion;  
        num++;  
        return true;
    } else {
        return false;  
    }
}
       public Lista<Eleccion> obtenerEleccion() {
        return listaEleccion;
    }
       
  public Lista<Eleccion> obtenereleccion() {
    Lista<Eleccion> listaEleccion= new Lista<>();
    for (int i = 0; i < num; i++) {
        if (array4[i] instanceof Eleccion) {
            listaEleccion.agregar((Eleccion) array4[i]);
        }
    }
    return listaEleccion;
}
       
     public boolean eliminarEleccionPorNombre(String nombre) {
    for (int i = 1; i <= listaEleccion.longitud(); i++) {
        Eleccion eleccion = listaEleccion.iesimo(i);
        if (eleccion.getNombre().equals(nombre)) {
            listaEleccion.eliminar(eleccion);
            return true; 
        }
    }
    return false; 
}
    
      public Lista<MesaElectoral> obtenerMesasElectorales() {
        return mesas;
    }
      
      
}

   
    
   


    
   

