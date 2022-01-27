package jwt;

import java.io.Serializable;

public class jwtRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1946487897772964380L;
	
	private String username;
    private String password;
    
    

    public jwtRequest() {
		super();
	}

	public jwtRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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

}