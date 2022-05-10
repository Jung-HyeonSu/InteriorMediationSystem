/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author 정현수
 */
public class FileMgmt implements FileInterface {
    ArrayList<String> readUserInfo = new ArrayList();
    ArrayList<String> readAdminInfo = new ArrayList();
    ArrayList<UserInfo> userInfo = new ArrayList<>();
    ArrayList<AdminInfo> adminInfo = new ArrayList<>();
    
    @Override
    public void readFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readUserInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readCsrFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readUserInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readManagerFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readAdminInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void writeFileData(String path, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)),true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    public void writeCsrFileData(String path, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)),true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    public void writeManagerFileData(String path, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)),true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    
    @Override
    public void splitFileData() {
        String line;

        for (int i = 0; i < readUserInfo.size(); i++) {
            line = readUserInfo.get(i);
            String[] str = line.split("\t");
            userInfo.add(new UserInfo(str[0], str[1], str[2]));
        }
    }
    public void splitManagerFileData() {
        String line;

        for (int i = 0; i < readAdminInfo.size(); i++) {
            line = readAdminInfo.get(i);
            String[] str = line.split("\t");
            adminInfo.add(new AdminInfo(str[0],str[1]));
        }
    }

    
    public ArrayList<UserInfo> returnUserInfo() throws IOException {
        return userInfo;
    }
    public ArrayList<UserInfo> returnCsrInfo() throws IOException {
        return userInfo;
    }
    public ArrayList<AdminInfo> returnManagerInfo() throws IOException {
        return adminInfo;
    }
}
