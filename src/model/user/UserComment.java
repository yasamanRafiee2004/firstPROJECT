package model.user;

public class UserComment {
   private final User user;
   private final int productID;
   private final String commentText;
   Boolean sellingStatue;

    public UserComment(User user, int productID, String commentText, Boolean sellingStatue) {
        this.user = user;
        this.productID = productID;
        this.commentText = commentText;
        this.sellingStatue = sellingStatue;
    }
    public User getUserAccount(){
        return user;
    }
    public int getProductID(){
        return productID;
    }
    public String getCommentText(){
        return commentText;
    }
}
