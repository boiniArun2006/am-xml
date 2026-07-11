package com.facebook.soloader;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Q extends r {
    public static Q rl(String str, Context context, ci[] ciVarArr) {
        StringBuilder sb = new StringBuilder("couldn't find DSO to load: ");
        sb.append(str);
        sb.append("\n\texisting SO sources: ");
        for (int i2 = 0; i2 < ciVarArr.length; i2++) {
            sb.append("\n\t\tSoSource ");
            sb.append(i2);
            sb.append(": ");
            sb.append(ciVarArr[i2].toString());
        }
        if (context != null) {
            sb.append("\n\tNative lib dir: ");
            sb.append(context.getApplicationInfo().nativeLibraryDir);
            sb.append("\n");
        }
        return new Q(str, sb.toString());
    }

    public Q(String str, String str2) {
        super(str, str2);
    }
}
