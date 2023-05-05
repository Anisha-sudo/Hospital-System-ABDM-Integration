package com.example.HAD.admin.receptionist;

import com.example.HAD.login.bean.LoginBean;
import com.example.HAD.login.dao.JpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class rec_ser_imp implements rec_service {
    
    @Autowired
    rec_dao dao1;
    
    @Autowired
    JpaRepo dao2;

    @Autowired
    rec_dao.DoctorHospitalIdGenerator idgenerator;
    

    @Override
    public String savedoc(largeBean obj) {
        
        recbean firstbean = new recbean();
        LoginBean secondbean = new LoginBean();
        
        firstbean.setMobile(obj.getMobile());
        firstbean.setName(obj.getName());
        firstbean.setAddress(obj.getAddress());
        firstbean.setHos_id(idgenerator.generateDoctorHospitalId(obj.getName(), obj.getRole()));
        firstbean.setEmail_Id(obj.getEmail_Id());
        secondbean.setId(idgenerator.generateDoctorHospitalId(obj.getName(), obj.getRole()));
        secondbean.setPassword(obj.getPassword());
        secondbean.setType(obj.getRole());
        firstbean.setGender(obj.getGender());
        firstbean.setYearofBirth(obj.getYearofBirth());



        dao1.save(firstbean);

        dao2.save(secondbean);
        
        
        
        return "sucess";
    }

//    @Override
//    public String deletedoc(largeBean obj) {
//        docbean firstbean = new docbean();
//        LoginBean secondbean = new LoginBean();
//
//        firstbean.setMobile(obj.mobile);
//        firstbean.setName(obj.name);
//        firstbean.setAddress(obj.Address);
//        firstbean.setAbha_id(obj.abha_id);
//        secondbean.setId(obj.id);
//        secondbean.setPassword(obj.password);
//        secondbean.setType(obj.role);
//
//        dao1.deleteById(firstbean.getAbha_id());
//
//        dao2.delete(secondbean);
//
//        return "deleted";
//
//   }
}