package clase4;


//import clase2_AbstractFactory_FactoryMethod.Station;
import clase3.Conection;
import clase3.RailroadNetwork;
import clase5.IEstacion;


public interface Builder {
    
    void buildRailroadNetwork();
    IEstacion buildStation(String name);
    Conection buildRailroadTrack(double distance, IEstacion s);
    RailroadNetwork getRailroadNetwork();
}
