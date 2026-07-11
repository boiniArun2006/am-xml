package com.facebook.internal;

import YgZ.uQga.IYJfqUyym;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.internal.Pl;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.analytics.brandsafety.l;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class vd {
    private static Locale mUb;
    private static int rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final vd f52821n = new vd();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static long f52822t = -1;
    private static long nr = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static long f52820O = -1;
    private static String J2 = "";
    private static String Uo = "";
    private static String KN = "NoCarrier";
    private static String xMQ = "";

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface j {
        void n(JSONObject jSONObject);

        void rl(FacebookException facebookException);
    }

    public static final String G7(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i2 = inputStreamReader.read(cArr);
                        if (i2 == -1) {
                            String string = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "{\n      bufferedInputStr…gBuilder.toString()\n    }");
                            mUb(bufferedInputStream);
                            mUb(inputStreamReader);
                            return string;
                        }
                        sb.append(cArr, 0, i2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mUb(bufferedInputStream);
                    mUb(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    public static final boolean B(AccessToken accessToken) {
        return accessToken != null && Intrinsics.areEqual(accessToken, AccessToken.INSTANCE.O());
    }

    public static final void C(Bundle b2, String str, String str2) {
        Intrinsics.checkNotNullParameter(b2, "b");
        if (I(str2)) {
            return;
        }
        b2.putString(str, str2);
    }

    public static final boolean D(Uri uri) {
        return uri != null && StringsKt.equals(FileUploadManager.f61570h, uri.getScheme(), true);
    }

    public static final boolean E(Context context) {
        AutofillManager autofillManagerN;
        Intrinsics.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT >= 26 && (autofillManagerN = androidx.compose.ui.autofill.n.n(context.getSystemService(androidx.compose.ui.autofill.j.n()))) != null && autofillManagerN.isAutofillSupported() && autofillManagerN.isEnabled();
    }

    public static final String EWS(String str) {
        if (str == null) {
            return null;
        }
        return f52821n.P5("SHA-256", str);
    }

    public static final boolean FX(Uri uri) {
        return uri != null && StringsKt.equals(AppLovinEventTypes.USER_VIEWED_CONTENT, uri.getScheme(), true);
    }

    public static final void GD(JSONObject params, Context appContext) throws JSONException {
        Locale locale;
        int i2;
        Display display;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f52821n.Rl(appContext);
        String packageName = appContext.getPackageName();
        int i3 = 0;
        int i5 = -1;
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i5 = packageInfo.versionCode;
            xMQ = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i5);
        jSONArray.put(xMQ);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        mUb = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = mUb;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = mUb;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb.append(country != null ? country : "");
        jSONArray.put(sb.toString());
        jSONArray.put(J2);
        jSONArray.put(KN);
        double d2 = 0.0d;
        try {
            Object systemService = appContext.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            display = displayManager != null ? displayManager.getDisplay(0) : null;
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i7 = displayMetrics.widthPixels;
            try {
                i3 = displayMetrics.heightPixels;
                d2 = displayMetrics.density;
            } catch (Exception unused4) {
            }
            i2 = i3;
            i3 = i7;
        } else {
            i2 = 0;
        }
        jSONArray.put(i3);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(f52821n.ul());
        jSONArray.put(nr);
        jSONArray.put(f52820O);
        jSONArray.put(Uo);
        params.put("extinfo", jSONArray.toString());
    }

    public static final boolean GR(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final Map HI(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = jSONArrayNames.getString(i2);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = HI((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    map.put(string, value);
                } catch (JSONException unused) {
                }
            }
        }
        return map;
    }

    public static final void HV(JSONObject params, com.facebook.internal.j jVar, String str, boolean z2, Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        Pl.n nVar = Pl.n.ServiceUpdateCompliance;
        if (!Pl.Uo(nVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z2);
        params.put("advertiser_id_collection_enabled", com.facebook.s4.gh());
        if (jVar != null) {
            if (Pl.Uo(nVar)) {
                f52821n.t(params, jVar, str, context);
            }
            if (jVar.mUb() != null) {
                if (Pl.Uo(nVar)) {
                    f52821n.nr(params, jVar, context);
                } else {
                    params.put("attribution", jVar.mUb());
                }
            }
            if (jVar.KN() != null) {
                params.put("advertiser_id", jVar.KN());
                params.put("advertiser_tracking_enabled", !jVar.gh());
            }
            if (!jVar.gh()) {
                String strRl = com.facebook.appevents.Zs.rl();
                if (strRl.length() != 0) {
                    params.put("ud", strRl);
                }
            }
            if (jVar.xMQ() != null) {
                params.put("installer_package", jVar.xMQ());
            }
        }
        UiE.aC aCVarN = UiE.aC.rl.n();
        Object objO = aCVarN != null ? aCVarN.O("campaign_ids") : null;
        if (objO != null) {
            params.put("campaign_ids", objO);
        }
    }

    public static final boolean I(String str) {
        return str == null || str.length() == 0;
    }

    public static final int Ik(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[8192];
            int i2 = 0;
            while (true) {
                int i3 = bufferedInputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                outputStream.write(bArr, 0, i3);
                i2 += i3;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i2;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static final boolean J() {
        if (VmF.j.nr(vd.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectFD = fD();
            if (jSONObjectFD == null) {
                return false;
            }
            try {
                JSONArray jSONArray = jSONObjectFD.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String string = jSONArray.getString(i2);
                    Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (Intrinsics.areEqual(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, vd.class);
            return false;
        }
    }

    public static final JSONObject J2(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject jSONObjectN = u.n(accessToken);
        if (jSONObjectN != null) {
            return jSONObjectN;
        }
        com.facebook.g9s g9sVarGh = f52821n.X(accessToken).gh();
        if (g9sVarGh.rl() != null) {
            return null;
        }
        return g9sVarGh.nr();
    }

    private final void Jk(Context context) {
        if (Intrinsics.areEqual(KN, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                KN = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    public static final boolean M(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        return new Regex(".+_cheets|cheets_.+").matches(DEVICE);
    }

    public static final Map Mx(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(j callback, String accessToken, com.facebook.g9s response) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.rl() != null) {
            callback.rl(response.rl().getException());
            return;
        }
        JSONObject jSONObjectNr = response.nr();
        if (jSONObjectNr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        u.rl(accessToken, jSONObjectNr);
        callback.n(response.nr());
    }

    public static final boolean Nxk(Uri uri) {
        if (uri != null) {
            return StringsKt.equals(g.f62375e, uri.getScheme(), true) || StringsKt.equals("https", uri.getScheme(), true) || StringsKt.equals("fbstaging", uri.getScheme(), true);
        }
        return false;
    }

    public static final boolean O(Object obj, Object obj2) {
        return obj == null ? obj2 == null : Intrinsics.areEqual(obj, obj2);
    }

    private final String P5(String str, String str2) {
        byte[] bytes = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return M7(str, bytes);
    }

    public static final String Po6(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, IYJfqUyym.MsjgUSkETU);
        return f52821n.M7("SHA-1", bArr);
    }

    private final void Rl(Context context) {
        if (f52822t == -1 || System.currentTimeMillis() - f52822t >= 1800000) {
            f52822t = System.currentTimeMillis();
            qm();
            Jk(context);
            mYa();
            eWT();
        }
    }

    public static final String S(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String strTy = com.facebook.s4.ty();
            if (strTy != null) {
                return strTy;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final void T(final String accessToken, final j callback) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject jSONObjectN = u.n(accessToken);
        if (jSONObjectN != null) {
            callback.n(jSONObjectN);
            return;
        }
        GraphRequest.n nVar = new GraphRequest.n() { // from class: com.facebook.internal.M
            @Override // com.facebook.GraphRequest.n
            public final void n(com.facebook.g9s g9sVar) {
                vd.N(callback, accessToken, g9sVar);
            }
        };
        GraphRequest graphRequestX = f52821n.X(accessToken);
        graphRequestX.fD(nVar);
        graphRequestX.qie();
    }

    public static final void UhV(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final Uri Uo(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static final Date ViF(Bundle bundle, String str, Date dateBase) {
        long jLongValue;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (jLongValue * 1000));
    }

    private final GraphRequest X(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", rV9(iF()));
        bundle.putString("access_token", str);
        GraphRequest graphRequestViF = GraphRequest.ty.ViF(null, null);
        graphRequestViF.T(bundle);
        graphRequestViF.X(com.facebook.afx.GET);
        return graphRequestViF;
    }

    public static final String XQ(Context context) {
        if (context == null) {
            return V8ValueNull.NULL;
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final Object Xw(JSONObject jsonObject, String str, String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object objOpt = jsonObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, objOpt);
        return jSONObject;
    }

    public static final Set Y(JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jsonArray.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final String Z(int i2) {
        String string = new BigInteger(i2 * 5, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(string, "BigInteger(length * 5, r).toString(32)");
        return string;
    }

    private final boolean a(Context context) {
        Method methodV = v("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodV == null) {
            return false;
        }
        Object objP5 = p5(null, methodV, context);
        return (objP5 instanceof Integer) && Intrinsics.areEqual(objP5, (Object) 0);
    }

    public static final HashSet az(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final Map ck(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jsonObject.optString(key);
            if (strOptString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    public static final Map dR0(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final boolean eF() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.s4.az()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextQie = com.facebook.s4.qie();
            PackageManager packageManager = contextQie.getPackageManager();
            String packageName = contextQie.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final String eTf(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f52821n.P5("MD5", key);
    }

    public static final JSONObject fD() {
        if (VmF.j.nr(vd.class)) {
            return null;
        }
        try {
            String string = com.facebook.s4.qie().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, vd.class);
            return null;
        }
    }

    public static final Map fcU(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            map.put(parcel.readString(), parcel.readString());
        }
        return map;
    }

    public static final long g(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursorQuery = null;
        try {
            cursorQuery = com.facebook.s4.qie().getContentResolver().query(contentUri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j2 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j2;
        } finally {
        }
    }

    public static final void hRu(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    private final String iF() {
        AccessToken accessTokenO = AccessToken.INSTANCE.O();
        return (accessTokenO == null || accessTokenO.getGraphDomain() == null) ? "facebook" : accessTokenO.getGraphDomain();
    }

    public static final List k(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jsonArray.getString(i2));
        }
        return arrayList;
    }

    public static final String m(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String string = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        Intrinsics.checkNotNullExpressionValue(string, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        return string;
    }

    public static final void mUb(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n1(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    private final void nr(JSONObject jSONObject, com.facebook.internal.j jVar, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !a(context)) {
            jSONObject.put("attribution", jVar.mUb());
        } else {
            if (jVar.gh()) {
                return;
            }
            jSONObject.put("attribution", jVar.mUb());
        }
    }

    private final boolean o() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    public static final boolean ofS(Bundle bundle, String str, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    public static final Object p5(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final Bundle pJg(String str) {
        Bundle bundle = new Bundle();
        if (!I(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            for (String str2 : (String[]) StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null).toArray(new String[0])) {
                String[] strArr = (String[]) StringsKt.split$default((CharSequence) str2, new String[]{l.ae}, false, 0, 6, (Object) null).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], com.google.android.exoplayer2.C.UTF8_NAME), URLDecoder.decode(strArr[1], com.google.android.exoplayer2.C.UTF8_NAME));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], com.google.android.exoplayer2.C.UTF8_NAME), "");
                    }
                } catch (UnsupportedEncodingException e2) {
                    z("FacebookSDK", e2);
                }
            }
        }
        return bundle;
    }

    private final long qie(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    public static final void r(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    private final String rV9(String str) {
        return Intrinsics.areEqual(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public static final String s7N(Context context) {
        Lu.mUb(context, "context");
        return com.facebook.s4.az();
    }

    private final void t(JSONObject jSONObject, com.facebook.internal.j jVar, String str, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !a(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (jVar.gh()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    public static final List ty(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jsonArray.getString(i2);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    private final int ul() {
        int i2 = rl;
        if (i2 > 0) {
            return i2;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.rv6
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return vd.n1(file, str);
                }
            });
            if (fileArrListFiles != null) {
                rl = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (rl <= 0) {
            rl = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return rl;
    }

    public static final Method v(String className, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return wTp(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Method wTp(Class clazz, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final void xMQ(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            vd vdVar = f52821n;
            vdVar.KN(context, "facebook.com");
            vdVar.KN(context, ".facebook.com");
            vdVar.KN(context, "https://facebook.com");
            vdVar.KN(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final boolean xg(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return E(context);
    }

    public final String E2() {
        return Uo;
    }

    public final long aYN() {
        return f52820O;
    }

    public final String jB() {
        return xMQ;
    }

    public final Locale nHg() {
        return mUb;
    }

    public final String nY() {
        return KN;
    }

    private vd() {
    }

    private final void KN(Context context, String str) {
        int i2;
        boolean z2;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0])) {
            String[] strArr = (String[]) StringsKt.split$default((CharSequence) str2, new String[]{l.ae}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i3 = 0;
                boolean z3 = false;
                while (i3 <= length) {
                    if (!z3) {
                        i2 = i3;
                    } else {
                        i2 = length;
                    }
                    if (Intrinsics.compare((int) str3.charAt(i2), 32) <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z3) {
                        if (!z2) {
                            z3 = true;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                sb.append(str3.subSequence(i3, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.removeExpiredCookie();
    }

    private final String M7(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            return U(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final void Org(Runnable runnable) {
        try {
            com.facebook.s4.Z().execute(runnable);
        } catch (Exception unused) {
        }
    }

    private final String U(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        for (byte b2 : digest) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & 15));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    public static final String WPU() {
        Context contextQie = com.facebook.s4.qie();
        if (contextQie == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextQie.getPackageManager().getPackageInfo(contextQie.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final Locale bzg() {
        try {
            return com.facebook.s4.qie().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String e(String str) {
        String strXQ = com.facebook.s4.XQ();
        if (str != null) {
            if (Intrinsics.areEqual(str, "gaming")) {
                return StringsKt.replace$default(strXQ, "facebook.com", "fb.gg", false, 4, (Object) null);
            }
            if (Intrinsics.areEqual(str, "instagram")) {
                return StringsKt.replace$default(strXQ, "facebook.com", "instagram.com", false, 4, (Object) null);
            }
        }
        return strXQ;
    }

    private final void eWT() {
        try {
            if (o()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f52820O = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f52820O = qie(f52820O);
        } catch (Exception unused) {
        }
    }

    public static final String gh(String str, String str2) {
        if (I(str)) {
            return str2;
        }
        return str;
    }

    public static final void ijL(String str, String str2, Throwable th) {
        if (com.facebook.s4.fD() && !I(str)) {
            Log.d(str, str2, th);
        }
    }

    private final void mYa() {
        try {
            if (o()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                nr = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            nr = qie(nr);
        } catch (Exception unused) {
        }
    }

    public static final void piY(String str, String str2) {
        if (com.facebook.s4.fD() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    private final void qm() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            J2 = displayName;
            String id = timeZone.getID();
            Intrinsics.checkNotNullExpressionValue(id, "tz.id");
            Uo = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    public static final Locale te() {
        Locale localeBzg = bzg();
        if (localeBzg == null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            return locale;
        }
        return localeBzg;
    }

    public static final void z(String str, Exception exc) {
        if (com.facebook.s4.fD() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }
}
