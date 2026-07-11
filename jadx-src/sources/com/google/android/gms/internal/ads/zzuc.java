package com.google.android.gms.internal.ads;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzuc implements zzui {

    @Nullable
    private final Context zza;

    @Deprecated
    public zzuc() {
        this.zza = null;
    }

    public zzuc(Context context, @Nullable zzgru zzgruVar, @Nullable zzgru zzgruVar2) {
        this.zza = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    @Override // com.google.android.gms.internal.ads.zzui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzuk zzb(zzuh zzuhVar) throws Throwable {
        Context context;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || ((context = this.zza) != null && i2 >= 28 && context.getPackageManager().hasSystemFeature(pTYaLzzmJSGAPQ.yPJYCLtc))) {
            int iZzf = zzas.zzf(zzuhVar.zzc.zzo);
            zzee.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfj.zzP(iZzf)));
            return new zztu(iZzf).zza(zzuhVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzun zzunVar = zzuhVar.zza;
            String str = zzunVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzuhVar.zzd;
                int i3 = 0;
                if (surface == null && zzunVar.zzh && i2 >= 35) {
                    i3 = 8;
                }
                mediaCodecCreateByCodecName.configure(zzuhVar.zzb, surface, (MediaCrypto) null, i3);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zzvh(mediaCodecCreateByCodecName, zzuhVar.zzf, null);
            } catch (IOException e2) {
                e = e2;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                }
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }
}
