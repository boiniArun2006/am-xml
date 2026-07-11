package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcq {

    @VisibleForTesting
    zzib zza = null;

    @GuardedBy
    private final Map zzb = new ArrayMap();

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsent(@NonNull Bundle bundle, long j2) throws RemoteException {
    }

    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdd zzddVar, long j2) throws RemoteException {
        zzib zzibVar = this.zza;
        if (zzibVar == null) {
            this.zza = zzib.zzy((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzddVar, Long.valueOf(j2));
        } else {
            zzibVar.zzaV().zze().zza("Attempting to initialize multiple times");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str) {
        zzb();
        this.zza.zzk().zzal(zzcuVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void beginAdUnitExposure(@NonNull String str, long j2) throws RemoteException {
        zzb();
        this.zza.zzw().zza(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzj().zzab(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearMeasurementEnabled(long j2) throws RemoteException {
        zzb();
        this.zza.zzj().zzn(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void endAdUnitExposure(@NonNull String str, long j2) throws RemoteException {
        zzb();
        this.zza.zzw().zzb(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void generateEventId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        long jZzd = this.zza.zzk().zzd();
        zzb();
        this.zza.zzk().zzam(zzcuVar, jZzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        this.zza.zzaW().zzj(new zzi(this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        zzc(zzcuVar, this.zza.zzj().zzQ());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        this.zza.zzaW().zzj(new zzm(this, zzcuVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        zzc(zzcuVar, this.zza.zzj().zzae());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        zzc(zzcuVar, this.zza.zzj().zzad());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        String strZza;
        zzb();
        zzli zzliVarZzj = this.zza.zzj();
        try {
            strZza = zzls.zza(zzliVarZzj.zzu.zzaY(), "google_app_id", zzliVarZzj.zzu.zzq());
        } catch (IllegalStateException e2) {
            zzliVarZzj.zzu.zzaV().zzb().zzb("getGoogleAppId failed with exception", e2);
            strZza = null;
        }
        zzc(zzcuVar, strZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        this.zza.zzj().zzY(str);
        zzb();
        this.zza.zzk().zzan(zzcuVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getSessionId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        zzli zzliVarZzj = this.zza.zzj();
        zzliVarZzj.zzu.zzaW().zzj(new zzkl(zzliVarZzj, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcu zzcuVar, int i2) throws RemoteException {
        zzb();
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                        this.zza.zzk().zzap(zzcuVar, this.zza.zzj().zzi().booleanValue());
                        return;
                    }
                    this.zza.zzk().zzan(zzcuVar, this.zza.zzj().zzl().intValue());
                    return;
                }
                zzpo zzpoVarZzk = this.zza.zzk();
                double dDoubleValue = this.zza.zzj().zzm().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", dDoubleValue);
                try {
                    zzcuVar.zzb(bundle);
                    return;
                } catch (RemoteException e2) {
                    zzpoVarZzk.zzu.zzaV().zze().zzb("Error returning double value to wrapper", e2);
                    return;
                }
            }
            this.zza.zzk().zzam(zzcuVar, this.zza.zzj().zzk().longValue());
            return;
        }
        this.zza.zzk().zzal(zzcuVar, this.zza.zzj().zzj());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getUserProperties(String str, String str2, boolean z2, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        this.zza.zzaW().zzj(new zzk(this, zzcuVar, str, str2, z2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initForTests(@NonNull Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzb();
        this.zza.zzaW().zzj(new zzn(this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z2, boolean z3, long j2) throws RemoteException {
        zzb();
        this.zza.zzj().zzC(str, str2, bundle, z2, z3, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j2) throws RemoteException {
        Bundle bundle2;
        zzb();
        Preconditions.checkNotEmpty(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", PangleCreativeInfo.f62498a);
        this.zza.zzaW().zzj(new zzj(this, zzcuVar, new zzbg(str2, new zzbe(bundle), PangleCreativeInfo.f62498a, j2), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logHealthData(int i2, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object objUnwrap;
        Object objUnwrap2;
        zzb();
        Object objUnwrap3 = null;
        if (iObjectWrapper == null) {
            objUnwrap = null;
        } else {
            objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            objUnwrap2 = null;
        } else {
            objUnwrap2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            objUnwrap3 = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zza.zzaV().zzm(i2, true, false, str, objUnwrap, objUnwrap2, objUnwrap3);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j2) throws RemoteException {
        zzb();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), bundle, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle, long j2) {
        zzb();
        zzkx zzkxVar = this.zza.zzj().zza;
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zza(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j2) throws RemoteException {
        zzb();
        zzkx zzkxVar = this.zza.zzj().zza;
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zzb(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j2) throws RemoteException {
        zzb();
        zzkx zzkxVar = this.zza.zzj().zza;
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zzc(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j2) throws RemoteException {
        zzb();
        zzkx zzkxVar = this.zza.zzj().zza;
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zzd(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j2) throws RemoteException {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), zzcuVar, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j2) throws RemoteException {
        zzb();
        zzkx zzkxVar = this.zza.zzj().zza;
        Bundle bundle = new Bundle();
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zze(zzdfVar, bundle);
        }
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            this.zza.zzaV().zze().zzb("Error returning bundle value to wrapper", e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j2) throws RemoteException {
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j2) throws RemoteException {
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j2) throws RemoteException {
        zzb();
        zzcuVar.zzb(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        zzjp zzqVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            try {
                zzqVar = (zzjp) map.get(Integer.valueOf(zzdaVar.zzf()));
                if (zzqVar == null) {
                    zzqVar = new zzq(this, zzdaVar);
                    map.put(Integer.valueOf(zzdaVar.zzf()), zzqVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzj().zzW(zzqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void resetAnalyticsData(long j2) throws RemoteException {
        zzb();
        this.zza.zzj().zzT(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.zzcx zzcxVar) {
        zzb();
        this.zza.zzj().zzt(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzcxVar.zze();
                } catch (RemoteException e2) {
                    ((zzib) Preconditions.checkNotNull(this.zza.zza)).zzaV().zze().zzb("Failed to call IDynamiteUploadBatchesCallback", e2);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j2) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.zza.zzaV().zzb().zza("Conditional user property must not be null");
        } else {
            this.zza.zzj().zzaa(bundle, j2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsentThirdParty(@NonNull Bundle bundle, long j2) throws RemoteException {
        zzb();
        this.zza.zzj().zzp(bundle, -20, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j2) throws RemoteException {
        zzb();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), str, str2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, String str, String str2, long j2) throws RemoteException {
        zzb();
        this.zza.zzs().zzk(zzdfVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDataCollectionEnabled(boolean z2) throws RemoteException {
        zzb();
        zzli zzliVarZzj = this.zza.zzj();
        zzliVarZzj.zzb();
        zzliVarZzj.zzu.zzaW().zzj(new zzjx(zzliVarZzj, z2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        final Bundle bundle2;
        zzb();
        final zzli zzliVarZzj = this.zza.zzj();
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        zzliVarZzj.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzle
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzliVarZzj.zzag(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        zzb();
        zzp zzpVar = new zzp(this, zzdaVar);
        if (this.zza.zzaW().zze()) {
            this.zza.zzj().zzV(zzpVar);
        } else {
            this.zza.zzaW().zzj(new zzl(this, zzpVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdc zzdcVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMeasurementEnabled(boolean z2, long j2) throws RemoteException {
        zzb();
        this.zza.zzj().zzn(Boolean.valueOf(z2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMinimumSessionDuration(long j2) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSessionTimeoutDuration(long j2) throws RemoteException {
        zzb();
        zzli zzliVarZzj = this.zza.zzj();
        zzliVarZzj.zzu.zzaW().zzj(new zzjz(zzliVarZzj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        zzb();
        zzli zzliVarZzj = this.zza.zzj();
        Uri data = intent.getData();
        if (data == null) {
            zzliVarZzj.zzu.zzaV().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter != null && queryParameter.equals("1")) {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                zzib zzibVar = zzliVarZzj.zzu;
                zzibVar.zzaV().zzi().zzb("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
                zzibVar.zzc().zzy(queryParameter2);
                return;
            }
            return;
        }
        zzib zzibVar2 = zzliVarZzj.zzu;
        zzibVar2.zzaV().zzi().zza("[sgtm] Preview Mode was not enabled.");
        zzibVar2.zzc().zzy(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserId(@NonNull final String str, long j2) throws RemoteException {
        zzb();
        final zzli zzliVarZzj = this.zza.zzj();
        if (str != null && TextUtils.isEmpty(str)) {
            zzliVarZzj.zzu.zzaV().zze().zza("User ID must be non-empty or null");
        } else {
            zzliVarZzj.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzib zzibVar = zzliVarZzj.zzu;
                    if (zzibVar.zzv().zzq(str)) {
                        zzibVar.zzv().zzi();
                    }
                }
            });
            zzliVarZzj.zzL(null, "_id", str, true, j2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z2, long j2) throws RemoteException {
        zzb();
        this.zza.zzj().zzL(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        zzjp zzqVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            zzqVar = (zzjp) map.remove(Integer.valueOf(zzdaVar.zzf()));
        }
        if (zzqVar == null) {
            zzqVar = new zzq(this, zzdaVar);
        }
        this.zza.zzj().zzX(zzqVar);
    }
}
