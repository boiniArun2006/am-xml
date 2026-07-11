package zx;

import android.os.Build;
import android.os.Bundle;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f76723n = new Ml();
    private static String[] nr = {a.f62811a, "_locale", "_appVersion", "_deviceOS", "_platform", inFlMLxL.UqEzQvJOorKCQd, "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};
    private static boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static JSONArray f76724t;

    public static final boolean J2(String str, Bundle bundle) {
        if (!VmF.j.nr(Ml.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strT = t(jSONObject);
                if (strT == null) {
                    return false;
                }
                Object obj = jSONObject.get(strT);
                int iHashCode = strT.hashCode();
                if (iHashCode != 3555) {
                    if (iHashCode != 96727) {
                        if (iHashCode == 109267 && strT.equals("not")) {
                            return !J2(obj.toString(), bundle);
                        }
                    } else if (strT.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            if (!J2(jSONArray.get(i2).toString(), bundle)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (strT.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (J2(jSONArray2.get(i3).toString(), bundle)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return mUb(strT, jSONObject2, bundle);
            } catch (Throwable th) {
                VmF.j.rl(th, Ml.class);
            }
        }
        return false;
    }

    public static final void KN(Bundle bundle, String event) {
        if (VmF.j.nr(Ml.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!rl || bundle == null) {
                return;
            }
            try {
                rl(bundle, event);
                bundle.putString("_audiencePropertyIds", nr(bundle));
                bundle.putString("cs_maca", "1");
                xMQ(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
        }
    }

    public static final ArrayList O(JSONArray jSONArray) {
        if (VmF.j.nr(Ml.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(jSONArray.get(i2).toString());
            }
            return arrayList;
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0217 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:140:0x0222, B:142:0x0228, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:151:0x0257, B:154:0x025e, B:155:0x0262, B:157:0x0268, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:198:0x0316, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:146:0x024a, B:161:0x028a, B:164:0x0294, B:168:0x02b0, B:171:0x02ba, B:173:0x02c3, B:191:0x0301, B:176:0x02cc, B:179:0x02d5, B:181:0x02e3, B:184:0x02ec, B:186:0x02f5, B:193:0x030a, B:200:0x031f, B:203:0x0328, B:23:0x005c), top: B:209:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0268 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:140:0x0222, B:142:0x0228, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:151:0x0257, B:154:0x025e, B:155:0x0262, B:157:0x0268, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:198:0x0316, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:146:0x024a, B:161:0x028a, B:164:0x0294, B:168:0x02b0, B:171:0x02ba, B:173:0x02c3, B:191:0x0301, B:176:0x02cc, B:179:0x02d5, B:181:0x02e3, B:184:0x02ec, B:186:0x02f5, B:193:0x030a, B:200:0x031f, B:203:0x0328, B:23:0x005c), top: B:209:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0301 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:140:0x0222, B:142:0x0228, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:151:0x0257, B:154:0x025e, B:155:0x0262, B:157:0x0268, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:198:0x0316, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:146:0x024a, B:161:0x028a, B:164:0x0294, B:168:0x02b0, B:171:0x02ba, B:173:0x02c3, B:191:0x0301, B:176:0x02cc, B:179:0x02d5, B:181:0x02e3, B:184:0x02ec, B:186:0x02f5, B:193:0x030a, B:200:0x031f, B:203:0x0328, B:23:0x005c), top: B:209:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0316 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:140:0x0222, B:142:0x0228, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:151:0x0257, B:154:0x025e, B:155:0x0262, B:157:0x0268, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:198:0x0316, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:146:0x024a, B:161:0x028a, B:164:0x0294, B:168:0x02b0, B:171:0x02ba, B:173:0x02c3, B:191:0x0301, B:176:0x02cc, B:179:0x02d5, B:181:0x02e3, B:184:0x02ec, B:186:0x02f5, B:193:0x030a, B:200:0x031f, B:203:0x0328, B:23:0x005c), top: B:209:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean mUb(String variable, JSONObject values, Bundle bundle) {
        Object obj;
        if (VmF.j.nr(Ml.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(variable, "variable");
            Intrinsics.checkNotNullParameter(values, "values");
            String strT = t(values);
            if (strT == null) {
                return false;
            }
            String string = values.get(strT).toString();
            ArrayList<String> arrayListO = O(values.optJSONArray(strT));
            if (Intrinsics.areEqual(strT, "exists")) {
                return bundle != null && bundle.containsKey(variable) == Boolean.parseBoolean(string);
            }
            if (bundle != null) {
                String lowerCase = variable.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                obj = bundle.get(lowerCase);
                if (obj == null) {
                    obj = bundle != null ? bundle.get(variable) : null;
                    if (obj == null) {
                        return false;
                    }
                }
            }
            switch (strT.hashCode()) {
                case -1729128927:
                    if (strT.equals("i_not_contains")) {
                        String string2 = obj.toString();
                        Locale locale = Locale.ROOT;
                        String lowerCase2 = string2.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase3 = string.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase3, false, 2, (Object) null)) {
                        }
                    }
                    break;
                case -1179774633:
                    if (!strT.equals("is_any")) {
                    }
                    if (arrayListO == null) {
                        break;
                    }
                    break;
                case -1039699439:
                    if (!strT.equals("not_in")) {
                    }
                    if (arrayListO == null) {
                        break;
                    }
                    break;
                case -969266188:
                    if (strT.equals("starts_with")) {
                    }
                    break;
                case -966353971:
                    if (strT.equals("regex_match")) {
                    }
                    break;
                case -665609109:
                    if (!strT.equals("is_not_any")) {
                    }
                    if (arrayListO == null) {
                    }
                    break;
                case -567445985:
                    if (strT.equals("contains")) {
                    }
                    break;
                case -327990090:
                    if (!strT.equals("i_str_neq")) {
                        break;
                    } else {
                        String string3 = obj.toString();
                        Locale locale2 = Locale.ROOT;
                        String lowerCase4 = string3.toLowerCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase5 = string.toLowerCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!Intrinsics.areEqual(lowerCase4, lowerCase5)) {
                        }
                    }
                    break;
                case -159812115:
                    if (!strT.equals("i_is_any")) {
                    }
                    if (arrayListO != null && !arrayListO.isEmpty()) {
                        for (String str : arrayListO) {
                            Locale locale3 = Locale.ROOT;
                            String lowerCase6 = str.toLowerCase(locale3);
                            Intrinsics.checkNotNullExpressionValue(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            String lowerCase7 = obj.toString().toLowerCase(locale3);
                            Intrinsics.checkNotNullExpressionValue(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (Intrinsics.areEqual(lowerCase6, lowerCase7)) {
                                break;
                            }
                        }
                    }
                    break;
                case -92753547:
                    if (!strT.equals("i_str_not_in")) {
                    }
                    if (arrayListO == null) {
                        if (!arrayListO.isEmpty()) {
                            for (String str2 : arrayListO) {
                                Locale locale4 = Locale.ROOT;
                                String lowerCase8 = str2.toLowerCase(locale4);
                                Intrinsics.checkNotNullExpressionValue(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                String lowerCase9 = obj.toString().toLowerCase(locale4);
                                Intrinsics.checkNotNullExpressionValue(lowerCase9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                if (Intrinsics.areEqual(lowerCase8, lowerCase9)) {
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 60:
                    if (!strT.equals("<")) {
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                    }
                    break;
                case 61:
                    if (!strT.equals(l.ae)) {
                    }
                    break;
                case 62:
                    if (!strT.equals(">")) {
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                    }
                    break;
                case 1084:
                    if (!strT.equals("!=")) {
                    }
                    if (!Intrinsics.areEqual(obj.toString(), string)) {
                    }
                    break;
                case 1921:
                    if (!strT.equals("<=")) {
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                    }
                    break;
                case 1952:
                    if (!strT.equals("==")) {
                    }
                    break;
                case 1983:
                    if (!strT.equals(">=")) {
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                    }
                    break;
                case 3244:
                    if (!strT.equals("eq")) {
                    }
                    break;
                case 3294:
                    if (!strT.equals("ge")) {
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                    }
                    break;
                case 3309:
                    if (!strT.equals("gt")) {
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                    }
                    break;
                case 3365:
                    if (!strT.equals("in")) {
                    }
                    if (arrayListO == null) {
                    }
                    break;
                case 3449:
                    if (!strT.equals("le")) {
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                    }
                    break;
                case 3464:
                    if (!strT.equals("lt")) {
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                    }
                    break;
                case 3511:
                    if (!strT.equals("ne")) {
                    }
                    if (!Intrinsics.areEqual(obj.toString(), string)) {
                    }
                    break;
                case 102680:
                    if (!strT.equals("gte")) {
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                    }
                    break;
                case 107485:
                    if (!strT.equals("lte")) {
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                    }
                    break;
                case 108954:
                    if (!strT.equals("neq")) {
                    }
                    if (!Intrinsics.areEqual(obj.toString(), string)) {
                    }
                    break;
                case 127966736:
                    if (strT.equals("i_str_eq")) {
                        String string4 = obj.toString();
                        Locale locale5 = Locale.ROOT;
                        String lowerCase10 = string4.toLowerCase(locale5);
                        Intrinsics.checkNotNullExpressionValue(lowerCase10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase11 = string.toLowerCase(locale5);
                        Intrinsics.checkNotNullExpressionValue(lowerCase11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    }
                    break;
                case 127966857:
                    if (!strT.equals("i_str_in")) {
                    }
                    if (arrayListO != null) {
                        while (r8.hasNext()) {
                        }
                        break;
                    }
                    break;
                case 363990325:
                    if (strT.equals("i_contains")) {
                        String string5 = obj.toString();
                        Locale locale6 = Locale.ROOT;
                        String lowerCase12 = string5.toLowerCase(locale6);
                        Intrinsics.checkNotNullExpressionValue(lowerCase12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase13 = string.toLowerCase(locale6);
                        Intrinsics.checkNotNullExpressionValue(lowerCase13, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    }
                    break;
                case 1091487233:
                    if (!strT.equals("i_is_not_any")) {
                    }
                    if (arrayListO == null) {
                    }
                    break;
                case 1918401035:
                    if (strT.equals("not_contains") && !StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) string, false, 2, (Object) null)) {
                    }
                    break;
                case 1961112862:
                    if (strT.equals("i_starts_with")) {
                        String string6 = obj.toString();
                        Locale locale7 = Locale.ROOT;
                        String lowerCase14 = string6.toLowerCase(locale7);
                        Intrinsics.checkNotNullExpressionValue(lowerCase14, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase15 = string.toLowerCase(locale7);
                        Intrinsics.checkNotNullExpressionValue(lowerCase15, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    }
                    break;
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
            return false;
        }
    }

    public static final void n() {
        if (VmF.j.nr(Ml.class)) {
            return;
        }
        try {
            f76723n.Uo();
            if (f76724t != null) {
                rl = true;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
        }
    }

    public static final String nr(Bundle bundle) {
        String strOptString;
        if (VmF.j.nr(Ml.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f76724t;
            if (jSONArray == null) {
                return "[]";
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = f76724t;
            Intrinsics.checkNotNull(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                String strOptString2 = jSONArray2.optString(i2);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong("id");
                    if (jOptLong != 0 && (strOptString = jSONObject.optString("rule")) != null && J2(strOptString, bundle)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            String string = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONArray(res).toString()");
            return string;
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
            return null;
        }
    }

    public static final void rl(Bundle params, String event) {
        if (VmF.j.nr(Ml.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(event, "event");
            params.putString(a.f62811a, event);
            StringBuilder sb = new StringBuilder();
            vd vdVar = vd.f52821n;
            Locale localeNHg = vdVar.nHg();
            String language = localeNHg != null ? localeNHg.getLanguage() : null;
            String str = "";
            if (language == null) {
                language = "";
            }
            sb.append(language);
            sb.append('_');
            Locale localeNHg2 = vdVar.nHg();
            String country = localeNHg2 != null ? localeNHg2.getCountry() : null;
            if (country == null) {
                country = "";
            }
            sb.append(country);
            params.putString("_locale", sb.toString());
            String strJB = vdVar.jB();
            if (strJB == null) {
                strJB = "";
            }
            params.putString("_appVersion", strJB);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            params.putString("_deviceModel", str2);
            params.putString("_nativeAppID", s4.az());
            String strJB2 = vdVar.jB();
            if (strJB2 != null) {
                str = strJB2;
            }
            params.putString("_nativeAppShortVersion", str);
            params.putString("_timezone", vdVar.E2());
            params.putString("_carrier", vdVar.nY());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", vdVar.aYN());
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
        }
    }

    public static final String t(JSONObject logic) {
        if (VmF.j.nr(Ml.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> itKeys = logic.keys();
            if (itKeys.hasNext()) {
                return itKeys.next();
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
            return null;
        }
    }

    public static final void xMQ(Bundle params) {
        if (VmF.j.nr(Ml.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            for (String str : nr) {
                params.remove(str);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
        }
    }

    private Ml() {
    }

    private final void Uo() {
        if (!VmF.j.nr(this)) {
            try {
                QJ qjXQ = UGc.XQ(s4.az(), false);
                if (qjXQ == null) {
                    return;
                }
                f76724t = qjXQ.mUb();
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
