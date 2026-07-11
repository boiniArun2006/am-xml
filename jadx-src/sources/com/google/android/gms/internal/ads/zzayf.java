package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzayf implements Runnable {
    private zzayf() {
        throw null;
    }

    /* synthetic */ zzayf(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzayg.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzayg.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzayg.zzb;
        } catch (Throwable th) {
            zzayg.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
