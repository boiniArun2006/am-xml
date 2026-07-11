package com.google.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class fg {
    private final Field caseField;
    private final int id;
    private final Field valueField;

    public Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.id;
    }

    public Field getValueField() {
        return this.valueField;
    }

    public fg(int i2, Field field, Field field2) {
        this.id = i2;
        this.caseField = field;
        this.valueField = field2;
    }
}
