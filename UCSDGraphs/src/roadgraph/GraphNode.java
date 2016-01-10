package roadgraph;

import java.util.HashSet;
import java.util.Set;

import geography.GeographicPoint;

/**
 * Class represents single graph node which consists of GeographicPoint location property and
 * list of edges which start at this node.
 * 
 * @author Roman
 *
 */
public class GraphNode {
	
	private GeographicPoint location;
	private Set<GraphEdge> edges;

	public GraphNode(GeographicPoint location) {
		super();
		this.location = location;
		this.edges = new HashSet<>();
	}

	public GeographicPoint getLocation() {
		return location;
	}
	
	public Set<GraphEdge> getEdges() {
		return edges;
	}
	
	public void addEdge(GraphEdge edge) {
		this.edges.add(edge);
	}
}
