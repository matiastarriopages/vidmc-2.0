package ar.com.vidmc.vidmcD;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.com.vidmc.repository.DataBase;
import ar.com.vidmc.repository.Repository;

public class RepositoryTest {

	@Test
	public void ConectionTest(){
		DataBase.getInstance().startDataBase();
		Repository.getInstancia().store(new Object());
		List<Object> set = Repository.getInstancia().queryByExample(new Object());
		Assert.assertTrue(set.size()>=0);
		for(Object o:set){
			Repository.getInstancia().delete(o);
		}
	}
}
