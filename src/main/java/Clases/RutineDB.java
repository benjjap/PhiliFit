
package Clases;

import java.sql.Connection;

public interface RutineDB {
    public void set_rutine(Connection connection, Rutine rutine , Patient patient);
    
}
