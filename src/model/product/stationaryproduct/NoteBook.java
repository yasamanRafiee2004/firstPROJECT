package model.product.stationaryproduct;

import model.product.ProductCategory;

public class NoteBook extends Stationary {
    private final int paperNum;
    private final String paperType;

    public NoteBook(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, String country, int paperNum, String paperType) {
        super(productName, productPrice, productCategory, numOfInventory, country);
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
