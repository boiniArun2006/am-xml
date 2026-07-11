package X7;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.Wre;
import com.safedk.android.analytics.brandsafety.l;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String[] f11756t = {"*", "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedPreferences f11757n;
    private final String rl;

    private String KN() {
        synchronized (this.f11757n) {
            try {
                String string = this.f11757n.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyO = O(string);
                if (publicKeyO == null) {
                    return null;
                }
                return t(publicKeyO);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private PublicKey O(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    private String Uo() {
        String string;
        synchronized (this.f11757n) {
            string = this.f11757n.getString("|S|id", null);
        }
        return string;
    }

    private String n(String str, String str2) {
        return "|T|" + str + l.ad + str2;
    }

    private String nr(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public String J2() {
        synchronized (this.f11757n) {
            try {
                String strUo = Uo();
                if (strUo != null) {
                    return strUo;
                }
                return KN();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String xMQ() {
        synchronized (this.f11757n) {
            try {
                for (String str : f11756t) {
                    String string = this.f11757n.getString(n(this.rl, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = nr(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public n(Wre wre) {
        this.f11757n = wre.qie().getSharedPreferences("com.google.android.gms.appid", 0);
        this.rl = rl(wre);
    }

    private static String rl(Wre wre) {
        String strNr = wre.ck().nr();
        if (strNr != null) {
            return strNr;
        }
        String strT = wre.ck().t();
        if (!strT.startsWith("1:") && !strT.startsWith("2:")) {
            return strT;
        }
        String[] strArrSplit = strT.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String t(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }
}
