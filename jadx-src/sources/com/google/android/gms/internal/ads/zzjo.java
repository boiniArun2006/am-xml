package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzjo implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzadm, zzrc, zzyq, zzvi, zzby, zzeu {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzks zza;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzks zzksVar = this.zza;
        zzksVar.zzQ(surfaceTexture);
        zzksVar.zzS(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzks zzksVar = this.zza;
        zzksVar.zzR(null);
        zzksVar.zzS(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.zza.zzS(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i5) {
        this.zza.zzS(i3, i5);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzS(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzeu
    public final void zza(zzfb zzfbVar) {
        this.zza.zzP(zziw.zzc(zzfbVar, 1003));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zzb(zzin zzinVar) {
        this.zza.zzW().zzN(zzinVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zzc(String str, long j2, long j3) {
        this.zza.zzW().zzO(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zzd(zzv zzvVar, @Nullable zzio zzioVar) {
        this.zza.zzW().zzP(zzvVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zze(int i2, long j2) {
        this.zza.zzW().zzQ(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zzf(final zzbv zzbvVar) {
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzt(zzbvVar);
            }
        };
        zzed zzedVarZzV = this.zza.zzV();
        zzedVarZzV.zzd(25, zzdyVar);
        zzedVarZzV.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zzg(Object obj, long j2) {
        zzks zzksVar = this.zza;
        zzksVar.zzW().zzT(obj, j2);
        if (zzksVar.zzab() == obj) {
            zzed zzedVarZzV = zzksVar.zzV();
            zzedVarZzV.zzd(26, zzjn.zza);
            zzedVarZzV.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zzh(String str) {
        this.zza.zzW().zzR(str);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zzi(zzin zzinVar) {
        this.zza.zzW().zzS(zzinVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zzj(long j2, int i2) {
        this.zza.zzW().zzU(j2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final void zzk(Exception exc) {
        this.zza.zzW().zzV(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzl(zzin zzinVar) {
        this.zza.zzW().zzC(zzinVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzm(String str, long j2, long j3) {
        this.zza.zzW().zzD(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzn(zzv zzvVar, @Nullable zzio zzioVar) {
        this.zza.zzW().zzE(zzvVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzo(long j2) {
        this.zza.zzW().zzF(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzp(int i2, long j2, long j3) {
        this.zza.zzW().zzG(i2, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzq(String str) {
        this.zza.zzW().zzH(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzr(zzin zzinVar) {
        this.zza.zzW().zzI(zzinVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzs(final boolean z2) {
        zzks zzksVar = this.zza;
        if (zzksVar.zzac() == z2) {
            return;
        }
        zzksVar.zzad(z2);
        zzed zzedVarZzV = zzksVar.zzV();
        zzedVarZzV.zzd(23, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzs(z2);
            }
        });
        zzedVarZzV.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzt(Exception exc) {
        this.zza.zzW().zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzu(Exception exc) {
        this.zza.zzW().zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzv(zzrd zzrdVar) {
        this.zza.zzW().zzL(zzrdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzw(zzrd zzrdVar) {
        this.zza.zzW().zzM(zzrdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzx(final int i2) {
        this.zza.zzZ().zza(new zzgqt() { // from class: com.google.android.gms.internal.ads.zzjk
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i2);
            }
        }, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzjl
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzy(zzil zzilVar) {
        zzks zzksVar = this.zza;
        for (Map.Entry entry : new HashMap(zzksVar.zzaa()).entrySet()) {
            zzim zzimVar = (zzim) entry.getKey();
            List list = (List) entry.getValue();
            if (!zzks.zzU(zzilVar, list).equals(zzks.zzU(zzksVar.zzaf(), list))) {
                zzimVar.zza();
            }
        }
        zzksVar.zzag(zzilVar);
    }

    /* synthetic */ zzjo(zzks zzksVar, byte[] bArr) {
        Objects.requireNonNull(zzksVar);
        this.zza = zzksVar;
    }
}
