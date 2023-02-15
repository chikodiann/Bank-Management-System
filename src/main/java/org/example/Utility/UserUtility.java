package org.example.Utility;

import org.example.entity.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserUtility {
    private final String PATH = "src/main/resources/user - Sheet1.csv";

    public List<User> readUser() throws IOException{
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));) {
            List<User> userList = new ArrayList<>();
            bufferedReader.readLine();
            String line = "";
            while((line = bufferedReader.readLine()) != null) {
                String[] row = line.split(",");
                userList.add(new User(row[0], Integer.parseInt(row[2]), row[1]));
            }
            return userList;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;


    }
}
