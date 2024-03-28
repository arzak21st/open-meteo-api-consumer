# Open-Meteo API Consumer ☕

A **Spring Boot** web application that consumes 
[Open-Meteo API](https://open-meteo.com/), 
to obtain weather forecasts for a specified location, including hourly and daily updates. </br>

## Live Demo 💻

- ### Requirements

  - [Java 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html) or higher.

- ### Steps

  - Download [this JAR file](https://github.com/arzak21st/open-meteo-api-consumer/releases/download/v0.0.1-SNAPSHOT/open-meteo-api-consumer-0.0.1-SNAPSHOT.jar).
  - Open your command-line and navigate to where your downloaded JAR file is located.
  - Run the JAR file with the following command:
      ```
      java -jar open-meteo-api-consumer-0.0.1-SNAPSHOT.jar
      ```
  - Open the browser and navigate to the following URL:
      ```
      http://localhost:4869/open-meteo-api-consumer/weather
      ```

## Installation 🔌

- ### Requirements

  - [Java 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html) or higher.
  - [Maven](https://maven.apache.org/download.cgi).
  - [Git](https://git-scm.com/downloads).
  - [NetBeans 19](https://netbeans.apache.org/front/main/download/nb19/).
    > You can use any other Java IDE, just make sure it uses the mentioned **Java 11**, and **Maven**. </br>

- ### Steps

  - Press the **Fork** button (top right the page) to make a copy of this project on your own GitHub account.
  - Open **Git Bash** and navigate to where you want your forked project to be cloned.
  - Clone the project with the following command:
      ```
      git clone https://github.com/your-username/your-forked-project-name.git
      ```
      > Replace `your-username` with the actual username of your GitHub account, and `your-forked-project-name` with the actual name of your forked project. </br>
  - Open **NetBeans** (or any other Java IDE) and try to import your cloned project.

## Additional Information 🔥

I was intending to use Google's 
[Geocoding API](https://developers.google.com/maps/documentation/geocoding/overview) 
for more precise geocoding. 
However, my plans were spoiled thanks to Google's new way of human verification process, 
which now requires a credit card instead of the usual method of selecting traffic lights or whatever.. 
So I utilized 
[World Cities Database](https://simplemaps.com/data/world-cities) 
as an alternative. </br>
