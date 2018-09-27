package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Supplier;
@Repository
public class SupplierDAOImpl implements SupplierDAO 
{
  public SupplierDAOImpl()
  {
	  System.out.println("Supplier");
  }
  @Autowired
  SessionFactory sessionfactory;
  @Transactional
	public boolean addSupplier(Supplier supplier)
	{
		try
		{
		sessionfactory.getCurrentSession().save(supplier);
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception arised"+e);
			return false;
		}
	}

	public Supplier getSupplier(int supplierId)
	{
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,supplierId);
		session.close();
		return supplier;

	}
    @Transactional
	public boolean deleteSupplier(Supplier supplier)
	{
		// TODO Auto-generated method stub
		try
		{
		sessionfactory.getCurrentSession().delete(supplier);
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception arised"+e);
			return false;
		}
	}
    @Transactional
	public boolean updateSupplier(Supplier supplier)
	{
		// TODO Auto-generated method stub
		try
		{
		sessionfactory.getCurrentSession().update(supplier);
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception arised"+e);
			return false;
		}
	}

	public List<Supplier> getSuppliers()
	{
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from supplier");
		List<Supplier> listSuppliers=(List<Supplier>)query.list();
		return listSuppliers;
	}

}


