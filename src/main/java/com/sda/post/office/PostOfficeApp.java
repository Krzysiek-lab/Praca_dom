package com.sda.post.office;

import javax.naming.InvalidNameException;
import java.util.Arrays;

public class PostOfficeApp {
    public static void main(String[] args) {
        Package inst1 = new Package();
        System.out.println("Package " + inst1.description + " with number " + inst1.numberOfPackage + " was " + inst1.status);
        inst1.ChangeStatus(PackageStatus.DELIVERED);
        System.out.println("Package " + inst1.description + " with number " + inst1.numberOfPackage + " is being " + inst1.status);
        System.out.println(PackageStatus.SENT.getStatus());
        System.out.println(PackageStatus.SENT.getCode());
        System.out.println(PackageStatus.SENT.toString());
        System.out.println(inst1.toString());
        Package inst3 = new Package();
        System.out.println(Arrays.toString(PackageStatus.values()));
        try {
            inst3.method2("TRAVELLING");
        } catch (InvalidNameException exception) {
            System.out.println("Exception caught");
        }
        System.out.println(inst3.status);
        System.out.println();

    }
}
