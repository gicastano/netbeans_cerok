/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

/**
 *
 * @author Gina
 */
public class Movie {
    
    public static final CHILDRENS = 2;
    public static final REGULAR=0;
    public static final NEW_RELEASE=1;
    private String _tittle;
    private int _priceCode;
    
    public Movie(String tittle, int priceCode){
        _tittle=tittle;
        _pirceCode=priceCode;
    
    }
    
    public int getPriceCode(){
        return_priceCode;
    }
    
    public void setPriceCode(int org){
        _priceCode=org;
    }
    
    public String getTittle(){
        return _tittle;
    
    }
    
}
