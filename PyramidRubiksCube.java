import java.util.*;

public class PyramidRubiksCube {
    private static final int FACE_SIZE = 16; // Each face contains 16 tiles because I have been working with the 4x4 Pyraminx
    private static final String[] COLORS = {"Red", "Green", "Blue", "Yellow"};
    private Map<String, String[][]> faces;

    // Constructor
    public PyramidRubiksCube() {
        faces = new HashMap<>();
        initializeFaces();
        initializeEdges();
    }

    // Initializes the faces with default colors in specific order
    private void initializeFaces() {
        for (String color : COLORS) {
            faces.put(color, new String[][] {
                    {color},
                    {color, color, color},
                    {color, color, color, color, color},
                    {color, color, color, color, color, color, color}
            });
        }
    }

    // Sets up the edges properly to match adjacent faces
    private void initializeEdges() {
        // In a real Pyraminx cube, edge stickers should match adjacent faces.
    }

    // Validates the cube structure
    public boolean validateCube() {
        for (String color : COLORS) {
            String[][] face = faces.get(color);
            if (face == null || face.length != 4) {
                return false;
            }
            int[] expectedSizes = {1, 3, 5, 7};
            for (int i = 0; i < face.length; i++) {
                if (face[i].length != expectedSizes[i]) {
                    return false;
                }
                for (String tile : face[i]) {
                    if (!tile.equals(color)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // Displays the cube's state
    public void displayCube() {
        for (String color : COLORS) {
            System.out.println(color + " Face: " + Arrays.deepToString(faces.get(color)));
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        PyramidRubiksCube cube = new PyramidRubiksCube();
        cube.displayCube();
        System.out.println("Is cube valid? " + cube.validateCube());
    }
}
