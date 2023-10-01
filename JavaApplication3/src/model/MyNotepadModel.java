
package model;


public class MyNotepadModel {
    private String fileName;
    private String content;
  public MyNotepadModel (String fileName, String content){
      this.fileName = " ";
      this.content = " ";
  }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public String getContent() {
        return content;
    }
  
}
