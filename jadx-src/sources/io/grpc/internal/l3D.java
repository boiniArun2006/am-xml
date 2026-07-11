package io.grpc.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface l3D extends tI {

    public enum j {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void nr(io.grpc.SPz sPz, j jVar, io.grpc.QJ qj);

    void rl(io.grpc.QJ qj);
}
