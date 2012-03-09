package ar.com.vidmc.vidmcD;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.com.vidmc.repository.DataBase;
import ar.com.vidmc.repository.Repository;

public class RepositoryTest {

	@Before
	public void Setup(){
		DataBase.getInstance().startDataBase();
	}
	
	@After
	public void TearDown(){
		DataBase.getInstance().stopDataBase();
	}
	
	@Test
	public void ConectionTest(){
		
		Repository.getInstancia().store(new MockObject());
		List<MockObject> set = Repository.getInstancia().queryByExample(new MockObject());
		Assert.assertTrue(set.size()==1);
		for(MockObject o:set){
			Repository.getInstancia().delete(o);
		}
		set = Repository.getInstancia().queryByExample(new MockObject());
		Assert.assertTrue(set.size()==0);
	}
}
