package javaapplication130;
public class owners {
    private String what;
    private int quantity;
    private String quality;
    private String source;

    public owners() {
    }

    public owners(String what, int quantity, String quality, String source) {
        this.what = what;
        this.quantity = quantity;
        this.quality = quality;
        this.source = source;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "owners{" + "what=" + what + ", quantity=" + quantity + ", quality=" + quality + ", source=" + source + '}';
    }
    
    
}
