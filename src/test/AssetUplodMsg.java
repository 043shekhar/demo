package test;

public enum AssetUplodMsg {

	JS("js"), 
    img("** Image Upload **"), 
    PDF("pdf"), 
    LP("Landing page"), 
    HTML("html");
 
	private String msg;
	 
	AssetUplodMsg(String msg) {
        this.msg = msg;
    }
 
    public String getMsg() {
        return msg;
    }
}

