package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcgi implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcgh zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public final float zzc() {
        float f3 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f3;
        }
        return 0.0f;
    }

    public final void zzd() {
        this.zzd = true;
        zzf();
    }

    public final void zze() {
        this.zzd = false;
        zzf();
    }

    private final void zzf() {
        if (!this.zzd || this.zze || this.zzf <= 0.0f) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    this.zzc = audioManager.abandonAudioFocus(this) == 0;
                }
                this.zzb.zzq();
                return;
            }
            return;
        }
        if (this.zzc) {
            return;
        }
        AudioManager audioManager2 = this.zza;
        if (audioManager2 != null) {
            this.zzc = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.zzb.zzq();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        this.zzc = i2 > 0;
        this.zzb.zzq();
    }

    public final void zza(boolean z2) {
        this.zze = z2;
        zzf();
    }

    public final void zzb(float f3) {
        this.zzf = f3;
        zzf();
    }

    public zzcgi(Context context, zzcgh zzcghVar) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzcghVar;
    }
}
