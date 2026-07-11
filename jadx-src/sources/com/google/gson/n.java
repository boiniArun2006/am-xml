package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Field f61017n;

    public String toString() {
        return this.f61017n.toString();
    }

    public n(Field field) {
        Objects.requireNonNull(field);
        this.f61017n = field;
    }
}
