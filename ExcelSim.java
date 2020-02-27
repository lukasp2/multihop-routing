import java.util.Random;

public class ExcelSim {
    private static final int NUM_NODES = 10;
    
    private static float[][] latencySheet;
    private static float[][] bandwidthSheet;
    private static float[][] packetlossSheet;

    ExcelSim() {
	latencySheet = new float[NUM_NODES][NUM_NODES];
	bandwidthSheet = new float[NUM_NODES][NUM_NODES];
	packetlossSheet = new float[NUM_NODES][NUM_NODES];
    }

    public static void generateSheets() {
	for (int y = 0; y < NUM_NODES; ++y) {
	    for (int x = 0; x < NUM_NODES; ++x)	{
		if (x != y)
		    latencySheet[y][x] = randomFill(100);
	    }
	}

	for (int y = 0; y < NUM_NODES; ++y) {
	    for (int x = 0; x < NUM_NODES; ++x)	{
		if (x != y)
		    bandwidthSheet[y][x] = randomFill(1000);
	    }
	}

	for (int y = 0; y < NUM_NODES; ++y) {
	    for (int x = 0; x < NUM_NODES; ++x) {
		if (x != y)
		    packetlossSheet[y][x] = randomFill(1);
	    }
	}
    }
   
    public static float randomFill(int k) {
	Random random = new Random();
	float f = k * random.nextFloat(); 
	return f;
    }

    public static int getCom() {
	Random random = new Random();
	int i = random.nextInt(2);
	return i;
    }
    
    public static int[] getNodes() {
	Random random = new Random();
	int[] nodes = new int[2];
	nodes[0] = random.nextInt(NUM_NODES);
	nodes[1] = random.nextInt(NUM_NODES);
	
	if (nodes[0] == nodes[1])
	    nodes[1] = (nodes[1] + 1) % NUM_NODES;
	
	return nodes;
    }

    public static float readCell(int x, int y, int s) {
	if (s == 0) 
	    return latencySheet[y][x];
	if (s == 1)
	    return bandwidthSheet[y][x];
	if (s == 2)
	    return packetlossSheet[y][x];
	return -1;
    }

    public static int getNumNodes() {
	return NUM_NODES;
    }

    public static void printSheets() {
	System.out.format("%20s\n", "LATENCY SHEET");
	System.out.format("%5s", "Node");
	for (int i = 0; i < NUM_NODES; ++i) { System.out.format("%5d", i); }
	System.out.println();
	
	for (int y = 0; y < NUM_NODES; ++y) {
	    System.out.format("%5d", y);
	    for (int x = 0; x < NUM_NODES; ++x)
		System.out.format("%5.0f", latencySheet[y][x]);
	    System.out.println();
	}
	
	System.out.format("\n%20s\n", "BANDWIDTH SHEET");
	System.out.format("%5s", "Node");
	for (int i = 0; i < NUM_NODES; ++i) { System.out.format("%5d", i); }
	System.out.println();

	for (int y = 0; y < NUM_NODES; ++y) {
	    System.out.format("%5d", y);
	    for (int x = 0; x < NUM_NODES; ++x)
		System.out.format("%5.0f", bandwidthSheet[y][x]);
	    System.out.println();
	}

	System.out.format("\n%20s\n", "PACKET LOSS SHEET");
	System.out.format("%5s", "Node");
	for (int i = 0; i < NUM_NODES; ++i) { System.out.format("%5d", i); }
	System.out.println();

	for (int y = 0; y < NUM_NODES; ++y) {
	    System.out.format("%5d", y);
	    for (int x = 0; x < NUM_NODES; ++x)
		System.out.format("%5.02f", packetlossSheet[y][x]);
	   System.out.println();
	}
	System.out.println();	
    }
    
}
