package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DateFormat f47937a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f47938b = new Random(System.currentTimeMillis());

    public static void a(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, t7 t7Var, int i2, C1802k c1802k) {
        if (c1802k == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i2);
        }
        Set setA = a(s7Var, c1802k);
        if (CollectionUtils.isEmpty(setA)) {
            return;
        }
        a(setA, t7Var, c1802k);
    }

    public static boolean b(o7 o7Var) {
        b8 b8VarP1;
        List listG;
        return (o7Var == null || (b8VarP1 = o7Var.p1()) == null || (listG = b8VarP1.g()) == null || listG.isEmpty()) ? false : true;
    }

    public static t7 c(o7 o7Var) {
        if (b(o7Var) || a(o7Var)) {
            return null;
        }
        return t7.GENERAL_WRAPPER_ERROR;
    }

    private static String b() {
        DateFormat dateFormat = f47937a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean a(o7 o7Var) {
        r7 r7VarG1;
        w7 w7VarE;
        if (o7Var == null || (r7VarG1 = o7Var.g1()) == null || (w7VarE = r7VarG1.e()) == null) {
            return false;
        }
        return w7VarE.c() != null || StringUtils.isValidString(w7VarE.b());
    }

    public static boolean b(p8 p8Var) {
        if (p8Var != null) {
            return p8Var.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static Uri a(String str, long j2, Uri uri, t7 t7Var, C1802k c1802k) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String string = Integer.toString(t7Var.b());
                String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
                if (j2 >= 0) {
                    strReplace = strReplace.replace("[CONTENTPLAYHEAD]", a(j2));
                }
                if (uri != null) {
                    strReplace = strReplace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(strReplace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                c1802k.D().a("VastUtils", th);
                return null;
            }
        }
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j2) {
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j2);
            long minutes = timeUnit.toMinutes(j2);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j2 % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(f47938b.nextInt(89999999) + 10000000);
    }

    public static void a(Set set, C1802k c1802k) {
        a(set, -1L, (Uri) null, t7.UNSPECIFIED, c1802k);
    }

    public static void a(Set set, t7 t7Var, C1802k c1802k) {
        a(set, -1L, (Uri) null, t7Var, c1802k);
    }

    public static void a(Set set, long j2, Uri uri, t7 t7Var, C1802k c1802k) {
        if (c1802k != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                y7 y7Var = (y7) it.next();
                long j3 = j2;
                Uri uri2 = uri;
                t7 t7Var2 = t7Var;
                C1802k c1802k2 = c1802k;
                Uri uriA = a(y7Var.c(), j3, uri2, t7Var2, c1802k2);
                if (uriA != null) {
                    c1802k2.f0().a(com.applovin.impl.sdk.network.d.b().d(uriA.toString()).a(false).b(y7Var.d()).a(), false);
                }
                j2 = j3;
                uri = uri2;
                t7Var = t7Var2;
                c1802k = c1802k2;
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(p8 p8Var, Map map, s7 s7Var, C1802k c1802k) {
        List<p8> listA;
        if (c1802k == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (p8Var == null) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        p8 p8VarC = p8Var.c("TrackingEvents");
        if (p8VarC == null || (listA = p8VarC.a("Tracking")) == null) {
            return;
        }
        for (p8 p8Var2 : listA) {
            String str = (String) p8Var2.a().get(com.safedk.android.analytics.events.a.f62811a);
            if (StringUtils.isValidString(str)) {
                y7 y7VarA = y7.a(p8Var2, s7Var, c1802k);
                if (y7VarA != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(y7VarA);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(y7VarA);
                        map.put(str, hashSet);
                    }
                }
            } else {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().b("VastUtils", "Could not find event for tracking node = " + p8Var2);
                }
            }
        }
    }

    public static void a(List list, Set set, s7 s7Var, C1802k c1802k) {
        if (c1802k == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y7 y7VarA = y7.a((p8) it.next(), s7Var, c1802k);
            if (y7VarA != null) {
                set.add(y7VarA);
            }
        }
    }

    public static boolean a(p8 p8Var) {
        if (p8Var != null) {
            return p8Var.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(s7 s7Var) {
        p8 p8VarB;
        if (s7Var != null) {
            List listA = s7Var.a();
            int size = s7Var.a().size();
            if (size <= 0 || (p8VarB = ((p8) listA.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return p8VarB.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(p8 p8Var, String str, String str2) {
        p8 p8VarC = p8Var.c(str);
        if (p8VarC != null) {
            String strD = p8VarC.d();
            if (StringUtils.isValidString(strD)) {
                return strD;
            }
        }
        return str2;
    }

    private static Set a(s7 s7Var, C1802k c1802k) {
        List listA;
        if (s7Var == null) {
            return null;
        }
        List<p8> listA2 = s7Var.a();
        HashSet hashSet = new HashSet(listA2.size());
        for (p8 p8Var : listA2) {
            p8 p8VarB = p8Var.b("Wrapper");
            if (p8VarB == null) {
                p8VarB = p8Var.b("InLine");
            }
            if (p8VarB != null) {
                listA = p8VarB.a("Error");
            } else {
                listA = p8Var.a("Error");
            }
            hashSet = a(hashSet, listA, s7Var, c1802k);
        }
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static HashSet a(HashSet hashSet, List list, s7 s7Var, C1802k c1802k) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y7 y7VarA = y7.a((p8) it.next(), s7Var, c1802k);
                if (y7VarA != null) {
                    hashSet.add(y7VarA);
                }
            }
        }
        return hashSet;
    }
}
