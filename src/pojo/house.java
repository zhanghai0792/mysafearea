package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

public class house implements pojoModel{

	private Integer id;//主键
	private Integer areaID;//小区ID
	private String address;//地址
	private Integer type;//用途（自住、出租、闲置）
	private String owner;//房主姓名
	private String pinYin;//姓名拼音
	private String ownerCardID;//房主身份证号码
	private String phone;//联系电话
	private Integer adderID;//采集人ID
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date createDate;//采集时间
	private Boolean isDelete;//是否已经删除
	
	public String areaName;//小区名
	public String adderName;//采集人姓名
	public Set<resident> residents=new HashSet<resident>(0);
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getAdderName() {
		return adderName;
	}
	public void setAdderName(String adderName) {
		this.adderName = adderName;
	}
	public Integer getAreaID() {
		return areaID;
	}
	public void setAreaID(Integer areaID) {
		this.areaID = areaID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPinYin() {
		return pinYin;
	}
	public void setPinYin(String pinYin) {
		this.pinYin = pinYin;
	}
	public String getOwnerCardID() {
		return ownerCardID;
	}
	public void setOwnerCardID(String ownerCardID) {
		this.ownerCardID = ownerCardID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAdderID() {
		return adderID;
	}
	public void setAdderID(Integer adderID) {
		this.adderID = adderID;
	}

	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	public Set<resident> getResidents() {
		return residents;
	}
	public void setResidents(Set<resident> residents) {
		this.residents = residents;
	}
	
	public house() {
		super();
		// TODO Auto-generated constructor stub
	}

}
