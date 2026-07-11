package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzcd {
    private final zzgru zza;
    private final Handler zzb;

    @Nullable
    private zzcc zzc;

    @Nullable
    private zzd zzd;
    private int zzf;
    private zzch zzh;
    private float zzg = 1.0f;
    private int zze = 0;

    public final float zza() {
        return this.zzg;
    }

    public final int zzc(boolean z2, int i2) {
        int iRequestAudioFocus;
        if (i2 == 1 || this.zzf != 1) {
            zzf();
            zzg(0);
            return 1;
        }
        if (!z2) {
            int i3 = this.zze;
            if (i3 != 1) {
                return i3 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.zze == 2) {
            return 1;
        }
        if (this.zzh == null) {
            zzce zzceVar = new zzce(1);
            zzd zzdVar = this.zzd;
            zzdVar.getClass();
            zzceVar.zzb(zzdVar);
            zzceVar.zza(new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.zzca
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final /* synthetic */ void onAudioFocusChange(int i5) {
                    this.zza.zze(i5);
                }
            }, this.zzb);
            this.zzh = zzceVar.zzc();
        }
        AudioManager audioManager = (AudioManager) this.zza.zza();
        zzch zzchVar = this.zzh;
        if (Build.VERSION.SDK_INT >= 26) {
            iRequestAudioFocus = audioManager.requestAudioFocus(zzchVar.zzc());
        } else {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerZzb = zzchVar.zzb();
            zzchVar.zza();
            iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListenerZzb, 3, 1);
        }
        if (iRequestAudioFocus == 1) {
            zzg(2);
            return 1;
        }
        zzg(1);
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zzf();
        zzg(0);
    }

    final /* synthetic */ void zze(int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2) {
                zzg(4);
                return;
            } else {
                zzh(0);
                zzg(3);
                return;
            }
        }
        if (i2 == -1) {
            zzh(-1);
            zzf();
            zzg(1);
        } else if (i2 == 1) {
            zzg(2);
            zzh(1);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 27);
            sb.append("Unknown focus change type: ");
            sb.append(i2);
            zzee.zzc("AudioFocusManager", sb.toString());
        }
    }

    private final void zzf() {
        int i2 = this.zze;
        if (i2 == 1 || i2 == 0 || this.zzh == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.zza.zza();
        zzch zzchVar = this.zzh;
        if (Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(zzchVar.zzc());
        } else {
            audioManager.abandonAudioFocus(zzchVar.zzb());
        }
    }

    private final void zzg(int i2) {
        if (this.zze == i2) {
            return;
        }
        this.zze = i2;
        float f3 = i2 == 4 ? 0.2f : 1.0f;
        if (this.zzg != f3) {
            this.zzg = f3;
            zzcc zzccVar = this.zzc;
            if (zzccVar != null) {
                zzccVar.zza(f3);
            }
        }
    }

    private final void zzh(int i2) {
        zzcc zzccVar = this.zzc;
        if (zzccVar != null) {
            zzccVar.zzb(i2);
        }
    }

    public final void zzb(@Nullable zzd zzdVar) {
        if (Objects.equals(this.zzd, zzdVar)) {
            return;
        }
        this.zzd = zzdVar;
        this.zzf = zzdVar == null ? 0 : 1;
    }

    public zzcd(final Context context, Looper looper, zzcc zzccVar) {
        this.zza = zzgry.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzcb
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return zzcj.zza(context);
            }
        });
        this.zzc = zzccVar;
        this.zzb = new Handler(looper);
    }
}
