package z;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class rv6 {
    private static long J2;
    private static long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static long f76331O;
    private static long Uo;
    private static volatile long nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile long f76333t;
    private static long xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final rv6 f76332n = new rv6();
    private static final Map rl = new LinkedHashMap();
    private static final Map mUb = new LinkedHashMap();
    public static final int gh = 8;

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f76334n = new j();

        private j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Ik(long j2) {
        return "GLTraceInfo: memsize=" + f76333t + " contexts=" + rl.size() + " texcount=" + nr + " peakMemsize=" + J2 + " peakTexcount=" + f76331O + " totalTexAllocs=" + KN + " allocsPerSec=" + j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Z() {
        return "GLAllocLevel: " + StringsKt.repeat("*", (int) (f76333t / ((long) 16777216)));
    }

    static /* synthetic */ void ck(rv6 rv6Var, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        rv6Var.HI(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh(long j2, Map map) {
        String str = (String) mUb.get(Long.valueOf(j2));
        if (str == null) {
            str = "Unknown";
        }
        Iterator it = map.values().iterator();
        int iN = 0;
        while (it.hasNext()) {
            iN += ((c7r) it.next()).n();
        }
        return "  " + j2 + "[" + str + "] size=" + iN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb() {
        return "--- ACTIVE CONTEXTS ---";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(long j2, long j3) {
        return "GLTraceInfo [Partial Period]: memsize=" + f76333t + " contexts=" + rl.size() + " texcount=" + nr + " peakMemsize=" + J2 + " peakTexcount=" + f76331O + " totalTexAllocs=" + KN + " allocsPerSec=" + j2 + " period=" + j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qie(int i2, c7r c7rVar) {
        return "     " + i2 + " (" + c7rVar + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r() {
        return "GLAllocLevel: " + StringsKt.repeat("*", (int) (f76333t / ((long) 16777216)));
    }

    public final void S(final String contextTag, EGLContext eglContext) {
        Intrinsics.checkNotNullParameter(contextTag, "contextTag");
        Intrinsics.checkNotNullParameter(eglContext, "eglContext");
        final long nativeHandle = eglContext.getNativeHandle();
        synchronized (j.f76334n) {
            try {
                mUb.put(Long.valueOf(nativeHandle), contextTag);
                Long lValueOf = Long.valueOf(nativeHandle);
                Map map = rl;
                if (map.containsKey(lValueOf)) {
                    String str = String.format("%08X", Arrays.copyOf(new Object[]{Long.valueOf(nativeHandle)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    Set setKeySet = map.keySet();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
                    Iterator it = setKeySet.iterator();
                    while (it.hasNext()) {
                        String str2 = String.format("%08X", Arrays.copyOf(new Object[]{Long.valueOf(((Number) it.next()).longValue())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        arrayList.add(str2);
                    }
                    throw new IllegalStateException(("Already found " + str + " in (" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + ")").toString());
                }
                map.put(Long.valueOf(nativeHandle), new LinkedHashMap());
                rv6 rv6Var = f76332n;
                XoT.C.qie(rv6Var, new Function0() { // from class: z.nKK
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return rv6.WPU(nativeHandle, contextTag);
                    }
                });
                rv6Var.HI(true);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ViF(int i2, String tag) {
        int i3;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Long lTy = ty();
        Intrinsics.checkNotNull(lTy);
        long jLongValue = lTy.longValue();
        synchronized (j.f76334n) {
            try {
                Object obj = rl.get(lTy);
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Map map = (Map) obj;
                c7r c7rVar = (c7r) map.get(Integer.valueOf(i2));
                if (c7rVar != null) {
                    f76332n.xMQ(true);
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Texture with name ");
                    i3 = i2;
                    sb.append(i3);
                    sb.append(" already traced in OpenGL context: ");
                    sb.append(jLongValue);
                    sb.append(". Existing info: ");
                    sb.append(c7rVar);
                    sb.append(". New tag: ");
                    sb.append(tag);
                    firebaseCrashlytics.recordException(new IllegalStateException(sb.toString()));
                    nr--;
                    KN--;
                } else {
                    i3 = i2;
                }
                map.put(Integer.valueOf(i3), new c7r(0, 0, 0, 0, 0L, tag, null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null));
                nr++;
                KN++;
                f76331O = Math.max(nr, f76331O);
                J2 = Math.max(f76333t, J2);
                ck(f76332n, false, 1, null);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void XQ(EGLContext eglContext) {
        Intrinsics.checkNotNullParameter(eglContext, "eglContext");
        long nativeHandle = eglContext.getNativeHandle();
        synchronized (j.f76334n) {
            try {
                Long lValueOf = Long.valueOf(nativeHandle);
                Map map = rl;
                if (!map.containsKey(lValueOf)) {
                    throw new IllegalStateException("Check failed.");
                }
                Object objRemove = map.remove(Long.valueOf(nativeHandle));
                Intrinsics.checkNotNull(objRemove);
                Map map2 = (Map) objRemove;
                Iterator it = map2.values().iterator();
                int iN = 0;
                while (it.hasNext()) {
                    iN += ((c7r) it.next()).n();
                }
                f76333t -= (long) iN;
                nr -= (long) map2.values().size();
                f76332n.HI(true);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void xMQ(boolean z2) throws InterruptedException {
        XoT.C.Uo(this, new Function0() { // from class: z.lej
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return rv6.mUb();
            }
        });
        if (z2) {
            XoT.C.nr("OpenGL Active Contexts: " + rl.size());
            Thread.sleep(2L);
        }
        synchronized (j.f76334n) {
            try {
                int i2 = 0;
                for (Map.Entry entry : rl.entrySet()) {
                    final long jLongValue = ((Number) entry.getKey()).longValue();
                    final Map map = (Map) entry.getValue();
                    if (z2) {
                        String str = (String) mUb.get(Long.valueOf(jLongValue));
                        if (str == null) {
                            str = "Unknown";
                        }
                        Iterator it = map.values().iterator();
                        int iN = 0;
                        while (it.hasNext()) {
                            iN += ((c7r) it.next()).n();
                        }
                        XoT.C.nr("  GLContext[" + i2 + "]: handle=" + jLongValue + " tag=" + str + " size=" + iN + " textures=" + map.size());
                        Thread.sleep(2L);
                    }
                    i2++;
                    XoT.C.Uo(f76332n, new Function0() { // from class: z.iwV
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return rv6.gh(jLongValue, map);
                        }
                    });
                    for (Map.Entry entry2 : map.entrySet()) {
                        final int iIntValue = ((Number) entry2.getKey()).intValue();
                        final c7r c7rVar = (c7r) entry2.getValue();
                        XoT.C.Uo(f76332n, new Function0() { // from class: z.M
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return rv6.qie(iIntValue, c7rVar);
                            }
                        });
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private rv6() {
    }

    private final void HI(boolean z2) {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        firebaseCrashlytics.setCustomKey("gl_memsize", f76333t);
        firebaseCrashlytics.setCustomKey("gl_texcount", nr);
        firebaseCrashlytics.setCustomKey("gl_ctx_count", rl.size());
        if (vd.f76342n || z2) {
            long jNanoTime = System.nanoTime() / ((long) 1000000);
            final long jMax = Math.max(1L, jNanoTime - Uo);
            if (jMax > 500) {
                long j2 = KN;
                final long j3 = ((j2 - xMQ) * ((long) 1000)) / jMax;
                xMQ = j2;
                Uo = jNanoTime;
                XoT.C.qie(this, new Function0() { // from class: z.DAz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return rv6.Ik(j3);
                    }
                });
                XoT.C.az(this, new Function0() { // from class: z.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return rv6.r();
                    }
                });
                return;
            }
            if (z2) {
                final long j4 = ((KN - xMQ) * ((long) 1000)) / jMax;
                XoT.C.qie(this, new Function0() { // from class: z.qf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return rv6.o(j4, jMax);
                    }
                });
                XoT.C.az(this, new Function0() { // from class: z.Ln
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return rv6.Z();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String WPU(long j2, String str) {
        String str2 = String.format("%08X", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return "Create context " + str2 + " tag=" + str + "; now " + rl.size() + " context(s); memsize=" + f76333t;
    }

    private final Long ty() {
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (eGLContextEglGetCurrentContext != null) {
            return Long.valueOf(eGLContextEglGetCurrentContext.getNativeHandle());
        }
        return null;
    }

    public final void aYN(int i2) {
        Long lTy = ty();
        Intrinsics.checkNotNull(lTy);
        lTy.longValue();
        synchronized (j.f76334n) {
            Map map = rl;
            if (map.containsKey(lTy)) {
                Integer numValueOf = Integer.valueOf(i2);
                Object obj = map.get(lTy);
                Intrinsics.checkNotNull(obj);
                if (((Map) obj).containsKey(numValueOf)) {
                    Object obj2 = map.get(lTy);
                    Intrinsics.checkNotNull(obj2);
                    Object objRemove = ((Map) obj2).remove(Integer.valueOf(i2));
                    Intrinsics.checkNotNull(objRemove);
                    nr--;
                    f76333t -= (long) ((c7r) objRemove).n();
                    ck(f76332n, false, 1, null);
                    Unit unit = Unit.INSTANCE;
                } else {
                    String str = String.format("%08X", Arrays.copyOf(new Object[]{lTy}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    Object obj3 = map.get(lTy);
                    Intrinsics.checkNotNull(obj3);
                    throw new IllegalStateException(("Not found " + str + "." + i2 + " in names(" + CollectionsKt.joinToString$default(((Map) obj3).keySet(), ",", null, null, 0, null, null, 62, null) + ")").toString());
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public final String az() {
        String str;
        long jNanoTime = System.nanoTime() / ((long) 1000000);
        synchronized (j.f76334n) {
            long jMax = ((KN - xMQ) * ((long) 1000)) / Math.max(1L, jNanoTime - Uo);
            str = "GLTraceInfo: memsize=" + f76333t + " contexts=" + rl.size() + " texcount=" + nr + " peakMemsize=" + J2 + " peakTexcount=" + f76331O + " totalTexAllocs=" + KN + " allocsPerSec=" + jMax;
        }
        return str;
    }

    public final void nY(int i2, int i3, int i5, int i7) {
        Long lTy = ty();
        Intrinsics.checkNotNull(lTy);
        lTy.longValue();
        synchronized (j.f76334n) {
            Map map = rl;
            if (map.containsKey(lTy)) {
                Object obj = map.get(lTy);
                Intrinsics.checkNotNull(obj);
                Object obj2 = ((Map) obj).get(Integer.valueOf(i2));
                Intrinsics.checkNotNull(obj2);
                c7r c7rVar = (c7r) obj2;
                c7rVar.J2(c7rVar.rl() + 1);
                c7rVar.nr((System.nanoTime() - vd.rl) / ((long) 1000000));
                c7rVar.Uo(i3);
                c7rVar.t(i5);
                int iN = c7rVar.n();
                c7rVar.O(i7);
                f76333t += (long) (i7 - iN);
                f76331O = Math.max(nr, f76331O);
                J2 = Math.max(f76333t, J2);
                ck(f76332n, false, 1, null);
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }
}
