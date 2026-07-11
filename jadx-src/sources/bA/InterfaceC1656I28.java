package bA;

import java.io.Closeable;

/* JADX INFO: renamed from: bA.I28, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface InterfaceC1656I28 extends Closeable, InterfaceC1664qz, Pj0.Ml, hVe.j {
    InterfaceC1664qz EWS();

    boolean F();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();

    eO mYa();
}
