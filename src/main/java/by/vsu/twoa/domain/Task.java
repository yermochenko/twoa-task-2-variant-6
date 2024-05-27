package by.vsu.twoa.domain;

import by.vsu.twoa.geometry.Point;
import by.vsu.twoa.geometry.Triangle;

import java.util.Date;

public class Task extends Entity {
	private User owner;
	private String name;
	private Date created;
	private Triangle triangle;
	private Point altitudeIntersectionPoint;

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	public Point getAltitudeIntersectionPoint() {
		return altitudeIntersectionPoint;
	}

	public void setAltitudeIntersectionPoint(Point altitudeIntersectionPoint) {
		this.altitudeIntersectionPoint = altitudeIntersectionPoint;
	}
}
