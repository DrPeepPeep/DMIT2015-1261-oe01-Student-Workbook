package dmit2015.view;

import dmit2015.model.MapLocation;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;

import java.util.List;

@Named
@RequestScoped
public class MapLocationView {

    @Getter
    private List<MapLocation> locations = List.of(
            new MapLocation("NAIT", 53.5422477, -113.5783983),
            new MapLocation("University of Alberta", 53.5231733,-113.5275611),
            new MapLocation("MacEwan University", 53.5470753,-113.5099403)
    );
}
