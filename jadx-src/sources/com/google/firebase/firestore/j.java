package com.google.firebase.firestore;

import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class j implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.protobuf.C f60363n;

    public static j rl(com.google.protobuf.C c2) {
        AbstractC2418c.t(c2, "Provided ByteString must not be null.");
        return new j(c2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.f60363n.equals(((j) obj).f60363n);
    }

    public int hashCode() {
        return this.f60363n.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        return wqP.Z.xMQ(this.f60363n, jVar.f60363n);
    }

    public String toString() {
        return "Blob { bytes=" + wqP.Z.WPU(this.f60363n) + " }";
    }

    private j(com.google.protobuf.C c2) {
        this.f60363n = c2;
    }
}
