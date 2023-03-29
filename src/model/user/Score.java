package model.user;

import model.product.Product;

public class Score {
    private final User user;
    private final int score;
    private final Product product;

    public Score(User user, int score, Product product) {
        this.user = user;
        this.score = score;
        this.product = product;
    }
    public User getUserAccount(){
        return user;
    }
    public int getScore(){
        return score;
    }
    public Product getProduct(){
        return product;
    }
}
