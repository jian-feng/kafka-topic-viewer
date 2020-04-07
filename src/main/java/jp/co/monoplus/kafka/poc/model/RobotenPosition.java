package jp.co.monoplus.kafka.poc.model;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class RobotenPosition {

	@ApiModelProperty(required = true, example = "8d1471c9-c5ab-443d-9f8e-c2a8d773e827")
	private String areaId;
	
	@ApiModelProperty(required = true, example = "MeetingRoom")
	private String areaName;

	@ApiModelProperty(required = true, example = "#FF0000")
	private String color;
	
	@ApiModelProperty(required = true, example = "db132a55-0f33-4711-9172-96420c1861fd")
	private String coordinateSystemId;
	
	@ApiModelProperty(required = true, example = "MonoplusRoom")
	private String coordinateSystemName;
	
	@ApiModelProperty(required = true, example = "[\n" + 
			"    0.11,\n" + 
			"    -0.02,\n" + 
			"    -0.03,\n" + 
			"    -0.02,\n" + 
			"    0.09,\n" + 
			"    -0.03,\n" + 
			"    -0.03,\n" + 
			"    -0.03,\n" + 
			"    0.32\n" + 
			"  ]")
	private List<Number> covarianceMatrix;

	@ApiModelProperty(required = true, example = "c8df8423688f")
	private String id;

	@ApiModelProperty(required = false, example = "null")
	private String name;
	
	@ApiModelProperty(required = true, example = "[\n" + 
			"    2.48,\n" + 
			"    3.56,\n" + 
			"    0.67\n" + 
			"  ]")
	private List<Number> position;
	
	@ApiModelProperty(required = true, example = "0.17")
	private Number positionAccuracy;
	
	@ApiModelProperty(required = true, example = "1540366500851")
	private Integer positionTS;
	
	@ApiModelProperty(required = true, example = "[\n" + 
			"    2.48,\n" + 
			"    3.56,\n" + 
			"    0.67\n" + 
			"  ]")
	private List<Number> smoothedPosition;
	
	@ApiModelProperty(required = true, example = "0.17")
	private Number smoothedPositionAccuracy;
	
	@ApiModelProperty(required = false, example = "[]")
	private List<String> zones;

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCoordinateSystemId() {
		return coordinateSystemId;
	}

	public void setCoordinateSystemId(String coordinateSystemId) {
		this.coordinateSystemId = coordinateSystemId;
	}

	public String getCoordinateSystemName() {
		return coordinateSystemName;
	}

	public void setCoordinateSystemName(String coordinateSystemName) {
		this.coordinateSystemName = coordinateSystemName;
	}

	public List<Number> getCovarianceMatrix() {
		return covarianceMatrix;
	}

	public void setCovarianceMatrix(List<Number> covarianceMatrix) {
		this.covarianceMatrix = covarianceMatrix;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Number> getPosition() {
		return position;
	}

	public void setPosition(List<Number> position) {
		this.position = position;
	}

	public Number getPositionAccuracy() {
		return positionAccuracy;
	}

	public void setPositionAccuracy(Number positionAccuracy) {
		this.positionAccuracy = positionAccuracy;
	}

	public Integer getPositionTS() {
		return positionTS;
	}

	public void setPositionTS(Integer positionTS) {
		this.positionTS = positionTS;
	}

	public List<Number> getSmoothedPosition() {
		return smoothedPosition;
	}

	public void setSmoothedPosition(List<Number> smoothedPosition) {
		this.smoothedPosition = smoothedPosition;
	}

	public Number getSmoothedPositionAccuracy() {
		return smoothedPositionAccuracy;
	}

	public void setSmoothedPositionAccuracy(Number smoothedPositionAccuracy) {
		this.smoothedPositionAccuracy = smoothedPositionAccuracy;
	}

	public List<String> getZones() {
		return zones;
	}

	public void setZones(List<String> zones) {
		this.zones = zones;
	}

}
