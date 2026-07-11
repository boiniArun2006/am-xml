package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int i2, String str) {
        super(str);
        this.errorCode = i2;
    }
}
