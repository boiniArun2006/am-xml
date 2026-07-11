package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzta extends zzuu implements zzlm {
    private final Context zzb;
    private final zzrb zzc;
    private final zzrj zzd;

    @Nullable
    private final zzug zze;
    private final Set zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;

    @Nullable
    private zzv zzj;
    private final zzil zzk;
    private zzil zzl;

    @Nullable
    private zzv zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private boolean zzs;
    private long zzt;

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzD() {
        this.zzp = true;
        this.zzj = null;
        this.zzt = -9223372036854775807L;
        try {
            this.zzd.zzA();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(((zzuu) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzE() {
        this.zzq = false;
        this.zzt = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzp) {
                this.zzp = false;
                this.zzd.zzB();
            }
        } catch (Throwable th) {
            if (this.zzp) {
                this.zzp = false;
                this.zzd.zzB();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml, com.google.android.gms.internal.ads.zzmn
    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final List zzad(zzuw zzuwVar, zzv zzvVar, boolean z2) throws zzuy {
        return zzvg.zze(zzbg(zzuwVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final float zzai(float f3, zzv zzvVar, zzv[] zzvVarArr) {
        int iMax = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i2 = zzvVar2.zzH;
            if (i2 != -1) {
                iMax = Math.max(iMax, i2);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f3;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzaj(String str, zzuh zzuhVar, long j2, long j3) {
        this.zzc.zzb(str, j2, j3);
        if (Build.VERSION.SDK_INT >= 31) {
            Set set = this.zzf;
            if (set.isEmpty()) {
                return;
            }
            zzuk zzukVarZzaE = zzaE();
            zzukVarZzaE.getClass();
            zzukVarZzaE.zzr(new ArrayList(set));
        }
    }

    @CallSuper
    protected final void zzao() {
        this.zzo = true;
    }

    final /* synthetic */ zzrb zzaw() {
        return this.zzc;
    }

    final /* synthetic */ zzug zzax() {
        return this.zze;
    }

    final /* synthetic */ void zzay(boolean z2) {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    @Nullable
    public final zzlm zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final boolean zzh() {
        boolean z2 = this.zzq;
        this.zzq = false;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public final void zzx(int i2, @Nullable Object obj) throws zziw {
        zzug zzugVar;
        if (i2 == 2) {
            zzrj zzrjVar = this.zzd;
            obj.getClass();
            zzrjVar.zzy(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            zzd zzdVar = (zzd) obj;
            zzrj zzrjVar2 = this.zzd;
            zzdVar.getClass();
            zzrjVar2.zzr(zzdVar);
            return;
        }
        if (i2 == 6) {
            zze zzeVar = (zze) obj;
            zzrj zzrjVar3 = this.zzd;
            zzeVar.getClass();
            zzrjVar3.zzt(zzeVar);
            return;
        }
        if (i2 == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i2 == 16) {
            obj.getClass();
            this.zzr = ((Integer) obj).intValue();
            zzuk zzukVarZzaE = zzaE();
            if (zzukVarZzaE == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzr));
            zzukVarZzaE.zzp(bundle);
            return;
        }
        if (i2 == 19) {
            zzrj zzrjVar4 = this.zzd;
            obj.getClass();
            zzrjVar4.zzv(((Integer) obj).intValue());
            return;
        }
        if (i2 == 9) {
            zzrj zzrjVar5 = this.zzd;
            obj.getClass();
            zzrjVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i2 != 10) {
                super.zzx(i2, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzs(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzugVar = this.zze) == null) {
                return;
            }
            zzugVar.zza(iIntValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzta(Context context, zzui zzuiVar, zzuw zzuwVar, boolean z2, @Nullable Handler handler, @Nullable zzrc zzrcVar, zzrj zzrjVar) {
        super(1, zzuiVar, zzuwVar, false, 44100.0f);
        zzug zzugVar = Build.VERSION.SDK_INT >= 35 ? new zzug(zzuf.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzrjVar;
        this.zze = zzugVar;
        this.zzr = -1000;
        this.zzc = new zzrb(handler, zzrcVar);
        this.zzt = -9223372036854775807L;
        zzrjVar.zza(new zzsz(this, null));
        this.zzf = new HashSet();
        zzil zzilVar = zzil.zza;
        this.zzk = zzilVar;
        this.zzl = zzilVar;
    }

    private static List zzbg(zzuw zzuwVar, zzv zzvVar, boolean z2, zzrj zzrjVar) throws zzuy {
        zzun zzunVarZza;
        return zzvVar.zzo == null ? zzguf.zzi() : (!zzrjVar.zzd(zzvVar) || (zzunVarZza = zzvg.zza()) == null) ? zzvg.zzc(zzuwVar, zzvVar, false, false) : zzguf.zzj(zzunVarZza);
    }

    private final int zzbh(zzun zzunVar, zzv zzvVar) {
        "OMX.google.raw.decoder".equals(zzunVar.zza);
        return zzvVar.zzp;
    }

    private final void zzbi() {
        long jZzg = this.zzd.zzg(zzZ());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzo) {
                jZzg = Math.max(this.zzn, jZzg);
            }
            this.zzn = jZzg;
            this.zzo = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzB() {
        this.zzd.zzi();
        this.zzs = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzF() {
        zzug zzugVar;
        this.zzd.zzC();
        if (Build.VERSION.SDK_INT < 35 || (zzugVar = this.zze) == null) {
            return;
        }
        zzugVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzY() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy {
        int i2;
        boolean z2;
        String str = zzvVar.zzo;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i3 = zzvVar.zzN;
        boolean zZzbd = zzuu.zzbd(zzvVar);
        int i5 = 1;
        if (!zZzbd || (i3 != 0 && zzvg.zza() == null)) {
            i2 = 0;
        } else {
            zzrj zzrjVar = this.zzd;
            zzpz zzpzVarZzf = zzrjVar.zzf(zzvVar);
            if (zzpzVarZzf.zzb) {
                i2 = true != zzpzVarZzf.zzc ? 512 : 1536;
                if (zzpzVarZzf.zzd) {
                    i2 |= 2048;
                }
            } else {
                i2 = 0;
            }
            if (zzrjVar.zzd(zzvVar)) {
                return i2 | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzrj zzrjVar2 = this.zzd;
            if (zzrjVar2.zzd(zzfj.zzy(2, zzvVar.zzG, zzvVar.zzH))) {
                List listZzbg = zzbg(zzuwVar, zzvVar, false, zzrjVar2);
                if (!listZzbg.isEmpty()) {
                    if (zZzbd) {
                        zzun zzunVar = (zzun) listZzbg.get(0);
                        boolean zZzc = zzunVar.zzc(zzvVar);
                        if (zZzc) {
                            z2 = true;
                        } else {
                            for (int i7 = 1; i7 < listZzbg.size(); i7++) {
                                zzun zzunVar2 = (zzun) listZzbg.get(i7);
                                if (zzunVar2.zzc(zzvVar)) {
                                    z2 = false;
                                    zZzc = true;
                                    zzunVar = zzunVar2;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        int i8 = true != zZzc ? 3 : 4;
                        int i9 = 8;
                        if (zZzc && zzunVar.zze(zzvVar)) {
                            i9 = 16;
                        }
                        return i8 | i9 | 32 | (true != zzunVar.zzg ? 0 : 64) | (true != z2 ? 0 : 128) | i2;
                    }
                    i5 = 2;
                }
            }
        }
        return i5 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final long zzah(long j2, long j3, boolean z2) {
        zzrj zzrjVar = this.zzd;
        boolean z3 = false;
        if (zzrjVar.zzn() && this.zzt != -9223372036854775807L) {
            z3 = true;
        }
        if (!this.zzs) {
            return (z3 || super.zzZ()) ? 1000000L : 10000L;
        }
        long jZzw = zzrjVar.zzw();
        if (!z3 || jZzw == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(jZzw, this.zzt - j2) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f)) - (zzfj.zzq(zzL().zzb()) - j3));
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzak(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzal(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @Nullable
    protected final zzio zzam(zzlh zzlhVar) throws zziw {
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        this.zzj = zzvVar;
        zzio zzioVarZzam = super.zzam(zzlhVar);
        this.zzc.zzc(zzvVar, zzioVarZzam);
        return zzioVarZzam;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzan(zzv zzvVar, @Nullable MediaFormat mediaFormat) throws zziw {
        int i2;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 29 && mediaFormat != null) {
            Set<String> set = this.zzf;
            if (!set.isEmpty()) {
                zzil zzilVar = zzil.zza;
                zzik zzikVar = new zzik();
                for (String str : set) {
                    if (mediaFormat.containsKey(str)) {
                        int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                        if (valueTypeForKey == 1) {
                            zzikVar.zza(str, mediaFormat.getInteger(str));
                        } else if (valueTypeForKey == 2) {
                            zzikVar.zzb(str, mediaFormat.getLong(str));
                        } else if (valueTypeForKey == 3) {
                            zzikVar.zzc(str, mediaFormat.getFloat(str));
                        } else if (valueTypeForKey == 4) {
                            zzikVar.zzd(str, mediaFormat.getString(str));
                        } else if (valueTypeForKey == 5) {
                            zzikVar.zze(str, mediaFormat.getByteBuffer(str));
                        }
                    }
                }
                zzil zzilVarZzg = zzikVar.zzg();
                if (!zzilVarZzg.equals(this.zzl)) {
                    this.zzl = zzilVarZzg;
                    this.zzc.zzn(zzilVarZzg);
                }
            }
        }
        zzv zzvVar2 = this.zzm;
        int[] iArr = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaE() != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(zzvVar.zzo) ? zzvVar.zzI : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? zzfj.zzz(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            zzt zztVar = new zzt();
            zztVar.zzm("audio/raw");
            zztVar.zzG(integer);
            zztVar.zzH(zzvVar.zzJ);
            zztVar.zzI(zzvVar.zzK);
            zztVar.zzk(zzvVar.zzl);
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzE(mediaFormat.getInteger("channel-count"));
            zztVar.zzF(mediaFormat.getInteger("sample-rate"));
            zzv zzvVarZzM = zztVar.zzM();
            if (this.zzh && zzvVarZzM.zzG == 6 && (i2 = zzvVar.zzG) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.zzi) {
                int i5 = zzvVarZzM.zzG;
                if (i5 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i5 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i5 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i5 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i5 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzvVar = zzvVarZzM;
        }
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                if (zzaD()) {
                    zzJ();
                }
                if (i7 < 29) {
                    z2 = false;
                }
                zzgrc.zzi(z2);
            }
            this.zzd.zzh(zzvVar, 0, iArr);
        } catch (zzre e2) {
            throw zzN(e2, e2.zza, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzap() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzar() throws zziw {
        try {
            this.zzd.zzl();
            if (zzba() != -9223372036854775807L) {
                this.zzt = zzba();
            }
        } catch (zzri e2) {
            throw zzN(e2, e2.zzc, e2.zzb, true != zzaD() ? 5002 : PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzas(zzih zzihVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzihVar.zza) == null || !Objects.equals(zzvVar.zzo, "audio/opus") || !zzaD()) {
            return;
        }
        ByteBuffer byteBuffer = zzihVar.zzf;
        byteBuffer.getClass();
        zzv zzvVar2 = zzihVar.zza;
        zzvVar2.getClass();
        int i2 = zzvVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzx(i2, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzA(long j2, boolean z2, boolean z3) throws zziw {
        super.zzA(j2, z2, z3);
        this.zzd.zzA();
        this.zzn = j2;
        this.zzt = -9223372036854775807L;
        this.zzq = false;
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzC() {
        zzbi();
        this.zzs = false;
        this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzZ() {
        if (super.zzZ() && this.zzd.zzm()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzae(zzv zzvVar) {
        zzJ();
        return this.zzd.zzd(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzuh zzaf(zzun zzunVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f3) {
        boolean z2;
        zzv zzvVar2;
        zzv[] zzvVarArrZzI = zzI();
        int length = zzvVarArrZzI.length;
        int iZzbh = zzbh(zzunVar, zzvVar);
        if (length != 1) {
            for (zzv zzvVar3 : zzvVarArrZzI) {
                if (zzunVar.zzf(zzvVar, zzvVar3).zzd != 0) {
                    iZzbh = Math.max(iZzbh, zzbh(zzunVar, zzvVar3));
                }
            }
        }
        this.zzg = iZzbh;
        String str = zzunVar.zza;
        int i2 = Build.VERSION.SDK_INT;
        this.zzh = false;
        if (str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder")) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzi = z2;
        String str2 = zzunVar.zzc;
        int i3 = this.zzg;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i5 = zzvVar.zzG;
        mediaFormat.setInteger("channel-count", i5);
        int i7 = zzvVar.zzH;
        mediaFormat.setInteger("sample-rate", i7);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        zzeh.zzb(mediaFormat, "max-input-size", i3);
        mediaFormat.setInteger("priority", 0);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f3);
        }
        String str3 = zzvVar.zzo;
        if ("audio/ac4".equals(str3)) {
            Pair pairZzd = zzdo.zzd(zzvVar);
            if (pairZzd != null) {
                zzeh.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZzd.first).intValue());
                zzeh.zzb(mediaFormat, AppLovinEventTypes.USER_COMPLETED_LEVEL, ((Integer) pairZzd.second).intValue());
            }
            if (i2 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzfj.zzy(4, i5, i7)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzr));
        }
        if (i2 >= 29) {
            this.zzk.zzb(mediaFormat);
        }
        if ("audio/raw".equals(zzunVar.zzb) && !"audio/raw".equals(str3)) {
            zzvVar2 = zzvVar;
        } else {
            zzvVar2 = null;
        }
        this.zzm = zzvVar2;
        return zzuh.zza(zzunVar, mediaFormat, zzvVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        int i2;
        int i3;
        zzio zzioVarZzf = zzunVar.zzf(zzvVar, zzvVar2);
        int i5 = zzioVarZzf.zze;
        if (zzaB(zzvVar2)) {
            i5 |= 32768;
        }
        if (zzbh(zzunVar, zzvVar2) > this.zzg) {
            i5 |= 64;
        }
        String str = zzunVar.zza;
        if (i5 != 0) {
            i3 = 0;
            i2 = i5;
        } else {
            i2 = 0;
            i3 = zzioVarZzf.zzd;
        }
        return new zzio(str, zzvVar, zzvVar2, i3, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaq(long j2, long j3, @Nullable zzuk zzukVar, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i5, long j4, boolean z2, boolean z3, zzv zzvVar) throws zziw {
        byteBuffer.getClass();
        this.zzt = -9223372036854775807L;
        if (this.zzm != null && (i3 & 2) != 0) {
            zzukVar.getClass();
            zzukVar.zzc(i2, false);
            return true;
        }
        if (z2) {
            if (zzukVar != null) {
                zzukVar.zzc(i2, false);
            }
            ((zzuu) this).zza.zzf += i5;
            this.zzd.zzj();
            return true;
        }
        try {
            if (this.zzd.zzk(byteBuffer, j4, i5)) {
                if (zzukVar != null) {
                    zzukVar.zzc(i2, false);
                }
                ((zzuu) this).zza.zze += i5;
                return true;
            }
            this.zzt = j4;
            return false;
        } catch (zzrf e2) {
            zzv zzvVar2 = this.zzj;
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e2, zzvVar2, false, 5001);
        } catch (zzri e3) {
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e3, zzvVar, e3.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final long zzg() {
        if (zze() == 2) {
            zzbi();
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzy(boolean z2, boolean z3) throws zziw {
        super.zzy(z2, z3);
        this.zzc.zza(((zzuu) this).zza);
        zzJ();
        zzrj zzrjVar = this.zzd;
        zzrjVar.zzb(zzK());
        zzrjVar.zzc(zzL());
    }
}
