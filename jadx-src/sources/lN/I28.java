package lN;

import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f70414n = new I28();

    public static final String n(Ml key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return f70414n.t(key);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final List rl(Ml key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(key.rl() ? key.n() : f70414n.t(key));
            return arrayList;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    private I28() {
    }

    private final String t(Ml ml) {
        String strN = ml.n();
        Intrinsics.checkNotNullExpressionValue(strN, "getUriString(...)");
        Charset charsetForName = Charset.forName(C.UTF8_NAME);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        byte[] bytes = strN.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strN2 = vn.n.n(bytes);
        Intrinsics.checkNotNullExpressionValue(strN2, "makeSHA1HashBase64(...)");
        return strN2;
    }
}
