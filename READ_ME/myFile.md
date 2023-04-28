# Welcome to readme-md-generator &#x1F44B; 
![example workflow](https://img.shields.io/badge/Eclipse-Version%3A%202022--09%20(4.25.0)-orange)
![example workflow](https://img.shields.io/badge/SpringBoot-2.2.1-yellowgreen)
![example workflow](https://img.shields.io/badge/Java-8-yellowgreen)
![example workflow](https://img.shields.io/badge/Postman-v10.13-orange)
![example workflow](https://img.shields.io/badge/Documentation-Yes-green)
![example workflow](https://img.shields.io/badge/Manitained%3F-Yes-green)
 >CLI that generate beautiful **ReadME**.md files

  :house:  <b><span style="color: blue;">Homepage</span></b>
  


 # Prerequisties

 - **Eclipse >=4.55.0**
 - **Postman >=10.13**
 


# Install
```
Maven Install
SpringTool Install
```
 # Framework And Language

 - **Framework :  SpringBoot**
 - **Language :  Java**

 # Dependencies Required

 - **spring-boot-starter-validation**
 - **spring-boot-starter-web**
 - **spring-boot-devtools**
 - **lombok**
 - **spring-boot-starter-test**

# DataFlow

<b><span style="color: white;">Controller</span></b>

1. *@PostMapping("/users")*
```
     public String addUser(@Valid @RequestBody User user ) {
		
		return userservices.saveUser(user);}	
	
```
2. *@GetMapping("/users")*
```
     public ArrayList<User> getAllUser() {
		return userservices.retriveAllUsers();
	}
```
3. *GetMapping("/users/{userid}")*

```
     public User getUserById (@Valid @PathVariable("userid") String userid){
		
		return userservices.findUserById(userid);
	}
```
4. *PutMapping("/users/{userid}")*
```
     public String updateUserInfo(@Valid @PathVariable("userid") String userid, @Valid @RequestBody User user) {
		
		return userservices.updateUserInfo(userid,user);
	}
```
5.*DeleteMapping("/users/{userid}")*
```
    public String deleteUserInfo(@Valid @PathVariable("userid")String userid) {
		
		return userservices.removeUserById(userid);
	}
```
<b><span style="color: white;">Services</span></b>



1.*userservices.saveUser(user)*
```
     public String saveUser(User user) {
		
		ArrayList<User>current=userrepository.getUserList();
		
		current.add(user);
		
		userrepository.setUserList(current);
		
		return "Sucessfully added";
	}	
	
```
2.*userservices.retriveAllUsers()*
```
    public ArrayList<User> retriveAllUsers() {
	
		ArrayList<User>current=userrepository.getUserList();
		return current;
	}	
	
```
3.*userservices.findUserById(userid)*
```
    public User findUserById(@Valid String userid) {
		ArrayList<User>current=userrepository.getUserList();
		
		for(User user:current) {
			
			if(user.getUserId().equals(userid)) {
				
				return user;
			}
			
		}return null;
		
		
	}	
	
```
4.*userservices.updateUserInfo(userid,user)*
```
     public String updateUserInfo(@Valid String userid,User user) {
		ArrayList<User>current=userrepository.getUserList();

		for(User u1:current) {
			
			if(u1.getUserId().equals(userid)) {
				
				u1.setDate(user.getDate());
				u1.setDateOfBirth(user.getDateOfBirth());
				u1.setEmail(user.getEmail());
				u1.setPhoneNumber(user.getPhoneNumber());
				u1.setUserId(user.getUserId());
				u1.setUserName(user.getUserName());
				u1.setTime(user.getTime());
				
				userrepository.setUserList(current);
				
				return "sucessfully updated";}
				
			
		}return "update not happend check the userid again";}	
	
```
5.*userservices.removeUserById(userid)*
```
     public String removeUserById(@Valid String userid) {
		
		ArrayList<User>current=userrepository.getUserList();

		
		for(User user:current) {
			
			if(user.getUserId().equals(userid)) {
				
				current.remove(user);
				userrepository.setUserList(current);
				return "Sucessfully removed ";
			}}
		
		   return "Error Check the userid again";
		
	}	
	
```

<b><span style="color: white;">Repository</span></b>
  
  
```

   @Repository
   @Data
   @NoArgsConstructor
   @AllArgsConstructor

    public class UserRepository {
	
	
	private ArrayList<User>userList=new ArrayList<>();

}	
	
```

<b><span style="color: white;">ModelClass With Validations</span></b>



```
1.userId 

    @NotEmpty(message = "These field cannot be empty ")
	@Size(min =4 ,message = "UserId should have atlest 4 characters")
	private String userId;
	
	
```
```
2.userName

    @NotEmpty(message = "These field cannot be empty")
	@Size(min =4,max=12,message = "Username should be in between four to twelve characters ")
	 private String userName;
	
	
```
```
3.email

    @Email(message = "Email is not valid")
	private String email;
	
	
```
```
4.phoneNumber

    @ValidPhoneNumber(message =  "Invalid phone number format.Please enter a 12-digit number with the first two digits as the country code.")
	private String phoneNumber;
	
	
```
```
5.dateOfBirth

    @NotNull(message = "Date of birth must not be null")
	@DateNotValid(message = "Please provide a date in the format YYYY-MM-DD, either for the present day or a valid date ")
	private String dateOfBirth;
	
	
```
```
6.date

   @NotNull(message="These field cannot be empty")
	@DateNotValid(message = "Please provide a date in the format YYYY-MM-DD, either for the present day or a valid date ")
	private String date;
	
	
```
```
7.time

   @NotNull(message = "These field cannot be empty")
	private String time;
	
	
```
	



# Datastructure Used

<details>
<summary><b><span style="color: white;">Clickme</span></b> &#x1F4F2; </summary>

*ARRAYLIST*

*HASHMAP*

</details>




# Summary

 Spring Project that is a User management system.
The user will have the following attribute
**UserId**,

**UserName**,
**DateOfBirth**,
**Phone Number**,
**Email**,
**Date**,
**Time**. Along with these proper validations are also provided.


Endpoint provided are **/users**, 
**/users/{userid}**



# :handshake:  Contributing
  Contributions,issues and features request are welcome! 
  

  #


  This *README* was generated with &#x2764;&#xFE0F; by <b><span style="color: blue;">readme-md-generator</span></b> 










   
  
  

