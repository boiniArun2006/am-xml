package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class f1 {
    public static String a(String str, HashMap map) {
        StringBuilder sb = new StringBuilder(str);
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(z2 ? "?" : "&");
            sb.append((String) entry.getKey());
            sb.append(com.safedk.android.analytics.brandsafety.l.ae);
            sb.append(Uri.encode((String) entry.getValue()));
            z2 = false;
        }
        return sb.toString();
    }
}
