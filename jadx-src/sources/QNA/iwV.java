package QNA;

import QNA.M;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class iwV implements M {
    private M.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final DAz f8119O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rv6 f8120n;
    private final s9b.I28 nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f8121t;
    private static final Pattern Uo = Pattern.compile("[^\\p{Alnum}]");
    private static final String KN = Pattern.quote("/");

    private synchronized String rl(String str, SharedPreferences sharedPreferences) {
        String strO;
        strO = O(UUID.randomUUID().toString());
        h1M.CN3.J2().xMQ("Created new Crashlytics installation ID: " + strO + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strO).putString("firebase.installation.id", str).apply();
        return strO;
    }

    @Override // QNA.M
    public synchronized M.j n() {
        if (!ty()) {
            return this.J2;
        }
        h1M.CN3.J2().xMQ("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesIk = Dsr.Ik(this.rl);
        String string = sharedPreferencesIk.getString("firebase.installation.id", null);
        h1M.CN3.J2().xMQ("Cached Firebase Installation ID: " + string);
        if (this.f8119O.nr()) {
            lej lejVarNr = nr(false);
            h1M.CN3.J2().xMQ("Fetched Firebase Installation ID: " + lejVarNr.rl());
            if (lejVarNr.rl() == null) {
                lejVarNr = new lej(string == null ? t() : string, null);
            }
            if (Objects.equals(lejVarNr.rl(), string)) {
                this.J2 = M.j.n(qie(sharedPreferencesIk), lejVarNr);
            } else {
                this.J2 = M.j.n(rl(lejVarNr.rl(), sharedPreferencesIk), lejVarNr);
            }
        } else if (gh(string)) {
            this.J2 = M.j.rl(qie(sharedPreferencesIk));
        } else {
            this.J2 = M.j.rl(rl(t(), sharedPreferencesIk));
        }
        h1M.CN3.J2().xMQ("Install IDs: " + this.J2);
        return this.J2;
    }

    private static String O(String str) {
        return Uo.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    private String az(String str) {
        return str.replaceAll(KN, "");
    }

    static boolean gh(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String qie(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    static String t() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private boolean ty() {
        M.j jVar = this.J2;
        if (jVar != null) {
            return jVar.O() == null && this.f8119O.nr();
        }
        return true;
    }

    public String J2() {
        return this.f8121t;
    }

    public String KN() {
        return String.format(Locale.US, "%s/%s", az(Build.MANUFACTURER), az(Build.MODEL));
    }

    public String Uo() {
        return this.f8120n.n(this.rl);
    }

    public String mUb() {
        return az(Build.VERSION.RELEASE);
    }

    public String xMQ() {
        return az(Build.VERSION.INCREMENTAL);
    }

    public iwV(Context context, String str, s9b.I28 i28, DAz dAz) {
        if (context != null) {
            if (str != null) {
                this.rl = context;
                this.f8121t = str;
                this.nr = i28;
                this.f8119O = dAz;
                this.f8120n = new rv6();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public lej nr(boolean z2) {
        String strRl;
        Zlm.Wre.O();
        String str = null;
        if (z2) {
            try {
                strRl = ((com.google.firebase.installations.Wre) Tasks.await(this.nr.n(false), 10000L, TimeUnit.MILLISECONDS)).rl();
            } catch (Exception e2) {
                h1M.CN3.J2().qie("Error getting Firebase authentication token.", e2);
                strRl = null;
            }
        } else {
            strRl = null;
        }
        try {
            str = (String) Tasks.await(this.nr.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e3) {
            h1M.CN3.J2().qie("Error getting Firebase installation id.", e3);
        }
        return new lej(str, strRl);
    }
}
