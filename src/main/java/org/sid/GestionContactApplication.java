package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionContactApplication {

	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionContactApplication.class, args);
	}

	@Autowired
	public void run(String... arg0) throws Exception {
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact("Bilel", "Laifi", df.parse("31/01/1992"), "bilelelaifi@gmail.com", 676981437, "biel.png"));
		contactRepository.save(new Contact("Ahmed", "Laifi", df.parse("25/03/1998"), "ahmed@gmail.com", 234545456, "biel.png"));
		contactRepository.save(new Contact("aaaa", "bbb", df.parse("02/01/1990"), "bilelelaifi@gmail.com", 676981437, "biel.png"));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
	}
}
