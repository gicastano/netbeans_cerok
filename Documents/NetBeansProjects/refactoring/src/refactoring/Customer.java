/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

import java.util.Enumeration;
import java.util.Vector;


/**
 *
 * @author Gina
 */
public class Customer{
    private String _name;
    private Vector _rentals= new Vector();
    
    public Customer(String name){
        _name=name;
    
    }
    
    public void addRental(Rental org){
        _rentals.addElement(org);
    
    }
    
    public String getName(){
        return _name;
    
    }
    public String statement()
    {
        double totalAmount=0;
        int frequentRenterPoints=0;
        Enumeration rentals = _rentals.elements();
        String result="Rental Record for" +getName()+"\n";
        
        while(rentals.hasMoreElements()){
            double thisAmount=0;
            Rental each=(Rental) rentals.nextElement();
            
            //determina el monto para cada linea
            
            switch(each.getMovie().getPriceCode()){
                case Movie.Regular:
                    thisAmount +=2;
                    if(each.getDaysRented() >2)
                        thisAmount +(each.getDaysRented()-2)*1,5;
                    break;
                    
                case Movie.New_RELEASE:
                    thisAmount +=each.getDaysRented()*3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 15;
                    if(each.getDaysRented()>3) {
                thisAmount +=(each.getDaysRented()-3)*1,5;
                    }
                    break;
            //suma los puntos de renta frecuente
                    frequentRenterPoints++;
            //suma un bono por rentas dos dias un estreno
                    if((each.getMovie().getPriceCode()==Movie.NEW_RELEASE) && each.getDaysRented()>1)
                       frequentRenterPoints++;
                    
            //muestra los datos para esta renta
                    result += "\+" + each.getMovie.getTittle()+"\+" + String.valueOf(thisAmount)+"\n";
                    totalAmount += thisAmount;
            }
        }//fin del while
            
            //agrega linea de totales
            
            result +="Amount owed is" +String.valueOf(totalAmount)+"\n";
            result +="you earned" +String.valueOf(frequentRenterPoints) + "frequent renter points";
            return result
               
        
        }
    
    }

