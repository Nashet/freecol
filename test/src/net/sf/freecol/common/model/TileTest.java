package net.sf.freecol.common.model;

import net.sf.freecol.util.test.FreeColTestCase;

public class TileTest extends FreeColTestCase {
    
    public static final String COPYRIGHT = "Copyright (C) 2003-2007 The FreeCol Team";

    public static final String LICENSE = "http://www.gnu.org/licenses/gpl.html";

    public static final String REVISION = "$Revision$";
    
    public void testGetWorkAmount(){
        
        Game game = getStandardGame();
        
        int[][] cost = new int[10][];
        
        cost[Tile.PLAINS] = new int[]{6,4,5,3};
        cost[Tile.DESERT] = new int[]{6,4,5,3};
        cost[Tile.GRASSLANDS] = new int[]{6,4,5,3};
        cost[Tile.PRAIRIE] = new int[]{6,4,5,3};
        cost[Tile.TUNDRA] = new int[]{6,4,6,4};
        cost[Tile.SAVANNAH] = new int[]{8,6,5,3};
        cost[Tile.MARSH] = new int[]{8,6,7,5};
        cost[Tile.SWAMP] = new int[]{9,7,9,7};
        cost[Tile.ARCTIC] = new int[]{6,4,6,4}; // Arctic cannot have forrests, but this keeps the test simpler
        
        for (int i = 1; i <= 9; i++){
            Tile tile = new Tile(game, i, 0, 0);
            tile.setForested(true);
            assertEquals(cost[i][0], tile.getWorkAmount(Unit.PLOW));
            assertEquals(cost[i][1], tile.getWorkAmount(Unit.BUILD_ROAD));
            
            tile = new Tile(game, i, 0, 0);
            assertEquals(cost[i][2], tile.getWorkAmount(Unit.PLOW));
            assertEquals(cost[i][3], tile.getWorkAmount(Unit.BUILD_ROAD));
        }
    }        
}
