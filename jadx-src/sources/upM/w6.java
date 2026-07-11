package upM;

import Vy.Dsr;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import fA.n;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static WindowManager f74605n;
    private static String[] rl = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static float f74606t = Resources.getSystem().getDisplayMetrics().density;

    public static boolean S(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && Z(jSONObject, jSONObject2) && XQ(jSONObject, jSONObject2) && o(jSONObject, jSONObject2) && r(jSONObject, jSONObject2) && Ik(jSONObject, jSONObject2) && ck(jSONObject, jSONObject2);
    }

    static float n(int i2) {
        return i2 / f74606t;
    }

    private static boolean qie(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74607n;

        static {
            int[] iArr = new int[Dsr.values().length];
            f74607n = iArr;
            try {
                iArr[Dsr.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final float f74608n;
        final float rl;

        n(float f3, float f4) {
            this.f74608n = f3;
            this.rl = f4;
        }
    }

    public static void HI(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e2) {
            Ml.rl("Error with setting not visible reason", e2);
        }
    }

    private static boolean Ik(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!qie(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            if (!jSONArrayOptJSONArray.optString(i2, "").equals(jSONArrayOptJSONArray2.optString(i2, ""))) {
                return false;
            }
        }
        return true;
    }

    public static void KN(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e2) {
            Ml.rl("Error with setting ad session id", e2);
        }
    }

    public static void Uo(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e2) {
            Ml.rl("Error with setting has window focus", e2);
        }
    }

    private static boolean XQ(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    private static boolean Z(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : rl) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean ck(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!qie(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            if (!S(jSONArrayOptJSONArray.optJSONObject(i2), jSONArrayOptJSONArray2.optJSONObject(i2))) {
                return false;
            }
        }
        return true;
    }

    private static boolean gh(Dsr dsr) {
        return j.f74607n[dsr.ordinal()] == 1;
    }

    public static void mUb(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void nr(Context context) {
        if (context != null) {
            f74606t = context.getResources().getDisplayMetrics().density;
            f74605n = (WindowManager) context.getSystemService("window");
        }
    }

    private static boolean o(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean r(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    public static JSONObject rl(int i2, int i3, int i5, int i7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", n(i2));
            jSONObject.put("y", n(i3));
            jSONObject.put("width", n(i5));
            jSONObject.put("height", n(i7));
            return jSONObject;
        } catch (JSONException e2) {
            Ml.rl("Error with creating viewStateObject", e2);
            return jSONObject;
        }
    }

    private static n t(JSONObject jSONObject) {
        float fN;
        float fN2;
        if (f74605n != null) {
            Point point = new Point(0, 0);
            f74605n.getDefaultDisplay().getRealSize(point);
            fN = n(point.x);
            fN2 = n(point.y);
        } else {
            fN = 0.0f;
            fN2 = 0.0f;
        }
        return new n(fN, fN2);
    }

    public static void J2(JSONObject jSONObject, n.j jVar) {
        jVar.n();
        JSONArray jSONArray = new JSONArray();
        Iterator it = jVar.rl().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            throw null;
        } catch (JSONException e2) {
            Ml.rl("Error with setting friendly obstruction", e2);
        }
    }

    public static void O(JSONObject jSONObject, Dsr dsr) {
        try {
            jSONObject.put("noOutputDevice", gh(dsr));
        } catch (JSONException e2) {
            Ml.rl("Error with setting output device status", e2);
        }
    }

    public static void az(JSONObject jSONObject) {
        n nVarT = t(jSONObject);
        try {
            jSONObject.put("width", nVarT.f74608n);
            jSONObject.put("height", nVarT.rl);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void ty(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e2) {
                Ml.rl("Error with setting is picture-in-picture active", e2);
            }
        }
    }

    public static void xMQ(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e2) {
            Ml.rl("JSONException during JSONObject.put for name [" + str + "]", e2);
        }
    }
}
