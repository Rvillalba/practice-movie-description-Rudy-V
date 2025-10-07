package com.example.movie_description;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import org.apache.http.HttpException;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class MovieDescriptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDescriptionApplication.class, args);
        Client client = new Client();

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a movie name and rating: ");
        String query = scanner.nextLine();

        GenerateContentResponse response = client.models().generateContent("gemini-2.5-flash", query, null);

        System.out.println(response.text());
	}


}
