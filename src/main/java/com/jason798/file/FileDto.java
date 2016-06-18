package com.jason798.file;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by JasonLiu798 on 16/6/2.
 */
public class FileDto {
    private String path;
    private List<String> contents = new LinkedList<>();

//    public FileDto(String content) {
//        path = DFT_PATH;
//        contents.add(content);
//    }
    public FileDto(String path,String content){
        this.path = path;
        contents.add(content);
    }

    public FileDto(String path,List<String> content){
        this.path = path;
        contents.addAll(content);
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public String getPath() {
        return path;
    }

    public List<String> getContents() {
        return contents;
    }
}
