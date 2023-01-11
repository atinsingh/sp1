package co.pragra.learning.firstspringproject.business;

import co.pragra.learning.firstspringproject.domain.IRateOfInterest;
import co.pragra.learning.firstspringproject.domain.RateType;

public class FirstTimeBuyerProvider implements IRateOfInterest{
    @Override
    public double getInterestRate(RateType rateType) {
        return 3.5;
    }
}
