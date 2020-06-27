package com.sda.post.office;

import javax.naming.InvalidNameException;
import java.util.Arrays;

import static java.lang.String.valueOf;

public class Package {
    int numberOfPackage;
    String description;
    PackageStatus status;

    public Package() {
        numberOfPackage = (int) (Math.random() * 1000);
        description = "Potato";
        status = PackageStatus.SENT;
    }

    public void ChangeStatus(PackageStatus changed) {
        status = changed;
    }

    @Override
    public String toString() {
        return status.toString();
    }

    public void method2(String given) throws InvalidNameException {
        for (PackageStatus newStatus : PackageStatus.values()) {
            if (newStatus.toString().equals(valueOf(given))) {
                System.out.println("MATCH!!");
                status = PackageStatus.valueOf(given);
            }
        }
        {
            throw new InvalidNameException("Wrong status name");
        }

    }
}
