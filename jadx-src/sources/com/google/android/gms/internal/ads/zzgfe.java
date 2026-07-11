package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgfe {
    private MessageDigest zza;
    private final zzgoe zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzgfe(zzgoe zzgoeVar) {
        this.zzb = zzgoeVar;
    }

    final synchronized void zzb(SecureRandom secureRandom) {
        zzgoc zzgocVarZza = this.zzb.zza(Sdk.SDKError.Reason.AD_CONSUMED_VALUE);
        try {
            try {
                try {
                    zzgocVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (Throwable th) {
                    zzgocVarZza.zzb(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e2) {
                zzgocVarZza.zzb(e2);
            }
            zzgocVarZza.zzc();
        } catch (Throwable th2) {
            zzgocVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    final byte[] zzd(byte[] bArr, String str, boolean z2) throws UnsupportedEncodingException {
        int length = bArr.length;
        int i2 = true != z2 ? 255 : 239;
        zzgrc.zza(length <= i2);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i2 + 1).put((byte) length);
        if (length < i2) {
            int i3 = i2 - length;
            byte[] bArr2 = new byte[i3];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i3);
            System.arraycopy(bArr2, 0, bArr, length, i3);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z2) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzgfh[] zzgfhVarArr = new zzgfu().zzcK;
        int length2 = zzgfhVarArr.length;
        for (int i5 = 0; i5 < 12; i5++) {
            zzgfhVarArr[i5].zza(bArrArray, bArr3);
        }
        if (!zzgrt.zzc(str)) {
            new zzgfg(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final void zza() {
        if (!zzc()) {
            zzb(new SecureRandom());
        }
    }

    public final zzaxw zzf(byte[] bArr, String str) throws UnsupportedEncodingException {
        zzaxw zzaxwVarZza = zzaxx.zza();
        byte[] bArrZze = zze(bArr);
        zzian zzianVar = zzian.zza;
        zzaxwVarZza.zzb(zzian.zzs(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i3 = i2 * 255;
            int i5 = i3 + 255;
            if (length > i5) {
                length = i5;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i3, length));
            i2++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzaxwVarZza.zza(zzian.zzs(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzaxwVarZza;
    }

    public final String zzg(int i2, String str) throws UnsupportedEncodingException {
        zzawg zzawgVarZzj = zzaxg.zzj();
        zzawgVarZzj.zzl(i2);
        return Base64.encodeToString(zzd(((zzaxg) zzawgVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}
