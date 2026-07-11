package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcja extends zzcfk {
    private final zzcgf zzc;

    @Nullable
    private zzcjb zzd;
    private Uri zze;
    private zzcfj zzf;
    private boolean zzg;
    private int zzh;

    private final boolean zzu() {
        int i2 = this.zzh;
        return (i2 == 1 || i2 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i2) {
        if (i2 == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.f63168h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzb(zzcfj zzcfjVar) {
        this.zzf = zzcfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzj(float f3, float f4) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcja.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzc(@Nullable String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzcjb(uri.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzcjb zzcjbVar = this.zzd;
        if (zzcjbVar != null) {
            zzcjbVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcix
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgh
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    final /* synthetic */ void zzr() {
        zzcfj zzcfjVar = this.zzf;
        if (zzcfjVar != null) {
            zzcfjVar.zzb();
        }
    }

    final /* synthetic */ void zzs() {
        zzcfj zzcfjVar = this.zzf;
        if (zzcfjVar != null) {
            if (!this.zzg) {
                zzcfjVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    final /* synthetic */ void zzt() {
        zzcfj zzcfjVar = this.zzf;
        if (zzcfjVar != null) {
            zzcfjVar.zzd();
        }
    }

    public zzcja(Context context, zzcgf zzcgfVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcgfVar;
        zzcgfVar.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzi(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
    }
}
