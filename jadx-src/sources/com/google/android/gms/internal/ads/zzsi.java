package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzsi implements zzqm {

    @Nullable
    private final Context zza;

    @Nullable
    private final zzsh zzb;
    private zzed zzc;
    private zzdn zzd;
    private zzps zze;
    private zzpx zzf;

    @Nullable
    private Looper zzg;

    @Nullable
    private Context zzh;
    private final zzsm zzi;

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zzd(zzdn zzdnVar) {
        this.zzd = zzdnVar;
    }

    final /* synthetic */ void zzh(zzps zzpsVar) {
        this.zze = zzpsVar;
    }

    final /* synthetic */ zzpx zzi() {
        return this.zzf;
    }

    private final void zzk() {
        if (this.zza == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzg;
        boolean z2 = true;
        if (looper != null && looper != looperMyLooper) {
            z2 = false;
        }
        String strZzl = zzl(looper);
        String strZzl2 = zzl(looperMyLooper);
        if (!z2) {
            throw new IllegalStateException(zzgrt.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", strZzl, strZzl2));
        }
        this.zzg = looperMyLooper;
    }

    private static String zzl(@Nullable Looper looper) {
        return looper == null ? V8ValueNull.NULL : looper.getThread().getName();
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zze() {
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzf();
        }
        zzpx zzpxVar = this.zzf;
        if (zzpxVar != null) {
            zzpxVar.zze();
        }
    }

    public final zzsd zzf(zzql zzqlVar) throws zzqi {
        Context context;
        try {
            int i2 = zzqlVar.zzg;
            int i3 = zzqlVar.zzh;
            Context context2 = null;
            if (i3 != -1 && (context = this.zza) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.zzh;
                if (context3 == null || context3.getDeviceId() != i3) {
                    this.zzh = context.createDeviceContext(i3);
                }
                context2 = this.zzh;
                i2 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzqlVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzqlVar.zzb).setChannelMask(zzqlVar.zzc).setEncoding(zzqlVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzqlVar.zze).setSessionId(i2);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i5 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new zzsd(audioTrackBuild, zzqlVar, this.zzb, this.zzd);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzqi();
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new zzqi(e);
        } catch (UnsupportedOperationException e3) {
            e = e3;
            throw new zzqi(e);
        }
    }

    /* synthetic */ zzsi(zzsg zzsgVar, byte[] bArr) {
        this.zza = zzsgVar.zzd();
        zzsm zzsmVarZzg = zzsgVar.zzg();
        zzsmVarZzg.getClass();
        this.zzi = zzsmVarZzg;
        this.zze = zzsgVar.zze();
        this.zzb = zzsgVar.zzd() != null ? new zzsh(this, null) : null;
        this.zzd = zzdn.zza;
    }

    private final void zzj(zzqf zzqfVar) {
        Context context;
        zzk();
        zzpx zzpxVar = this.zzf;
        if (zzpxVar == null && (context = this.zza) != null) {
            zzpx zzpxVar2 = new zzpx(context, new zzpw() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // com.google.android.gms.internal.ads.zzpw
                public final /* synthetic */ void zza(zzps zzpsVar) {
                    this.zza.zzg(zzpsVar);
                }
            }, zzqfVar.zzb, zzqfVar.zzc);
            this.zzf = zzpxVar2;
            this.zze = zzpxVar2.zzd();
        } else if (zzpxVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzqfVar.zzc;
            if (audioDeviceInfo != null) {
                zzpxVar.zzc(audioDeviceInfo);
            }
            this.zzf.zzb(zzqfVar.zzb);
        }
        this.zze.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @Override // com.google.android.gms.internal.ads.zzqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzqh zza(zzqf zzqfVar) {
        zzj(zzqfVar);
        zzsm zzsmVar = this.zzi;
        zzv zzvVar = zzqfVar.zza;
        zzd zzdVar = zzqfVar.zzb;
        zzpz zzpzVarZza = zzsmVar.zza(zzvVar, zzdVar);
        zzqg zzqgVar = new zzqg();
        int i2 = 0;
        if (Objects.equals(zzvVar.zzo, "audio/raw")) {
            int i3 = zzvVar.zzI;
            if (!zzfj.zzA(i3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 22);
                sb.append("Invalid PCM encoding: ");
                sb.append(i3);
                zzee.zzc("ATAudioOutputProvider", sb.toString());
            } else {
                i2 = i3 != 2 ? 1 : 2;
            }
        } else if (this.zze.zzd(zzvVar, zzdVar) != null) {
        }
        zzqgVar.zzd(i2);
        zzqgVar.zza(zzpzVarZza.zzb);
        zzqgVar.zzb(zzpzVarZza.zzc);
        zzqgVar.zzc(zzpzVarZza.zzd);
        return zzqgVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzql zzb(zzqf zzqfVar) throws zzqd {
        int i2;
        int iIntValue;
        int i3;
        int iZzD;
        int i5;
        boolean z2;
        int i7;
        zzj(zzqfVar);
        zzv zzvVar = zzqfVar.zza;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/raw")) {
            int i8 = zzvVar.zzI;
            zzgrc.zza(zzfj.zzA(i8));
            i2 = zzvVar.zzH;
            int i9 = zzvVar.zzG;
            iIntValue = zzfj.zzB(i9);
            iZzD = zzfj.zzD(i8) * i9;
            i5 = i8;
            i3 = 0;
        } else {
            i2 = zzvVar.zzH;
            zzpz zzpzVar = zzpz.zza;
            Pair pairZzd = this.zze.zzd(zzvVar, zzqfVar.zzb);
            if (pairZzd != null) {
                int iIntValue2 = ((Integer) pairZzd.first).intValue();
                iIntValue = ((Integer) pairZzd.second).intValue();
                i3 = 2;
                iZzD = -1;
                i5 = iIntValue2;
            } else {
                throw new zzqd("Unable to configure passthrough for: ".concat(String.valueOf(zzvVar)));
            }
        }
        int i10 = i2;
        int i11 = zzvVar.zzj;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i11 == -1) {
            i11 = 768000;
        }
        int i12 = i11;
        int iMax = zzqfVar.zzf;
        if (iMax == -1) {
            int i13 = iZzD;
            if (AudioTrack.getMinBufferSize(i10, iIntValue, i5) != -2) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzgrc.zzi(z2);
            if (i13 == -1) {
                i7 = 1;
            } else {
                i7 = i13;
            }
            int i14 = i7;
            iMax = (((Math.max(r8, zzsy.zzb(r8, i5, i3, i7, i10, i12)) + i14) - 1) / i14) * i14;
        }
        zzqk zzqkVar = new zzqk();
        zzqkVar.zzb(i10);
        zzqkVar.zzc(iIntValue);
        zzqkVar.zza(i5);
        zzqkVar.zze(iMax);
        zzqkVar.zzg(zzqfVar.zzd);
        zzqkVar.zzf(zzqfVar.zzb);
        zzqkVar.zzd(false);
        zzqkVar.zzh(zzqfVar.zze);
        return new zzql(zzqkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zzc(zzqj zzqjVar) {
        zzk();
        if (this.zzc == null) {
            zzed zzedVar = new zzed(Thread.currentThread());
            this.zzc = zzedVar;
            zzedVar.zzg(false);
        }
        this.zzc.zzb(zzqjVar);
    }

    final void zzg(zzps zzpsVar) {
        zzk();
        zzps zzpsVar2 = this.zze;
        if (zzpsVar2 != null && !zzpsVar.equals(zzpsVar2)) {
            this.zze = zzpsVar;
            zzed zzedVar = this.zzc;
            if (zzedVar != null) {
                zzedVar.zzd(-1, zzse.zza);
                zzedVar.zze();
            }
        }
    }
}
