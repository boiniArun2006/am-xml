package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhef implements zzhas {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zze;
    private final String zzc;
    private final zzhas zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zze = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    zzhef(zzhqf zzhqfVar, zzhas zzhasVar) throws GeneralSecurityException {
        if (zze.contains(zzhqfVar.zza())) {
            this.zzc = zzhqfVar.zza();
            zzhqe zzhqeVarZzg = zzhqf.zzg(zzhqfVar);
            zzhqeVarZzg.zzc(zzhqy.RAW);
            zzhbv.zzb(((zzhqf) zzhqeVarZzg.zzbu()).zzaN());
            this.zzd = zzhasVar;
            return;
        }
        String strZza = zzhqfVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + 67);
        sb.append("Unsupported DEK key type: ");
        sb.append(strZza);
        sb.append(". Only Tink AEAD key types are supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i2 = byteBufferWrap.getInt();
            if (i2 > 0 && i2 <= 4096 && i2 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i2];
                byteBufferWrap.get(bArr3, 0, i2);
                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
                byte[] bArrZza = this.zzd.zza(bArr3, zzb);
                String str = this.zzc;
                zzian zzianVar = zzian.zza;
                return ((zzhas) zzhkd.zza().zzd(zzhkg.zza().zzg(zzhlb.zza(str, zzian.zzs(bArrZza, 0, bArrZza.length), zzhqb.SYMMETRIC, zzhqy.RAW, null), zzhax.zza()), zzhas.class)).zza(bArr4, bArr2);
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
