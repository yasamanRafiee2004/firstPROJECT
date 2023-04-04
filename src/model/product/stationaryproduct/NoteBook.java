package model.product.stationaryproduct;

import model.product.ProductCategory;

public class NoteBook extends Stationary {
    private final int paperNum;
    private final String paperType;

    public NoteBook(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, String country, int paperNum, String paperType) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage, country);
        this.paperNum = paperNum;
        this.paperType = paperType;
    }

    public int getPaperNum(){
        return paperNum;
    }
    public String getPaperType(){
        return paperType;
    }
    @Override
    public String toString(){
        return super.toString() + " number of paper : " + paperNum + " type of paper : " + paperType;
    }
}
