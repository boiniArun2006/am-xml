package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzxb extends zzvs {
    private static final zzak zza;
    private final zzwm[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;

    @Nullable
    private zzwz zzh;
    private final zzvv zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzA(zzak zzakVar) {
        this.zzb[0].zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        zzwy zzwyVar = (zzwy) zzwiVar;
        int i2 = 0;
        while (true) {
            zzwm[] zzwmVarArr = this.zzb;
            if (i2 >= zzwmVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i2);
            zzwi zzwiVarZza = zzwyVar.zza(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                if (((zzxa) list.get(i3)).zzb().equals(zzwiVarZza)) {
                    list.remove(i3);
                    break;
                }
                i3++;
            }
            zzwmVarArr[i2].zzD(zzwyVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j2) {
        zzbf[] zzbfVarArr = this.zzd;
        zzwm[] zzwmVarArr = this.zzb;
        int length = zzwmVarArr.length;
        zzwi[] zzwiVarArr = new zzwi[length];
        int iZze = zzbfVarArr[0].zze(zzwkVar.zza);
        for (int i2 = 0; i2 < length; i2++) {
            zzwk zzwkVarZza = zzwkVar.zza(zzbfVarArr[i2].zzf(iZze));
            zzwiVarArr[i2] = zzwmVarArr[i2].zzG(zzwkVarZza, zzaanVar, j2 - this.zzg[iZze][i2]);
            ((List) this.zzc.get(i2)).add(new zzxa(zzwkVarZza, zzwiVarArr[i2], null));
        }
        return new zzwy(this.zzi, this.zzg[iZze], zzwiVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzak zzJ() {
        zzwm[] zzwmVarArr = this.zzb;
        return zzwmVarArr.length > 0 ? zzwmVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzwm
    public final void zzt() throws IOException {
        zzwz zzwzVar = this.zzh;
        if (zzwzVar != null) {
            throw zzwzVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    protected final /* bridge */ /* synthetic */ void zzu(Object obj, zzwm zzwmVar, zzbf zzbfVar) {
        int iZzc;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzc = zzbfVar.zzc();
            this.zzf = iZzc;
        } else {
            int iZzc2 = zzbfVar.zzc();
            int i2 = this.zzf;
            if (iZzc2 != i2) {
                this.zzh = new zzwz(0);
                return;
            }
            iZzc = i2;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzc, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzwmVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    @Nullable
    protected final /* bridge */ /* synthetic */ zzwk zzx(Object obj, zzwk zzwkVar) {
        int iIntValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(iIntValue);
        for (int i2 = 0; i2 < list2.size(); i2++) {
            if (((zzxa) list2.get(i2)).zza().equals(zzwkVar)) {
                return ((zzxa) ((List) list.get(0)).get(i2)).zza();
            }
        }
        return null;
    }

    public zzxb(boolean z2, boolean z3, zzvv zzvvVar, zzwm... zzwmVarArr) {
        this.zzb = zzwmVarArr;
        this.zzi = zzvvVar;
        this.zze = new ArrayList(Arrays.asList(zzwmVarArr));
        this.zzc = new ArrayList(zzwmVarArr.length);
        int i2 = 0;
        while (true) {
            int length = zzwmVarArr.length;
            if (i2 < length) {
                this.zzc.add(new ArrayList());
                i2++;
            } else {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgvu.zzb(8).zzb(2).zza();
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzvj
    protected final void zza(@Nullable zzhz zzhzVar) {
        super.zza(zzhzVar);
        int i2 = 0;
        while (true) {
            zzwm[] zzwmVarArr = this.zzb;
            if (i2 < zzwmVarArr.length) {
                zzv(Integer.valueOf(i2), zzwmVarArr[i2]);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzvj
    protected final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }
}
