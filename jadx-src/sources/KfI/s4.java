package KfI;

import android.util.Base64;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class s4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s4 f5741n = new s4();
    private static final String nr;
    private static final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f5742t;

    static {
        String strEncodeToString = Base64.encodeToString(StringsKt.encodeToByteArray(C1395c.f5694n.O()), 10);
        rl = strEncodeToString;
        f5742t = "firebase_session_" + strEncodeToString + "_data";
        nr = "firebase_session_" + strEncodeToString + "_settings";
    }

    public final String n() {
        return f5742t;
    }

    public final String rl() {
        return nr;
    }

    private s4() {
    }
}
