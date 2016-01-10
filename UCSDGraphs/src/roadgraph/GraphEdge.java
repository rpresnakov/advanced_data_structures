package roadgraph;

/**
 * Class which represents a graph edge and contains information about start and end points,
 * road name and type, length of edge. 
 * 
 * @author Roman P
 *
 */
public class GraphEdge {

	private GraphNode startPoint;
	private GraphNode endPoint;
	private String roadName;
	private String roadType;
	private double length;

	public GraphEdge(GraphNode startPoint, GraphNode endPoint, String roadName, String roadType,
			double length) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.roadName = roadName;
		this.roadType = roadType;
		this.length = length;
	}

	public GraphNode getStartPoint() {
		return startPoint;
	}

	public GraphNode getEndPoint() {
		return endPoint;
	}

	public String getRoadName() {
		return roadName;
	}

	public String getRoadType() {
		return roadType;
	}

	public double getLength() {
		return length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endPoint == null) ? 0 : endPoint.hashCode());
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((roadName == null) ? 0 : roadName.hashCode());
		result = prime * result + ((roadType == null) ? 0 : roadType.hashCode());
		result = prime * result + ((startPoint == null) ? 0 : startPoint.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GraphEdge other = (GraphEdge) obj;
		if (endPoint == null) {
			if (other.endPoint != null)
				return false;
		} else if (!endPoint.equals(other.endPoint))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (roadName == null) {
			if (other.roadName != null)
				return false;
		} else if (!roadName.equals(other.roadName))
			return false;
		if (roadType == null) {
			if (other.roadType != null)
				return false;
		} else if (!roadType.equals(other.roadType))
			return false;
		if (startPoint == null) {
			if (other.startPoint != null)
				return false;
		} else if (!startPoint.equals(other.startPoint))
			return false;
		return true;
	}
}
