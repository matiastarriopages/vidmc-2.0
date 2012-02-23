package ar.com.vidmc.repository;

import com.db4o.ObjectServer;
import com.db4o.cs.Db4oClientServer;

public class DataBase {
	
	private static DataBase instance = null;
	private ObjectServer server;
	private int port = 5555;
	
	public static DataBase getInstance(){
		if(instance == null){
			instance = new DataBase();
		}
		return instance;
	}
	
	public void stopDataBase(){
		server.close();
	}
	
	public void startDataBase(){
		server = Db4oClientServer.openServer("repository.db", port);
		server.grantAccess("vidmc", "vidmc");
	}

}
