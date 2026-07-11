package upM;

import android.os.Build;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class n {
    public static String n() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static JSONObject nr() {
        JSONObject jSONObject = new JSONObject();
        w6.xMQ(jSONObject, "deviceType", n());
        w6.xMQ(jSONObject, "osVersion", t());
        w6.xMQ(jSONObject, "os", rl());
        return jSONObject;
    }

    public static String rl() {
        return "Android";
    }

    public static String t() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }
}
