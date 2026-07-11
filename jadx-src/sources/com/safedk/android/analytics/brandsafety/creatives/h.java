package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import android.util.Pair;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class h extends e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f62390q = "VastAdParser";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final CharSequence f62391r = "acao/yes";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final LinkedHashSetWithItemLimit<i> f62389p = new LinkedHashSetWithItemLimit<>(50);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f62392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f62393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f62394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f62395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f62396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f62397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f62398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f62399h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<Pair<String, String>> f62400i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<String> f62401j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<String> f62402k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<String> f62403l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<String> f62404m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<String> f62405n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List<String> f62406o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<String> f62407p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<String> f62408q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<String> f62409r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List<String> f62410s;

        a(String str, String str2, String str3, String str4, ArrayList<String> arrayList, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<String> list8, boolean z2, String str5, List<String> list9, String str6, List<Pair<String, String>> list10) {
            this.f62392a = false;
            this.f62402k = new ArrayList();
            this.f62403l = new ArrayList();
            this.f62404m = new ArrayList();
            this.f62405n = new ArrayList();
            this.f62406o = new ArrayList();
            this.f62395d = str;
            this.f62396e = str2;
            this.f62393b = str3;
            this.f62394c = str4;
            this.f62402k = arrayList;
            this.f62403l = list;
            this.f62404m = list2;
            this.f62405n = list3;
            this.f62406o = list4;
            this.f62407p = list5;
            this.f62408q = list6;
            this.f62409r = list7;
            this.f62410s = list8;
            this.f62392a = z2;
            this.f62398g = z2 ? str5 : null;
            this.f62401j = list9;
            this.f62399h = str6;
            this.f62400i = list10;
            Logger.v(h.f62390q, "Vast ad created: vastAdId=", str, " adSystem=", str2);
            Logger.v(h.f62390q, "clickUrl=", str3);
            Logger.v(h.f62390q, "videoUrl=", str4);
            Object[] objArr = new Object[2];
            objArr[0] = "prefetchResourceUrls=";
            String str7 = V8ValueNull.NULL;
            objArr[1] = arrayList != null ? arrayList.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr);
            Object[] objArr2 = new Object[2];
            objArr2[0] = "staticResourceUrls=";
            objArr2[1] = list != null ? list.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr2);
            Object[] objArr3 = new Object[2];
            objArr3[0] = "scriptResourceUrls=";
            objArr3[1] = list2 != null ? list2.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr3);
            Object[] objArr4 = new Object[2];
            objArr4[0] = "htmlResourceUrls=";
            objArr4[1] = list3 != null ? list3.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr4);
            Object[] objArr5 = new Object[2];
            objArr5[0] = "videoCompletedUrls=";
            objArr5[1] = list5 != null ? list5.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr5);
            Object[] objArr6 = new Object[2];
            objArr6[0] = "videoTrackingEventUrls=";
            objArr6[1] = list6 != null ? list6.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr6);
            Object[] objArr7 = new Object[2];
            objArr7[0] = "clickTrackingUrls=";
            objArr7[1] = list7 != null ? list7.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr7);
            Object[] objArr8 = new Object[2];
            objArr8[0] = "companionClickTrackingUrls=";
            objArr8[1] = list8 != null ? list8.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr8);
            Logger.v(h.f62390q, "containsMediaFileWithJsAppAttribute=", Boolean.valueOf(z2));
            Logger.v(h.f62390q, "adParameters=", str5);
            Object[] objArr9 = new Object[2];
            objArr9[0] = "impressionUrls=";
            objArr9[1] = list9 != null ? list9.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr9);
            Object[] objArr10 = new Object[2];
            objArr10[0] = "mediaUrlList=";
            objArr10[1] = list10 != null ? list10.toString() : str7;
            Logger.v(h.f62390q, objArr10);
        }

        a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
            this.f62392a = false;
            this.f62402k = new ArrayList();
            this.f62403l = new ArrayList();
            this.f62404m = new ArrayList();
            this.f62405n = new ArrayList();
            this.f62406o = new ArrayList();
            this.f62395d = str;
            this.f62396e = str2;
            this.f62397f = str3;
            this.f62401j = list;
            this.f62407p = list2;
            this.f62408q = list3;
            this.f62409r = list4;
            this.f62410s = list5;
            Logger.v(h.f62390q, "Vast ad created: vastAdId=", str, " adSystem=", str2);
            Logger.v(h.f62390q, "vastAdUri=", str3);
            Object[] objArr = new Object[2];
            objArr[0] = "videoCompletedUrls=";
            String str4 = V8ValueNull.NULL;
            objArr[1] = list2 != null ? list2.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr);
            Object[] objArr2 = new Object[2];
            objArr2[0] = "videoTrackingEventUrls=";
            objArr2[1] = list3 != null ? list3.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr2);
            Object[] objArr3 = new Object[2];
            objArr3[0] = "clickTrackingUrls=";
            objArr3[1] = list4 != null ? list4.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr3);
            Object[] objArr4 = new Object[2];
            objArr4[0] = "companionClickTrackingUrls=";
            objArr4[1] = list5 != null ? list5.toString() : V8ValueNull.NULL;
            Logger.v(h.f62390q, objArr4);
            Object[] objArr5 = new Object[2];
            objArr5[0] = "impressionUrls=";
            objArr5[1] = list != null ? list.toString() : str4;
            Logger.v(h.f62390q, objArr5);
        }

        public String a() {
            return this.f62393b;
        }

        public String b() {
            return this.f62394c;
        }

        public String c() {
            return this.f62395d;
        }

        public void a(String str) {
            this.f62395d = str;
        }

        public String d() {
            return this.f62396e;
        }

        public void b(String str) {
            this.f62396e = str;
        }

        public String e() {
            return this.f62397f;
        }

        public void c(String str) {
            this.f62397f = str;
        }

        public String f() {
            return this.f62398g;
        }

        public String g() {
            return this.f62399h;
        }

        public List<String> h() {
            ArrayList arrayList = new ArrayList();
            List<Pair<String, String>> list = this.f62400i;
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().second);
                }
            }
            return arrayList;
        }

        public List<String> i() {
            return this.f62401j;
        }

        public void a(List<String> list) {
            this.f62401j = list;
        }

        public List<String> j() {
            return this.f62402k;
        }

        public List<String> k() {
            return this.f62403l;
        }

        public List<String> l() {
            return this.f62404m;
        }

        public List<String> m() {
            return this.f62405n;
        }

        public List<String> n() {
            return this.f62406o;
        }

        public List<String> o() {
            return this.f62407p;
        }

        public void b(List<String> list) {
            this.f62407p = list;
        }

        public List<String> p() {
            return this.f62408q;
        }

        public void c(List<String> list) {
            this.f62408q = list;
        }

        public List<String> q() {
            return this.f62409r;
        }

        public void d(List<String> list) {
            this.f62409r = list;
        }

        public List<String> r() {
            return this.f62410s;
        }

        public void e(List<String> list) {
            this.f62410s = list;
        }

        public boolean s() {
            return this.f62392a && !t();
        }

        private boolean t() {
            for (Pair<String, String> pair : this.f62400i) {
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                if (str.startsWith("video")) {
                    Logger.d(h.f62390q, "video file exists: ", str2);
                    return true;
                }
            }
            Logger.printFullVerboseLog(h.f62390q, "video file doesn't exist: ", this.f62400i);
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("vastAdId=");
            String str = this.f62395d;
            String string = V8ValueNull.NULL;
            if (str == null) {
                str = V8ValueNull.NULL;
            }
            sb.append(str);
            sb.append(", adSystem=");
            String str2 = this.f62396e;
            if (str2 == null) {
                str2 = V8ValueNull.NULL;
            }
            sb.append(str2);
            sb.append(", clickUrl=");
            String str3 = this.f62393b;
            if (str3 == null) {
                str3 = V8ValueNull.NULL;
            }
            sb.append(str3);
            sb.append(", videoUrl=");
            String str4 = this.f62394c;
            if (str4 == null) {
                str4 = V8ValueNull.NULL;
            }
            sb.append(str4);
            sb.append(", vastAdUri=");
            String str5 = this.f62397f;
            if (str5 == null) {
                str5 = V8ValueNull.NULL;
            }
            sb.append(str5);
            sb.append(", mediaUrlList=");
            List<Pair<String, String>> list = this.f62400i;
            if (list != null) {
                string = list.toString();
            }
            sb.append(string);
            return sb.toString();
        }
    }

    public static ArrayList<a> a(String str, boolean z2, String str2) {
        ArrayList<a> arrayList = new ArrayList<>();
        List<String> listA = n.a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Ad(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Ad(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34), str);
        if (listA.isEmpty()) {
            Logger.d(f62390q, "No ad blocks detected, exiting");
            return arrayList;
        }
        Iterator<String> it = listA.iterator();
        while (it.hasNext()) {
            a aVarB = b(it.next(), z2, str2);
            if (aVarB != null) {
                arrayList.add(aVarB);
            }
        }
        return arrayList;
    }

    private static String a(String str, String str2) throws UnsupportedEncodingException {
        if (CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, false) && str.contains("%25")) {
            String strDecode = URLDecoder.decode(str, C.UTF8_NAME);
            Logger.d(f62390q, "Decoding URL - url was decoded once");
            if (strDecode.contains("%25")) {
                String strDecode2 = URLDecoder.decode(strDecode, C.UTF8_NAME);
                Logger.d(f62390q, "Decoding URL - url was decoded twice");
                return strDecode2;
            }
            return strDecode;
        }
        return str;
    }

    public static a b(String str, boolean z2, String str2) {
        String str3;
        String str4;
        String str5;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)((.*?)(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34), str, -1, z2).isEmpty()) {
                Logger.d(f62390q, "No ad blocks detected, exiting");
                return null;
            }
            List<String> listA = a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(Creative|Ad)(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34), str, 2, z2);
            if (listA.isEmpty()) {
                str3 = null;
            } else {
                String strA = a(listA.get(0), false);
                Logger.d(f62390q, "Ad ID detected: ", strA);
                str3 = strA;
            }
            List<String> listA2 = a(com.safedk.android.utils.g.a(a("VASTAdTagURI"), 2), str, 1, z2);
            if (listA2.isEmpty()) {
                str4 = null;
            } else {
                String strA2 = a(CreativeInfoManager.e(str2), a(k.g(a(listA2.get(0), z2)), str2));
                Logger.printFullVerboseLog(f62390q, "Vast ad uri added to followed urls : ", strA2);
                a(new f(strA2));
                str4 = strA2;
            }
            List<String> listA3 = a(com.safedk.android.utils.g.a(a("AdSystem"), 2), str, 1, z2);
            if (listA3.isEmpty()) {
                str5 = null;
            } else {
                String strA3 = a(listA3.get(0), false);
                Logger.d(f62390q, "Ad system detected : ", strA3);
                str5 = strA3;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = a(com.safedk.android.utils.g.a(a("Impression"), 2), str, 1, z2).iterator();
            while (it.hasNext()) {
                String strReplace = k.g(a(it.next(), z2)).replace("\\/", "/");
                arrayList.add(strReplace);
                Logger.d(f62390q, "impression url identified : ", strReplace);
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<String> listA4 = a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Tracking(?:[\\s]|%20)event(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Tracking(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2), str, 1, 2, z2);
            for (int i2 = 0; i2 < listA4.size(); i2 += 2) {
                listA4.get(i2);
                arrayList2.add(k.g(a(listA4.get(i2 + 1), z2)));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<String> it2 = a(com.safedk.android.utils.g.a(a("ClickTracking"), 2), str, 1, z2).iterator();
            while (it2.hasNext()) {
                arrayList4.add(k.g(a(it2.next(), z2)));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<String> it3 = a(com.safedk.android.utils.g.a(a("CompanionClickTracking"), 2), str, 1, z2).iterator();
            while (it3.hasNext()) {
                arrayList5.add(k.g(a(it3.next(), z2)));
            }
            if (str4 != null) {
                return a(str4, str3, str5, arrayList, arrayList3, arrayList2, arrayList4, arrayList5);
            }
            return a(str, z2, str, str3, str5, arrayList, arrayList3, arrayList2, arrayList4, arrayList5);
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.e(f62390q, "failed to parse vast data", th);
            return null;
        }
    }

    private static a a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        if (str != null) {
            Logger.d(f62390q, "vast ad uri detected: ", str);
            return new a(str2, str3, str, list, list2, list3, list4, list5);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03be  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static a a(String str, boolean z2, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        Iterator<String> it;
        int i2;
        ?? r7;
        int i3;
        String str5;
        char c2;
        String str6;
        ArrayList arrayList;
        List<String> listA;
        char c4;
        String str7;
        ArrayList arrayList2;
        ?? r6 = 0;
        Logger.d(f62390q, "no vast ad tag uri");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        List<String> listA2 = a(k(), str2, 0, false);
        int i5 = 2;
        Logger.d(f62390q, "Number of creatives XML elements: ", Integer.valueOf(listA2.size()));
        if (listA2.isEmpty()) {
            Logger.printFullVerboseLog(f62390q, "Number of creatives XML elements is 0, the xml is:\n", str2);
        }
        Iterator<String> it2 = listA2.iterator();
        String str8 = null;
        String str9 = null;
        String strA = null;
        boolean z3 = false;
        String strA2 = null;
        String strA3 = null;
        while (it2.hasNext()) {
            String next = it2.next();
            List<String> listA3 = a(com.safedk.android.utils.g.a(a("CompanionClickThrough"), i5), next, 1, (boolean) r6);
            if (!listA3.isEmpty()) {
                it = it2;
                Object[] objArr = new Object[2];
                objArr[r6] = "companion click url list: ";
                i2 = 1;
                objArr[1] = listA3.toString();
                Logger.d(f62390q, objArr);
                r7 = 0;
                strA = a(listA3.get(0), true);
            } else {
                it = it2;
                i2 = 1;
                r7 = 0;
                Logger.d(f62390q, "companion click url list is empty");
            }
            List<String> listA4 = a(com.safedk.android.utils.g.a(a("ClickThrough"), 2), next, i2, (boolean) r7);
            if (!listA4.isEmpty()) {
                Object[] objArr2 = new Object[2];
                objArr2[r7] = "click url list: ";
                objArr2[1] = listA4;
                Logger.d(f62390q, objArr2);
                strA3 = a(listA4.get(r7), z2);
                if (strA == null) {
                    strA = a(listA4.get(r7), true);
                }
                Iterator<String> it3 = listA4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(a(it3.next(), z2));
                }
            } else {
                Logger.d(f62390q, "click url list is empty");
            }
            if (!TextUtils.isEmpty(strA)) {
                str8 = strA;
            }
            Pattern patternA = com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)<TAG_NAME>[\\s\\S]*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)<TAG_NAME>(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)".replaceFirst("<TAG_NAME>", "MediaFile[^s]").replace("<TAG_NAME>", "MediaFile"), 2);
            Iterator<String> it4 = a(patternA, next, -1, z2).iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                Iterator<String> it5 = it4;
                List<String> listA5 = a(com.safedk.android.utils.g.a("(apiFramework(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)VPAID(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|type(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)application/javascript(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2), next2, -1, z2);
                String str10 = str8;
                List<String> listA6 = a(patternA, next2, 1, z2);
                String strA4 = a(listA6.get(0), z2);
                Pattern pattern = patternA;
                String str11 = str9;
                Pattern patternA2 = com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)MediaFile[\\s\\S]*?type(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
                List<String> listA7 = a(patternA2, next2, 1, z2);
                if (!listA7.isEmpty()) {
                    str6 = "";
                    arrayList = arrayList6;
                    listA = listA7;
                } else {
                    arrayList = arrayList6;
                    str6 = "";
                    listA = a(patternA2, next2.replace(" ", ""), 1, z2);
                }
                if (listA.isEmpty()) {
                    c4 = 0;
                    str7 = str6;
                } else {
                    c4 = 0;
                    str7 = listA.get(0);
                }
                if (!str7.isEmpty()) {
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = arrayList5;
                    Object[] objArr3 = new Object[2];
                    objArr3[c4] = "empty media type: ";
                    objArr3[1] = next2;
                    Logger.d(f62390q, objArr3);
                }
                if (!listA5.isEmpty()) {
                    arrayList3.add(strA4);
                    Logger.d(f62390q, "contains media file with JS app attribute");
                    z3 = true;
                } else if (!listA6.isEmpty()) {
                    arrayList7.add(new Pair(str7, strA4));
                    Logger.d(f62390q, "adding media file : ", strA4);
                } else {
                    Logger.d(f62390q, "cannot detect media resource in. skipping");
                }
                it4 = it5;
                str8 = str10;
                patternA = pattern;
                str9 = str11;
                arrayList5 = arrayList2;
                arrayList6 = arrayList;
            }
            String str12 = str8;
            String str13 = str9;
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList6;
            List<String> listA8 = a(com.safedk.android.utils.g.a(a("AdParameters"), 2), next, 1, z2);
            if (listA8.isEmpty()) {
                i3 = 1;
            } else {
                strA2 = a(listA8.get(0), z2);
                if (n.n(strA2)) {
                    Logger.printFullVerboseLog(f62390q, "ad parameters is JSON : ", strA2);
                    ArrayList<String> arrayListG = n.g(strA2);
                    if (!arrayListG.isEmpty()) {
                        for (String str14 : arrayListG) {
                            Logger.d(f62390q, "ad parameters media url : ", str14);
                            if (n.s(str14)) {
                                Logger.d(f62390q, "ad parameters media url is video url : ", str14);
                                arrayList7.add(new Pair("video/*", a(str14, z2)));
                            }
                        }
                    }
                    i3 = 1;
                } else {
                    i3 = 1;
                    Logger.printFullVerboseLog(f62390q, "found ad parameters = ", strA2);
                }
            }
            List<String> listA9 = a(com.safedk.android.utils.g.a(a("YouTubeVideoId"), 2), str2, i3, z2);
            if (!listA9.isEmpty()) {
                arrayList3.add("element:ytId:" + listA9.get(0));
                Logger.d(f62390q, "handle no vast ad Uri - added element to prefetch collection: ", listA9.get(0));
            }
            Iterator it6 = arrayList7.iterator();
            String str15 = null;
            String str16 = null;
            String str17 = null;
            while (true) {
                if (!it6.hasNext()) {
                    str5 = null;
                    break;
                }
                Pair pair = (Pair) it6.next();
                String strA5 = a((Pair<String, String>) pair);
                str5 = (String) pair.second;
                Logger.d(f62390q, "found extension : ", strA5, " for media: ", pair);
                if (((String) pair.first).contains("video") && str5.contains(f62391r)) {
                    if (strA5 != null && strA5.equals(n.f63223d)) {
                        Logger.d(f62390q, "found google videoUrl mp4: ", pair);
                        break;
                    }
                    Logger.d(f62390q, "found google videoUrl regular: ", pair);
                    str17 = str5;
                }
                if (strA5 != null && strA5.equals(n.f63223d) && str15 == null) {
                    Logger.d(f62390q, "setting first mp4 media file as: ", pair);
                    str15 = str5;
                }
                if (strA5 != null && !strA5.equals(n.f63223d) && str16 == null) {
                    Logger.d(f62390q, "setting first non-mp4 media file as: ", pair);
                    str16 = str5;
                }
            }
            if (str5 == null) {
                if (str17 != null) {
                    str15 = str17;
                } else if (str15 != null) {
                    Logger.d(f62390q, "found first MP4 videoUrl : ", str15);
                } else if (str16 != null) {
                    Logger.d(f62390q, "found first non-MP4 videoUrl : ", str16);
                    str15 = str16;
                }
            } else {
                str15 = str5;
            }
            if (!TextUtils.isEmpty(str15)) {
                if (!arrayList3.contains(str15)) {
                    arrayList3.add(str15);
                }
                str9 = str15;
                c2 = 0;
            } else {
                c2 = 0;
                Logger.d(f62390q, "VAST ad did NOT found video url");
                str9 = str13;
            }
            if (!TextUtils.isEmpty(strA)) {
                Object[] objArr4 = new Object[2];
                objArr4[c2] = "VAST ad found click Url = ";
                objArr4[1] = strA;
                Logger.d(f62390q, objArr4);
            }
            it2 = it;
            str8 = str12;
            arrayList5 = arrayList8;
            arrayList6 = arrayList9;
            r6 = 0;
            i5 = 2;
        }
        String str18 = str9;
        ArrayList arrayList10 = arrayList5;
        ArrayList arrayList11 = arrayList6;
        a(str, z2, arrayList4, com.safedk.android.utils.g.a(a("StaticResource"), 2));
        a(str, z2, arrayList10, com.safedk.android.utils.g.a(a("IFrameResource"), 2));
        Pattern patternA3 = com.safedk.android.utils.g.a(a("HTMLResource"), 2);
        a(str, z2, arrayList11, patternA3);
        List<String> listA10 = a(patternA3, str, 1, z2);
        if (str8 != null) {
            arrayList3.remove(str8);
        }
        return new a(str3, str4, str8, str18, arrayList3, arrayList4, arrayList10, arrayList11, listA10, list2, list3, list4, list5, z3, strA2, list, strA3, arrayList7);
    }

    private static void a(String str, boolean z2, List<String> list, Pattern pattern) {
        Iterator<String> it = a(pattern, str, 1, z2).iterator();
        while (it.hasNext()) {
            String strZ = n.z(it.next());
            List<String> listA = a(a(), strZ, 1, z2);
            if (!listA.isEmpty()) {
                strZ = listA.get(0);
            }
            try {
                new URL(strZ);
                list.add(strZ);
            } catch (MalformedURLException e2) {
                Logger.d(f62390q, "resources inner text is malformed. cannot add this url to the resources list");
            }
        }
    }

    public static boolean b(String str) {
        return com.safedk.android.utils.g.a("VAST.*/VAST", 34).matcher(str).find();
    }

    public static void a(String str, String[] strArr, String str2) {
        List<String> listA = a(com.safedk.android.utils.g.a(a("VASTAdTagURI"), 2), str, 1, true);
        if (!listA.isEmpty()) {
            String strG = k.g(a(listA.get(0), true));
            Logger.printFullVerboseLog(f62390q, "Vast ad uri added to followed urls : ", strG);
            a(new f(a(strArr, strG)));
        }
    }

    private static String a(String[] strArr, String str) {
        if (strArr != null && strArr.length > 0) {
            String strA = k.a(str, strArr);
            Logger.d(f62390q, "Vast ad uri, query params removed : ", strArr);
            return strA;
        }
        return str;
    }

    protected static void a(i iVar) {
        f62389p.add(iVar);
    }

    protected static String a(Pair<String, String> pair) {
        String[] strArrSplit = ((String) pair.first).split("/");
        if (strArrSplit.length > 1 && "video".equals(strArrSplit[0])) {
            return strArrSplit[1];
        }
        return null;
    }

    public static Pattern j() {
        return com.safedk.android.utils.g.a(a("VAST"), 2);
    }

    public static Pattern k() {
        return com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Creative[^s]?(?:id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([0-9]+)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))?.*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Creative(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2);
    }
}
