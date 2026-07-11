package androidx.media3.decoder;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int i2, String str) {
        super(str);
        this.errorCode = i2;
    }
}
