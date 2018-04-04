package operation;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileControl {
    // Atrbutos
    private String pathFile;
    private String information;
    
    // Método de lectura
    public void readContent() {
        // Creo la instancia del objeto
        File fileObject = new File(this.getPathFile());
        try {
            // Leyendo el archivo
            BufferedReader _entry = new BufferedReader(new FileReader(fileObject));
            this.information = _entry.readLine();
            
            // Recorro la información del archivo
            while (this.information != null) {
                System.out.println(this.information);
                this.information = _entry.readLine();
            }
            
            // Cierro la conexión al archivo
            _entry.close();
        } catch (IOException ex) {
            // Muestro el mensaje de la excepción en caso de producirse
            System.out.println(ex.getMessage());
        }
    }

    // Métodos get y set
    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }
}
