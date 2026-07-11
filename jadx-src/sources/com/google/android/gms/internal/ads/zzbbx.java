package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbbx {
    private final zzbak zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    private final String zzc(byte[] bArr, String str) throws zzazo, UnsupportedEncodingException {
        return new String(this.zza.zzf().zzb(bArr, str), com.google.android.exoplayer2.C.UTF8_NAME);
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    final /* synthetic */ void zzb() {
        try {
            zzbak zzbakVar = this.zza;
            Class<?> clsLoadClass = zzbakVar.zze().loadClass(zzc(zzbakVar.zzg(), this.zzb));
            if (clsLoadClass != null) {
                this.zzd = clsLoadClass.getMethod(zzc(zzbakVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzazo | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            this.zzf.countDown();
            throw th;
        }
        this.zzf.countDown();
    }

    public zzbbx(zzbak zzbakVar, String str, String str2, Class... clsArr) {
        this.zza = zzbakVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzbakVar.zzd().submit(new zzbbw(this));
    }
}
