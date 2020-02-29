package houserental.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false)
	private String fullname;
	@Column(unique=true, nullable=false )
	private String email;
	@Column(unique=true, nullable=false )
	private String mobile;
	@Column(nullable=false)
	private String owner;
	@Column(nullable=false)
	private String username;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String confirmpassword;
	
	@OneToMany(mappedBy="user")
	private List<RentalHouse> houseList;
	
	
	
	public User() {
		super();
	}
	
	
	public User(Integer id, String fullname, String email, String mobile, String owner, String username,
			String password, String confirmpassword) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.mobile = mobile;
		this.owner = owner;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", mobile=" + mobile + ", owner="
				+ owner + ", username=" + username + ", password=" + password + ", confirmpassword=" + confirmpassword
				+ "]";
	}
	
	
	
	
	
	
}
