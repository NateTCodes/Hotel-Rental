<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D387 – ADVANCED JAVA

Part B1a:
Created welcome.properties resource bundle
welcome_en_US.properties: lines 1-2, created hello and welcome message in English
welcome_fr_CA.properties: lines 1-2, created hello and welcome message in French

Part B1b:
WelcomeMessage.java: lines 7-23, created a function that parses through the bundle and returns the string message for each instance.
D387SampleCodeApplication.java: lines 15-23, created objects for each welcome message along with threads and started them.
WelcomeController.java: lines 12-20, returns welcome message to appropriate url and frontend host based on locale instance.
app.component.ts: lines 18-19, created variables for each welcome message
app.component.ts: lines 35-36, created get request to call from the welcome controller
app.component.html: lines 25-28, calls get request results to display in frontend

Part B2:
app.component.ts: line 59, added the two currencies and set them equal to room.price
app.component.ts: lines 109-110, created variables under room interface
app.component.html: lines 82-83 created two html elements to display the currencies on frontend
app.component.html: line 81, added line break to pre-written code so US prices displayed on a different row from Canadian

Part B3a:
TimeZoneConvert.java: lines 12-17, retrieved current time and added conversion for each different zone
TimeZoneConvert.java: lines 19-23, set formatting for times and returned the them based on zones

Part B3b:
TimeController.java: lines 12-15, returns response entity with a message announcing the live presentation
app.component.ts: line 21, declared startTime variable
app.component.ts: line 40, created get request to retrieve the times for presentation
app.component.html: line 30, displayed the message and time to frontend

Part C1:
Dockerfile created

Part C3:
The cloud provider I would use to deploy this application is Microsoft Azure. I would first have to create a Dockerfile
in order to package the project and set all the parameters in the file. I would then create a container application on Microsoft Azure as well as a resource group.
The settings within the application will include a target port set to 8080 and allowing open traffic. Once that is set I will finish the deployment and check to see if the application url is valid.


