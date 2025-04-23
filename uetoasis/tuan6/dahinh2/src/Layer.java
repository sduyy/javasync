import java.awt.*;
import java.util.*;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<>();
    }

    /**
     * Add Shape.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * get.
     */
    public List<Shape> getShapes() {
        return shapes;
    }

    /**
     * GetInfo.
     */
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            sb.append(shape.toString()).append("\n");
        }
        return sb.toString().trim();
    }

    /**
     * remove Circles.
     */
    public void removeCircles() {
        shapes.removeIf(s -> s instanceof Circle);
    }

    /**
     * remove Duplicate.
     */
    public void removeDuplicates() {
        Set<Shape> uniqueShapes = new LinkedHashSet<>(shapes);
        shapes.clear();
        shapes.addAll(uniqueShapes);
    }
}
