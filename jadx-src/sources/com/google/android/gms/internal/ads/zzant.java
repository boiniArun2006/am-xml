package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzant {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzant(String str, int i2, String str2, Set set) {
        this.zzb = i2;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzant zzb() {
        return new zzant("", 0, "", Collections.EMPTY_SET);
    }

    public static zzant zza(String str, int i2) {
        String str2;
        String strTrim = str.trim();
        zzgrc.zza(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = zzfj.zza;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i3 = 1; i3 < strArrSplit.length; i3++) {
            hashSet.add(strArrSplit[i3]);
        }
        return new zzant(str4, i2, str2, hashSet);
    }
}
