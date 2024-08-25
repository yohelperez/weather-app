# weather-app

### Weather Information Service
![image](https://github.com/user-attachments/assets/dd0cc08a-b2ed-4922-a396-76ac8e3fc30b)

### Overview
This Spring Boot application provides weather information for a given city by utilizing the OpenWeatherMap Geocoding API to fetch the city's coordinates, and then retrieving the weather data using the OpenWeatherMap Current Weather Data API. The service is accessible through a RESTful endpoint.

### Features
* City Weather Lookup: Fetch current weather information for any city.
* Coordinates Retrieval: Automatically obtain the geographical coordinates of the city using the Geocoding API.
* Unit Testing: Includes JUnit tests to ensure that the application correctly retrieves and processes weather data.

### Technologies Used
* Spring Boot: For building the RESTful web service.
* Java 8: As the programming language.
* OpenWeatherMap API: For obtaining geolocation and weather data.
* JUnit: For unit testing.
* Postman: For testing the API endpoints.

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
