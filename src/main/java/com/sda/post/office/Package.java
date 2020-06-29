package com.sda.post.office;

import javax.naming.InvalidNameException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Package {
    int numberOfPackage;
    String description;
    PackageStatus status;

    Scanner pob = new Scanner(System.in);

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

    public void method2(String given) {
        for (PackageStatus newStatus : PackageStatus.values()) {
            if (newStatus.toString().equals(valueOf(given))) {
                status = PackageStatus.valueOf(given);
                System.out.println("MATCH!! " + newStatus.toString());
                return;
            }
        }
        for (PackageStatus newStatus2 : PackageStatus.values()) {
            if (!newStatus2.toString().equals(valueOf(given))) {
                System.out.println(("Wrong status name, try again: "));
                String pob2 = pob.nextLine();
                method2(pob2);
                return;
            }
        }
    }
}

