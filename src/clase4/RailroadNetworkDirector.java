package clase4;

import clase2_AbstractFactory_FactoryMethod.Station;
import clase3.Conection;
import clase3.RailroadNetwork;
import clase5.IEstacion;

/**
 *
 * @author Waldo
 */
public class RailroadNetworkDirector {
   
    public static RailroadNetwork buildRailRoadNetworkFromGraph(Builder builder, String[] stationsNames, String[] connections){
        int cStations = stationsNames.length;
        int cConnections = connections.length;
        
        IEstacion[] stations = new Station[cStations];
        IEstacion s1, s2;
        
        
        Conection track;
        
        builder.buildRailroadNetwork();
        
        for(int i = 0; i < cStations; i++){
            stations[i] = builder.buildStation(stationsNames[i]);
        }
        for(int i = 0; i < cConnections; i++){
            
        	String[] connection = connections[i].split(",");
            s1 = stations[Integer.parseInt(connection[0])];
        	s2 = stations[Integer.parseInt(connection[1])];
            
            track = builder.buildRailroadTrack(Double.parseDouble(connection[2]), s2);
            s1.agregarConexion(track);
            
        }

		return builder.getRailroadNetwork();
    }
}
