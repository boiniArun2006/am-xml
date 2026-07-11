package aP;

import android.util.Patterns;
import com.applovin.sdk.AppLovinEventParameters;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {
    private static boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static JSONObject f12895O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f12896n = new j();
    private static Map nr;
    private static Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Map f12897t;

    public static final boolean J2() {
        if (VmF.j.nr(j.class)) {
            return false;
        }
        try {
            return J2;
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
            return false;
        }
    }

    private final float[] KN(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f3;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            int length = jSONArray.length();
            float f4 = 1.0f;
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                int i3 = 0;
                while (i3 < length2) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    f3 = f4;
                    try {
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "siblings.getJSONObject(i)");
                        if (O(jSONObject2)) {
                            fArr[9] = fArr[9] + f3;
                        }
                        i3++;
                        f4 = f3;
                    } catch (JSONException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
            f3 = f4;
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            ty(jSONObject, sb2, sb);
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "hintSB.toString()");
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "textSB.toString()");
            fArr[15] = qie("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? f3 : 0.0f;
            fArr[16] = qie("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? f3 : 0.0f;
            fArr[17] = qie("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string) ? f3 : 0.0f;
            fArr[18] = StringsKt.contains$default((CharSequence) str2, (CharSequence) "password", false, 2, (Object) null) ? f3 : 0.0f;
            fArr[19] = gh("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? f3 : 0.0f;
            fArr[20] = gh("(?i)(sign in)|login|signIn", str2) ? f3 : 0.0f;
            fArr[21] = gh("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? f3 : 0.0f;
            fArr[22] = qie("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? f3 : 0.0f;
            fArr[24] = qie("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? f3 : 0.0f;
            fArr[25] = gh("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? f3 : 0.0f;
            fArr[27] = gh("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? f3 : 0.0f;
            fArr[28] = qie("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? f3 : 0.0f;
            fArr[29] = qie("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? f3 : 0.0f;
            return fArr;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final boolean mUb(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z2;
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            boolean z3 = z2;
            JSONArray jSONArray2 = new JSONArray();
            if (z2) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i3));
                }
                return z3;
            }
            int length3 = jSONArrayOptJSONArray.length();
            for (int i5 = 0; i5 < length3; i5++) {
                JSONObject child = jSONArrayOptJSONArray.getJSONObject(i5);
                Intrinsics.checkNotNullExpressionValue(child, "child");
                if (mUb(child, jSONArray)) {
                    jSONArray2.put(child);
                    z3 = true;
                }
            }
            jSONObject.put("childviews", jSONArray2);
            return z3;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    public static final float[] n(JSONObject viewHierarchy, String appName) {
        if (VmF.j.nr(j.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!J2) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            try {
                String lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                JSONObject jSONObject = new JSONObject(viewHierarchy.optJSONObject("view").toString());
                String screenName = viewHierarchy.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                j jVar = f12896n;
                jVar.mUb(jSONObject, jSONArray);
                jVar.az(fArr, jVar.xMQ(jSONObject));
                JSONObject jSONObjectRl = jVar.rl(jSONObject);
                if (jSONObjectRl == null) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                jVar.az(fArr, jVar.KN(jSONObjectRl, jSONArray, screenName, string, lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
            return null;
        }
    }

    public static final void nr(File file) {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            try {
                f12895O = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f12895O = new JSONObject(new String(bArr, Charsets.UTF_8));
                rl = MapsKt.mapOf(TuplesKt.to("ENGLISH", "1"), TuplesKt.to("GERMAN", "2"), TuplesKt.to("SPANISH", "3"), TuplesKt.to("JAPANESE", "4"));
                f12897t = MapsKt.mapOf(TuplesKt.to("VIEW_CONTENT", "0"), TuplesKt.to("SEARCH", "1"), TuplesKt.to("ADD_TO_CART", "2"), TuplesKt.to("ADD_TO_WISHLIST", "3"), TuplesKt.to("INITIATE_CHECKOUT", "4"), TuplesKt.to("ADD_PAYMENT_INFO", "5"), TuplesKt.to("PURCHASE", "6"), TuplesKt.to("LEAD", "7"), TuplesKt.to("COMPLETE_REGISTRATION", "8"));
                nr = MapsKt.mapOf(TuplesKt.to("BUTTON_TEXT", "1"), TuplesKt.to("PAGE_TITLE", "2"), TuplesKt.to("RESOLVED_DOCUMENT_LINK", "3"), TuplesKt.to("BUTTON_ID", "4"));
                J2 = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    public static final String t(String buttonText, String activityName, String appName) {
        if (VmF.j.nr(j.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String lowerCase = (appName + " | " + activityName + ", " + buttonText).toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
            return null;
        }
    }

    private final void ty(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = strOptString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint", "");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = strOptString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    JSONObject currentChildView = jSONArrayOptJSONArray.getJSONObject(i2);
                    Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                    ty(currentChildView, sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final float[] xMQ(JSONObject jSONObject) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            Intrinsics.checkNotNullExpressionValue(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            String strOptString3 = jSONObject.optString("classname");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = strOptString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase()");
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (Uo(new String[]{"$", AppLovinEventParameters.REVENUE_AMOUNT, "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (Uo(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (Uo(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (Uo(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "checkbox", false, 2, (Object) null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (Uo(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "radio", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "button", false, 2, (Object) null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "childViews.getJSONObject(i)");
                    az(fArr, xMQ(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private j() {
    }

    private final boolean O(JSONObject jSONObject) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (((jSONObject.optInt("classtypebitmask") & 1) << 5) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final boolean Uo(String[] strArr, String[] strArr2) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final void az(float[] fArr, float[] fArr2) {
        if (!VmF.j.nr(this)) {
            try {
                int length = fArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    fArr[i2] = fArr[i2] + fArr2[i2];
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final boolean gh(String str, String str2) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final boolean qie(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f12895O;
            String strOptString = null;
            Map map = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rules");
                jSONObject = null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject3 != null) {
                Map map2 = rl;
                if (map2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                    map2 = null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) map2.get(str));
                if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                    Map map3 = f12897t;
                    if (map3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                        map3 = null;
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) map3.get(str2));
                    if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                        Map map4 = nr;
                        if (map4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                        } else {
                            map = map4;
                        }
                        strOptString = jSONObjectOptJSONObject2.optString((String) map.get(str3));
                    }
                }
            }
            if (strOptString == null) {
                return false;
            }
            return gh(strOptString, str4);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final JSONObject rl(JSONObject jSONObject) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "children.getJSONObject(i)");
                JSONObject jSONObjectRl = rl(jSONObject2);
                if (jSONObjectRl != null) {
                    return jSONObjectRl;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
        return null;
    }
}
