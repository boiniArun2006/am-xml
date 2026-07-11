package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zztu implements zzui {
    private final zzgru zza;
    private final zzgru zzb;

    public zztu(final int i2) {
        zzgru zzgruVar = new zzgru() { // from class: com.google.android.gms.internal.ads.zztt
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zztv.zzw(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzgru zzgruVar2 = new zzgru() { // from class: com.google.android.gms.internal.ads.zzts
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zztv.zzw(i2, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzgruVar;
        this.zzb = zzgruVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final /* bridge */ /* synthetic */ zzuk zzb(zzuh zzuhVar) throws IOException {
        throw null;
    }

    public final zztv zza(zzuh zzuhVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzun zzunVar = zzuhVar.zza;
        String str = zzunVar.zza;
        zztv zztvVar = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zztv zztvVar2 = new zztv(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), new zzty(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza()), zzuhVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzuhVar.zzd;
                    int i2 = 0;
                    if (surface == null && zzunVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i2 = 8;
                    }
                    zztvVar2.zzt(zzuhVar.zzb, surface, null, i2);
                    return zztvVar2;
                } catch (Exception e2) {
                    exc = e2;
                    zztvVar = zztvVar2;
                    if (zztvVar != null) {
                        zztvVar.zzl();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e3) {
                exc = e3;
            }
        } catch (Exception e4) {
            exc = e4;
            mediaCodecCreateByCodecName = null;
        }
    }
}
