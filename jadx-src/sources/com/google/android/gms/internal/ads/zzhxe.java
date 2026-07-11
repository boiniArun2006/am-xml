package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhxe {
    public static final zzhxe zza = new zzhxe(new zzhxf());
    public static final zzhxe zzb = new zzhxe(new zzhxj());
    public static final zzhxe zzc = new zzhxe(new zzhxl());
    public static final zzhxe zzd = new zzhxe(new zzhxk());
    public static final zzhxe zze;
    public static final zzhxe zzf;
    private final zzhxd zzg;

    static {
        new zzhxe(new zzhxg());
        zze = new zzhxe(new zzhxi());
        zzf = new zzhxe(new zzhxh());
    }

    public static List zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zzb(String str) throws GeneralSecurityException {
        return this.zzg.zza(str);
    }

    public zzhxe(zzhxm zzhxmVar) {
        zzhxd zzhxcVar;
        if (!zzhie.zza()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                zzhxcVar = new zzhxa(zzhxmVar, null);
            } else {
                zzhxcVar = new zzhxb(zzhxmVar, null);
            }
        } else {
            zzhxcVar = new zzhxc(zzhxmVar, null);
        }
        this.zzg = zzhxcVar;
    }
}
