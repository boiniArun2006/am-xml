package com.safedk.android.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63136a = "MemoryUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f63137b = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f63138c = 1.5d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double f63139d = 2.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f63140e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f63141f = 1048576;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f63142g = 1073741824;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f63143h = 1099511627776L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f63144i = 1125899906842624L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f63145j = 1152921504606846976L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f63146k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f63147l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f63148m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f63149n = 33554432;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f63150o = 67108864;

    public static long a(Context context) {
        return Runtime.getRuntime().freeMemory();
    }

    public static String a() {
        try {
            return a(a(Environment.getDataDirectory()));
        } catch (Throwable th) {
            Logger.e(f63136a, "error in getHumanReadableFreeInternalMemory()");
            return "";
        }
    }

    public static long b() {
        return a(Environment.getDataDirectory());
    }

    private static long a(File file) {
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            return Build.VERSION.SDK_INT >= 18 ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            Logger.e(f63136a, "error in getAvailableMemoryInPath");
            return 0L;
        }
    }

    public static String a(long j2) {
        if (j2 < 1024) {
            return a(j2) + " byte";
        }
        if (j2 >= 1024 && j2 < f63141f) {
            StringBuilder sb = new StringBuilder();
            double d2 = j2;
            Double.isNaN(d2);
            sb.append(a(d2 / 1024.0d));
            sb.append(" Kb");
            return sb.toString();
        }
        if (j2 >= f63141f && j2 < f63142g) {
            StringBuilder sb2 = new StringBuilder();
            double d4 = j2;
            Double.isNaN(d4);
            sb2.append(a(d4 / 1048576.0d));
            sb2.append(" Mb");
            return sb2.toString();
        }
        if (j2 >= f63142g && j2 < f63143h) {
            StringBuilder sb3 = new StringBuilder();
            double d5 = j2;
            Double.isNaN(d5);
            sb3.append(a(d5 / 1.073741824E9d));
            sb3.append(" Gb");
            return sb3.toString();
        }
        if (j2 >= f63143h && j2 < f63144i) {
            StringBuilder sb4 = new StringBuilder();
            double d6 = j2;
            Double.isNaN(d6);
            sb4.append(a(d6 / 1.099511627776E12d));
            sb4.append(" Tb");
            return sb4.toString();
        }
        if (j2 >= f63144i && j2 < f63145j) {
            StringBuilder sb5 = new StringBuilder();
            double d7 = j2;
            Double.isNaN(d7);
            sb5.append(a(d7 / 1.125899906842624E15d));
            sb5.append(" Pb");
            return sb5.toString();
        }
        if (j2 < f63145j) {
            return "???";
        }
        StringBuilder sb6 = new StringBuilder();
        double d8 = j2;
        Double.isNaN(d8);
        sb6.append(a(d8 / 1.15292150460684698E18d));
        sb6.append(" Eb");
        return sb6.toString();
    }

    private static String a(double d2) {
        return new DecimalFormat("#.##").format(d2);
    }

    public static long c() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }

    public static void a(String str) {
        String strA = a(str.getBytes().length);
        String strA2 = a(c());
        Logger.d(f63136a, "loaded from prefs: ", strA);
        Logger.d(f63136a, "available heap size: ", strA2);
        if (b(SafeDK.getInstance().m())) {
            Logger.e(f63136a, "android low memory!");
        }
    }

    public static void b(String str) {
        String strA = a(str.getBytes().length);
        String strA2 = a(c());
        Logger.d(f63136a, "saved in prefs: ", strA);
        boolean zB = b(SafeDK.getInstance().m());
        Logger.d(f63136a, "available heap size: ", strA2);
        if (zB) {
            Logger.e(f63136a, "android low memory!");
        }
    }

    public static void a(Map<?, ?> map, String str) {
        Long lB = b(map, str);
        if (map == null || lB == null || map.size() <= lB.longValue()) {
            return;
        }
        String string = UUID.randomUUID().toString();
        try {
            Map<BrandSafetyUtils.AdType, Integer> mapA = a(map, str, lB.longValue(), string);
            for (BrandSafetyUtils.AdType adType : mapA.keySet()) {
                if (mapA.get(adType) != null && r3.intValue() > lB.longValue()) {
                    a(adType, map, str, lB.longValue(), string);
                }
            }
        } catch (Throwable th) {
            Logger.d(f63136a, "Exception in clear CIs from memory ", string, " for ", str, th);
        }
    }

    private static Long b(Map<?, ?> map, String str) {
        CreativeInfo creativeInfoA;
        long jU = SafeDK.getInstance().U();
        if (map != null && !map.isEmpty() && map.values().iterator().hasNext() && (creativeInfoA = a(map.values().iterator().next())) != null) {
            String strS = creativeInfoA.S();
            if (!CreativeInfoManager.a(strS, AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true)) {
                Logger.d(f63136a, "clear CIs from memory, don't clean on CI expiration, sdk: ", strS);
                return null;
            }
            jU = CreativeInfoManager.a(strS, AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_THRESHOLD, jU);
            Logger.d(f63136a, "clear CIs from memory for ", str, ", map size:", Integer.valueOf(map.size()), ", sdk: ", strS, ", threshold: ", Long.valueOf(jU));
        }
        return Long.valueOf(jU);
    }

    private static Map<BrandSafetyUtils.AdType, Integer> a(Map<?, ?> map, String str, long j2, String str2) {
        Iterator it;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (map) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                CreativeInfo creativeInfoA = a(entry.getValue());
                if (creativeInfoA != null) {
                    BrandSafetyUtils.AdType adTypeM = creativeInfoA.M();
                    Integer num = (Integer) map2.get(adTypeM);
                    if (num == null) {
                        num = 0;
                    }
                    map2.put(adTypeM, Integer.valueOf(num.intValue() + 1));
                    if (creativeInfoA.ad() != null && creativeInfoA.ad().before(new Timestamp(jCurrentTimeMillis))) {
                        List arrayList = (List) map3.get(adTypeM);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map3.put(adTypeM, arrayList);
                        }
                        arrayList.add(entry.getKey());
                    }
                }
            }
        }
        char c2 = 4;
        char c4 = 3;
        Logger.d(f63136a, "clear CIs from memory (expired) ", str2, ", total CI counts: ", map2);
        Iterator it2 = map3.keySet().iterator();
        while (it2.hasNext()) {
            BrandSafetyUtils.AdType adType = (BrandSafetyUtils.AdType) it2.next();
            Integer num2 = (Integer) map2.get(adType);
            if (num2 == null || num2.intValue() <= j2) {
                it = it2;
            } else {
                Object[] objArr = new Object[8];
                objArr[0] = "clear CIs from memory (expired) ";
                objArr[1] = str2;
                objArr[2] = " for ";
                objArr[c4] = str;
                objArr[c2] = ", type:";
                objArr[5] = adType;
                objArr[6] = ", total count: ";
                objArr[7] = num2;
                Logger.d(f63136a, objArr);
                long jIntValue = ((long) num2.intValue()) - j2;
                List list = (List) map3.get(adType);
                if (list == null) {
                    it = it2;
                } else {
                    int i2 = 0;
                    while (true) {
                        it = it2;
                        if (i2 >= jIntValue || i2 >= list.size()) {
                            break;
                        }
                        Object obj = list.get(i2);
                        synchronized (map) {
                            if (map.remove(obj) != null) {
                                Integer numValueOf = Integer.valueOf(num2.intValue() - 1);
                                map2.put(adType, numValueOf);
                                Logger.d(f63136a, "clear CIs from memory (expired) ", str2, ", removing item with key: ", obj, ", remaining items: ", numValueOf);
                                num2 = numValueOf;
                            }
                        }
                        i2++;
                        it2 = it;
                    }
                }
            }
            it2 = it;
            c2 = 4;
            c4 = 3;
        }
        return map2;
    }

    private static void a(BrandSafetyUtils.AdType adType, Map<?, ?> map, String str, long j2, String str2) {
        Map<Long, List<Object>> mapA = a(map, adType, str2);
        int iC = c(mapA, str2);
        long j3 = iC;
        if (j3 > j2) {
            long j4 = j3 - j2;
            if (j4 > 0) {
                ArrayList arrayList = new ArrayList(mapA.keySet());
                Collections.sort(arrayList);
                Logger.d(f63136a, "clear CIs from memory (oldest) ", str2, " for ", str, ", type:", adType, ", total count: ", Integer.valueOf(iC));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List<Object> list = mapA.get((Long) it.next());
                    if (list != null) {
                        for (Object obj : list) {
                            if (map.containsKey(obj)) {
                                synchronized (map) {
                                    map.remove(obj);
                                }
                                iC--;
                                Logger.d(f63136a, "clear CIs from memory (oldest) ", str2, ", removing item with key: ", obj, ", remaining items: ", Integer.valueOf(iC));
                                j4--;
                                if (j4 <= 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static CreativeInfo a(Object obj) {
        if (obj instanceof CreativeInfo) {
            return (CreativeInfo) obj;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (!list.isEmpty() && (list.get(0) instanceof CreativeInfo)) {
                return (CreativeInfo) list.get(0);
            }
        }
        return null;
    }

    private static int c(Map<Long, List<Object>> map, String str) {
        int size;
        if (map == null) {
            size = 0;
        } else {
            Iterator<List<Object>> it = map.values().iterator();
            size = 0;
            while (it.hasNext()) {
                size += it.next().size();
            }
        }
        if (size > 0) {
            Logger.d(f63136a, "clear CIs from memory (oldest) ", str, ", total values in TS map: ", Integer.valueOf(size));
        }
        return size;
    }

    private static Map<Long, List<Object>> a(Map<?, ?> map, BrandSafetyUtils.AdType adType, String str) {
        HashMap map2 = new HashMap();
        synchronized (map) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                CreativeInfo creativeInfoA = a(entry.getValue());
                if (creativeInfoA != null && ((creativeInfoA.M() == null && adType == null) || (creativeInfoA.M() != null && creativeInfoA.M().equals(adType)))) {
                    List arrayList = (List) map2.get(Long.valueOf(creativeInfoA.ag()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map2.put(Long.valueOf(creativeInfoA.ag()), arrayList);
                    }
                    arrayList.add(entry.getKey());
                }
            }
        }
        if (!map2.isEmpty()) {
            Object[] objArr = new Object[6];
            objArr[0] = "clear CIs from memory (oldest) ";
            objArr[1] = str;
            objArr[2] = ", total keys in TS map: ";
            objArr[3] = Integer.valueOf(map2.size());
            objArr[4] = ", adType: ";
            objArr[5] = adType != null ? adType.name() : V8ValueNull.NULL;
            Logger.d(f63136a, objArr);
        }
        return map2;
    }

    public static boolean a(com.safedk.android.analytics.brandsafety.c cVar) {
        if (b(SafeDK.getInstance().m())) {
            cVar.b(com.safedk.android.analytics.brandsafety.l.f62627H, new l.a(com.safedk.android.analytics.brandsafety.l.f62642W, com.safedk.android.analytics.brandsafety.l.ab));
            return true;
        }
        if (d()) {
            cVar.b(com.safedk.android.analytics.brandsafety.l.f62627H, new l.a(com.safedk.android.analytics.brandsafety.l.f62642W, com.safedk.android.analytics.brandsafety.l.aa));
        } else if (e()) {
            cVar.b(com.safedk.android.analytics.brandsafety.l.f62627H, new l.a(com.safedk.android.analytics.brandsafety.l.f62642W, com.safedk.android.analytics.brandsafety.l.f62645Z));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d() {
        a.b(SafeDK.getInstance().m());
        if (f63147l.f63151a != null) {
            double d2 = f63147l.f63151a.availMem;
            double d4 = f63147l.f63151a.threshold;
            Double.isNaN(d4);
            if (d2 >= d4 * f63138c) {
                if (!l()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e() {
        a.b(SafeDK.getInstance().m());
        if (f63147l.f63151a != null) {
            double d2 = f63147l.f63151a.availMem;
            double d4 = f63147l.f63151a.threshold;
            Double.isNaN(d4);
            if (d2 >= d4 * f63139d) {
                if (!l()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String f() {
        if (f63147l.f63151a != null) {
            return "{ available=" + a(f63147l.f63151a.availMem) + ", total=" + a(f63147l.f63151a.totalMem) + ", threshold=" + a(f63147l.f63151a.threshold) + ", app heap free mem =" + a(f63147l.f63152b) + " }";
        }
        return "{ }";
    }

    private static String a(Timestamp timestamp) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(timestamp.getTime()));
    }

    public static String b(long j2) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) new Date(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long j() {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (jMaxMemory < 0) {
            return 0L;
        }
        return jMaxMemory;
    }

    private static boolean k() {
        long j2 = j();
        if (j2 >= f63149n) {
            return false;
        }
        Logger.d(f63136a, "app heap free mem critical : ", a(j2));
        return true;
    }

    private static boolean l() {
        long j2 = j();
        if (j2 >= f63150o || j2 < f63149n) {
            return false;
        }
        Logger.d(f63136a, "app heap free mem low : ", a(j2));
        return true;
    }

    public static boolean b(Context context) {
        a.b(context);
        return (f63147l.f63151a != null && f63147l.f63151a.lowMemory) || k();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ActivityManager.MemoryInfo f63151a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f63152b;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - e.f63146k > 5000 && SafeDK.getInstance() != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                e.f63147l.f63151a = memoryInfo;
                long unused = e.f63146k = jElapsedRealtime;
                e.f63147l.f63152b = e.j();
                if (memoryInfo.lowMemory) {
                    Logger.d(e.f63136a, Logger.FeatureTag.MEMORY_LOAD, "critical RAM memory level reached: ", e.f());
                    return;
                }
                double d2 = memoryInfo.availMem;
                double d4 = memoryInfo.threshold;
                Double.isNaN(d4);
                if (d2 < d4 * e.f63138c) {
                    Logger.d(e.f63136a, Logger.FeatureTag.MEMORY_LOAD, "low RAM memory level reached: ", e.f());
                    return;
                }
                double d5 = memoryInfo.availMem;
                double d6 = memoryInfo.threshold;
                Double.isNaN(d6);
                if (d5 < d6 * e.f63139d) {
                    Logger.d(e.f63136a, Logger.FeatureTag.MEMORY_LOAD, "medium RAM memory level reached: ", e.f());
                } else if (e.f63147l.f63152b < e.f63149n) {
                    Logger.d(e.f63136a, Logger.FeatureTag.MEMORY_LOAD, "critical app-heap: avail app heap=", e.f());
                } else {
                    Logger.d(e.f63136a, Logger.FeatureTag.MEMORY_LOAD, "update memory info: ", e.f());
                }
            }
        }
    }
}
