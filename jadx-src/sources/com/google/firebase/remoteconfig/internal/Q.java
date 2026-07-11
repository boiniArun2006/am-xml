package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Q implements N67.o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60728n;
    private final int rl;

    private void rl() {
        if (this.f60728n == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // N67.o
    public boolean asBoolean() {
        if (this.rl == 0) {
            return false;
        }
        String strN = n();
        if (Xo.J2.matcher(strN).matches()) {
            return true;
        }
        if (Xo.Uo.matcher(strN).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strN, "boolean"));
    }

    @Override // N67.o
    public double asDouble() {
        if (this.rl == 0) {
            return 0.0d;
        }
        String strN = n();
        try {
            return Double.valueOf(strN).doubleValue();
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strN, "double"), e2);
        }
    }

    @Override // N67.o
    public long asLong() {
        if (this.rl == 0) {
            return 0L;
        }
        String strN = n();
        try {
            return Long.valueOf(strN).longValue();
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strN, "long"), e2);
        }
    }

    @Override // N67.o
    public String asString() {
        if (this.rl == 0) {
            return "";
        }
        rl();
        return this.f60728n;
    }

    @Override // N67.o
    public int getSource() {
        return this.rl;
    }

    Q(String str, int i2) {
        this.f60728n = str;
        this.rl = i2;
    }

    private String n() {
        return asString().trim();
    }
}
