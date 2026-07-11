package O2;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String[] f7264n;

    public static boolean n(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        yMa.j.O().n("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f7264n == null) {
            f7264n = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f7264n) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
