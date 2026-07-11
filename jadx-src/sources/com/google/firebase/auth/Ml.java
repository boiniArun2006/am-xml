package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Ml {
    private static final zzan Uo;
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f60117O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60118n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60119t;

    static {
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        Uo = zzan.zza(map);
    }

    private static String O(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.checkNotEmpty(uri.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String n() {
        return this.rl;
    }

    public final String nr() {
        return this.J2;
    }

    public int rl() {
        zzan zzanVar = Uo;
        if (zzanVar.containsKey(this.f60119t)) {
            return ((Integer) zzanVar.get(this.f60119t)).intValue();
        }
        return 3;
    }

    private Ml(String str) {
        String strO = O(str, "apiKey");
        String strO2 = O(str, "oobCode");
        String strO3 = O(str, "mode");
        if (strO != null && strO2 != null && strO3 != null) {
            this.f60118n = Preconditions.checkNotEmpty(strO);
            this.rl = Preconditions.checkNotEmpty(strO2);
            this.f60119t = Preconditions.checkNotEmpty(strO3);
            this.nr = O(str, "continueUrl");
            this.f60117O = O(str, "lang");
            this.J2 = O(str, "tenantId");
            return;
        }
        throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
    }

    public static Ml t(String str) {
        Preconditions.checkNotEmpty(str);
        try {
            return new Ml(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
