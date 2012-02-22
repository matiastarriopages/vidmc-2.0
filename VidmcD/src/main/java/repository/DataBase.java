package repository;

import com.db4o.ObjectServer;
import com.db4o.cs.Db4oClientServer;

public class DataBase {
	
	private DataBase instance = null;
	private int port = 5555;
	
	public DataBase getInstance(){
		
		if(instance == null){
			instance = new DataBase();
		}
		return instance;
	}
	
	public DataBase(){
		ObjectServer server = Db4oClientServer.openServer("repository.db", port);
		server.grantAccess("vidmc", "vidmc");
	}

}
