# weather-app

### Weather Information Service

![image](https://github.com/user-attachments/assets/f2363293-ef82-4f09-a717-e029c4f8ed08)

### Overview
This is a full-stack weather application built using Spring Boot on the back-end and JavaScript (with TailwindCSS) on the front-end. The application fetches and displays real-time weather information for a given city by utilizing the OpenWeatherMap API.

### Features
* City Weather Lookup: Fetch current weather information for any city.
* Detailed current weather information (temperature, real feel, etc.).
* Dynamic weather icons.

### Technologies Used
* Backend: Spring Boot, Java 8
* Frontend: HTML, CSS (TailwindCSS), JavaScript
* API: OpenWeatherMap
* Testing: JUnit
* Deployment: Render.com

### Installation and Setup

1. Clone the Repository.
2. Configure API Keys:
* Sign up on OpenWeatherMap and obtain API keys for both Geocoding and Current Weather Data APIs.
*  Add these keys application.properties file.
3. Run the Application:
* Navigate to the project directory and use Maven or your IDE to run the application.
* The application will start on http://localhost:8080
4. Testing the Endpoint:
* Use Postman or any REST client to send a GET request to the following endpoint: http://localhost:8080/api/v1/weather/{city}
* Replace {city} with the name of the city for which you want to retrieve weather information.

### Live demo

You can try the deployed version of the app on Render.com here: https://weather-app-6in8.onrender.com
