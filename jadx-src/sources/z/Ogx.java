package z;

import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ogx {
    private static volatile int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static volatile int f76269O;
    private static volatile int nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ConcurrentHashMap f76270n = new ConcurrentHashMap();
    private static int rl = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f76271t = new ArrayList();

    public static final Integer J2(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ConcurrentHashMap concurrentHashMap = f76270n;
        Object objValueOf = concurrentHashMap.get(uri);
        if (objValueOf == null) {
            int i2 = rl;
            rl = i2 + 1;
            objValueOf = Integer.valueOf(i2);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(uri, objValueOf);
            if (objPutIfAbsent != null) {
                objValueOf = objPutIfAbsent;
            }
        }
        return (Integer) objValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN() {
        return "reduceTextureCacheSizeForOOM : IN";
    }

    public static final boolean Uo() {
        nr++;
        XoT.C.KN("reduceTextureCacheSizeForOOM", new Function0() { // from class: z.g9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ogx.KN();
            }
        });
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        List list = f76271t;
        synchronized (list) {
            try {
                CollectionsKt.removeAll(list, new Function1() { // from class: z.L0y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(Ogx.xMQ((WeakReference) obj));
                    }
                });
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    tI tIVar = (tI) ((WeakReference) it.next()).get();
                    if (tIVar != null) {
                        arrayList.add(tIVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((tI) obj).J2()) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                int iTy = 0;
                final int iAz = 0;
                while (it2.hasNext()) {
                    iAz += ((tI) it2.next()).az();
                }
                Iterator it3 = arrayList2.iterator();
                final int iTy2 = 0;
                while (it3.hasNext()) {
                    iTy2 += ((tI) it3.next()).ty();
                }
                final int i2 = (int) ((((long) iTy2) * 75) / 100);
                XoT.C.KN("reduceTextureCacheSizeForOOM", new Function0() { // from class: z.CM
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Ogx.mUb(iTy2, i2, iAz);
                    }
                });
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    if (((tI) it4.next()).HI(iAz, i2)) {
                        booleanRef.element = true;
                    }
                }
                Iterator it5 = arrayList2.iterator();
                int iAz2 = 0;
                while (it5.hasNext()) {
                    iAz2 += ((tI) it5.next()).az();
                }
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    iTy += ((tI) it6.next()).ty();
                }
                f76269O += iTy2 - iTy;
                J2 += iAz - iAz2;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        XoT.C.KN("reduceTextureCacheSizeForOOM", new Function0() { // from class: z.crp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ogx.gh(booleanRef);
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh(Ref.BooleanRef booleanRef) {
        return "reduceTextureCacheSizeForOOM : OUT (reducedSize=" + booleanRef.element + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(int i2, int i3, int i5) {
        return "reduceTextureCacheSizeForOOM : about to reduce from " + i2 + " to " + i3 + " (curMax=" + i5 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }
}
