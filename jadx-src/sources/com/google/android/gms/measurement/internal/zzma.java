package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzma extends zzg {

    @VisibleForTesting
    protected zzlt zza;
    private volatile zzlt zzb;
    private volatile zzlt zzc;
    private final Map zzd;

    @GuardedBy
    private com.google.android.gms.internal.measurement.zzdf zze;

    @GuardedBy
    private volatile boolean zzf;
    private volatile zzlt zzg;
    private zzlt zzh;

    @GuardedBy
    private boolean zzi;
    private final Object zzj;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzz(zzlt zzltVar, zzlt zzltVar2, long j2, boolean z2, Bundle bundle) {
        boolean z3;
        zzg();
        boolean z4 = false;
        if (zzltVar2 != null) {
            z3 = (zzltVar2.zzc == zzltVar.zzc && Objects.equals(zzltVar2.zzb, zzltVar.zzb) && Objects.equals(zzltVar2.zza, zzltVar.zza)) ? false : true;
        }
        if (z2 && this.zza != null) {
            z4 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzpo.zzav(zzltVar, bundle2, true);
            if (zzltVar2 != null) {
                String str = zzltVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzltVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzltVar2.zzc);
            }
            if (z4) {
                zznz zznzVar = this.zzu.zzh().zzb;
                long j3 = j2 - zznzVar.zzb;
                zznzVar.zzb = j2;
                if (j3 > 0) {
                    this.zzu.zzk().zzak(bundle2, j3);
                }
            }
            zzib zzibVar = this.zzu;
            if (!zzibVar.zzc().zzv()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z5 = zzltVar.zze;
            String str3 = true != z5 ? TtmlNode.TEXT_EMPHASIS_AUTO : PangleCreativeInfo.f62498a;
            long jCurrentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
            if (z5) {
                long j4 = zzltVar.zzf;
                long j5 = j4 == 0 ? jCurrentTimeMillis : j4;
                this.zzu.zzj().zzG(str3, "_vs", j5, bundle2);
            }
        }
        if (z4) {
            zzA(this.zza, true, j2);
        }
        this.zza = zzltVar;
        if (zzltVar.zze) {
            this.zzh = zzltVar;
        }
        this.zzu.zzt().zzG(zzltVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final zzlt zzl() {
        return this.zzb;
    }

    final /* synthetic */ void zzu(zzlt zzltVar, zzlt zzltVar2, long j2, boolean z2, Bundle bundle) {
        zzz(zzltVar, zzltVar2, j2, z2, null);
    }

    final /* synthetic */ void zzv(zzlt zzltVar, boolean z2, long j2) {
        zzA(zzltVar, false, j2);
    }

    final /* synthetic */ zzlt zzw() {
        return this.zzh;
    }

    final /* synthetic */ void zzx(zzlt zzltVar) {
        this.zzh = null;
    }

    @WorkerThread
    private final void zzA(zzlt zzltVar, boolean z2, long j2) {
        zzib zzibVar = this.zzu;
        zzibVar.zzw().zzc(zzibVar.zzaZ().elapsedRealtime());
        if (!zzibVar.zzh().zzb.zzd(zzltVar != null && zzltVar.zzd, z2, j2) || zzltVar == null) {
            return;
        }
        zzltVar.zzd = false;
    }

    @MainThread
    private final void zzy(String str, zzlt zzltVar, boolean z2) {
        zzlt zzltVar2;
        zzlt zzltVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzltVar.zzb == null) {
            zzltVar2 = new zzlt(zzltVar.zza, str != null ? zzi(str, "Activity") : null, zzltVar.zzc, zzltVar.zze, zzltVar.zzf);
        } else {
            zzltVar2 = zzltVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzltVar2;
        zzib zzibVar = this.zzu;
        zzibVar.zzaW().zzj(new zzlv(this, zzltVar2, zzltVar3, zzibVar.zzaZ().elapsedRealtime(), z2));
    }

    @VisibleForTesting
    final String zzi(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        zzib zzibVar = this.zzu;
        return str3.length() > zzibVar.zzc().zze(null, false) ? str3.substring(0, zzibVar.zzc().zze(null, false)) : str3;
    }

    public final void zzj(Bundle bundle, long j2) {
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    this.zzu.zzaV().zzh().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.zzdf zzdfVar = this.zze;
                    string2 = zzdfVar != null ? zzi(zzdfVar.zzb, "Activity") : "Activity";
                }
                zzlt zzltVar = this.zzb;
                if (this.zzf && zzltVar != null) {
                    this.zzf = false;
                    boolean zEquals = Objects.equals(zzltVar.zzb, string2);
                    boolean zEquals2 = Objects.equals(zzltVar.zza, string);
                    if (zEquals && zEquals2) {
                        this.zzu.zzaV().zzh().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzib zzibVar = this.zzu;
                zzibVar.zzaV().zzk().zzc("Logging screen view with name, class", string == null ? V8ValueNull.NULL : string, string2 == null ? V8ValueNull.NULL : string2);
                zzlt zzltVar2 = this.zzb == null ? this.zzc : this.zzb;
                zzlt zzltVar3 = new zzlt(string, string2, zzibVar.zzk().zzd(), true, j2);
                this.zzb = zzltVar3;
                this.zzc = zzltVar2;
                this.zzg = zzltVar3;
                zzibVar.zzaW().zzj(new zzlu(this, bundle, zzltVar3, zzltVar2, zzibVar.zzaZ().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public final void zzk(@NonNull com.google.android.gms.internal.measurement.zzdf zzdfVar, @Size String str, @Size String str2) {
        zzib zzibVar = this.zzu;
        if (!zzibVar.zzc().zzv()) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlt zzltVar = this.zzb;
        if (zzltVar == null) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.zzd;
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        if (map.get(numValueOf) == null) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzi(zzdfVar.zzb, "Activity");
        }
        String str3 = zzltVar.zzb;
        String str4 = zzltVar.zza;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zzibVar.zzc().zze(null, false))) {
            zzibVar.zzaV().zzh().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zzibVar.zzc().zze(null, false))) {
            zzibVar.zzaV().zzh().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzibVar.zzaV().zzk().zzc("Setting current screen to name, class", str == null ? V8ValueNull.NULL : str, str2);
        zzlt zzltVar2 = new zzlt(str, str2, zzibVar.zzk().zzd());
        map.put(numValueOf, zzltVar2);
        zzy(zzdfVar.zzb, zzltVar2, true);
    }

    @MainThread
    public final void zzm(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzu.zzc().zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(Integer.valueOf(zzdfVar.zza), new zzlt(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzn(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        Object obj = this.zzj;
        synchronized (obj) {
            this.zzi = true;
            if (!Objects.equals(zzdfVar, this.zze)) {
                synchronized (obj) {
                    this.zze = zzdfVar;
                    this.zzf = false;
                    zzib zzibVar = this.zzu;
                    if (zzibVar.zzc().zzv()) {
                        this.zzg = null;
                        zzibVar.zzaW().zzj(new zzlz(this));
                    }
                }
            }
        }
        zzib zzibVar2 = this.zzu;
        if (!zzibVar2.zzc().zzv()) {
            this.zzb = this.zzg;
            zzibVar2.zzaW().zzj(new zzlw(this));
            return;
        }
        zzy(zzdfVar.zzb, zzB(zzdfVar), false);
        zzd zzdVarZzw = this.zzu.zzw();
        zzib zzibVar3 = zzdVarZzw.zzu;
        zzibVar3.zzaW().zzj(new zzc(zzdVarZzw, zzibVar3.zzaZ().elapsedRealtime()));
    }

    @MainThread
    public final void zzp(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        zzib zzibVar = this.zzu;
        long jElapsedRealtime = zzibVar.zzaZ().elapsedRealtime();
        if (!zzibVar.zzc().zzv()) {
            this.zzb = null;
            zzibVar.zzaW().zzj(new zzlx(this, jElapsedRealtime));
        } else {
            zzlt zzltVarZzB = zzB(zzdfVar);
            this.zzc = this.zzb;
            this.zzb = null;
            zzibVar.zzaW().zzj(new zzly(this, zzltVarZzB, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzq(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        zzlt zzltVar;
        if (!this.zzu.zzc().zzv() || bundle == null || (zzltVar = (zzlt) this.zzd.get(Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzltVar.zzc);
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzltVar.zza);
        bundle2.putString("referrer_name", zzltVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @MainThread
    public final void zzs(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            try {
                if (Objects.equals(this.zze, zzdfVar)) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zzu.zzc().zzv()) {
            this.zzd.remove(Integer.valueOf(zzdfVar.zza));
        }
    }

    final /* synthetic */ void zzt(Bundle bundle, zzlt zzltVar, zzlt zzltVar2, long j2) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzz(zzltVar, zzltVar2, j2, true, this.zzu.zzk().zzF(null, "screen_view", bundle, null, false));
    }

    public zzma(zzib zzibVar) {
        super(zzibVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    @MainThread
    private final zzlt zzB(@NonNull com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        Preconditions.checkNotNull(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        Map map = this.zzd;
        zzlt zzltVar = (zzlt) map.get(numValueOf);
        if (zzltVar == null) {
            zzlt zzltVar2 = new zzlt(null, zzi(zzdfVar.zzb, "Activity"), this.zzu.zzk().zzd());
            map.put(numValueOf, zzltVar2);
            zzltVar = zzltVar2;
        }
        if (this.zzg != null) {
            return this.zzg;
        }
        return zzltVar;
    }

    @WorkerThread
    public final zzlt zzh(boolean z2) {
        zzb();
        zzg();
        if (!z2) {
            return this.zza;
        }
        zzlt zzltVar = this.zza;
        if (zzltVar != null) {
            return zzltVar;
        }
        return this.zzh;
    }
}
