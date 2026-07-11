package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62368b = "PrefetchVastAdTagUri";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62369c = "\\[[\\s\\S].*?\\]";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f62370d;

    public f(String str) {
        super(str);
        String[] strArrA = a(str);
        this.f62370d = strArrA;
        Logger.d(f62368b, "Prefetch URI, unique parts: ", Arrays.toString(strArrA));
    }

    private String[] a(String str) {
        if (str != null) {
            return str.split(f62369c);
        }
        return new String[0];
    }

    private boolean b(String str) {
        for (String str2 : this.f62370d) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf < 0) {
                return a(str2, str);
            }
            str = str.substring(iIndexOf + str2.length());
        }
        return true;
    }

    private static boolean a(String str, String str2) {
        int iIndexOf = str2.indexOf(38);
        if (iIndexOf > 0) {
            str2 = str2.substring(iIndexOf);
        }
        if (!str.contains(str2)) {
            return false;
        }
        Logger.d(f62368b, "Prefetch URI, VastAdTagUri in the prefetch has a tail that is not included in the loaded URL");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.i
    public boolean equals(Object obj) {
        return b(obj.toString());
    }
}
