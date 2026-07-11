package F5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f2509n;

    private File n() {
        return this.f2509n;
    }

    public JSONObject rl() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        h1M.CN3.J2().rl("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileN = n();
                if (fileN.exists()) {
                    fileInputStream = new FileInputStream(fileN);
                    try {
                        jSONObject = new JSONObject(QNA.Dsr.te(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        h1M.CN3.J2().O("Failed to fetch cached settings", e);
                        QNA.Dsr.J2(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    h1M.CN3.J2().xMQ("Settings file does not exist.");
                    jSONObject = null;
                }
                QNA.Dsr.J2(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                QNA.Dsr.J2(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            QNA.Dsr.J2(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void t(long j2, JSONObject jSONObject) throws Throwable {
        FileWriter fileWriter;
        h1M.CN3.J2().xMQ("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j2);
                    fileWriter = new FileWriter(n());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                QNA.Dsr.J2(fileWriter, "Failed to close settings writer.");
            } catch (Exception e3) {
                e = e3;
                fileWriter2 = fileWriter;
                h1M.CN3.J2().O("Failed to cache settings", e);
                QNA.Dsr.J2(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                QNA.Dsr.J2(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }

    public j(E8K.CN3 cn3) {
        this.f2509n = cn3.Uo("com.crashlytics.settings.json");
    }
}
