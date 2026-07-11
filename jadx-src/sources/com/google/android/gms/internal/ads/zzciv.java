package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzciv extends zzhq {
    public zzciv(int i2, Map map, zzhf zzhfVar, int i3) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("Response code: ");
        sb.append(i2);
        super(sb.toString(), zzhfVar, 2000, i3);
    }
}
