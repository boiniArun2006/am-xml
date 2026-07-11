package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzua extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;

    @Nullable
    @GuardedBy
    private MediaFormat zzh;

    @Nullable
    @GuardedBy
    private MediaFormat zzi;

    @Nullable
    @GuardedBy
    private MediaCodec.CodecException zzj;

    @Nullable
    @GuardedBy
    private MediaCodec.CryptoException zzk;

    @GuardedBy
    private long zzl;

    @GuardedBy
    private boolean zzm;

    @Nullable
    @GuardedBy
    private IllegalStateException zzn;

    @Nullable
    @GuardedBy
    private zzuj zzo;
    private final Object zza = new Object();

    @GuardedBy
    private final CircularIntArray zzd = new CircularIntArray();

    @GuardedBy
    private final CircularIntArray zze = new CircularIntArray();

    @GuardedBy
    private final ArrayDeque zzf = new ArrayDeque();

    @GuardedBy
    private final ArrayDeque zzg = new ArrayDeque();

    @GuardedBy
    private final boolean zzk() {
        return this.zzl > 0 || this.zzm;
    }

    @GuardedBy
    private final void zzj() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        this.zzd.rl();
        this.zze.rl();
        this.zzf.clear();
        arrayDeque.clear();
    }

    @GuardedBy
    private final void zzl(MediaFormat mediaFormat) {
        this.zze.n(-2);
        this.zzg.add(mediaFormat);
    }

    @GuardedBy
    private final void zzm() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.zza) {
            try {
                this.zzd.n(i2);
                zzuj zzujVar = this.zzo;
                if (zzujVar != null) {
                    zzuu zzuuVar = ((zzus) zzujVar).zza;
                    if (zzuuVar.zzbf() != null) {
                        zzuuVar.zzbf().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzl(mediaFormat);
                    this.zzi = null;
                }
                this.zze.n(i2);
                this.zzf.add(bufferInfo);
                zzuj zzujVar = this.zzo;
                if (zzujVar != null) {
                    zzuu zzuuVar = ((zzus) zzujVar).zza;
                    if (zzuuVar.zzbf() != null) {
                        zzuuVar.zzbf().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzl(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzgrc.zzi(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }

    public final void zzc(Runnable runnable) {
        synchronized (this.zza) {
            zzm();
            runnable.run();
        }
    }

    public final int zzd() {
        synchronized (this.zza) {
            try {
                zzm();
                int iO = -1;
                if (zzk()) {
                    return -1;
                }
                CircularIntArray circularIntArray = this.zzd;
                if (!circularIntArray.nr()) {
                    iO = circularIntArray.O();
                }
                return iO;
            } finally {
            }
        }
    }

    public final int zze(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzm();
                if (zzk()) {
                    return -1;
                }
                CircularIntArray circularIntArray = this.zze;
                if (circularIntArray.nr()) {
                    return -1;
                }
                int iO = circularIntArray.O();
                if (iO >= 0) {
                    if (this.zzh == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iO == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    iO = -2;
                }
                return iO;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat zzf() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzfj.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi();
                }
            });
        }
    }

    public final void zzh(zzuj zzujVar) {
        synchronized (this.zza) {
            this.zzo = zzujVar;
        }
    }

    final /* synthetic */ void zzi() {
        Object obj = this.zza;
        synchronized (obj) {
            try {
                if (this.zzm) {
                    return;
                }
                long j2 = this.zzl - 1;
                this.zzl = j2;
                if (j2 > 0) {
                    return;
                }
                if (j2 >= 0) {
                    zzj();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.zzn = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    zzua(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }
}
