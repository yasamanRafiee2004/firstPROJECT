package model.product.stationaryproduct;

import model.product.ProductCategory;

public class NoteBook extends Stationary {
    private final int paperNum;
    private final String paperType;

    public NoteBook(int productID, String productName, int productPrice, ProductCategory productCategory, String country, int paperNum, String paperType) {
        super(productID, productName, productPrice, productCategory, country);
        this.paperNum = paperNum;
        this.paperType = paperType;
    }
    public int getPaperNum(){
        return paperNum;
    }
    public String getPaperType(){
        return paperType;
    }
}
