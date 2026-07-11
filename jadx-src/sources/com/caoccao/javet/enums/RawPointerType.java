package com.caoccao.javet.enums;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum RawPointerType {
    HeapStatisticsContainer(1),
    HeapSpaceStatisticsContainer(2),
    Invalid(0);

    private final int id;

    public static RawPointerType parse(int i2) {
        return i2 != 1 ? i2 != 2 ? Invalid : HeapSpaceStatisticsContainer : HeapStatisticsContainer;
    }

    public int getId() {
        return this.id;
    }

    RawPointerType(int i2) {
        this.id = i2;
    }
}
