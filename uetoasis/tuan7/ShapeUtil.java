import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    private List<GeometricObject> shapes;

    /**
     * This is constructor.
     */
    public ShapeUtil() {
        this.shapes = new ArrayList<>();
    }

    /**
     * This is to print info.
     */
    public String printInf() {
        StringBuilder info = new StringBuilder();

        // Append info for circles first
        info.append("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                info.append(shape.getInfo()).append("\n");
            }
        }

        // Append info for triangles next
        info.append("Triangle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                info.append(shape.getInfo()).append("\n");
            }
        }

        return info.toString().trim(); // Remove trailing newline
    }
}
