package CbW;

import android.util.Base64;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static /* synthetic */ String J2(byte[] bArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        return nr(bArr, i2);
    }

    public static /* synthetic */ String O(String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        return t(str, i2);
    }

    public static final byte[] n(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = str.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDecode = Base64.decode(bytes, i2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return bArrDecode;
    }

    public static final String nr(byte[] bArr, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        String strEncodeToString = Base64.encodeToString(bArr, i2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static /* synthetic */ byte[] rl(String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        return n(str, i2);
    }

    public static final String t(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Charset charsetForName = Charset.forName(C.UTF8_NAME);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        byte[] bytes = str.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return nr(bytes, i2);
    }
}
