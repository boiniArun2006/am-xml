package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class MasterKey {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f41950n;
    private final KeyGenParameterSpec rl;

    public static final class Builder {
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f41952O;
        final Context Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f41953n;
        boolean nr;
        KeyGenParameterSpec rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        KeyScheme f41954t;

        @RequiresApi
        static class Api23Impl {

            @RequiresApi
            static class Api28Impl {
                @DoNotInline
                static void n(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            @RequiresApi
            static class Api30Impl {
                @DoNotInline
                static void n(KeyGenParameterSpec.Builder builder, int i2, int i3) {
                    builder.setUserAuthenticationParameters(i2, i3);
                }
            }

            static MasterKey n(Builder builder) {
                KeyScheme keyScheme = builder.f41954t;
                if (keyScheme == null && builder.rl == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (keyScheme == KeyScheme.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(builder.f41953n, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (builder.nr) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            Api30Impl.n(keySize, builder.f41952O, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(builder.f41952O);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && builder.J2 && builder.Uo.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        Api28Impl.n(keySize);
                    }
                    builder.rl = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = builder.rl;
                if (keyGenParameterSpec != null) {
                    return new MasterKey(MasterKeys.t(keyGenParameterSpec), builder.rl);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            @DoNotInline
            static String rl(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public Builder(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public Builder(Context context, String str) {
            this.Uo = context.getApplicationContext();
            this.f41953n = str;
        }

        public Builder rl(KeyScheme keyScheme) {
            if (AnonymousClass1.f41951n[keyScheme.ordinal()] == 1) {
                if (this.rl != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.f41954t = keyScheme;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + keyScheme);
        }

        public MasterKey n() {
            return Api23Impl.n(this);
        }
    }

    public enum KeyScheme {
        AES256_GCM
    }

    /* JADX INFO: renamed from: androidx.security.crypto.MasterKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f41951n;

        static {
            int[] iArr = new int[KeyScheme.values().length];
            f41951n = iArr;
            try {
                iArr[KeyScheme.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @RequiresApi
    static class Api23Impl {
        @DoNotInline
        static int n(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
        }

        @DoNotInline
        static boolean rl(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isUserAuthenticationRequired();
        }
    }

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static boolean n(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isStrongBoxBacked();
        }
    }

    String n() {
        return this.f41950n;
    }

    public boolean rl() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f41950n);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f41950n + ", isKeyStoreBacked=" + rl() + "}";
    }

    MasterKey(String str, Object obj) {
        this.f41950n = str;
        this.rl = (KeyGenParameterSpec) obj;
    }
}
