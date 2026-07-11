package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzavh;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzayz;
import com.google.android.gms.internal.ads.zzazc;
import com.google.android.gms.internal.ads.zzazg;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfwe;
import com.google.android.gms.internal.ads.zzfwy;
import com.google.android.gms.internal.ads.zzgzo;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzk implements Runnable, zzazc {
    private static final long zzc = System.currentTimeMillis();

    @VisibleForTesting
    protected boolean zza;
    private final boolean zzg;
    private final boolean zzh;
    private final Executor zzi;
    private final zzfvh zzj;
    private Context zzk;
    private final Context zzl;
    private VersionInfoParcel zzm;
    private final VersionInfoParcel zzn;
    private final boolean zzo;
    private int zzp;
    private final List zzd = new Vector();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzeo)).booleanValue()) {
                this.zza = zzm();
            }
            boolean z2 = this.zzm.isClientJar;
            final boolean z3 = false;
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzbD)).booleanValue() && z2) {
                z3 = true;
            }
            if (zzp() == 1) {
                zzr(z3);
                if (this.zzp == 2) {
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzn(z3);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzayz zzayzVarZzu = zzu(this.zzk, this.zzm, z3, this.zzo);
                    this.zzf.set(zzayzVarZzu);
                    if (this.zzh && !zzayzVarZzu.zzb()) {
                        this.zzp = 1;
                        zzr(z3);
                    }
                } catch (NullPointerException e2) {
                    this.zzp = 1;
                    zzr(z3);
                    this.zzj.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e2);
                }
            }
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        return zzb(context, null);
    }

    final /* synthetic */ zzfvh zzo() {
        return this.zzj;
    }

    protected final int zzp() {
        if (!this.zzg || this.zza) {
            return this.zzp;
        }
        return 1;
    }

    private final void zzq() {
        List<Object[]> list = this.zzd;
        zzazc zzazcVarZzs = zzs();
        if (list.isEmpty() || zzazcVarZzs == null) {
            return;
        }
        for (Object[] objArr : list) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    zzazcVarZzs.zzd((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzazcVarZzs.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        this.zzd.clear();
    }

    private final void zzr(boolean z2) {
        String str = this.zzm.afmaVersion;
        Context contextZzt = zzt(this.zzk);
        zzavh zzavhVarZze = zzavi.zze();
        zzavhVarZze.zzb(z2);
        zzavhVarZze.zza(str);
        this.zze.set(zzazg.zzt(contextZzt, (zzavi) zzavhVarZze.zzbu()));
    }

    public final boolean zza() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    public final String zzc() {
        int i2 = this.zzp;
        int i3 = i2 - 1;
        if (i2 != 0) {
            return i3 != 0 ? "2" : "1";
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzazc zzazcVarZzs;
        zzazc zzazcVarZzs2;
        try {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzdC)).booleanValue()) {
                if (this.zzb.getCount() != 0 || (zzazcVarZzs2 = zzs()) == null) {
                    return;
                }
                zzazcVarZzs2.zzi(stackTraceElementArr);
                return;
            }
            if (!zza() || (zzazcVarZzs = zzs()) == null) {
                return;
            }
            zzazcVarZzs.zzi(stackTraceElementArr);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, View view, Activity activity) {
        try {
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmd)).booleanValue()) {
                zzazc zzazcVarZzs = zzs();
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzme)).booleanValue()) {
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzO(view, 2, null);
                }
                return zzazcVarZzs != null ? zzazcVarZzs.zzj(context, view, activity) : "";
            }
            if (!zza()) {
                return "";
            }
            zzazc zzazcVarZzs2 = zzs();
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzme)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzO(view, 2, null);
            }
            return zzazcVarZzs2 != null ? zzazcVarZzs2.zzj(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(final Context context) {
        try {
            return (String) zzgzo.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(context, null);
                }
            }, this.zzi).get(((Integer) zzbd.zzc().zzd(zzbhe.zzdv)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzayv.zza(context, this.zzn.afmaVersion, zzc, true);
        }
    }

    protected final boolean zzm() {
        Context context = this.zzk;
        zzh zzhVar = new zzh(this);
        zzfvh zzfvhVar = this.zzj;
        return new zzfwy(this.zzk, zzfwe.zzb(context, zzfvhVar), zzhVar, ((Boolean) zzbd.zzc().zzd(zzbhe.zzdc)).booleanValue()).zzd(1);
    }

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzk = context;
        this.zzl = context;
        this.zzm = versionInfoParcel;
        this.zzn = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzi = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzbd.zzc().zzd(zzbhe.zzde)).booleanValue();
        this.zzo = zBooleanValue;
        this.zzj = zzfvh.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzg = ((Boolean) zzbd.zzc().zzd(zzbhe.zzdb)).booleanValue();
        this.zzh = ((Boolean) zzbd.zzc().zzd(zzbhe.zzdf)).booleanValue();
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzdd)).booleanValue()) {
            this.zzp = 2;
        } else {
            this.zzp = 1;
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzeo)).booleanValue()) {
            this.zza = zzm();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzeh)).booleanValue()) {
            zzcei.zza.execute(this);
            return;
        }
        zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzz()) {
            zzcei.zza.execute(this);
        } else {
            run();
        }
    }

    @Nullable
    private final zzazc zzs() {
        if (zzp() == 2) {
            return (zzazc) this.zzf.get();
        }
        return (zzazc) this.zze.get();
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    private static final zzayz zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z2, boolean z3) {
        zzavh zzavhVarZze = zzavi.zze();
        zzavhVarZze.zzb(z2);
        zzavhVarZze.zza(versionInfoParcel.afmaVersion);
        return zzayz.zza(zzt(context), (zzavi) zzavhVarZze.zzbu(), z3);
    }

    public final String zzb(Context context, byte[] bArr) {
        zzazc zzazcVarZzs;
        if (zza() && (zzazcVarZzs = zzs()) != null) {
            zzq();
            try {
                return zzazcVarZzs.zzl(zzt(context));
            } catch (NullPointerException unused) {
                return "";
            }
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzd(MotionEvent motionEvent) {
        zzazc zzazcVarZzs = zzs();
        if (zzazcVarZzs != null) {
            zzq();
            try {
                zzazcVarZzs.zzd(motionEvent);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        this.zzd.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zze(int i2, int i3, int i5) {
        zzazc zzazcVarZzs = zzs();
        if (zzazcVarZzs != null) {
            zzq();
            try {
                zzazcVarZzs.zze(i2, i3, i5);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        this.zzd.add(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5)});
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zza()) {
            zzazc zzazcVarZzs = zzs();
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzme)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzO(view, 4, null);
            }
            if (zzazcVarZzs != null) {
                zzq();
                try {
                    return zzazcVarZzs.zzf(zzt(context), str, view, activity);
                } catch (NullPointerException unused) {
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzh(View view) {
        zzazc zzazcVarZzs = zzs();
        if (zzazcVarZzs != null) {
            try {
                zzazcVarZzs.zzh(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    final /* synthetic */ void zzn(boolean z2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzl, this.zzn, z2, this.zzo).zzm();
        } catch (NullPointerException e2) {
            this.zzj.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e2);
        }
    }
}
