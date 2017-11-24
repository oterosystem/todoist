import java.util.ArrayList;

/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer.
 */
public class Todoist 
{

    // Almacena nuestras tareas
    private ArrayList<String> tareas; 

    /**
     * Constructor de la clase Todoist. Crea un gestor con las 3 tareas vacías.
     */
    public Todoist()
    {
        tareas = new ArrayList<String>();
    }

    /**
     * Inserta una nueva tarea
     */
    public void addTarea(String nombreTarea)
    {
        tareas.add(nombreTarea);
    }

    /**
     * Muestra por pantalla todas las tareas existentes
     */

    public void mostrarTareas()
    {
        System.out.println("Tareas existentes:");
        System.out.println(tareas);

    }

    /**
     * devuelve numero tareas existentes.
     */
    public int getNumeroDeTareas()
    {
        return tareas.size() ;
    }

    /**
     * imprime por pantalla el numero de tarea pendientes.
     */
    public void mostrarNumeroDeTareasPendientes()
    {
        System.out.println(tareas.size());
    }

    /**
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro empezando en 0, devuelve verdadero si elimina una
     * tarea, falso en caso contrario.
     */
    public boolean eliminarTarea(int posicionTarea)
    {
        boolean valorADevolver =true;
        if(posicionTarea >= 0 && posicionTarea <tareas.size()){
        tareas.remove(posicionTarea);
        valorADevolver = true;
    }
        return valorADevolver;
    }
    
   
}

