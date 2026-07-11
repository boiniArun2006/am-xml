package cIr;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Xo {
    private static final String J2 = "cIr.Xo";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final oSp.n f43586O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f43587n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f43588t;

    public Xo(com.google.firebase.Wre wre) {
        this(wre.qie(), wre.ck(), ((aC) Dh.I28.O(wre)).ty());
    }

    private static String J2(int i2) {
        if (i2 == 2) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
        }
        if (i2 == 3) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
        }
        throw new IllegalArgumentException("Unknown token type.");
    }

    private String nr() {
        try {
            Context context = this.f43587n;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e(J2, "Could not get fingerprint hash for package: " + this.f43587n.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(J2, "No such package: " + this.f43587n.getPackageName(), e2);
            return null;
        }
    }

    private static final boolean Uo(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    String O() {
        Ip.Dsr dsr = (Ip.Dsr) this.f43586O.get();
        if (dsr != null) {
            try {
                return (String) Tasks.await(dsr.n());
            } catch (Exception unused) {
                Log.w(J2, "Unable to get heartbeats!");
            }
        }
        return null;
    }

    private String KN(URL url, byte[] bArr, eO eOVar, boolean z2) {
        InputStream errorStream;
        HttpURLConnection httpURLConnectionN = n(url);
        try {
            httpURLConnectionN.setDoOutput(true);
            httpURLConnectionN.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionN.setRequestProperty("Content-Type", "application/json");
            String strO = O();
            if (strO != null) {
                httpURLConnectionN.setRequestProperty("X-Firebase-Client", strO);
            }
            httpURLConnectionN.setRequestProperty("X-Android-Package", this.f43587n.getPackageName());
            httpURLConnectionN.setRequestProperty("X-Android-Cert", nr());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnectionN.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnectionN.getResponseCode();
                if (Uo(responseCode)) {
                    errorStream = httpURLConnectionN.getInputStream();
                } else {
                    errorStream = httpURLConnectionN.getErrorStream();
                }
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, com.google.android.exoplayer2.C.UTF8_NAME));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } finally {
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (Uo(responseCode)) {
                    if (z2) {
                        eOVar.t();
                    }
                    httpURLConnectionN.disconnect();
                    return string;
                }
                eOVar.nr(responseCode);
                Pl plN = Pl.n(string);
                throw new FirebaseException("Error returned from API. code: " + plN.rl() + " body: " + plN.t());
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnectionN.disconnect();
            throw th;
        }
    }

    HttpURLConnection n(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public j rl(byte[] bArr, int i2, eO eOVar) throws FirebaseException {
        if (eOVar.n()) {
            return j.n(KN(new URL(String.format(J2(i2), this.nr, this.f43588t, this.rl)), bArr, eOVar, true));
        }
        throw new FirebaseException("Too many attempts.");
    }

    public String t(byte[] bArr, eO eOVar) throws FirebaseException {
        if (eOVar.n()) {
            return KN(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", this.nr, this.f43588t, this.rl)), bArr, eOVar, false);
        }
        throw new FirebaseException("Too many attempts.");
    }

    Xo(Context context, com.google.firebase.qz qzVar, oSp.n nVar) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(qzVar);
        Preconditions.checkNotNull(nVar);
        this.f43587n = context;
        this.rl = qzVar.rl();
        this.f43588t = qzVar.t();
        String strO = qzVar.O();
        this.nr = strO;
        if (strO != null) {
            this.f43586O = nVar;
            return;
        }
        throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
    }
}
