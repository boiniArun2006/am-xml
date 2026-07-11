package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzty implements zzul {

    @GuardedBy
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdq zzg;
    private boolean zzh;

    public zzty(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdq zzdqVar = new zzdq(zzdn.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdqVar;
        this.zzf = new AtomicReference();
    }

    private static zztx zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zztx();
                }
                return (zztx) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static int[] zzj(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Nullable
    private static byte[] zzk(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zztw(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdq zzdqVar = this.zzg;
                zzdqVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdqVar.zzc();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzh(Message message) {
        zztx zztxVar;
        int i2 = message.what;
        zztx zztxVar2 = null;
        if (i2 == 1) {
            zztxVar = (zztx) message.obj;
            try {
                this.zzc.queueInputBuffer(zztxVar.zza, 0, zztxVar.zzc, zztxVar.zze, zztxVar.zzf);
            } catch (RuntimeException e2) {
                androidx.compose.animation.core.fuX.n(this.zzf, null, e2);
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.zzg.zza();
                } else if (i2 != 4) {
                    androidx.compose.animation.core.fuX.n(this.zzf, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    try {
                        this.zzc.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e3) {
                        androidx.compose.animation.core.fuX.n(this.zzf, null, e3);
                    }
                }
                if (zztxVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zztxVar2);
                    }
                    return;
                }
                return;
            }
            zztxVar = (zztx) message.obj;
            int i3 = zztxVar.zza;
            MediaCodec.CryptoInfo cryptoInfo = zztxVar.zzd;
            long j2 = zztxVar.zze;
            int i5 = zztxVar.zzf;
            try {
                synchronized (zzb) {
                    this.zzc.queueSecureInputBuffer(i3, 0, cryptoInfo, j2, i5);
                }
            } catch (RuntimeException e4) {
                androidx.compose.animation.core.fuX.n(this.zzf, null, e4);
            }
        }
        zztxVar2 = zztxVar;
        if (zztxVar2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzb(int i2, int i3, int i5, long j2, int i7) {
        zzg();
        zztx zztxVarZzi = zzi();
        zztxVarZzi.zza(i2, 0, i5, j2, i7);
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(1, zztxVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzc(int i2, int i3, zzie zzieVar, long j2, int i5) {
        zzg();
        zztx zztxVarZzi = zzi();
        zztxVarZzi.zza(i2, 0, 0, j2, i5);
        MediaCodec.CryptoInfo cryptoInfo = zztxVarZzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzieVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzieVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzieVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzieVar.zzg, zzieVar.zzh));
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(2, zztxVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }
}
