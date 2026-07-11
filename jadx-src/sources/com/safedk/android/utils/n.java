package com.safedk.android.utils;

import aT.dE.JLZo;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.WebView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.applovin.mediation.ads.MaxAdView;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
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
import java.util.SortedMap;
import java.util.Stack;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.UByte;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f63216A = "samsungapps://ProductDetail/";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f63217B = "http://play.google.com/store/apps/details?id=";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f63218C = "https://play.google.com/store/apps/details?id=";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final Map<String, String> f63219D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63220a = "UNKNOWN_PROCESS";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f63221b = "data:text/html";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f63222c = "Accept";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f63224e = "text:";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f63225f = "java.lang.String";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f63227h = "Utils";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f63228i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f63230k = "com.applovin.sdk.AppLovinSdk";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f63231l = "VERSION";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f63232m = "video/";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f63237r = "https://www.youtube.com/watch?v=";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f63240u = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f63244y = "market://details?id=";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f63245z = "amzn://apps/android?p=";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f63229j = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f63223d = "mp4";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f63233n = {"jpg", "jpeg", "gif", "png", f63223d, "m4v", "js", "css", CreativeInfo.al, "mkv", "3gp", "3gpp", "webm", "mp3", "htm", "svg", "3g2", "avi", "mpg", "mpeg", "mov", "qt", "zip", "webp", "raw", "image"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final HashSet<String> f63234o = new HashSet<>(Arrays.asList(f63233n));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String[] f63235p = {"image"};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final HashSet<String> f63236q = new HashSet<>(Arrays.asList(f63235p));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final List<String> f63238s = Arrays.asList("gif", "jpg", "jpeg", "png", "bmp", "webp");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List<String> f63239t = Arrays.asList(f63223d, "m4v", "webm", "avi", "mpg", "mpeg", "mov", "qt", "3gp", "3gpp");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static Map<String, String> f63226g = new HashMap<String, String>() { // from class: com.safedk.android.utils.Utils$1
        {
            put("sms", "SMS MMS");
            put("calllog", "Call Log");
            put("packagemanager", "User Apps");
            put("advertising_identifier", "Identifier for Advertising");
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String[] f63241v = {"expire", "ei", "sig", "lsig", "mt", "lmt", "cpn"};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String[] f63242w = {f63223d, "m4v", "mkv", "3gp", "3gpp", "webm", "mov"};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String[] f63243x = {"jpg", "jpeg", "gif", "png", f63223d, "m4v", "mkv", "3gp", "3gpp", "webm", "mp3", "htm", "js", "css", CreativeInfo.al, "svg", "3g2", "avi", "mpg", "mpeg", "mov", "qt", "zip", "webp"};

    static {
        HashMap map = new HashMap();
        f63219D = map;
        map.put(f63244y, f63218C);
        f63219D.put(f63245z, "https://www.amazon.com/gp/mas/dl/android?p=");
        f63219D.put(f63216A, "https://www.samsungapps.com/appquery/appDetail.as?appId=");
        f63219D.put(f63217B, f63217B);
        f63219D.put(f63218C, f63218C);
    }

    public static String a() {
        if (f63240u == null) {
            f63240u = a(f63230k, f63231l);
        }
        return f63240u;
    }

    public static Object a(Object obj, String str) {
        Object obj2 = null;
        try {
            Field fieldA = a((Class) obj.getClass(), str);
            fieldA.setAccessible(true);
            obj2 = fieldA.get(obj);
            Logger.d("reflection", str, " = ", obj2);
            return obj2;
        } catch (NoSuchFieldException e2) {
            Logger.w(f63227h, "Failed to get reflection field:", str);
            return obj2;
        } catch (Exception e3) {
            Logger.e(f63227h, "Failed to get reflection field value", e3);
            return obj2;
        }
    }

    private static Field a(Class cls, String str) throws NoSuchFieldException {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                throw e2;
            }
            return a(superclass, str);
        }
    }

    public static String a(String str, String str2) {
        String str3 = null;
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            if (declaredField.isAccessible()) {
                str3 = (String) declaredField.get(null);
                return str3;
            }
            return "";
        } catch (ClassNotFoundException e2) {
            Logger.d(f63227h, "Error retrieving field value. Class name :", str, ", field name :", str2, e2);
            return str3;
        } catch (IllegalAccessException e3) {
            Logger.e(f63227h, "Error retrieving field value. Class name :", str, ", field name :", str2, e3);
            return str3;
        } catch (IllegalArgumentException e4) {
            Logger.e(f63227h, "Error retrieving field value. Class name :", str, ", field name :", str2, e4);
            return str3;
        } catch (NoSuchFieldException e5) {
            Logger.e(f63227h, "Error retrieving field value. Class name :", str, ", field name :", str2, e5);
            return str3;
        } catch (SecurityException e6) {
            Logger.e(f63227h, "Error retrieving field value. Class name :", str, ", field name :", str2, e6);
            return str3;
        }
    }

    public static Object b(Object obj, String str) {
        Object objInvoke = null;
        try {
            Method method = obj.getClass().getMethod(str, new Class[0]);
            method.setAccessible(true);
            objInvoke = method.invoke(obj, new Object[0]);
            Logger.d("reflection", str, " ", objInvoke);
            return objInvoke;
        } catch (NoSuchMethodException e2) {
            Logger.d("reflection", "exception - no such method: ", e2);
            return objInvoke;
        } catch (Exception e3) {
            Logger.d("reflection", "exception: ", e3);
            return objInvoke;
        }
    }

    public static long b() {
        return a(System.currentTimeMillis());
    }

    public static long a(long j2) {
        return (j2 / 60000) * 60;
    }

    public static long b(long j2) {
        return j2 / 1000;
    }

    public static boolean a(ArrayList<StatsEvent> arrayList) {
        int i2 = 0;
        while (i2 < arrayList.size() - 1) {
            StatsEvent statsEvent = arrayList.get(i2);
            i2++;
            StatsEvent statsEvent2 = arrayList.get(i2);
            int iC = statsEvent.compareTo(statsEvent2);
            if (iC > 0) {
                Logger.e(f63227h, "failed sort. first: ", statsEvent, " second: ", statsEvent2);
                Logger.e(f63227h, "compare score: ", Integer.valueOf(iC));
                return false;
            }
        }
        return true;
    }

    public static String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C.UTF8_NAME);
            char[] cArr = new char[65536];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 == -1) {
                    break;
                }
                sb.append(cArr, 0, i2);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            Logger.e(f63227h, "Failed to read configuration from input stream", e2);
        }
        return sb.toString();
    }

    public static long c(long j2) {
        return (j2 / 60) * 60000;
    }

    public static String a(Context context) {
        String str;
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            str = "";
        } else {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    str = runningAppProcessInfo.processName;
                    break;
                }
            }
            str = "";
        }
        if (str.equals("")) {
            return f63220a;
        }
        return str;
    }

    public static String a(String str) {
        String str2 = f63226g.get(str);
        return TextUtils.isEmpty(str2) ? k.d(str) : str2;
    }

    public static DisplayMetrics a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } catch (Throwable th) {
            Logger.e(f63227h, "error during display metrics extraction");
        }
        return displayMetrics;
    }

    public static Map<String, String> b(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, (String) jSONObject.get(next));
                }
            } catch (JSONException e2) {
                Logger.e(f63227h, "exception while parsing json string to map", e2);
                return null;
            }
        }
        return map;
    }

    public static JSONObject a(Map<String, String> map) {
        try {
            return new JSONObject(map.toString());
        } catch (JSONException e2) {
            Logger.e(f63227h, "exception while parsing map to JSON object", e2);
            return null;
        }
    }

    public static boolean c(String str) {
        String strE = k.e(str);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        return f63234o.contains(strE);
    }

    public static boolean a(String str, Map<String, String> map) {
        boolean z2;
        if (TextUtils.isEmpty(str) || str.startsWith(f63221b)) {
            return false;
        }
        String strC = k.c(str);
        String strE = k.e(strC);
        if (strE != null && strE.length() > 0) {
            strE = strE.toLowerCase();
        }
        if (a((Object) strC) && strE != null && strE.length() > 0 && f63234o.contains(strE)) {
            Logger.d(f63227h, "should include resource url extension match: ", strC);
            z2 = true;
        } else {
            if (strC.toLowerCase().startsWith(f63237r.toLowerCase()) || strC.toLowerCase().startsWith("text:".toLowerCase())) {
                Logger.d(f63227h, "should include resource url prefix match :", strC);
                z2 = true;
            } else {
                z2 = false;
            }
            String[] strArr = com.safedk.android.analytics.brandsafety.creatives.g.a().get(com.safedk.android.analytics.brandsafety.creatives.g.f62374d);
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (strC.contains(str2)) {
                        Logger.d(f63227h, "should include resource url will be included (GENERAL_INCLUSION_LIST) : ", strC);
                        z2 = true;
                    }
                }
            }
            if (map != null && map.containsKey(f63222c)) {
                String str3 = map.get(f63222c);
                Logger.d(f63227h, "should include resource url 'Accept' header value is ", str3);
                if (str3 != null && str3.length() > 0 && (str3.contains(f63232m) || D(str3) || E(str3))) {
                    z2 = true;
                }
            }
        }
        if (strC.startsWith("data:") || strC.startsWith("about:")) {
            Logger.d(f63227h, "should include resource url excluded : ", strC);
            z2 = false;
        }
        if (z2) {
            boolean zC2 = C(strC);
            Logger.d(f63227h, "should include resource url: ", strC, ", should excluded? ", Boolean.valueOf(zC2));
            return !zC2;
        }
        return z2;
    }

    private static boolean C(String str) {
        String[] strArr = com.safedk.android.analytics.brandsafety.creatives.g.a().get(com.safedk.android.analytics.brandsafety.creatives.g.f62373c);
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    Logger.d(f63227h, "url will be excluded (GENERAL_EXCLUSION_LIST) : ", str);
                    return true;
                }
            }
        }
        String[] strArr2 = com.safedk.android.analytics.brandsafety.creatives.g.a().get(com.safedk.android.analytics.brandsafety.creatives.g.f62372b);
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str.contains(str3)) {
                    Logger.d(f63227h, "url will be excluded (ATTRIBUTION_URLS): ", str);
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean D(String str) {
        Logger.d(f63227h, "header contains image mime type, headerValue = ", str, ", list: ", SafeDK.getInstance().v().toString());
        Iterator<String> it = SafeDK.getInstance().v().iterator();
        while (it.hasNext()) {
            if (str.contains("image/" + it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean E(String str) {
        Logger.d(f63227h, "header contains audio mime type, headerValue = ", str, ", list: ", SafeDK.getInstance().w().toString());
        Iterator<String> it = SafeDK.getInstance().w().iterator();
        while (it.hasNext()) {
            if (str.contains("audio/" + it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String d(String str) {
        return String.format(Locale.ENGLISH, "https://www.youtube.com/watch?v=%s", str);
    }

    public static ArrayList<String> e(String str) {
        String strReplaceAll;
        new ArrayList();
        StringBuffer stringBuffer = new StringBuffer(str);
        try {
            Logger.printFullVerboseLog(f63227h, "extract Urls from source with unicode unescape started, source length ", Integer.valueOf(str.length()));
            Matcher matcher = g.a("\\\\x3c(?:!DOCTYPE(?:.?))html\\\\x3e(.*?)(\\\\x3c/html\\\\x3e)").matcher(str);
            while (matcher.find()) {
                stringBuffer.replace(matcher.start(), matcher.end(), k.a(str.substring(matcher.start(), matcher.end())));
            }
        } finally {
            try {
            } finally {
            }
        }
        return f(strReplaceAll);
    }

    public static ArrayList<String> f(String str) {
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        try {
            Matcher matcher = g.a("((http|https|gmsg)(:|%3A)\\\\*(/|%2F)\\\\*(/|%2F).*?)(?:;frame-src| alt|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)|(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)|(?:%5B|\\\\+x5B|\\[|\\\\n)|(?:%5D|\\\\+x5D|\\])|\\)|[\n\r\t\\x{0001}-\\x{001f}\\x{fffd}])").matcher(str);
            while (matcher.find()) {
                String strG = k.g(matcher.group(1).replace("\\/", "/"));
                if (URLUtil.isValidUrl(strG)) {
                    hashSet.add(strG);
                } else {
                    try {
                        String strDecode = URLDecoder.decode(strG, C.UTF8_NAME);
                        if (URLUtil.isValidUrl(strDecode)) {
                            hashSet.add(strDecode);
                        }
                    } catch (IllegalArgumentException e2) {
                        Logger.d(f63227h, "extract urls from html - illegal argument exception occurred while decoding, so adding the original url instead: ", strG);
                        hashSet.add(strG);
                    }
                }
            }
            Logger.printFullVerboseLog(f63227h, "extract urls from html found: ", hashSet);
        } catch (Throwable th) {
            Logger.d(f63227h, "extract urls from html - exception when decoding url: ", th.getMessage());
        }
        return new ArrayList<>(hashSet);
    }

    public static ArrayList<String> g(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            Logger.printFullVerboseLog(f63227h, "extract urls from source with special chars: , source: ", str);
            Matcher matcher = g.a("(https?:\\\\*\\/\\\\*\\/.*?)(?:;frame-src|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)|(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)|\\s?(?:%5D|\\\\+x5D|\\]){2})").matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1).replace("\\/", "/"));
            }
        }
        return arrayList;
    }

    public static ArrayList<String> h(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            try {
                Pattern patternA = g.a("data:([a-zA-Z]*\\/[a-zA-Z1-9]*);?([\\s\\S]*?;)base64,([^\\\"\\')]*)");
                Logger.v(f63227h, "extract base64 encoded resource from source. regex pattern: ", patternA);
                Matcher matcher = patternA.matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(2);
                    int iF = F(strGroup);
                    Logger.v(f63227h, "base64 encoded resource from source found. Hash: ", Integer.valueOf(iF), " , resource: ", strGroup);
                    arrayList.add(matcher.group(1) + ":" + iF);
                }
            } catch (Throwable th) {
                Logger.d(f63227h, "Exception in base64 encoded resource extraction ", th.getMessage());
            }
        }
        return arrayList;
    }

    private static int F(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int iCharAt = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            iCharAt = (((iCharAt << 5) - iCharAt) + str.charAt(i2)) | 0;
        }
        return iCharAt;
    }

    public static String a(Pattern pattern, String str, int i2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() >= i2) {
            return matcher.group(i2);
        }
        return null;
    }

    public static List<String> b(Pattern pattern, String str, int i2) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group(i2));
        }
        return arrayList;
    }

    public static List<String> a(Pattern pattern, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static List<Integer> b(Pattern pattern, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(Integer.valueOf(matcher.start()));
        }
        return arrayList;
    }

    public static List<MatchResult> c(Pattern pattern, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.toMatchResult());
        }
        return arrayList;
    }

    public static boolean d(Pattern pattern, String str) {
        return pattern.matcher(str).find();
    }

    public static String e(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() > 0) {
            String strGroup = matcher.group(1);
            Logger.d(f63227h, "match for pattern: ", strGroup);
            return strGroup;
        }
        return null;
    }

    public static boolean i(String str) {
        return d(g.a("(https?:\\/\\/.*?).googlevideo.com\\/videoplayback"), str);
    }

    public static String j(String str) {
        if (i(str)) {
            for (String str2 : f63241v) {
                str = k.f(str, str2);
            }
        }
        return str;
    }

    public static String a(View view) {
        if (view == null) {
            return "";
        }
        return view.getClass().getName() + " " + BrandSafetyUtils.a(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View a(String str, String str2, View view) {
        try {
            if (view.getParent() == null) {
                return view;
            }
            ViewParent parent = view.getParent();
            Logger.d(str, str2, " get absolute parent, new view parent : ", parent);
            ViewParent viewParent = parent;
            while (viewParent.getParent() != null) {
                ViewParent parent2 = viewParent.getParent();
                Logger.d(str, str2, " get absolute parent, new parent : ", parent2);
                viewParent = parent2;
            }
            view = (View) viewParent;
        } catch (Throwable th) {
            Logger.e(str, str2, " exception in get absolute parent (input param is ", view, "' , error : ", th.getMessage());
        }
        Logger.d(str, str2, " get absolute parent returning ", view);
        return view;
    }

    public static boolean b(View view) {
        try {
            if (view.getParent() == null) {
                return false;
            }
            if (view instanceof MaxAdView) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof MaxAdView) {
                return true;
            }
            while (parent.getParent() != null) {
                parent = parent.getParent();
                if (parent instanceof MaxAdView) {
                    return true;
                }
            }
        } catch (Throwable th) {
            Logger.e(f63227h, "exception in get absolute parent (input param is ", view, "' , error : ", th.getMessage());
        }
        return false;
    }

    public static MaxAdView c(View view) {
        if (view != null) {
            try {
            } catch (Throwable th) {
                Logger.e(f63227h, HrvQKfmFZJudBc.HbnE, view, qfEYuUHwj.CwyEYf, th.getMessage());
            }
            if (view.getParent() != null) {
                if (view instanceof MaxAdView) {
                    return (MaxAdView) view;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof MaxAdView) {
                    return (MaxAdView) parent;
                }
                while (parent.getParent() != null) {
                    parent = parent.getParent();
                    if (parent instanceof MaxAdView) {
                        return (MaxAdView) parent;
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static void a(SortedMap<Integer, List<String>> sortedMap, int i2, String str) {
        if (!sortedMap.containsKey(Integer.valueOf(i2))) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            sortedMap.put(Integer.valueOf(i2), arrayList);
            return;
        }
        sortedMap.get(Integer.valueOf(i2)).add(str);
    }

    public static boolean k(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e2) {
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof URL) {
            return true;
        }
        try {
            new URL((String) obj);
            return true;
        } catch (MalformedURLException e2) {
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                Object obj = bundle.get(str);
                if (obj instanceof Bundle) {
                    jSONObject.put(str, a((Bundle) obj));
                } else {
                    jSONObject.put(str, obj);
                }
            } catch (JSONException e2) {
            }
        }
        return jSONObject;
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("action: ");
        sb.append(intent.getAction());
        sb.append(" data: ");
        sb.append(intent.getDataString());
        sb.append(" extras: ");
        if (intent.getExtras() != null) {
            for (String str : intent.getExtras().keySet()) {
                sb.append(str);
                sb.append(com.safedk.android.analytics.brandsafety.l.ae);
                sb.append(intent.getExtras().get(str));
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static boolean l(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException e2) {
            return false;
        }
    }

    public static boolean m(String str) {
        try {
            new JSONArray(str);
            return true;
        } catch (JSONException e2) {
            return false;
        }
    }

    public static boolean n(String str) {
        return l(str) || m(str);
    }

    public static String o(String str) {
        Logger.d(f63227h, "getStorePackageIdFromUrl started, url =  ", str);
        String strD = null;
        if (p(str)) {
            if (str.contains(f63244y) || str.contains(f63217B) || str.contains(f63218C)) {
                strD = k.d(str, "id");
            } else if (str.contains(f63245z)) {
                strD = k.d(str, TtmlNode.TAG_P);
            } else if (str.contains(f63216A)) {
                strD = k.d(str, "appId");
            }
            Logger.d(f63227h, "getStorePackageIdFromUrl extracted packageId ", strD, ", for url ", str);
            return strD;
        }
        Logger.d(f63227h, "getStorePackageIdFromUrl url is not a store url. url : ", str);
        return null;
    }

    public static boolean p(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : f63219D.keySet()) {
            if (str.startsWith(str2) || str.startsWith(f63219D.get(str2))) {
                return true;
            }
        }
        return false;
    }

    public static String q(String str) {
        for (String str2 : f63219D.keySet()) {
            if (str.startsWith(str2)) {
                return str.replace(str2, f63219D.get(str2));
            }
        }
        return str;
    }

    public static String r(String str) {
        int iIndexOf;
        for (String str2 : f63219D.keySet()) {
            if (str.startsWith(str2)) {
                String strReplace = str.replace(str2, "");
                int iIndexOf2 = strReplace.indexOf(63);
                if (iIndexOf2 < 0) {
                    iIndexOf2 = strReplace.indexOf(38);
                }
                if (iIndexOf2 > 0) {
                    return str2 + strReplace.substring(0, iIndexOf2);
                }
                return str;
            }
            if (str.startsWith(f63219D.get(str2)) && (iIndexOf = str.indexOf(38)) > 0) {
                str = str.substring(0, iIndexOf);
            }
        }
        return str;
    }

    public static boolean s(String str) {
        boolean z2;
        if (str == null) {
            return false;
        }
        String lowerCase = k.c(str).toLowerCase();
        String[] strArr = f63242w;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z2 = false;
                break;
            }
            if (!lowerCase.endsWith("." + strArr[i2])) {
                i2++;
            } else {
                z2 = true;
                break;
            }
        }
        Logger.d(f63227h, "is video media uri returned ", Boolean.valueOf(z2), " for url = ", str);
        return z2;
    }

    public static String t(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("%3F") && !str.contains("?")) {
            str = str.replace("%3F", "?");
        }
        String lowerCase = k.c(str).toLowerCase();
        for (String str2 : f63242w) {
            if (lowerCase.endsWith("." + str2)) {
                Logger.d(f63227h, "get video media extension returned ", str2, " for url = ", str);
                return str2;
            }
        }
        return null;
    }

    public static boolean u(String str) {
        boolean z2 = false;
        for (String str2 : f63243x) {
            if (str.endsWith(str2)) {
                z2 = true;
            }
        }
        return z2;
    }

    public static String d() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
    }

    public static String e() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
    }

    public static String a(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.getDefault()).format(date);
    }

    public static String v(String str) {
        try {
            return a(new Date(new File(str).lastModified()));
        } catch (Throwable th) {
            Logger.d(f63227h, "Error extracting file last modified date from file ", str, " : ", th.getMessage(), th);
            return "NA";
        }
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & UByte.MAX_VALUE);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static boolean a(String str, List<String> list) {
        if (str != null && list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean w(String str) {
        String strC = k.c(str);
        Iterator<String> it = f63238s.iterator();
        while (it.hasNext()) {
            if (strC.endsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(String str) {
        if (str.startsWith("text:")) {
            return false;
        }
        if (str.startsWith(CreativeInfo.aq)) {
            return true;
        }
        String strC = k.c(str);
        Iterator<String> it = f63239t.iterator();
        while (it.hasNext()) {
            if (strC.endsWith("." + it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(float f3, float f4) {
        if (f4 == 0.0f || f3 == 0.0f) {
            return false;
        }
        double d2 = f3 / f4;
        return (d2 >= 6.0d && d2 <= 8.4d) || (d2 >= 12.0d && d2 <= 15.0d);
    }

    public static boolean b(float f3, float f4) {
        if (f4 == 0.0f || f3 == 0.0f) {
            return false;
        }
        double d2 = f3 / f4;
        return d2 >= 1.1d && d2 <= 1.3d;
    }

    public static boolean d(View view) {
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent != null) {
                Logger.d(f63227h, "is webview inside max ad view, view parent: ", parent);
                if (parent instanceof MaxAdView) {
                    Logger.d(f63227h, "is webview inside max ad view, max ad view found: ", parent);
                    return true;
                }
                if (parent.getParent() != null) {
                    parent = parent.getParent();
                }
            }
        }
        return false;
    }

    public static boolean b(String str, Map<String, String> map) {
        String str2;
        Logger.d(f63227h, "is video file?, url: ", str, ", headers: ", map);
        if (map != null && map.containsKey(f63222c) && (str2 = map.get(f63222c)) != null && str2.length() > 0 && str2.contains(f63232m)) {
            Logger.d(f63227h, "identified video header, url: ", str, ", headers: ", map);
            return true;
        }
        if (str == null || !x(str)) {
            return false;
        }
        Logger.d(f63227h, "identified video extension, url: ", str);
        return true;
    }

    public static String y(String str) {
        if (b(str, (Map<String, String>) null)) {
            String str2 = JLZo.FYlQopxEhwEE;
            if (!str.startsWith(str2)) {
                str = str2 + str;
            }
            Logger.d(f63227h, "video resource found : ", str);
        }
        return str;
    }

    public static String a(String str, Pattern pattern, int i2, String str2) {
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            stack.push(Integer.valueOf(matcher.start(i2)));
            stack2.push(Integer.valueOf(matcher.end(i2)));
        }
        StringBuilder sb = new StringBuilder(str);
        while (!stack.isEmpty()) {
            int iIntValue = ((Integer) stack.pop()).intValue();
            int iIntValue2 = ((Integer) stack2.pop()).intValue();
            if (iIntValue >= 0 && iIntValue2 >= 0) {
                Logger.d(f63227h, "replacing text of matching group. removing :  ", str.substring(iIntValue, iIntValue2));
                sb.replace(iIntValue, iIntValue2, str2);
            }
        }
        return sb.toString();
    }

    public static String z(String str) {
        if (str != null) {
            String strA = A(str);
            if (strA.contains("?") && str.contains("%3F") && strA.indexOf("?") <= str.indexOf("%3F")) {
                Logger.d(f63227h, "decode URL if needed: ", str);
                return strA;
            }
        }
        return str;
    }

    public static String A(String str) {
        if (str != null) {
            try {
                return URLDecoder.decode(str, C.UTF8_NAME);
            } catch (Throwable th) {
                Logger.d(f63227h, "Exception decoding url ", str, " : ", th.getMessage());
            }
        }
        return str;
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    public static String a(Map<?, WeakReference<WebView>> map, boolean z2) {
        StringBuilder sb = new StringBuilder("{");
        Iterator<Map.Entry<?, WeakReference<WebView>>> it = map.entrySet().iterator();
        for (int i2 = 0; i2 < map.size(); i2++) {
            Map.Entry<?, WeakReference<WebView>> next = it.next();
            sb.append(next.getKey());
            sb.append(com.safedk.android.analytics.brandsafety.l.ae);
            if (next.getValue() != null && next.getValue().get() != null) {
                if (z2) {
                    sb.append(BrandSafetyUtils.a((Object) next.getValue().get()));
                } else {
                    sb.append(next.getValue().get().toString());
                }
            } else {
                sb.append(V8ValueNull.NULL);
            }
            if (i2 < map.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static ArrayList<String> a(Collection<String> collection, int i2) {
        return a(collection, 0, i2);
    }

    public static ArrayList<String> a(Collection<String> collection, int i2, int i3) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().substring(i2, i3));
        }
        return arrayList;
    }

    public static boolean a(Reference<?> reference) {
        return (reference == null || reference.get() == null) ? false : true;
    }

    public static String b(Object obj) {
        return obj == null ? V8ValueNull.NULL : obj.toString();
    }

    public static boolean a(WebView webView) {
        MaxAdView maxAdViewC = c(webView);
        if (maxAdViewC != null) {
            String strA = BrandSafetyUtils.a(maxAdViewC);
            SafeDK.getInstance().A();
            if (BannerFinder.f().containsKey(strA)) {
                SafeDK.getInstance().A();
                if (BannerFinder.f().get(strA) != null) {
                    SafeDK.getInstance().A();
                    if (BannerFinder.f().get(strA).equals(BrandSafetyUtils.AdType.MREC)) {
                        SafeDK.getInstance().A();
                        Logger.d(f63227h, "isMrecWebView returned true for webview = ", webView, ", maxAdViewAddress = ", strA, ", getMaxAdViewAddressToAdType= ", BannerFinder.f().toString());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 != -1) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Logger.d(f63227h, "Error closing stream", e2);
            }
        }
    }

    public static Boolean a(Bundle bundle, String str) {
        Object obj = bundle.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public static String b(Bundle bundle, String str) {
        Object obj = bundle.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static HashSet<String> c(Bundle bundle, String str) {
        Object obj = bundle.get(str);
        if (obj instanceof ArrayList) {
            return new HashSet<>((ArrayList) obj);
        }
        return null;
    }

    public static boolean a(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return false;
        }
        try {
            boolean z2 = mediaPlayer.isPlaying() && (mediaPlayer.getVideoWidth() > 0 && mediaPlayer.getVideoHeight() > 0);
            if (z2) {
                Logger.d(f63227h, "Video is playing");
            }
            return z2;
        } catch (Throwable th) {
            Logger.d(f63227h, "Error trying to check if the media player is playing ", th);
            return false;
        }
    }

    public static boolean c(Object obj, String str) {
        if (obj == null) {
            return false;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (str.equals(superclass.getSimpleName())) {
                return true;
            }
        }
        return false;
    }

    public static String B(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        return str;
    }

    public static boolean b(String str, String str2) {
        for (String str3 : str2.split(",")) {
            if (str.startsWith(str3)) {
                return true;
            }
        }
        return false;
    }

    public static String c(String str, String str2) {
        for (String str3 : str2.split(",")) {
            if (str.startsWith(str3)) {
                return str3;
            }
        }
        return null;
    }
}
