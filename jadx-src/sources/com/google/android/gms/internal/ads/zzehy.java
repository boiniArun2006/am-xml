package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbgj;
import com.vungle.ads.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzehy implements zzgzl {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzehz zzb;

    zzehy(zzehz zzehzVar, boolean z2) {
        this.zza = z2;
        Objects.requireNonNull(zzehzVar);
        this.zzb = zzehzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> listUnmodifiableList;
        List listAsList;
        byte b2;
        zzehz zzehzVar = this.zzb;
        zzdah zzdahVar = (zzdah) obj;
        if (zzehzVar.zzf()) {
            return;
        }
        Bundle bundle = zzdahVar.zza;
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            listAsList = (List) obj2;
        } else {
            if (!(obj2 instanceof String[])) {
                listUnmodifiableList = Collections.EMPTY_LIST;
                final ArrayList arrayList = new ArrayList();
                for (String str : listUnmodifiableList) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            b2 = str.equals("banner") ? (byte) 0 : (byte) -1;
                            break;
                        case -1052618729:
                            if (str.equals("native")) {
                                b2 = 2;
                                break;
                            }
                            break;
                        case -239580146:
                            if (str.equals(Constants.PLACEMENT_TYPE_REWARDED)) {
                                b2 = 3;
                                break;
                            }
                            break;
                        case 604727084:
                            if (str.equals(Constants.PLACEMENT_TYPE_INTERSTITIAL)) {
                                b2 = 1;
                                break;
                            }
                            break;
                    }
                    arrayList.add(b2 != 0 ? b2 != 1 ? b2 != 2 ? b2 != 3 ? zzbgj.zzd.zza.zza : zzbgj.zzd.zza.REWARD_BASED_VIDEO_AD : zzbgj.zzd.zza.NATIVE_APP_INSTALL : zzbgj.zzd.zza.INTERSTITIAL : zzbgj.zzd.zza.BANNER);
                }
                final zzbgj.zzaf.zzd zzdVarZze = zzehz.zze(bundle);
                final zzbgj.zzab zzabVarZzb = zzehzVar.zzb(bundle);
                final boolean z2 = this.zza;
                zzehzVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehx
                    @Override // com.google.android.gms.internal.ads.zzfmu
                    public final /* synthetic */ Object zza(Object obj3) {
                        zzehz zzehzVar2 = this.zza.zzb;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzehzVar2.zzf()) {
                            return null;
                        }
                        zzbgj.zzaf.zzd zzdVar = zzdVarZze;
                        zzbgj.zzab zzabVar = zzabVarZzb;
                        ArrayList arrayList2 = arrayList;
                        boolean z3 = z2;
                        byte[] bArrZzc = zzehzVar2.zzc(z3, arrayList2, zzabVar, zzdVar);
                        zzeic.zzf(sQLiteDatabase, z3, true);
                        zzeic.zze(sQLiteDatabase, zzehzVar2.zzd().zzb(), bArrZzc);
                        return null;
                    }
                });
            }
            listAsList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        final zzbgj.zzaf.zzd zzdVarZze2 = zzehz.zze(bundle);
        final zzbgj.zzab zzabVarZzb2 = zzehzVar.zzb(bundle);
        final boolean z22 = this.zza;
        zzehzVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj32) {
                zzehz zzehzVar2 = this.zza.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzehzVar2.zzf()) {
                    return null;
                }
                zzbgj.zzaf.zzd zzdVar = zzdVarZze2;
                zzbgj.zzab zzabVar = zzabVarZzb2;
                ArrayList arrayList22 = arrayList3;
                boolean z3 = z22;
                byte[] bArrZzc = zzehzVar2.zzc(z3, arrayList22, zzabVar, zzdVar);
                zzeic.zzf(sQLiteDatabase, z3, true);
                zzeic.zze(sQLiteDatabase, zzehzVar2.zzd().zzb(), bArrZzc);
                return null;
            }
        });
    }
}
