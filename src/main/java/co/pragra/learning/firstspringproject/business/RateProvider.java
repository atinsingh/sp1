package co.pragra.learning.firstspringproject.business;

import co.pragra.learning.firstspringproject.domain.IRateOfInterest;
import co.pragra.learning.firstspringproject.domain.RateType;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;

public class RateProvider implements IRateOfInterest {
    @Override
    public double getInterestRate(RateType rateType) {
        Path path = Paths.get("src/main/resources/application.properties");
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(path.toFile()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return Double.parseDouble((String) properties.get("rate"));
    }
}
