package co.pragra.learning.firstspringproject.business;

import co.pragra.learning.firstspringproject.domain.IRateOfInterest;
import co.pragra.learning.firstspringproject.domain.RateType;

public class PaymentCalculator {
    private double loanAmount;
    private double tenure;

    public PaymentCalculator(double loanAmount, double tenure,  IRateOfInterest interestProvider) {
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.interestProvider = interestProvider;
    }

    private IRateOfInterest interestProvider;

    public double calculatePayment() {
        return  loanAmount+ loanAmount*interestProvider.getInterestRate(RateType.FIXED)*tenure/100;
    }

}
