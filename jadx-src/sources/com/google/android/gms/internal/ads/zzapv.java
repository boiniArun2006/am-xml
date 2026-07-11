package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.extractor.ts.TsExtractor;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzapv implements zzapn {
    final /* synthetic */ zzapx zza;
    private final zzeq zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        zzapx zzapxVar;
        int i2;
        zzeq zzeqVar;
        int i3;
        int i5;
        if (zzerVar.zzs() != 2) {
            return;
        }
        zzapx zzapxVar2 = this.zza;
        zzfg zzfgVar = (zzfg) zzapxVar2.zzh().get(0);
        if ((zzerVar.zzs() & 128) != 0) {
            zzerVar.zzk(1);
            int iZzt = zzerVar.zzt();
            int i7 = 3;
            zzerVar.zzk(3);
            zzeq zzeqVar2 = this.zzb;
            zzerVar.zzl(zzeqVar2, 2);
            zzeqVar2.zzh(3);
            int i8 = 13;
            zzapxVar2.zzq(zzeqVar2.zzj(13));
            zzerVar.zzl(zzeqVar2, 2);
            int i9 = 4;
            zzeqVar2.zzh(4);
            int i10 = 12;
            zzerVar.zzk(zzeqVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzerVar.zzd();
            while (iZzd > 0) {
                int i11 = 5;
                zzerVar.zzl(zzeqVar2, 5);
                int iZzj = zzeqVar2.zzj(8);
                zzeqVar2.zzh(i7);
                int iZzj2 = zzeqVar2.zzj(i8);
                zzeqVar2.zzh(i9);
                int iZzj3 = zzeqVar2.zzj(i10);
                int iZzg = zzerVar.zzg();
                int i12 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i13 = -1;
                int iZzs = 0;
                while (zzerVar.zzg() < i12) {
                    int iZzs2 = zzerVar.zzs();
                    int iZzg2 = zzerVar.zzg() + zzerVar.zzs();
                    if (iZzg2 > i12) {
                        break;
                    }
                    if (iZzs2 == i11) {
                        long jZzz = zzerVar.zzz();
                        if (jZzz != 1094921523) {
                            if (jZzz != 1161904947) {
                                if (jZzz != 1094921524) {
                                    if (jZzz == 1212503619) {
                                        i5 = 36;
                                        zzapxVar = zzapxVar2;
                                        i13 = i5;
                                        i2 = iZzg2;
                                        zzeqVar = zzeqVar2;
                                        i3 = iZzd;
                                    }
                                    zzapxVar = zzapxVar2;
                                    i2 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i3 = iZzd;
                                }
                                zzapxVar = zzapxVar2;
                                i2 = iZzg2;
                                zzeqVar = zzeqVar2;
                                i3 = iZzd;
                                i13 = 172;
                            }
                            zzapxVar = zzapxVar2;
                            zzeqVar = zzeqVar2;
                            i3 = iZzd;
                            i13 = 135;
                            i2 = iZzg2;
                        }
                        zzapxVar = zzapxVar2;
                        i2 = iZzg2;
                        zzeqVar = zzeqVar2;
                        i3 = iZzd;
                        i13 = 129;
                    } else {
                        if (iZzs2 != 106) {
                            if (iZzs2 == 122) {
                                zzapxVar = zzapxVar2;
                                zzeqVar = zzeqVar2;
                                i3 = iZzd;
                                i13 = 135;
                                i2 = iZzg2;
                            } else {
                                if (iZzs2 == 127) {
                                    int iZzs3 = zzerVar.zzs();
                                    if (iZzs3 != 21) {
                                        if (iZzs3 == 14) {
                                            i5 = 136;
                                        } else {
                                            if (iZzs3 == 33) {
                                                i5 = TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                                            }
                                            zzapxVar = zzapxVar2;
                                            i2 = iZzg2;
                                            zzeqVar = zzeqVar2;
                                            i3 = iZzd;
                                        }
                                    }
                                    zzapxVar = zzapxVar2;
                                    i2 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i3 = iZzd;
                                    i13 = 172;
                                } else if (iZzs2 == 123) {
                                    i5 = 138;
                                } else if (iZzs2 == 10) {
                                    String strTrim = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    iZzs = zzerVar.zzs();
                                    zzapxVar = zzapxVar2;
                                    str = strTrim;
                                    i2 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i3 = iZzd;
                                } else if (iZzs2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzerVar.zzg() < iZzg2) {
                                        int i14 = iZzg2;
                                        String strTrim2 = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        int iZzs4 = zzerVar.zzs();
                                        int i15 = iZzd;
                                        byte[] bArr = new byte[4];
                                        zzerVar.zzm(bArr, 0, 4);
                                        arrayList2.add(new zzapy(strTrim2, iZzs4, bArr));
                                        iZzd = i15;
                                        iZzg2 = i14;
                                        zzeqVar2 = zzeqVar2;
                                        zzapxVar2 = zzapxVar2;
                                    }
                                    zzapxVar = zzapxVar2;
                                    i2 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i3 = iZzd;
                                    arrayList = arrayList2;
                                    i13 = 89;
                                } else {
                                    zzapxVar = zzapxVar2;
                                    i2 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i3 = iZzd;
                                    if (iZzs2 == 111) {
                                        i13 = 257;
                                    }
                                }
                                zzapxVar = zzapxVar2;
                                i13 = i5;
                                i2 = iZzg2;
                                zzeqVar = zzeqVar2;
                                i3 = iZzd;
                            }
                        }
                        zzapxVar = zzapxVar2;
                        i2 = iZzg2;
                        zzeqVar = zzeqVar2;
                        i3 = iZzd;
                        i13 = 129;
                    }
                    zzerVar.zzk(i2 - zzerVar.zzg());
                    iZzd = i3;
                    zzeqVar2 = zzeqVar;
                    zzapxVar2 = zzapxVar;
                    i11 = 5;
                }
                zzapx zzapxVar3 = zzapxVar2;
                zzeq zzeqVar3 = zzeqVar2;
                int i16 = iZzd;
                zzerVar.zzh(i12);
                zzapz zzapzVar = new zzapz(i13, str, iZzs, arrayList, Arrays.copyOfRange(zzerVar.zzi(), iZzg, i12));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzapzVar.zza;
                }
                iZzd = i16 - (iZzj3 + 5);
                if (!zzapxVar3.zzk().get(iZzj2)) {
                    zzaqc zzaqcVarZzb = zzapxVar3.zzi().zzb(iZzj, zzapzVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzaqcVarZzb);
                }
                i9 = 4;
                zzeqVar2 = zzeqVar3;
                zzapxVar2 = zzapxVar3;
                i7 = 3;
                i8 = 13;
                i10 = 12;
            }
            zzapx zzapxVar4 = zzapxVar2;
            int size = sparseIntArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                int iKeyAt = sparseIntArray.keyAt(i17);
                int iValueAt = sparseIntArray.valueAt(i17);
                zzapxVar4.zzk().put(iKeyAt, true);
                zzapxVar4.zzl().put(iValueAt, true);
                zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i17);
                if (zzaqcVar != null) {
                    zzaqcVar.zza(zzfgVar, zzapxVar4.zzm(), new zzaqb(iZzt, iKeyAt, 8192));
                    zzapxVar4.zzj().put(iValueAt, zzaqcVar);
                }
            }
            zzapxVar4.zzj().remove(this.zze);
            zzapxVar4.zzo(0);
            if (zzapxVar4.zzn() == 0) {
                zzapxVar4.zzm().zzv();
                zzapxVar4.zzp(true);
            }
        }
    }

    public zzapv(zzapx zzapxVar, int i2) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i2;
    }
}
