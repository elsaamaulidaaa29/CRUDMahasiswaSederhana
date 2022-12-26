/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package praktikum1.crudmahasiswasederhana.interfc;

import java.sql.SQLException;
import java.util.List;
import praktikum1.crudmahasiswasederhana.models.Mahasiswa;


/**
 *
 * @author ASUS
 */
public interface MahasiswaInterface {
    Mahasiswa insert (Mahasiswa o) throws SQLException;
    
    void update (Mahasiswa o) throws SQLException;
    
    void delete (String nim) throws SQLException;
    
    List<Mahasiswa> getAll() throws SQLException;
    
}
