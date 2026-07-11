package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeii {
    private final zzbgd zza;
    private final Context zzb;
    private final zzehn zzc;
    private final VersionInfoParcel zzd;

    public zzeii(Context context, VersionInfoParcel versionInfoParcel, zzbgd zzbgdVar, zzehn zzehnVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbgdVar;
        this.zzc = zzehnVar;
    }

    public final void zza(final boolean z2) {
        try {
            this.zzc.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzeih
                @Override // com.google.android.gms.internal.ads.zzfmu
                public final /* synthetic */ Object zza(Object obj) {
                    this.zza.zzb(z2, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(strValueOf));
        }
    }

    final /* synthetic */ Void zzb(boolean z2, SQLiteDatabase sQLiteDatabase) {
        if (z2) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbgj.zzaf.zza.zzk(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzicg e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e2.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbgj.zzaf.zzc zzcVarZzB = zzbgj.zzaf.zzB();
            zzcVarZzB.zzB(context.getPackageName());
            zzcVarZzB.zzH(Build.MODEL);
            zzcVarZzB.zzo(zzeic.zzc(sQLiteDatabase, 0));
            zzcVarZzB.zzj(arrayList);
            zzcVarZzB.zzs(zzeic.zzc(sQLiteDatabase, 1));
            zzcVarZzB.zzQ(zzeic.zzc(sQLiteDatabase, 3));
            zzcVarZzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzcVarZzB.zzM(zzeic.zzd(sQLiteDatabase, 2));
            final zzbgj.zzaf zzafVarZzbu = zzcVarZzB.zzbu();
            int size = arrayList.size();
            long jZzb = 0;
            for (int i3 = 0; i3 < size; i3++) {
                zzbgj.zzaf.zza zzaVar = (zzbgj.zzaf.zza) arrayList.get(i3);
                if (zzaVar.zzf() == zzbgj.zzq.ENUM_TRUE && zzaVar.zzb() > jZzb) {
                    jZzb = zzaVar.zzb();
                }
            }
            if (jZzb != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jZzb));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbgd zzbgdVar = this.zza;
            zzbgdVar.zzb(new zzbgc() { // from class: com.google.android.gms.internal.ads.zzeif
                @Override // com.google.android.gms.internal.ads.zzbgc
                public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzafVarZzbu);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbgj.zzar.zza zzaVarZzs = zzbgj.zzar.zzs();
            zzaVarZzs.zzc(versionInfoParcel.buddyApkVersion);
            zzaVarZzs.zzg(versionInfoParcel.clientJarVersion);
            zzaVarZzs.zzk(true == versionInfoParcel.isClientJar ? 0 : 2);
            final zzbgj.zzar zzarVarZzbu = zzaVarZzs.zzbu();
            zzbgdVar.zzb(new zzbgc() { // from class: com.google.android.gms.internal.ads.zzeig
                @Override // com.google.android.gms.internal.ads.zzbgc
                public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar2) {
                    zzbgj.zzm.zza zzaVarZzcc = zzaVar2.zzG().zzcc();
                    zzaVarZzcc.zzs(zzarVarZzbu);
                    zzaVar2.zzI(zzaVarZzcc);
                }
            });
            zzbgdVar.zzc(10004);
            zzeic.zzb(sQLiteDatabase);
        }
        return null;
    }
}
