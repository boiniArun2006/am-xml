package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class SoLoader {
    private static int qie;
    static l3D rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ReentrantReadWriteLock f53024t = new ReentrantReadWriteLock();
    static Context nr = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static volatile ci[] f53022O = null;
    private static final AtomicInteger J2 = new AtomicInteger(0);
    private static ddf.CN3 Uo = null;
    private static final HashSet KN = new HashSet();
    private static final Map xMQ = new HashMap();
    private static final Set mUb = Collections.newSetFromMap(new ConcurrentHashMap());
    private static boolean gh = true;
    private static int az = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final boolean f53023n = true;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class j extends UnsatisfiedLinkError {
        j(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.mUb()) + " error: " + str);
            initCause(th);
        }
    }

    private static boolean Z(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        ddf.Wre wreGh = null;
        while (true) {
            try {
                return XQ(str, str2, str3, i2, threadPolicy);
            } catch (UnsatisfiedLinkError e2) {
                qz.KN("SoLoader", "Starting recovery for " + str, e2);
                f53024t.writeLock().lock();
                if (wreGh == null) {
                    try {
                        try {
                            wreGh = gh();
                        } catch (NoBaseApkException e3) {
                            qz.t("SoLoader", "Base APK not found during recovery", e3);
                            throw e3;
                        } catch (Exception e4) {
                            qz.t("SoLoader", "Got an exception during recovery, will throw the initial error instead", e4);
                            throw e2;
                        }
                    } finally {
                        f53024t.writeLock().unlock();
                    }
                }
                if (wreGh == null || !wreGh.n(e2, f53022O)) {
                    f53024t.writeLock().unlock();
                    qz.Uo("SoLoader", "Failed to recover");
                    throw e2;
                }
                J2.getAndIncrement();
                qz.Uo("SoLoader", "Attempting to load library again");
            }
        }
        f53024t.writeLock().unlock();
        qz.Uo("SoLoader", "Failed to recover");
        throw e2;
    }

    public static void init(Context context, int i2) throws IOException {
        qie(context, i2, null);
    }

    private static boolean ty(Context context) {
        String packageName;
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
        } catch (Exception e2) {
            e = e2;
            packageName = null;
        }
        try {
            bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
        } catch (Exception e3) {
            e = e3;
            qz.KN("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    private static synchronized void HI(Context context, l3D l3d) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    qz.Uo("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                nr = context;
                Uo = new ddf.Ml(context);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l3d != null || rl == null) {
            if (l3d != null) {
                rl = l3d;
            } else {
                rl = new C1871c();
            }
        }
    }

    public static boolean Ik() {
        if (f53022O != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f53024t;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z2 = f53022O != null;
            reentrantReadWriteLock.readLock().unlock();
            return z2;
        } catch (Throwable th) {
            f53024t.readLock().unlock();
            throw th;
        }
    }

    private static void J2(Context context, ArrayList arrayList) {
        g9s g9sVar = new g9s();
        qz.n("SoLoader", "adding systemLoadWrapper source: " + g9sVar);
        arrayList.add(0, g9sVar);
    }

    private static void KN(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z2;
        ReentrantReadWriteLock reentrantReadWriteLock = f53024t;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f53022O == null) {
                qz.rl("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z2 = true;
            } else {
                z2 = false;
            }
            if (f53023n) {
                Api18TraceUtils.n("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (ci ciVar : f53022O) {
                            if (ciVar.nr(str, i2, threadPolicy) != 0) {
                                if (z2) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw Q.rl(str, nr, f53022O);
                    } catch (IOException e2) {
                        r rVar = new r(str, e2.toString());
                        rVar.initCause(e2);
                        throw rVar;
                    }
                } finally {
                }
            } finally {
                if (f53023n) {
                    Api18TraceUtils.rl();
                }
                if (z2) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    private static Boolean S(String str) {
        Boolean boolValueOf;
        if (f53022O != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f53024t;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f53022O == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean zContains = KN.contains(str);
                            boolean z2 = !zContains;
                            if (!zContains) {
                                System.loadLibrary(str);
                            }
                            boolValueOf = Boolean.valueOf(z2);
                        } finally {
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                Uo();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th) {
            f53024t.readLock().unlock();
            throw th;
        }
    }

    private static int WPU() {
        ReentrantReadWriteLock reentrantReadWriteLock = f53024t;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i2 = qie;
            int i3 = (i2 & 2) != 0 ? 1 : 0;
            if ((i2 & 256) != 0) {
                i3 |= 4;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i3;
        } catch (Throwable th) {
            f53024t.writeLock().unlock();
            throw th;
        }
    }

    private static void az() {
        if (f53022O != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f53024t;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f53022O == null) {
                f53022O = new ci[0];
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f53024t.writeLock().unlock();
            throw th;
        }
    }

    private static void ck(Context context, int i2) {
        ReentrantReadWriteLock.WriteLock writeLock;
        if (f53022O != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f53024t;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f53022O != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                qie = i2;
                ArrayList arrayList = new ArrayList();
                if ((i2 & 512) != 0) {
                    J2(context, arrayList);
                } else {
                    O(arrayList);
                    if (context != null) {
                        if ((i2 & 1) != 0) {
                            n(arrayList, mUb());
                            qz.n("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new aC(context, "lib-main"));
                        } else {
                            if (SysUtil.qie(context, az)) {
                                nr(context, arrayList);
                            }
                            n(arrayList, mUb());
                            rl(context, arrayList, 1);
                        }
                    }
                }
                ci[] ciVarArr = (ci[]) arrayList.toArray(new ci[arrayList.size()]);
                int iWPU = WPU();
                int length = ciVarArr.length;
                while (true) {
                    int i3 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    qz.n("SoLoader", "Preparing SO source: " + ciVarArr[i3]);
                    boolean z2 = f53023n;
                    if (z2) {
                        Api18TraceUtils.n("SoLoader", "_", ciVarArr[i3].getClass().getSimpleName());
                    }
                    ciVarArr[i3].O(iWPU);
                    if (z2) {
                        Api18TraceUtils.rl();
                    }
                    length = i3;
                }
                f53022O = ciVarArr;
                J2.getAndIncrement();
                qz.n("SoLoader", "init finish: " + f53022O.length + " SO sources prepared");
                writeLock = f53024t.writeLock();
            }
            writeLock.unlock();
        } catch (Throwable th) {
            f53024t.writeLock().unlock();
            throw th;
        }
    }

    private static synchronized ddf.Wre gh() {
        ddf.CN3 cn3;
        cn3 = Uo;
        return cn3 == null ? null : cn3.get();
    }

    private static int mUb() {
        int i2 = az;
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2 || i2 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    private static void n(ArrayList arrayList, int i2) {
        com.facebook.soloader.j jVar = new com.facebook.soloader.j(nr, i2);
        qz.n("SoLoader", "Adding application source: " + jVar.toString());
        arrayList.add(0, jVar);
    }

    private static void nr(Context context, ArrayList arrayList) {
        Ml ml = new Ml(context);
        qz.n("SoLoader", "validating/adding directApk source: " + ml.toString());
        if (ml.ty()) {
            arrayList.add(0, ml);
        }
    }

    static void r(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        XQ(str, null, null, i2 | 1, threadPolicy);
    }

    private static void rl(Context context, ArrayList arrayList, int i2) {
        if ((qie & 8) != 0) {
            File fileTy = afx.ty(context, "lib-main");
            try {
                if (fileTy.exists()) {
                    SysUtil.t(fileTy);
                    return;
                }
                return;
            } catch (Throwable th) {
                qz.KN("SoLoader", "Failed to delete " + fileTy.getCanonicalPath(), th);
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        w6 w6Var = new w6(context, file, "lib-main", i2);
        arrayList2.add(w6Var);
        qz.n("SoLoader", "adding backup source from : " + w6Var.toString());
        t(context, i2, arrayList2);
        arrayList.addAll(0, arrayList2);
    }

    private static int xMQ(Context context) {
        int i2 = az;
        if (i2 != 0) {
            return i2;
        }
        if (context == null) {
            qz.n("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i3 = applicationInfo.flags;
        int i5 = (i3 & 1) != 0 ? (i3 & 128) != 0 ? 3 : 2 : 1;
        qz.n("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + obbPUqyhtS.YLZseCnjsw + i5);
        return i5;
    }

    private static void O(ArrayList arrayList) {
        String str;
        if (SysUtil.gh()) {
            str = "/system/lib64:/vendor/lib64";
        } else {
            str = "/system/lib:/vendor/lib";
        }
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + ":" + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            qz.n("SoLoader", "adding system library source: " + str3);
            arrayList.add(new I28(new File(str3), 2));
        }
    }

    private static void Uo() {
        if (Ik()) {
        } else {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3 A[Catch: all -> 0x005e, PHI: r3
      0x00c3: PHI (r3v3 boolean) = (r3v2 boolean), (r3v4 boolean), (r3v4 boolean) binds: [B:25:0x0047, B:41:0x0065, B:47:0x009d] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {, blocks: (B:27:0x004b, B:32:0x0055, B:42:0x0067, B:43:0x0080, B:44:0x0098, B:50:0x00a0, B:52:0x00a2, B:54:0x00a8, B:56:0x00b0, B:57:0x00bf, B:58:0x00c0, B:60:0x00c2, B:61:0x00c3, B:63:0x00c7, B:65:0x00cd, B:70:0x00da, B:72:0x00de, B:75:0x010d, B:82:0x0138, B:84:0x013c, B:85:0x013f, B:86:0x0140, B:73:0x00e5, B:80:0x0114, B:81:0x0137, B:28:0x004c, B:31:0x0054, B:40:0x0064, B:45:0x0099, B:46:0x009c), top: B:106:0x004b, outer: #5, inners: #1, #2, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7 A[Catch: all -> 0x005e, TryCatch #7 {, blocks: (B:27:0x004b, B:32:0x0055, B:42:0x0067, B:43:0x0080, B:44:0x0098, B:50:0x00a0, B:52:0x00a2, B:54:0x00a8, B:56:0x00b0, B:57:0x00bf, B:58:0x00c0, B:60:0x00c2, B:61:0x00c3, B:63:0x00c7, B:65:0x00cd, B:70:0x00da, B:72:0x00de, B:75:0x010d, B:82:0x0138, B:84:0x013c, B:85:0x013f, B:86:0x0140, B:73:0x00e5, B:80:0x0114, B:81:0x0137, B:28:0x004c, B:31:0x0054, B:40:0x0064, B:45:0x0099, B:46:0x009c), top: B:106:0x004b, outer: #5, inners: #1, #2, #3, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean XQ(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z2;
        Object obj;
        boolean z3 = false;
        if (!TextUtils.isEmpty(str2) && mUb.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                HashSet hashSet = KN;
                if (hashSet.contains(str)) {
                    if (str3 == null) {
                        return false;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                Map map = xMQ;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f53024t;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z2) {
                            synchronized (SoLoader.class) {
                                if (hashSet.contains(str)) {
                                    if (str3 == null) {
                                        reentrantReadWriteLock.readLock().unlock();
                                        return false;
                                    }
                                    z2 = true;
                                }
                                if (!z2) {
                                    try {
                                        qz.n("SoLoader", "About to load: " + str);
                                        KN(str, i2, threadPolicy);
                                        qz.n("SoLoader", "Loaded: " + str);
                                        synchronized (SoLoader.class) {
                                            hashSet.add(str);
                                        }
                                        if ((i2 & 16) == 0) {
                                            if (!TextUtils.isEmpty(str2) && mUb.contains(str2)) {
                                                z3 = true;
                                            }
                                            if (str3 != null && !z3) {
                                                boolean z4 = f53023n;
                                                if (z4) {
                                                    Api18TraceUtils.n("MergedSoMapping.invokeJniOnload[", str2, "]");
                                                }
                                                try {
                                                    try {
                                                        qz.n("SoLoader", "About to merge: " + str2 + " / " + str);
                                                        Pl.n(str2);
                                                        mUb.add(str2);
                                                        if (z4) {
                                                            Api18TraceUtils.rl();
                                                        }
                                                    } catch (Throwable th) {
                                                        if (f53023n) {
                                                            Api18TraceUtils.rl();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (UnsatisfiedLinkError e2) {
                                                    throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e2);
                                                }
                                            }
                                        }
                                        reentrantReadWriteLock.readLock().unlock();
                                        return !z2;
                                    } catch (UnsatisfiedLinkError e3) {
                                        String message = e3.getMessage();
                                        if (message != null && message.contains("unexpected e_machine:")) {
                                            throw new j(e3, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                        }
                                        throw e3;
                                    }
                                }
                                if ((i2 & 16) == 0) {
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return !z2;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    f53024t.readLock().unlock();
                    throw th2;
                }
            } finally {
            }
        }
    }

    public static boolean o(String str, int i2) {
        String str2;
        Boolean boolS = S(str);
        if (boolS != null) {
            return boolS.booleanValue();
        }
        if (!gh) {
            return y5Y.j.nr(str);
        }
        if (az != 2) {
        }
        String strRl = Pl.rl(str);
        if (strRl != null) {
            str2 = strRl;
        } else {
            str2 = str;
        }
        return Z(System.mapLibraryName(str2), str, strRl, i2, null);
    }

    public static void qie(Context context, int i2, l3D l3d) {
        if (Ik()) {
            qz.Uo("SoLoader", "SoLoader already initialized");
            return;
        }
        qz.Uo("SoLoader", "Initializing SoLoader: " + i2);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zTy = ty(context);
            gh = zTy;
            if (zTy) {
                int iXMQ = xMQ(context);
                az = iXMQ;
                if ((i2 & 128) == 0 && SysUtil.qie(context, iXMQ)) {
                    i2 |= 8;
                }
                HI(context, l3d);
                ck(context, i2);
                qz.J2("SoLoader", "Init SoLoader delegate");
                y5Y.j.rl(new z());
            } else {
                az();
                qz.J2("SoLoader", "Init System Loader delegate");
                y5Y.j.rl(new y5Y.w6());
            }
            qz.Uo("SoLoader", "SoLoader initialized: " + i2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    private static void t(Context context, int i2, ArrayList arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            qz.n("SoLoader", "adding backup sources from split apks");
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i3 = 0;
            int i5 = 0;
            while (i3 < length) {
                File file = new File(strArr[i3]);
                StringBuilder sb = new StringBuilder();
                sb.append("lib-");
                int i7 = i5 + 1;
                sb.append(i5);
                w6 w6Var = new w6(context, file, sb.toString(), i2);
                qz.n("SoLoader", "adding backup source: " + w6Var.toString());
                if (w6Var.S()) {
                    arrayList.add(w6Var);
                }
                i3++;
                i5 = i7;
            }
        }
    }
}
