package CKP;

import CKP.s4;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.appevents.Lu;
import com.facebook.appevents.vd;
import com.facebook.internal.Pl;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class l3D {
    private static String nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l3D f882n = new l3D();
    private static final ConcurrentHashMap rl = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ConcurrentHashMap f883t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final AtomicBoolean f881O = new AtomicBoolean(false);

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[s4.j.values().length];
            try {
                iArr[s4.j.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s4.j.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s4.j.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s4.j.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final synchronized Bundle J2(List list, long j2, boolean z2, List list2) {
        Bundle bundle;
        ?? r6;
        ?? ValueOf;
        ?? r11;
        boolean z3;
        List purchases = list;
        List purchaseParameters = list2;
        synchronized (l3D.class) {
            Bundle bundle2 = null;
            if (VmF.j.nr(l3D.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(purchases, "purchases");
                Intrinsics.checkNotNullParameter(purchaseParameters, "purchaseParameters");
                if (purchaseParameters.isEmpty()) {
                    return null;
                }
                if (purchases.size() != purchaseParameters.size()) {
                    return null;
                }
                ArrayList<Pair> arrayList = new ArrayList();
                int size = purchases.size();
                ?? bundle3 = 0;
                int i2 = 0;
                while (i2 < size) {
                    CKP.j jVar = (CKP.j) purchases.get(i2);
                    Pair pair = (Pair) purchaseParameters.get(i2);
                    Bundle bundle4 = (Bundle) pair.component1();
                    vd vdVar = (vd) pair.component2();
                    bundle = bundle2;
                    try {
                        int i3 = i2;
                        CKP.j jVar2 = new CKP.j(jVar.t(), new BigDecimal(String.valueOf(jVar.n())).setScale(2, RoundingMode.HALF_UP).doubleValue(), jVar.rl());
                        List<Pair> list3 = z2 ? (List) rl.get(jVar2) : (List) f883t.get(jVar2);
                        if (list3 == null || list3.isEmpty()) {
                            r6 = bundle;
                            ValueOf = r6;
                            r11 = ValueOf;
                            z3 = false;
                        } else {
                            r6 = bundle;
                            ValueOf = r6;
                            r11 = ValueOf;
                            z3 = false;
                            for (Pair pair2 : list3) {
                                long jLongValue = ((Number) pair2.getFirst()).longValue();
                                Pair pair3 = (Pair) pair2.getSecond();
                                Bundle bundle5 = (Bundle) pair3.component1();
                                vd vdVar2 = (vd) pair3.component2();
                                if (Math.abs(j2 - jLongValue) <= eO.f876n.O() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                                    l3D l3d = f882n;
                                    String strNr = nr(l3d, bundle4, vdVar, bundle5, vdVar2, !z2, false, 32, null);
                                    String strT = l3d.t(bundle4, vdVar, bundle5, vdVar2, !z2, true);
                                    r6 = r6;
                                    if (strT != null) {
                                        r6 = strT;
                                    }
                                    if (strNr != null) {
                                        ValueOf = Long.valueOf(jLongValue);
                                        arrayList.add(new Pair(jVar2, Long.valueOf(jLongValue)));
                                        z3 = true;
                                    }
                                    r11 = strNr;
                                }
                            }
                        }
                        if (r6 != 0) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_test_dedup_result", "1");
                            bundle3.putString("fb_iap_test_dedup_key_used", r6);
                        }
                        if (z3) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_non_deduped_event_time", String.valueOf(ValueOf != 0 ? ValueOf.longValue() / ((long) 1000) : 0L));
                            bundle3.putString("fb_iap_actual_dedup_result", "1");
                            bundle3.putString("fb_iap_actual_dedup_key_used", r11);
                        }
                        if (z2 && !z3) {
                            ConcurrentHashMap concurrentHashMap = f883t;
                            if (concurrentHashMap.get(jVar2) == null) {
                                concurrentHashMap.put(jVar2, new ArrayList());
                            }
                            List list4 = (List) concurrentHashMap.get(jVar2);
                            if (list4 != null) {
                                list4.add(new Pair(Long.valueOf(j2), new Pair(bundle4, vdVar)));
                            }
                        } else if (!z2 && !z3) {
                            ConcurrentHashMap concurrentHashMap2 = rl;
                            if (concurrentHashMap2.get(jVar2) == null) {
                                concurrentHashMap2.put(jVar2, new ArrayList());
                            }
                            List list5 = (List) concurrentHashMap2.get(jVar2);
                            if (list5 != null) {
                                list5.add(new Pair(Long.valueOf(j2), new Pair(bundle4, vdVar)));
                            }
                        }
                        i2 = i3 + 1;
                        purchases = list;
                        purchaseParameters = list2;
                        bundle2 = bundle;
                        bundle3 = bundle3;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                bundle = bundle2;
                for (Pair pair4 : arrayList) {
                    List list6 = z2 ? (List) rl.get(pair4.getFirst()) : (List) f883t.get(pair4.getFirst());
                    if (list6 != null) {
                        Iterator it = list6.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i7 = i5 + 1;
                            if (((Number) ((Pair) it.next()).getFirst()).longValue() == ((Number) pair4.getSecond()).longValue()) {
                                list6.remove(i5);
                                break;
                            }
                            i5 = i7;
                        }
                        if (z2) {
                            if (list6.isEmpty()) {
                                rl.remove(pair4.getFirst());
                            } else {
                                rl.put(pair4.getFirst(), list6);
                            }
                        } else if (list6.isEmpty()) {
                            f883t.remove(pair4.getFirst());
                        } else {
                            f883t.put(pair4.getFirst(), list6);
                        }
                    }
                }
                return bundle3;
            } catch (Throwable th2) {
                th = th2;
                bundle = bundle2;
            }
            VmF.j.rl(th, l3D.class);
            return bundle;
        }
    }

    public static final void KN() {
        if (VmF.j.nr(l3D.class)) {
            return;
        }
        try {
            if (f881O.get()) {
                s4.j jVarRl = f882n.rl();
                int i2 = j.$EnumSwitchMapping$0[jVarRl.ordinal()];
                if (i2 == 2) {
                    n.Uo(s4.j.V1);
                    return;
                }
                if (i2 != 3) {
                    if (i2 == 4 && com.facebook.internal.Pl.Uo(Pl.n.IapLoggingLib5To7)) {
                        fuX.O(com.facebook.s4.qie(), jVarRl);
                        return;
                    }
                    return;
                }
                if (com.facebook.internal.Pl.Uo(Pl.n.IapLoggingLib2)) {
                    fuX.O(com.facebook.s4.qie(), jVarRl);
                } else {
                    n.Uo(s4.j.V2_V4);
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, l3D.class);
        }
    }

    public static final String O() {
        if (VmF.j.nr(l3D.class)) {
            return null;
        }
        try {
            return nr;
        } catch (Throwable th) {
            VmF.j.rl(th, l3D.class);
            return null;
        }
    }

    private static final void Uo(String str) {
        if (VmF.j.nr(l3D.class)) {
            return;
        }
        try {
            nr = str;
        } catch (Throwable th) {
            VmF.j.rl(th, l3D.class);
        }
    }

    public static final void n() {
        if (VmF.j.nr(l3D.class)) {
            return;
        }
        try {
            if (!UiE.C.Uo()) {
                QJ.xMQ();
            } else {
                f881O.set(true);
                KN();
            }
        } catch (Throwable th) {
            VmF.j.rl(th, l3D.class);
        }
    }

    public static /* synthetic */ String nr(l3D l3d, Bundle bundle, vd vdVar, Bundle bundle2, vd vdVar2, boolean z2, boolean z3, int i2, Object obj) {
        if (VmF.j.nr(l3D.class)) {
            return null;
        }
        try {
            return l3d.t(bundle, vdVar, bundle2, vdVar2, z2, (i2 & 32) != 0 ? false : z3);
        } catch (Throwable th) {
            VmF.j.rl(th, l3D.class);
            return null;
        }
    }

    private l3D() {
    }

    private final s4.j rl() {
        try {
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
                Context contextQie = com.facebook.s4.qie();
                ApplicationInfo applicationInfo = contextQie.getPackageManager().getApplicationInfo(contextQie.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return s4.j.NONE;
                }
                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{"."}, false, 3, 2, (Object) null);
                if (string.length() == 0) {
                    return s4.j.V5_V7;
                }
                Uo("GPBL." + string);
                Integer intOrNull = StringsKt.toIntOrNull((String) listSplit$default.get(0));
                if (intOrNull != null) {
                    int iIntValue = intOrNull.intValue();
                    if (iIntValue == 1) {
                        return s4.j.V1;
                    }
                    if (iIntValue < 5) {
                        return s4.j.V2_V4;
                    }
                    return s4.j.V5_V7;
                }
                return s4.j.V5_V7;
            } catch (Exception unused) {
                return s4.j.V5_V7;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final String t(Bundle bundle, vd vdVar, Bundle bundle2, vd vdVar2, boolean z2, boolean z3) {
        List<Pair> listNr;
        String str;
        String str2;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            if (z3) {
                listNr = eO.f876n.J2(z2);
            } else {
                listNr = eO.f876n.nr(z2);
            }
            if (listNr == null) {
                return null;
            }
            for (Pair pair : listNr) {
                Object objT = vd.rl.t(Lu.IAPParameters, (String) pair.getFirst(), bundle, vdVar);
                if (objT instanceof String) {
                    str = (String) objT;
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    for (String str3 : (List) pair.getSecond()) {
                        Object objT2 = vd.rl.t(Lu.IAPParameters, str3, bundle2, vdVar2);
                        if (objT2 instanceof String) {
                            str2 = (String) objT2;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null && str2.length() != 0 && Intrinsics.areEqual(str2, str)) {
                            if (z2) {
                                return (String) pair.getFirst();
                            }
                            return str3;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
