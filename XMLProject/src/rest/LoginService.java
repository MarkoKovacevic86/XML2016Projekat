package rest;

import java.io.File;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import java.io.IOException;
import java.util.Scanner;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;

import sun.awt.datatransfer.DataTransferer;
import uloge.User;

@Path("/user")
public class LoginService {

	private String path = "C:\\Users\\Bebica\\git\\XML2016\\XMLProject\\src\\users\\users.txt";

	@Path("/login")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public User login(String json) {
		System.out.println(json);
		ObjectMapper mapper = new ObjectMapper();
		User u = null;
		try {
			u = mapper.readValue(json, User.class);
			System.out.println("__" + u.getUsername());
			File f = new File(path);
			try {

				Scanner scanner = new Scanner(f);
				while (scanner.hasNext()) {
					String line = scanner.nextLine();
					String[] splitStr = line.split(";");
					String username = splitStr[0].trim();
					String password = splitStr[1].trim();
					String role = splitStr[2].trim();
					if (username.equals(u.getUsername())) {
						if (password.equals(u.getPassword())) {
							scanner.close();
							u.setRole(role);
							return u;
						} else {
							scanner.close();
							return null;
						}
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return null;

	}

}