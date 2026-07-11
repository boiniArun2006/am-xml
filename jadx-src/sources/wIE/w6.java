package wIE;

import java.io.UnsupportedEncodingException;
import okio.ByteString;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {
    public static String n(String str, String str2) {
        try {
            return "Basic " + ByteString.of((str + ":" + str2).getBytes(com.google.android.exoplayer2.C.ISO88591_NAME)).base64();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
