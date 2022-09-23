package magiworldtravel;

import java.sql.SQLException;
import magiDAO.MaGiDAO;
import magiworldtravelpassageiro.MaGi;

public class MaGiWorldTravel {
    public static void main(String[] args){
        MaGiDAO magi = new MaGiDAO();
        //magi.create("Lucas A.", 111, 111, "RJ", "SP", "RJ");
        //magi.create("Flávia", 222, 222, "RJ", "SP", "RJ");
        //magi.create("Rafaela", 333, 333, "RJ", "SP", "RJ");
        //magi.create("Lucas U.", 444, 444, "RJ", "SP", "RJ");
        
        //magi.update("Airton", 555, 555, "SP", "RJ", "SP", 1);
        
        magi.delete(2);
    }
    
}
