package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.RequiresApi;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zznd implements zzca {
    private static final Object zza = new Object();

    @RequiresApi
    public zznd() throws GeneralSecurityException {
        this(new zza());
    }

    static /* synthetic */ boolean zza() {
        return true;
    }

    public static final class zza {
        @RequiresApi
        public zza() {
            zznd.zza();
        }
    }

    private zznd(zza zzaVar) {
    }

    @RequiresApi
    static boolean zzc(String str) throws GeneralSecurityException {
        synchronized (zza) {
            try {
                String strZza = zzzz.zza("android-keystore://", str);
                if (zznc.zzb(strZza)) {
                    return false;
                }
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strZza, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(keyGenParameterSpecBuild);
                keyGenerator.generateKey();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final zzbe zza(String str) throws GeneralSecurityException {
        zzne zzneVar;
        try {
            synchronized (zza) {
                try {
                    zzneVar = new zzne(zzzz.zza("android-keystore://", str));
                    byte[] bArrZza = zzqg.zza(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(bArrZza, zzneVar.zza(zzneVar.zzb(bArrZza, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzneVar;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    @RequiresApi
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
