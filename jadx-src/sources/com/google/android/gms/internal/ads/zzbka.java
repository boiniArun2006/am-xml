package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbka extends zzbkk {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final String zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final List zzc() {
        return this.zzf;
    }

    public final List zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzg;
    }

    public final int zzf() {
        return this.zzh;
    }

    public final int zzg() {
        return this.zzi;
    }

    public final int zzh() {
        return this.zzj;
    }

    public final int zzi() {
        return this.zzk;
    }

    static {
        int iRgb = Color.rgb(12, 174, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE);
        zzc = iRgb;
        zza = Color.rgb(204, 204, 204);
        zzb = iRgb;
    }

    public zzbka(String str, List list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z2) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.zzd = str;
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzbkd zzbkdVar = (zzbkd) list.get(i5);
            this.zze.add(zzbkdVar);
            this.zzf.add(zzbkdVar);
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = zza;
        }
        this.zzg = iIntValue;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = zzb;
        }
        this.zzh = iIntValue2;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 12;
        }
        this.zzi = iIntValue3;
        this.zzj = i2;
        this.zzk = i3;
    }
}
