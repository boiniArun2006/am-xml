package mV;

import B8M.eO;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import gAe.QJ;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 implements QJ {
    private static final String nr = "w6";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f70692t = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f70693n;
    private KeyStore rl;

    public w6() {
        this(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Uo() {
        return true;
    }

    synchronized boolean J2(String str) {
        String strRl;
        strRl = B8M.QJ.rl("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(nr, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                KN();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.rl = keyStore;
                keyStore.load(null);
                return this.rl.containsAlias(strRl);
            } catch (IOException e2) {
                throw new GeneralSecurityException(e2);
            }
        }
        return this.rl.containsAlias(strRl);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    @Override // gAe.QJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean n(String str) {
        boolean z2;
        String str2 = this.f70693n;
        if (str2 != null && str2.equals(str)) {
            return true;
        }
        if (this.f70693n == null) {
            z2 = str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return z2;
    }

    @Override // gAe.QJ
    public synchronized gAe.j rl(String str) {
        try {
            String str2 = this.f70693n;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f70693n, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return xMQ(new n(B8M.QJ.rl("android-keystore://", str), this.rl));
    }

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f70694n = null;
        KeyStore rl;

        public j() {
            this.rl = null;
            if (w6.Uo()) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.rl = keyStore;
                    keyStore.load(null);
                    return;
                } catch (IOException | GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            }
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
    }

    private w6(j jVar) {
        this.f70693n = jVar.f70694n;
        this.rl = jVar.rl;
    }

    static void O(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strRl = B8M.QJ.rl("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strRl, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    static boolean nr(String str) {
        w6 w6Var = new w6();
        synchronized (f70692t) {
            try {
                if (w6Var.J2(str)) {
                    return false;
                }
                O(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static gAe.j xMQ(gAe.j jVar) throws KeyStoreException {
        byte[] bArrT = eO.t(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrT, jVar.rl(jVar.n(bArrT, bArr), bArr))) {
            return jVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    private static void KN() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }
}
