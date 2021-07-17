package com.toluwase.walletapi.models;

public enum Level {
    LEVEL_ONE(10_000d), LEVEL_TWO(50_000d), LEVEL_THREE(9_999_999_999_9999d);
    private Double minTransfer;
    private Double maxTransfer;

    Level( Double maxTransfer) {
        this.minTransfer = 0d;
        this.maxTransfer = maxTransfer;
    }
}
