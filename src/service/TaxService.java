package service;

public class TaxService implements GeralTaxService{

    @Override
    public double  tax(double amount){
        return amount * 0.2;
    }

}
