package risbic.data;

public class DBConfig {
	private String type;
	private String host;
	private String port;
	private String user;
	private String pass;
	private String database;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		DBConfig dbConfig = (DBConfig) o;

		if (database != null ? !database.equals(dbConfig.database) : dbConfig.database != null) {
			return false;
		}
		if (host != null ? !host.equals(dbConfig.host) : dbConfig.host != null) {
			return false;
		}
		if (pass != null ? !pass.equals(dbConfig.pass) : dbConfig.pass != null) {
			return false;
		}
		if (port != null ? !port.equals(dbConfig.port) : dbConfig.port != null) {
			return false;
		}
		if (type != null ? !type.equals(dbConfig.type) : dbConfig.type != null) {
			return false;
		}
		if (user != null ? !user.equals(dbConfig.user) : dbConfig.user != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = type != null ? type.hashCode() : 0;
		result = 31 * result + (host != null ? host.hashCode() : 0);
		result = 31 * result + (port != null ? port.hashCode() : 0);
		result = 31 * result + (user != null ? user.hashCode() : 0);
		result = 31 * result + (pass != null ? pass.hashCode() : 0);
		result = 31 * result + (database != null ? database.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("DBConfig{");
		sb.append("type='").append(type).append('\'');
		sb.append(", host='").append(host).append('\'');
		sb.append(", port='").append(port).append('\'');
		sb.append(", user='").append(user).append('\'');
		sb.append(", pass='").append(pass).append('\'');
		sb.append(", database='").append(database).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
