package com.sda.post.office;

public enum PackageStatus {
    SENT("Package was sent", 1000),
    TRAVELLING("Package is travelling", 2000),
    COURIER("Courier has Your Package", 3000),
    DELIVERED("Package was delivered", 4000),
    LOST("Package was lost", 5000),
    RETURNED("Package returned to sender", 6000);


    final String status;
    final int code;

    PackageStatus(String status, int code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }


}
