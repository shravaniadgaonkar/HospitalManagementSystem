package com.example.hospitalManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalManagementSystem.dto.StaffDto;
import com.example.hospitalManagementSystem.entity.RolesEntity;
import com.example.hospitalManagementSystem.entity.StaffDetailsEntity;
import com.example.hospitalManagementSystem.repository.StaffDetailsRepository;

@Service
public class LoginService {

	@Autowired
	StaffDetailsRepository staffDetailsRepository;

	public boolean checkCredentials(StaffDto staffDto) {

		try {
			StaffDetailsEntity staffDetailsEntity = new StaffDetailsEntity();

			String userName = staffDto.getUserName();
			String password = staffDto.getPassword();

			StaffDetailsEntity staffDetails = staffDetailsRepository.findByStaffName(userName);
			
			String dbUserName = null;
			String dbPassword = null;
			
//			if(staffDetails.getUserName() != null) {
				dbUserName = staffDetailsRepository.findByUserName(userName).getUserName();
				dbPassword = staffDetailsRepository.findByUserName(userName).getStaffPassword();
//			}
			
			String role = staffDetailsRepository.findByUserName(userName).getRoleId().getRoleType();

			if (userName.equals(dbUserName) && password.equals(dbPassword)) {
				return true;
			} else {
				return false;

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	public String roleType(StaffDetailsEntity staffDetailsEntity) {

		return null;
	}
}
