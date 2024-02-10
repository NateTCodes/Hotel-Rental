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