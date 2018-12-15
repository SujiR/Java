package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

@Controller
public class SupplierController 
{
	
		@Autowired
		SupplierDAO supplierDAO;
		
		boolean flag = true;
		@RequestMapping("/supplier")
		public String showSupplier(Model m) {
			List<Supplier> listSuppliers = supplierDAO.getSuppliers();
			m.addAttribute("listSuppliers", listSuppliers);

			for (Supplier supplier : listSuppliers) {
				System.out.println(supplier.getSupplierName() + ",");
			}
			flag = false;
			return "supplier";
		}
		@RequestMapping(value = "/InsertSupplier", method = RequestMethod.POST)
		public String insertSupplierData(@RequestParam("supname") String supname, @RequestParam("suploc") String suploc,
				Model m) {
			Supplier supplier = new Supplier();
			supplier.setSupplierName(supname);
			supplier.setSupplierLocation(suploc);

			supplierDAO.addSupplier(supplier);

			List<Supplier> listSuppliers = supplierDAO.getSuppliers();
			m.addAttribute("listSuppliers", listSuppliers);
			flag = false;
			return "supplier";
		}

		@RequestMapping("/deleteSupplier/{supplierId}")
		public String deleteSupplier(@PathVariable("supplierId") int supplierId,Model m)
		{
			Supplier supplier=supplierDAO.getSupplier(supplierId);
			
			supplierDAO.deleteSupplier(supplier);
			
			List<Supplier> listSuppliers=supplierDAO.getSuppliers();
			m.addAttribute("listSuppliers",listSuppliers);
			flag=false;
			return "supplier";
		}
		@RequestMapping("/updateSupplier/{supplierId}")
		public String updateSupplier(@PathVariable("supplierId") int supplierId,Model m)
		{
			Supplier supplier=supplierDAO.getSupplier(supplierId);
			
			
			List<Supplier> listSuppliers=supplierDAO.getSuppliers();
			m.addAttribute("listSuppliers",listSuppliers);
			m.addAttribute("supplierInfo",supplier);
			
			return "updatesupplier";
		}
		
		@RequestMapping(value="/UpdateSupplier",method=RequestMethod.POST)
		public String updateSupplierInDB(@RequestParam("supid") int supplierId,@RequestParam("supname") String supplierName,
				@RequestParam("suploc") String supplierLocation,Model m)
		{
			Supplier supplier=supplierDAO.getSupplier(supplierId);
			supplier.setSupplierName(supplierName);
			supplier.setSupplierLocation(supplierLocation);
			
			supplierDAO.updateSupplier(supplier);
			
			List<Supplier> listSuppliers=supplierDAO.getSuppliers();
			m.addAttribute("listSuppliers",listSuppliers);
			
			return "supplier";
		}

	}


