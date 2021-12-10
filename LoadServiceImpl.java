package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.springrest.createconnection.connecttionWithDB;
import com.springrest.createconnection.load;
@Service 
public class LoadServiceImpl implements LoadService {
	
	@Autowired
	private connecttionWithDB loadDao;
	
//	List<course> list;
//	
//	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new course(143,"Java","All basics of java"));
//		list.add(new course(35467,"Python","All basics of Python"));
//				
//	}

	@Override 
	public Optional<load> getLoadbyId(@RequestParam("shipperId") long shipperId) {
	//	return list;
		Optional<load> i = loadDao.findById(shipperId); 
		return i;
	}

	
	@Override
	public load getLoad(long loadId) {
//		course c=null;
//		for(course cr:list) {
//			if(cr.getId()==courseId) {
//				c=cr;
//				break;
//			}
//		}
//		return c;
		
		return loadDao.getById(loadId);
	}

	@Override
	public load addLoad(load c) {
//		list.add(c);
//		return c;
		
		loadDao.save(c);
		return c;
	}

	@Override
	public load updateLoad(load c) {
//		list.forEach(e ->{
//			if(e.getId() == c.getId()) {
//				e.setTitle(c.getTitle());
//				e.setDescription(c.getDescription());
//			}
//		});
//		return c;
		// SAME AS ADD- IF ALREADY EXISTS IT WILL UPDATE ELSE ADD NEW RECORD.
		loadDao.save(c);
		return c;
//		
	}

	@Override
	public void deleteLoad(long id) {
		//list = this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
		load en=loadDao.getById(id);
		loadDao.delete(en);
	}
	
	
	
}
