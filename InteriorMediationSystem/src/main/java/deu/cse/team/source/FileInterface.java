/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.IOException;

/**
 * 파일 쓰기, 읽기 인터페이스
 * @author 정현수
 */
public interface FileInterface {
    void readFileData(String path);
    void writeFileData(String path, String data) throws IOException;
    void splitFileData();
}
