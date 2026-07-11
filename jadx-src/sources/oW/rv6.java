package oW;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzbe;
import com.google.android.gms.internal.p002firebaseauthapi.zzcn;
import com.google.android.gms.internal.p002firebaseauthapi.zzco;
import com.google.android.gms.internal.p002firebaseauthapi.zzcy;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class rv6 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static rv6 f71514t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71515n;
    private final zzmy rl;

    public static rv6 rl(Context context, String str) {
        rv6 rv6Var = f71514t;
        if (rv6Var == null || !zzp.zza(rv6Var.f71515n, str)) {
            f71514t = new rv6(str, t(context, str));
        }
        return f71514t;
    }

    private rv6(String str, zzmy zzmyVar) {
        this.f71515n = str;
        this.rl = zzmyVar;
    }

    private static zzmy t(Context context, String str) {
        try {
            zzco.zza();
            return new zzmy.zza().zza(context, "StorageCryptoKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzcy.zzb).zza(String.format("android-keystore://firebear_main_key_id_for_storage_crypto.%s", str)).zza();
        } catch (IOException | GeneralSecurityException e2) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e2.getMessage());
            return null;
        }
    }

    public final String n(String str) {
        String str2;
        Preconditions.checkNotNull(str);
        zzmy zzmyVar = this.rl;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbe) this.rl.zza().zza(zzcn.zza(), zzbe.class)).zza(Base64.decode(str, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e2) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e2.getMessage());
            return null;
        }
    }

    public final String nr(String str) {
        String strEncodeToString;
        Preconditions.checkNotNull(str);
        zzmy zzmyVar = this.rl;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                strEncodeToString = Base64.encodeToString(((zzbe) this.rl.zza().zza(zzcn.zza(), zzbe.class)).zzb(str.getBytes(StandardCharsets.UTF_8), null), 2);
            }
            return strEncodeToString;
        } catch (GeneralSecurityException e2) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e2.getMessage());
            return null;
        }
    }
}
