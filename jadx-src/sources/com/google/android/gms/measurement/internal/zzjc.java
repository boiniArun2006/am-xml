package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzjc extends zzfz {
    private final zzpf zza;
    private Boolean zzb;
    private String zzc;

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzA(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new zzie(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzB(zzr zzrVar, final zzon zzonVar, final zzgg zzggVar) {
        zzN(zzrVar, false);
        final String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzI(str, zzonVar, zzggVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzC(final zzr zzrVar, final zzaf zzafVar) {
        zzN(zzrVar, false);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(zzrVar, zzafVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzD(final zzr zzrVar, final Bundle bundle, final zzgd zzgdVar) {
        zzN(zzrVar, false);
        final String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzix
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH(zzrVar, bundle, zzgdVar, str);
            }
        });
    }

    final /* synthetic */ zzpf zzL() {
        return this.zza;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzg(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new zzid(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzi(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new zzim(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final List zzj(zzr zzrVar, boolean z2) {
        zzN(zzrVar, false);
        String str = zzrVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzpm> list = (List) this.zza.zzaW().zzh(new zzic(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpm zzpmVar : list) {
                if (z2 || !zzpo.zzZ(zzpmVar.zzc)) {
                    arrayList.add(new zzpk(zzpmVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.zza.zzaV().zzb().zzc("Failed to get user properties. appId", zzgt.zzl(zzrVar.zza), e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.zza.zzaV().zzb().zzc("Failed to get user properties. appId", zzgt.zzl(zzrVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final String zzm(zzr zzrVar) {
        zzN(zzrVar, false);
        return this.zza.zzao(zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final List zzp(String str, String str2, boolean z2, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzpm> list = (List) this.zza.zzaW().zzh(new zzii(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpm zzpmVar : list) {
                if (z2 || !zzpo.zzZ(zzpmVar.zzc)) {
                    arrayList.add(new zzpk(zzpmVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.zza.zzaV().zzb().zzc("Failed to query user properties. appId", zzgt.zzl(zzrVar.zza), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e3) {
            e = e3;
            this.zza.zzaV().zzb().zzc("Failed to query user properties. appId", zzgt.zzl(zzrVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final List zzq(String str, String str2, String str3, boolean z2) {
        zzO(str, true);
        try {
            List<zzpm> list = (List) this.zza.zzaW().zzh(new zzij(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpm zzpmVar : list) {
                if (z2 || !zzpo.zzZ(zzpmVar.zzc)) {
                    arrayList.add(new zzpk(zzpmVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.zza.zzaV().zzb().zzc("Failed to get user properties as. appId", zzgt.zzl(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e3) {
            e = e3;
            this.zza.zzaV().zzb().zzc("Failed to get user properties as. appId", zzgt.zzl(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final List zzr(String str, String str2, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaW().zzh(new zzik(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties", e2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final List zzs(String str, String str2, String str3) {
        zzO(str, true);
        try {
            return (List) this.zza.zzaW().zzh(new zzil(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties as", e2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzu(final Bundle bundle, final zzr zzrVar) {
        zzN(zzrVar, false);
        final String str = zzrVar.zza;
        Preconditions.checkNotNull(str);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK(bundle, str, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final zzao zzw(zzr zzrVar) {
        zzN(zzrVar, false);
        Preconditions.checkNotEmpty(zzrVar.zza);
        try {
            return (zzao) this.zza.zzaW().zzi(new zzip(this, zzrVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.zza.zzaV().zzb().zzc("Failed to get consent. appId", zzgt.zzl(zzrVar.zza), e2);
            return new zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final List zzx(zzr zzrVar, Bundle bundle) {
        zzN(zzrVar, false);
        Preconditions.checkNotNull(zzrVar.zza);
        zzpf zzpfVar = this.zza;
        if (!zzpfVar.zzd().zzp(null, zzfx.zzaY)) {
            try {
                return (List) this.zza.zzaW().zzh(new zziv(this, zzrVar, bundle)).get();
            } catch (InterruptedException | ExecutionException e2) {
                this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", zzgt.zzl(zzrVar.zza), e2);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) zzpfVar.zzaW().zzi(new zziu(this, zzrVar, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", zzgt.zzl(zzrVar.zza), e3);
            return Collections.EMPTY_LIST;
        }
    }

    private final void zzM(zzbg zzbgVar, zzr zzrVar) {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzF(zzbgVar, zzrVar);
    }

    final /* synthetic */ void zzF(zzr zzrVar) {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzv(zzrVar);
    }

    final /* synthetic */ void zzG(zzr zzrVar) {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzw(zzrVar);
    }

    final /* synthetic */ void zzH(zzr zzrVar, Bundle bundle, zzgd zzgdVar, String str) {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        try {
            zzgdVar.zze(zzpfVar.zzap(zzrVar, bundle));
        } catch (RemoteException e2) {
            this.zza.zzaV().zzb().zzc("Failed to return trigger URIs for app", str, e2);
        }
    }

    final /* synthetic */ void zzI(String str, zzon zzonVar, zzgg zzggVar) {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzaW().zzg();
        zzpfVar.zzu();
        List<zzpi> listZzC = zzpfVar.zzj().zzC(str, zzonVar, ((Integer) zzfx.zzA.zzb(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (zzpi zzpiVar : listZzC) {
            if (zzpfVar.zzO(str, zzpiVar.zze())) {
                int iZzi = zzpiVar.zzi();
                if (iZzi > 0) {
                    if (iZzi <= ((Integer) zzfx.zzy.zzb(null)).intValue()) {
                        if (zzpfVar.zzaZ().currentTimeMillis() >= zzpiVar.zzh() + Math.min(((Long) zzfx.zzw.zzb(null)).longValue() * (1 << (iZzi - 1)), ((Long) zzfx.zzx.zzb(null)).longValue())) {
                        }
                    }
                    zzpfVar.zzaV().zzk().zzd("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(zzpiVar.zzc()), Long.valueOf(zzpiVar.zzh()));
                }
                zzol zzolVarZzb = zzpiVar.zzb();
                try {
                    com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpj.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), zzolVarZzb.zzb);
                    for (int i2 = 0; i2 < zzhzVar.zzb(); i2++) {
                        com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) zzhzVar.zzc(i2).zzcl();
                        zzicVar.zzs(zzpfVar.zzaZ().currentTimeMillis());
                        zzhzVar.zzd(i2, zzicVar);
                    }
                    zzolVarZzb.zzb = ((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc();
                    if (Log.isLoggable(zzpfVar.zzaV().zzn(), 2)) {
                        zzolVarZzb.zzg = zzpfVar.zzp().zzi((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc());
                    }
                    arrayList.add(zzolVarZzb);
                } catch (com.google.android.gms.internal.measurement.zzmq unused) {
                    zzpfVar.zzaV().zze().zzb("Failed to parse queued batch. appId", str);
                }
            } else {
                zzpfVar.zzaV().zzk().zzd("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(zzpiVar.zzc()), zzpiVar.zze());
            }
        }
        zzop zzopVar = new zzop(arrayList);
        try {
            zzggVar.zze(zzopVar);
            this.zza.zzaV().zzk().zzc("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(zzopVar.zza.size()));
        } catch (RemoteException e2) {
            this.zza.zzaV().zzb().zzc("[sgtm] Failed to return upload batches for app", str, e2);
        }
    }

    final /* synthetic */ void zzJ(zzr zzrVar, zzaf zzafVar) {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzaq((String) Preconditions.checkNotNull(zzrVar.zza), zzafVar);
    }

    final /* synthetic */ void zzK(Bundle bundle, String str, zzr zzrVar) {
        zzpf zzpfVar = this.zza;
        boolean zZzp = zzpfVar.zzd().zzp(null, zzfx.zzaV);
        if (bundle.isEmpty() && zZzp) {
            zzav zzavVarZzj = this.zza.zzj();
            zzavVarZzj.zzg();
            zzavVarZzj.zzay();
            try {
                zzavVarZzj.zze().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e2) {
                zzavVarZzj.zzu.zzaV().zzb().zzb("Error clearing default event params", e2);
                return;
            }
        }
        zzav zzavVarZzj2 = zzpfVar.zzj();
        zzavVarZzj2.zzg();
        zzavVarZzj2.zzay();
        byte[] bArrZzcc = zzavVarZzj2.zzg.zzp().zzh(new zzbb(zzavVarZzj2.zzu, "", str, "dep", 0L, 0L, bundle)).zzcc();
        zzib zzibVar = zzavVarZzj2.zzu;
        zzibVar.zzaV().zzk().zzc("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrZzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzcc);
        try {
            if (zzavVarZzj2.zze().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzibVar.zzaV().zzb().zzb("Failed to insert default event parameters (got -1). appId", zzgt.zzl(str));
            }
        } catch (SQLiteException e3) {
            zzavVarZzj2.zzu.zzaV().zzb().zzc("Error storing default event parameters. appId", zzgt.zzl(str), e3);
        }
        zzpf zzpfVar2 = this.zza;
        zzav zzavVarZzj3 = zzpfVar2.zzj();
        long j2 = zzrVar.zzD;
        if (zzavVarZzj3.zzX(str, j2)) {
            zzpfVar2.zzj().zzY(str, Long.valueOf(j2), null, bundle);
        }
    }

    final void zzb(zzbg zzbgVar, zzr zzrVar) {
        zzpf zzpfVar = this.zza;
        zzhs zzhsVarZzh = zzpfVar.zzh();
        String str = zzrVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzc) zzhsVarZzh.zzd.get(str);
        if (zzcVar == null) {
            this.zza.zzaV().zzk().zzb("EES not loaded for", zzrVar.zza);
            zzM(zzbgVar, zzrVar);
            return;
        }
        try {
            Map mapZzz = zzpfVar.zzp().zzz(zzbgVar.zzb.zzf(), true);
            String str2 = zzbgVar.zza;
            String strZza = zzjl.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            if (zzcVar.zzb(new com.google.android.gms.internal.measurement.zzaa(str2, zzbgVar.zzd, mapZzz))) {
                if (zzcVar.zzc()) {
                    zzpf zzpfVar2 = this.zza;
                    zzpfVar2.zzaV().zzk().zzb("EES edited event", zzbgVar.zza);
                    zzM(zzpfVar2.zzp().zzA(zzcVar.zze().zzc()), zzrVar);
                } else {
                    zzM(zzbgVar, zzrVar);
                }
                if (zzcVar.zzd()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zze().zzf()) {
                        zzpf zzpfVar3 = this.zza;
                        zzpfVar3.zzaV().zzk().zzb("EES logging created event", zzaaVar.zzb());
                        zzM(zzpfVar3.zzp().zzA(zzaaVar), zzrVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzaV().zzb().zzc("EES error. appId, eventName", zzrVar.zzb, zzbgVar.zza);
        }
        this.zza.zzaV().zzk().zzb("EES was not applied to event", zzbgVar.zza);
        zzM(zzbgVar, zzrVar);
    }

    @VisibleForTesting
    final zzbg zzc(zzbg zzbgVar, zzr zzrVar) {
        zzbe zzbeVar;
        if ("_cmp".equals(zzbgVar.zza) && (zzbeVar = zzbgVar.zzb) != null && zzbeVar.zze() != 0) {
            String strZzd = zzbeVar.zzd("_cis");
            if ("referrer broadcast".equals(strZzd) || "referrer API".equals(strZzd)) {
                this.zza.zzaV().zzi().zzb("Event has been filtered ", zzbgVar.toString());
                return new zzbg("_cmpx", zzbeVar, zzbgVar.zzc, zzbgVar.zzd);
            }
        }
        return zzbgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzl(long j2, String str, String str2, String str3) {
        zzd(new zzif(this, str2, str3, str, j2));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzt(zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzO(str, false);
        zzd(new zzin(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzv(zzr zzrVar) {
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new zzio(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzy(final zzr zzrVar) {
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzz(final zzr zzrVar) {
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(zzrVar);
            }
        });
    }

    public zzjc(zzpf zzpfVar, String str) {
        Preconditions.checkNotNull(zzpfVar);
        this.zza = zzpfVar;
        this.zzc = null;
    }

    @BinderThread
    private final void zzN(zzr zzrVar, boolean z2) {
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzO(str, false);
        this.zza.zzt().zzA(zzrVar.zzb);
    }

    @BinderThread
    private final void zzO(String str, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            if (z2) {
                try {
                    if (this.zzb == null) {
                        boolean z3 = true;
                        if (!"com.google.android.gms".equals(this.zzc)) {
                            zzpf zzpfVar = this.zza;
                            if (!UidVerifier.isGooglePlayServicesUid(zzpfVar.zzaY(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(zzpfVar.zzaY()).isUidGoogleSigned(Binder.getCallingUid())) {
                                z3 = false;
                            }
                        }
                        this.zzb = Boolean.valueOf(z3);
                    }
                    if (this.zzb.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.zza.zzaV().zzb().zzb("Measurement Service called with invalid calling package. appId", zzgt.zzl(str));
                    throw e2;
                }
            }
            if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaY(), Binder.getCallingUid(), str)) {
                this.zzc = str;
            }
            if (str.equals(this.zzc)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.zza.zzaV().zzb().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @VisibleForTesting
    final void zzE(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        zzpf zzpfVar = this.zza;
        if (zzpfVar.zzaW().zze()) {
            runnable.run();
        } else {
            zzpfVar.zzaW().zzl(runnable);
        }
    }

    @VisibleForTesting
    final void zzd(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        zzpf zzpfVar = this.zza;
        if (zzpfVar.zzaW().zze()) {
            runnable.run();
        } else {
            zzpfVar.zzaW().zzj(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zze(zzbg zzbgVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzbgVar);
        zzN(zzrVar, false);
        zzd(new zziq(this, zzbgVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzf(zzpk zzpkVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzpkVar);
        zzN(zzrVar, false);
        zzd(new zzit(this, zzpkVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzh(zzbg zzbgVar, String str, String str2) {
        Preconditions.checkNotNull(zzbgVar);
        Preconditions.checkNotEmpty(str);
        zzO(str, true);
        zzd(new zzir(this, zzbgVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final byte[] zzk(zzbg zzbgVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbgVar);
        zzO(str, true);
        zzpf zzpfVar = this.zza;
        zzgr zzgrVarZzj = zzpfVar.zzaV().zzj();
        zzgm zzgmVarZzs = zzpfVar.zzs();
        String str2 = zzbgVar.zza;
        zzgrVarZzj.zzb("Log and bundle. event", zzgmVarZzs.zza(str2));
        long jNanoTime = zzpfVar.zzaZ().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) zzpfVar.zzaW().zzi(new zzis(this, zzbgVar, str)).get();
            if (bArr == null) {
                zzpfVar.zzaV().zzb().zzb("Log and bundle returned null. appId", zzgt.zzl(str));
                bArr = new byte[0];
            }
            zzpfVar.zzaV().zzj().zzd("Log and bundle processed. event, size, time_ms", zzpfVar.zzs().zza(str2), Integer.valueOf(bArr.length), Long.valueOf((zzpfVar.zzaZ().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            zzpf zzpfVar2 = this.zza;
            zzpfVar2.zzaV().zzb().zzd("Failed to log and bundle. appId, event, error", zzgt.zzl(str), zzpfVar2.zzs().zza(zzbgVar.zza), e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            zzpf zzpfVar22 = this.zza;
            zzpfVar22.zzaV().zzb().zzd("Failed to log and bundle. appId, event, error", zzgt.zzl(str), zzpfVar22.zzs().zza(zzbgVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzn(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotNull(zzahVar.zzc);
        zzN(zzrVar, false);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.zza = zzrVar.zza;
        zzd(new zzig(this, zzahVar2, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    @BinderThread
    public final void zzo(zzah zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zza);
        zzO(zzahVar.zza, true);
        zzd(new zzih(this, new zzah(zzahVar)));
    }
}
