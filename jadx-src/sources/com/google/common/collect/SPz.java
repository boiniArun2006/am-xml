package com.google.common.collect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class SPz extends Q implements psW {
    protected abstract psW KN();

    @Override // java.util.Collection, com.google.common.collect.psW
    public boolean equals(Object obj) {
        return obj == this || KN().equals(obj);
    }

    protected SPz() {
    }

    @Override // com.google.common.collect.psW
    public int M(Object obj, int i2) {
        return KN().M(obj, i2);
    }

    @Override // com.google.common.collect.psW
    public int count(Object obj) {
        return KN().count(obj);
    }

    @Override // com.google.common.collect.psW
    public int eF(Object obj, int i2) {
        return KN().eF(obj, i2);
    }

    @Override // java.util.Collection, com.google.common.collect.psW
    public int hashCode() {
        return KN().hashCode();
    }

    @Override // com.google.common.collect.psW
    public boolean z(Object obj, int i2, int i3) {
        return KN().z(obj, i2, i3);
    }
}
