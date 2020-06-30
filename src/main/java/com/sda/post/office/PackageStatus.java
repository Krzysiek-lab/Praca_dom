package com.sda.post.office;

public enum PackageStatus {
    SENT("Package was sent", 1000) {
        @Override
        PackageStatus getNextStatuses() {
            return PackageStatus.DELIVERED;
        }
    },
    TRAVELLING("Package is travelling", 2000) {
        @Override
        PackageStatus getNextStatuses() {

            return PackageStatus.TRAVELLING;
        }
    },
    COURIER("Courier has Your Package", 3000) {
        @Override
        PackageStatus getNextStatuses() {

            return PackageStatus.LOST;
        }
    },
    DELIVERED("Package was delivered", 4000) {
        @Override
        PackageStatus getNextStatuses() {

            return null;
        }
    },
    LOST("Package was lost", 5000) {
        @Override
        PackageStatus getNextStatuses() {

            return null;
        }
    },
    RETURNED("Package returned to sender", 6000) {
        @Override
        PackageStatus getNextStatuses() {

            return null;
        }
    };


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

    abstract PackageStatus getNextStatuses();


}
