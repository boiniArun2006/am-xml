package t1;

import com.google.common.base.VerifyException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class g9s {
    public static void n(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new VerifyException(s4.t(str, obj));
        }
    }
}
