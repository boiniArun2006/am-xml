package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzes implements zzbe {
    private static final byte[] zza = new byte[0];
    private static final Set<String> zzb;
    private final String zzc;
    private final zzce zzd;
    private final zzbe zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    public static zzbe zza(zzcx zzcxVar, zzbe zzbeVar) throws GeneralSecurityException {
        try {
            return new zzes(zzww.zza(zzcm.zza(zzcxVar), zzakk.zza()), zzbeVar);
        } catch (zzalf e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    @Deprecated
    private zzes(zzww zzwwVar, zzbe zzbeVar) throws GeneralSecurityException {
        if (zzb.contains(zzwwVar.zzf())) {
            this.zzc = zzwwVar.zzf();
            this.zzd = zzcm.zza(((zzww) ((zzaky) zzww.zza(zzwwVar).zza(zzxu.RAW).zze())).zzk());
            this.zze = zzbeVar;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + zzwwVar.zzf() + ". Only Tink AEAD key types are supported.");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzbm zzbmVarZza = zzos.zza().zza(this.zzd, (Integer) null);
        byte[] bArrZzb = this.zze.zzb(((zzqe) zzpc.zza().zza(zzbmVarZza, zzqe.class, zzbj.zza())).zzd().zzd(), zza);
        if (bArrZzb.length <= 4096) {
            byte[] bArrZzb2 = ((zzbe) zzoz.zza().zza(zzbmVarZza, zzbe.class)).zzb(bArr, bArr2);
            return ByteBuffer.allocate(bArrZzb.length + 4 + bArrZzb2.length).putInt(bArrZzb.length).put(bArrZzb).put(bArrZzb2).array();
        }
        throw new GeneralSecurityException("length of encrypted DEK too large");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i2 = byteBufferWrap.getInt();
            if (i2 > 0 && i2 <= 4096 && i2 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i2];
                byteBufferWrap.get(bArr3, 0, i2);
                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
                return ((zzbe) zzoz.zza().zza(zzpc.zza().zza(zzqe.zza(this.zzc, zzajp.zza(this.zze.zza(bArr3, zza)), zzws.zza.SYMMETRIC, zzxu.RAW, null), zzbj.zza()), zzbe.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("length of encrypted DEK too large");
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
