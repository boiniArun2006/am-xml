package h1M;

import android.content.Context;
import com.bendingspoons.legal.privacy.Tracker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f67943n;
    private n rl = null;

    private class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f67944n;
        private final String rl;

        private n() {
            int iCk = QNA.Dsr.ck(Wre.this.f67943n, "com.google.firebase.crashlytics.unity_version", "string");
            if (iCk == 0) {
                if (!Wre.this.t("flutter_assets/NOTICES.Z")) {
                    this.f67944n = null;
                    this.rl = null;
                    return;
                } else {
                    this.f67944n = "Flutter";
                    this.rl = null;
                    CN3.J2().xMQ("Development platform is: Flutter");
                    return;
                }
            }
            this.f67944n = Tracker.Unity.NAME;
            String string = Wre.this.f67943n.getResources().getString(iCk);
            this.rl = string;
            CN3.J2().xMQ("Unity Editor version is: " + string);
        }
    }

    private n J2() {
        if (this.rl == null) {
            this.rl = new n();
        }
        return this.rl;
    }

    public static boolean Uo(Context context) {
        return QNA.Dsr.ck(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(String str) {
        if (this.f67943n.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f67943n.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public Wre(Context context) {
        this.f67943n = context;
    }

    public String O() {
        return J2().rl;
    }

    public String nr() {
        return J2().f67944n;
    }
}
