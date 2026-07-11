package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzfe implements zzdx {

    @GuardedBy
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfe(Handler handler) {
        this.zzb = handler;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzi(int i2, int i3) {
        return this.zzb.sendEmptyMessageDelayed(i2, i3);
    }

    static /* synthetic */ void zzp(zzfd zzfdVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzfdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzfd zzq() {
        zzfd zzfdVar;
        List list = zza;
        synchronized (list) {
            try {
                zzfdVar = list.isEmpty() ? new zzfd(null) : (zzfd) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzb(int i2) {
        return this.zzb.hasMessages(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final zzdw zzc(int i2) {
        Handler handler = this.zzb;
        zzfd zzfdVarZzq = zzq();
        zzfdVarZzq.zzb(handler.obtainMessage(i2), this);
        return zzfdVarZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final zzdw zzd(int i2, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfd zzfdVarZzq = zzq();
        zzfdVarZzq.zzb(handler.obtainMessage(i2, obj), this);
        return zzfdVarZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final zzdw zze(int i2, int i3, int i5) {
        Handler handler = this.zzb;
        zzfd zzfdVarZzq = zzq();
        zzfdVarZzq.zzb(handler.obtainMessage(i2, i3, i5), this);
        return zzfdVarZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final zzdw zzf(int i2, int i3, int i5, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfd zzfdVarZzq = zzq();
        zzfdVarZzq.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzfdVarZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzg(zzdw zzdwVar) {
        return ((zzfd) zzdwVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzh(int i2) {
        return this.zzb.sendEmptyMessage(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzj(int i2, long j2) {
        return this.zzb.sendEmptyMessageAtTime(2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final void zzk(int i2) {
        this.zzb.removeMessages(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final void zzl(Runnable runnable) {
        this.zzb.removeCallbacks(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final void zzm(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzn(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final boolean zzo(Runnable runnable, long j2) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
