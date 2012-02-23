package ar.com.vidmc.vidmcD;

import ar.com.vidmc.repository.DataBase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DataBase.getInstance().startDataBase();
    }
    
}
