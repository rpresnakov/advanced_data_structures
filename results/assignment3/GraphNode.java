package roadgraph;

import java.util.Comparator;
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
public class GraphNode implements Comparable<GraphNode> {
	
	private GeographicPoint location;
	private Set<GraphEdge> edges;
	
	private Double distanceFromStart = Double.POSITIVE_INFINITY;
	private Double distanceToGoal;

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

	public Double getDistanceFromStart() {
		return distanceFromStart;
	}

	public void setDistanceFromStart(Double distanceFromStart) {
		this.distanceFromStart = distanceFromStart;
	}

	@Override
	public int compareTo(GraphNode o) {
		// TODO Auto-generated method stub
		return this.distanceFromStart.compareTo(o.getDistanceFromStart());
	}
	
	public void setDistanceToGoal(GeographicPoint goal) {
		this.distanceToGoal = goal.distance(this.location);
	}
	
	public Double getWholeDistance() {
		return this.distanceFromStart + this.distanceToGoal;
	}
	
}
