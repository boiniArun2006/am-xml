package X7;

import com.google.android.exoplayer2.C;
import com.google.firebase.Wre;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f11758n;
    private final Wre rl;

    public enum j {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    private File n() {
        if (this.f11758n == null) {
            synchronized (this) {
                try {
                    if (this.f11758n == null) {
                        this.f11758n = new File(this.rl.qie().getFilesDir(), "PersistedInstallation." + this.rl.Ik() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f11758n;
    }

    private JSONObject t() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(n());
            while (true) {
                try {
                    int i2 = fileInputStream.read(bArr, 0, 16384);
                    if (i2 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public Ml rl(Ml ml) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ml.nr());
            jSONObject.put("Status", ml.Uo().ordinal());
            jSONObject.put("AuthToken", ml.rl());
            jSONObject.put("RefreshToken", ml.J2());
            jSONObject.put("TokenCreationEpochInSecs", ml.KN());
            jSONObject.put("ExpiresInSecs", ml.t());
            jSONObject.put("FisError", ml.O());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.rl.qie().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(C.UTF8_NAME));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(n())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return ml;
    }

    public w6(Wre wre) {
        this.rl = wre;
    }

    public Ml nr() {
        JSONObject jSONObjectT = t();
        String strOptString = jSONObjectT.optString("Fid", null);
        int iOptInt = jSONObjectT.optInt("Status", j.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectT.optString("AuthToken", null);
        String strOptString3 = jSONObjectT.optString("RefreshToken", null);
        long jOptLong = jSONObjectT.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectT.optLong("ExpiresInSecs", 0L);
        return Ml.n().nr(strOptString).Uo(j.values()[iOptInt]).rl(strOptString2).J2(strOptString3).KN(jOptLong).t(jOptLong2).O(jSONObjectT.optString("FisError", null)).n();
    }
}
