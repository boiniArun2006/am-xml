package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzuq extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final zzun zzc;

    @Nullable
    public final String zzd;

    public zzuq(zzv zzvVar, @Nullable Throwable th, boolean z2, int i2) {
        String string = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i2);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = zzvVar.zzo;
        int iAbs = Math.abs(i2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iAbs).length() + 60);
        sb2.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb2.append(iAbs);
        this(string2, th, str, false, null, sb2.toString(), null);
    }

    final /* synthetic */ zzuq zza(zzuq zzuqVar) {
        return new zzuq(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzuqVar);
    }

    public zzuq(zzv zzvVar, @Nullable Throwable th, boolean z2, zzun zzunVar) {
        String str = zzunVar.zza;
        int length = str.length();
        String string = zzvVar.toString();
        StringBuilder sb = new StringBuilder(length + 23 + string.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(string);
        this(sb.toString(), th, zzvVar.zzo, false, zzunVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzuq(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z2, @Nullable zzun zzunVar, @Nullable String str3, @Nullable zzuq zzuqVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzunVar;
        this.zzd = str3;
    }
}
