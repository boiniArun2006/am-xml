package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.firebase.auth.Dsr;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f60166n = new Logger("GetTokenResultFactory", new String[0]);

    public static Dsr n(String str) {
        Map map;
        try {
            map = Ml.rl(str);
        } catch (zzaag e2) {
            f60166n.e("Error parsing token claims", e2, new Object[0]);
            map = new HashMap();
        }
        return new Dsr(str, map);
    }
}
