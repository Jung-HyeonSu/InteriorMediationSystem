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
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author 정현수
 */
public class FileMgmt implements FileInterface {
    ArrayList<String> readUserInfo = new ArrayList();
    ArrayList<String> readAdminInfo = new ArrayList();
    ArrayList<String> readConstructionInfo = new ArrayList();
    ArrayList<String> readColorInfo = new ArrayList();
    ArrayList<String> readHousingTypeInfo = new ArrayList();
    ArrayList<String> readNoticeInfo = new ArrayList();
    ArrayList<String> readTileInfo = new ArrayList();
    ArrayList<String> readPayTypeInfo = new ArrayList();
    ArrayList<String> readEstimateInfo = new ArrayList();
    ArrayList<String> readPaintInfo = new ArrayList();
    
    ArrayList<UserInfo> userInfo = new ArrayList<>();
    ArrayList<AdminInfo> adminInfo = new ArrayList<>();
    ArrayList<ConstructionInfo> constructionInfo = new ArrayList<>();
    ArrayList<ColorInfo> colorInfo = new ArrayList();
    ArrayList<HousingTypeInfo> housingtypeInfo = new ArrayList();
    ArrayList<NoticeInfo> noticeInfo = new ArrayList();
    ArrayList<TileInfo> tileInfo = new ArrayList();
    ArrayList<PayTypeInfo> paytypeInfo = new ArrayList();
    ArrayList<EstimateInfo> estimateInfo = new ArrayList();
    ArrayList<PaintInfo> paintInfo = new ArrayList();
    
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
    public void readConstructionFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readConstructionInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readColorFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readColorInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readHousingTypeFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readHousingTypeInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readNoticeFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readNoticeInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readTileFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readTileInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     public void readPayTypeFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readPayTypeInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readEstimateFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readEstimateInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readPaintFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readPaintInfo.add(line);
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
    public void splitConstructionFileData() {
        String line;

        for (int i = 0; i < readConstructionInfo.size(); i++) {
            line = readConstructionInfo.get(i);
            String[] str = line.split("\t");
            constructionInfo.add(new ConstructionInfo(str[0],str[1]));
        }
    }
    public void splitColorFileData() {
        String line;

        for (int i = 0; i < readColorInfo.size(); i++) {
            line = readColorInfo.get(i);
            String[] str = line.split("\t");
            colorInfo.add(new ColorInfo(str[0],str[1]));
        }
    }
    public void splitHousingTypeFileData() {
        String line;

        for (int i = 0; i < readHousingTypeInfo.size(); i++) {
            line = readHousingTypeInfo.get(i);
            String[] str = line.split("\t");
            housingtypeInfo.add(new HousingTypeInfo(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7]));
        }
    }
    public void splitNoticeFileData() {
        String line;

        for (int i = 0; i < readNoticeInfo.size(); i++) {
            line = readNoticeInfo.get(i);
            String[] str = line.split("\t");
            noticeInfo.add(new NoticeInfo(str[0],str[1]));
        }
    }
    public void splitTileFileData() {
        String line;

        for (int i = 0; i < readTileInfo.size(); i++) {
            line = readTileInfo.get(i);
            String[] str = line.split("\t");
            tileInfo.add(new TileInfo(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7]));
        }
    }
    public void splitPayTypeFileData() {
        String line;

        for (int i = 0; i < readPayTypeInfo.size(); i++) {
            line = readPayTypeInfo.get(i);
            String[] str = line.split("\t");
            paytypeInfo.add(new PayTypeInfo(str[0], str[1]));
        }
    }
    public void splitEstimateFileData() {
        String line;

        for (int i = 0; i < readEstimateInfo.size(); i++) {
            line = readEstimateInfo.get(i);
            String[] str = line.split("\t");
            estimateInfo.add(new EstimateInfo(str[0], str[1]));
        }
    }
    public void splitPaintFileData() {
        String line;

        for (int i = 0; i < readPaintInfo.size(); i++) {
            line = readPaintInfo.get(i);
            String[] str = line.split("\t");
            paintInfo.add(new PaintInfo(str[0], str[1], str[2], str[3]));
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
    public ArrayList<ConstructionInfo> returnConstructionInfo() throws IOException {
        return constructionInfo;
    }
    public ArrayList<ColorInfo> returnColorInfo() throws IOException {
        return colorInfo;
    }
    public ArrayList<HousingTypeInfo> returnHousingTypeInfo() throws IOException {
        return housingtypeInfo;
    }
    public ArrayList<NoticeInfo> returnNoticeInfo() throws IOException {
        return noticeInfo;
    }
    public ArrayList<TileInfo> returnTileInfo() throws IOException {
        return tileInfo;
    } 
    public ArrayList<PayTypeInfo> returnPayTypeInfo() throws IOException {
        return paytypeInfo;
    }
    public ArrayList<EstimateInfo> returnEstimateInfo() throws IOException {
        return estimateInfo;
    }
    public ArrayList<PaintInfo> returnPaintInfo() throws IOException {
        return paintInfo;
    }
}
