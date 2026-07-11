package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzwy implements zzwi, zzwh {
    private final zzwi[] zza;
    private final boolean[] zzb;

    @Nullable
    private zzwh zzf;

    @Nullable
    private zzyn zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzye zzi = new zzvu(zzguf.zzi(), zzguf.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzwi[] zzh = new zzwi[0];

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() throws IOException {
        int i2 = 0;
        while (true) {
            zzwi[] zzwiVarArr = this.zza;
            if (i2 >= zzwiVarArr.length) {
                return;
            }
            zzwiVarArr[i2].zzc();
            i2++;
        }
    }

    public final zzwi zza(int i2) {
        return this.zzb[i2] ? ((zzyk) this.zza[i2]).zza() : this.zza[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j2) {
        this.zzf = zzwhVar;
        ArrayList arrayList = this.zzd;
        zzwi[] zzwiVarArr = this.zza;
        Collections.addAll(arrayList, zzwiVarArr);
        for (zzwi zzwiVar : zzwiVarArr) {
            zzwiVar.zzb(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzyn zzynVar = this.zzg;
        zzynVar.getClass();
        return zzynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j2) {
        int length;
        int[] iArr;
        int length2 = zzaacVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = zzaacVarArr.length;
            if (i3 >= length) {
                break;
            }
            zzyc zzycVar = zzycVarArr[i3];
            Integer num = zzycVar == null ? null : (Integer) this.zzc.get(zzycVar);
            iArr2[i3] = num == null ? -1 : num.intValue();
            zzaac zzaacVar = zzaacVarArr[i3];
            if (zzaacVar != null) {
                String str = zzaacVar.zza().zzb;
                iArr3[i3] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i3] = -1;
            }
            i3++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzwi[] zzwiVarArr = this.zza;
        zzyc[] zzycVarArr2 = new zzyc[length];
        zzyc[] zzycVarArr3 = new zzyc[length];
        zzaac[] zzaacVarArr2 = new zzaac[length];
        ArrayList arrayList = new ArrayList(zzwiVarArr.length);
        long j3 = j2;
        int i5 = 0;
        while (i5 < zzwiVarArr.length) {
            int i7 = i2;
            while (i7 < zzaacVarArr.length) {
                zzycVarArr3[i7] = iArr2[i7] == i5 ? zzycVarArr[i7] : null;
                if (iArr3[i7] == i5) {
                    zzaac zzaacVar2 = zzaacVarArr[i7];
                    zzaacVar2.getClass();
                    iArr = iArr3;
                    zzbg zzbgVar = (zzbg) this.zze.get(zzaacVar2.zza());
                    zzbgVar.getClass();
                    zzaacVarArr2[i7] = new zzwx(zzaacVar2, zzbgVar);
                } else {
                    iArr = iArr3;
                    zzaacVarArr2[i7] = null;
                }
                i7++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i8 = i5;
            long jZze = zzwiVarArr[i5].zze(zzaacVarArr2, zArr, zzycVarArr3, zArr2, j3);
            if (i8 == 0) {
                j3 = jZze;
            } else if (jZze != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i9 = 0; i9 < zzaacVarArr.length; i9++) {
                if (iArr4[i9] == i8) {
                    zzyc zzycVar2 = zzycVarArr3[i9];
                    zzycVar2.getClass();
                    zzycVarArr2[i9] = zzycVar2;
                    identityHashMap.put(zzycVar2, Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr2[i9] == i8) {
                    zzgrc.zzi(zzycVarArr3[i9] == null);
                }
            }
            if (z2) {
                arrayList2.add(zzwiVarArr[i8]);
            }
            i5 = i8 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i2 = 0;
        }
        int i10 = i2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzycVarArr2, i10, zzycVarArr, i10, length);
        this.zzh = (zzwi[]) arrayList3.toArray(new zzwi[i10]);
        this.zzi = new zzvu(arrayList3, zzgvf.zzc(arrayList3, zzww.zza));
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j2, boolean z2) {
        for (zzwi zzwiVar : this.zzh) {
            zzwiVar.zzf(j2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
        this.zzi.zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        long j2 = -9223372036854775807L;
        for (zzwi zzwiVar : this.zzh) {
            long jZzh = zzwiVar.zzh();
            if (jZzh == -9223372036854775807L) {
                if (j2 != -9223372036854775807L && zzwiVar.zzj(j2) != j2) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j2 == -9223372036854775807L) {
                for (zzwi zzwiVar2 : this.zzh) {
                    if (zzwiVar2 == zzwiVar) {
                        break;
                    }
                    if (zzwiVar2.zzj(jZzh) != jZzh) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j2 = jZzh;
            } else if (jZzh != j2) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j2) {
        long jZzj = this.zzh[0].zzj(j2);
        int i2 = 1;
        while (true) {
            zzwi[] zzwiVarArr = this.zzh;
            if (i2 >= zzwiVarArr.length) {
                return jZzj;
            }
            if (zzwiVarArr[i2].zzj(jZzj) != jZzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j2, zzmt zzmtVar) {
        zzwi[] zzwiVarArr = this.zzh;
        return (zzwiVarArr.length > 0 ? zzwiVarArr[0] : this.zza[0]).zzk(j2, zzmtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzllVar);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzwi) arrayList.get(i2)).zzm(zzllVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzwiVar);
        if (arrayList.isEmpty()) {
            zzwi[] zzwiVarArr = this.zza;
            int i2 = 0;
            for (zzwi zzwiVar2 : zzwiVarArr) {
                i2 += zzwiVar2.zzd().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i2];
            int i3 = 0;
            for (int i5 = 0; i5 < zzwiVarArr.length; i5++) {
                zzyn zzynVarZzd = zzwiVarArr[i5].zzd();
                int i7 = zzynVarZzd.zzb;
                int i8 = 0;
                while (i8 < i7) {
                    zzbg zzbgVarZza = zzynVarZzd.zza(i8);
                    int i9 = zzbgVarZza.zza;
                    zzv[] zzvVarArr = new zzv[i9];
                    int i10 = 0;
                    while (i10 < i9) {
                        zzv zzvVarZza = zzbgVarZza.zza(i10);
                        zzt zztVarZza = zzvVarZza.zza();
                        String str = zzvVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 1 + str.length());
                        sb.append(i5);
                        sb.append(":");
                        sb.append(str);
                        zztVarZza.zza(sb.toString());
                        zzvVarArr[i10] = zztVarZza.zzM();
                        i10++;
                        zzwiVarArr = zzwiVarArr;
                    }
                    zzwi[] zzwiVarArr2 = zzwiVarArr;
                    String str2 = zzbgVarZza.zzb;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 1 + String.valueOf(str2).length());
                    sb2.append(i5);
                    sb2.append(":");
                    sb2.append(str2);
                    zzbg zzbgVar = new zzbg(sb2.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zzbgVarZza);
                    zzbgVarArr[i3] = zzbgVar;
                    i8++;
                    i3++;
                    zzwiVarArr = zzwiVarArr2;
                }
            }
            this.zzg = new zzyn(zzbgVarArr);
            zzwh zzwhVar = this.zzf;
            zzwhVar.getClass();
            zzwhVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzf;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    public zzwy(zzvv zzvvVar, long[] jArr, zzwi... zzwiVarArr) {
        this.zza = zzwiVarArr;
        this.zzb = new boolean[zzwiVarArr.length];
        for (int i2 = 0; i2 < zzwiVarArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                this.zzb[i2] = true;
                this.zza[i2] = new zzyk(zzwiVarArr[i2], j2);
            }
        }
    }
}
