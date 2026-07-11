package oW;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbg;
import com.google.android.gms.internal.p002firebaseauthapi.zzbh;
import com.google.android.gms.internal.p002firebaseauthapi.zzbx;
import com.google.android.gms.internal.p002firebaseauthapi.zzks;
import com.google.android.gms.internal.p002firebaseauthapi.zzkv;
import com.google.android.gms.internal.p002firebaseauthapi.zzlg;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class KH {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static KH f71459t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71460n;
    private final zzmy rl;

    public static KH t(Context context, String str) {
        KH kh = f71459t;
        if (kh == null || !zzp.zza(kh.f71460n, str)) {
            f71459t = new KH(context, str, true);
        }
        return f71459t;
    }

    public final String n() {
        if (this.rl == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbx zzbxVarZza = zzbg.zza(byteArrayOutputStream);
        try {
            synchronized (this.rl) {
                this.rl.zza().zzb().zza(zzbxVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e2.getMessage());
            return null;
        }
    }

    public final String rl(String str) {
        String str2;
        zzmy zzmyVar = this.rl;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbh) this.rl.zza().zza(zzkv.zza(), zzbh.class)).zza(Base64.decode(str, 8), null), com.google.android.exoplayer2.C.UTF8_NAME);
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e2.getMessage());
            return null;
        }
    }

    private KH(Context context, String str, boolean z2) {
        zzmy zzmyVarZza;
        this.f71460n = str;
        try {
            zzks.zza();
            zzmy.zza zzaVarZza = new zzmy.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzlg.zza);
            zzaVarZza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmyVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e2.getMessage());
            zzmyVarZza = null;
        }
        this.rl = zzmyVarZza;
    }
}
