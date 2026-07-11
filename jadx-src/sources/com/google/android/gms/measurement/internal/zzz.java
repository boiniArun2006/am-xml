package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzz {
    final /* synthetic */ zzad zza;
    private com.google.android.gms.internal.measurement.zzhs zzb;
    private Long zzc;
    private long zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d1  */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.android.gms.internal.measurement.zzhs zza(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strZzd = zzhsVar.zzd();
        List listZza = zzhsVar.zza();
        zzad zzadVar = this.zza;
        zzpf zzpfVar = zzadVar.zzg;
        zzpfVar.zzp();
        Long l2 = (Long) zzpj.zzI(zzhsVar, "_eid");
        if (l2 != null) {
            if (strZzd.equals("_ep")) {
                Preconditions.checkNotNull(l2);
                zzpfVar.zzp();
                String str2 = (String) zzpj.zzI(zzhsVar, "_en");
                ?? r7 = 0;
                if (TextUtils.isEmpty(str2)) {
                    zzadVar.zzu.zzaV().zzc().zzb("Extra parameter without an event name. eventId", l2);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l2.longValue() != this.zzc.longValue()) {
                    zzav zzavVarZzj = zzpfVar.zzj();
                    zzavVarZzj.zzg();
                    zzavVarZzj.zzay();
                    try {
                        try {
                            cursorRawQuery = zzavVarZzj.zze().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l2.toString()});
                            try {
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzavVarZzj.zzu.zzaV().zzb().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzu.zzaV().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l2);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r7 = zzpfVar;
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r7 != 0) {
                        }
                        throw th;
                    }
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorRawQuery.getBlob(0))).zzbc(), Long.valueOf(cursorRawQuery.getLong(1)));
                            cursorRawQuery.close();
                        } catch (IOException e4) {
                            zzavVarZzj.zzu.zzaV().zzb().zzd("Failed to merge main event. appId, eventId", zzgt.zzl(str), l2, e4);
                            cursorRawQuery.close();
                            pairCreate = null;
                        }
                        if (pairCreate != null || (obj = pairCreate.first) == null) {
                            this.zza.zzu.zzaV().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l2);
                            return null;
                        }
                        this.zzb = (com.google.android.gms.internal.measurement.zzhs) obj;
                        this.zzd = ((Long) pairCreate.second).longValue();
                        this.zza.zzg.zzp();
                        this.zzc = (Long) zzpj.zzI(this.zzb, "_eid");
                    } else {
                        zzavVarZzj.zzu.zzaV().zzk().zza("Main event not found");
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.zza.zzu.zzaV().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l2);
                    return null;
                }
                long j2 = this.zzd - 1;
                this.zzd = j2;
                if (j2 <= 0) {
                    zzav zzavVarZzj2 = this.zza.zzg.zzj();
                    zzavVarZzj2.zzg();
                    zzavVarZzj2.zzu.zzaV().zzk().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzavVarZzj2.zze().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e5) {
                        zzavVarZzj2.zzu.zzaV().zzb().zzb("Error clearing complex main event", e5);
                    }
                } else {
                    this.zza.zzg.zzj().zzV(str, l2, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : this.zzb.zza()) {
                    this.zza.zzg.zzp();
                    if (zzpj.zzF(zzhsVar, zzhwVar.zzb()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzu.zzaV().zzc().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZza);
                    listZza = arrayList;
                }
                strZzd = str2;
            } else {
                this.zzc = l2;
                this.zzb = zzhsVar;
                zzpfVar.zzp();
                long jLongValue = ((Long) zzpj.zzJ(zzhsVar, "_epc", 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    zzadVar.zzu.zzaV().zzc().zzb("Complex event with zero extra param count. eventName", strZzd);
                } else {
                    zzpfVar.zzj().zzV(str, (Long) Preconditions.checkNotNull(l2), this.zzd, zzhsVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar.zzcl();
        zzhrVar.zzl(strZzd);
        zzhrVar.zzi();
        zzhrVar.zzh(listZza);
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc();
    }

    /* synthetic */ zzz(zzad zzadVar, byte[] bArr) {
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
    }
}
