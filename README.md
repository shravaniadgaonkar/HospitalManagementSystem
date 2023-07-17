# HospitalManagementSystem
 
1. create a database with name hospitalmanagementsystem.
2. I have used the eclipse ide to code and execute the code.
3. I have used postman for POST, GET and PUT request to fetch data, insert the data and update the data in the database.
4. The prequisite to run this project is to have minimum of Java 8 on your system. This project has used Java 11. Apache Maven and MySQL database is used for this project.
5. include following in your application.properties:
   # Database 
   spring.datasource.url=jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
   spring.datasource.username=root
   spring.datasource.password=root
   (Note: localhost portno, database username and password may change for each system)
6. Following are all the api that that needed to run
   6.1. For login use : "/login"
   6.2. Register new staff : "/hospital/addNewStaf"
   sample data:
         {
          "staffId": 1,
          "staffName": "nisha",
          "dateOfBirth": "1990-01-01",
          "email": "nisha@gmail.com",
          "userName": "nisha123",
          "password": "123456",
          "joiningDate": "2022-01-01",
          "lastWorkingDate": null,
          "roleId": 2
         }
   6.3. Fetch all doctors : "/getAllDoctorsList"
   6.4. Fetch all nurses : "/getAllNurseList"
   6.5. Add patient : "/hospital/addNewPatient"
   sample data:
            {
              "patientId": 4,
              "patientName": "Sukar",
              "age": 30,
              "patientBedNumber": 2,
              "admitDate": "2022-01-01",
              "staffId": "nisha",
              "status": 1,
              "expenses": 2000.0
            }
   6.6 Fetch All Patient : "/getAllPatientDetails"
   6.7. Discharge Patient : "/hospital/patient/{patientId}/discharge"
   sample data:
              /hospital/patient/1/discharge
   
   6.8. Admitted Patient : "/hospital/admittedPatient"
   6.9. Total roles : "/hospital/getRole"
   6.10. Add new role : "/hospital/addNewRole"
   sample data :
           {
            "roleId" : 1,
            "roleType" : "Doctor"
           }
   6.11. Add new bed : "/hospital/addNewBed"
           {
              "bedId": 1,
              "roomNumber": 101,
              "bedNumber": 1,
              "priceOfBed": 100,
              "wardId": 2
           }
   6.12. Check total available status : "/hospital/getStatus"
   6.13. Add new status : "/hospital/addNewPatientStatus"
   sample data:
           {
            "statusId" : 1,
            "statusType" : "admitted"
           }
   6.14. Add new ward : "/hospital/addWard"
   sample data:
            {
                "statusId" : 1,
                "wardName" : "General",
                "totalRooms" : 10
            }
   6.15. Get total ward list : "/hospital/wardList"

  7. While passing the data from postman I've passed Dto class object so make sure to check the classes and entity classes to avoid confusion between the class variables.
