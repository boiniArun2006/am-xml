package Du;

import EJn.Xo;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class DC implements EJn.Wre, Pl {
    private final List[] J2;
    private final boolean[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String[] f1953O;
    private List Uo;
    private final Lazy gh;
    private final Lazy mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1954n;
    private int nr;
    private final Lazy qie;
    private final vd rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f1955t;
    private Map xMQ;

    public DC(String serialName, vd vdVar, int i2) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f1954n = serialName;
        this.rl = vdVar;
        this.f1955t = i2;
        this.nr = -1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f1953O = strArr;
        int i5 = this.f1955t;
        this.J2 = new List[i5];
        this.KN = new boolean[i5];
        this.xMQ = MapsKt.emptyMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.mUb = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: Du.CM
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DC.r(this.f1947n);
            }
        });
        this.gh = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: Du.crp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DC.ViF(this.f2010n);
            }
        });
        this.qie = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: Du.Ogx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(DC.ty(this.f1978n));
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DC)) {
            return false;
        }
        EJn.Wre wre = (EJn.Wre) obj;
        if (!Intrinsics.areEqual(KN(), wre.KN()) || !Arrays.equals(Z(), ((DC) obj).Z()) || nr() != wre.nr()) {
            return false;
        }
        int iNr = nr();
        for (int i2 = 0; i2 < iNr; i2++) {
            if (!Intrinsics.areEqual(Uo(i2).KN(), wre.Uo(i2).KN()) || !Intrinsics.areEqual(Uo(i2).getKind(), wre.Uo(i2).getKind())) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.f1955t), ", ", KN() + '(', ")", 0, null, new Function1() { // from class: Du.L0y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DC.aYN(this.f1965n, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    private final Map Ik() {
        HashMap map = new HashMap();
        int length = this.f1953O.length;
        for (int i2 = 0; i2 < length; i2++) {
            map.put(this.f1953O[i2], Integer.valueOf(i2));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre[] ViF(DC dc) {
        ArrayList arrayList;
        XA.Ml[] mlArrTypeParametersSerializers;
        vd vdVar = dc.rl;
        if (vdVar == null || (mlArrTypeParametersSerializers = vdVar.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(mlArrTypeParametersSerializers.length);
            for (XA.Ml ml : mlArrTypeParametersSerializers) {
                arrayList.add(ml.getDescriptor());
            }
        }
        return cA.rl(arrayList);
    }

    private final int XQ() {
        return ((Number) this.qie.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence aYN(DC dc, int i2) {
        return dc.O(i2) + ": " + dc.Uo(i2).KN();
    }

    public static /* synthetic */ void ck(DC dc, String str, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        dc.HI(str, z2);
    }

    private final XA.Ml[] o() {
        return (XA.Ml[]) this.mUb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XA.Ml[] r(DC dc) {
        XA.Ml[] mlArrChildSerializers;
        vd vdVar = dc.rl;
        return (vdVar == null || (mlArrChildSerializers = vdVar.childSerializers()) == null) ? V1.f1996n : mlArrChildSerializers;
    }

    public final void HI(String name, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f1953O;
        int i2 = this.nr + 1;
        this.nr = i2;
        strArr[i2] = name;
        this.KN[i2] = z2;
        this.J2[i2] = null;
        if (i2 == this.f1955t - 1) {
            this.xMQ = Ik();
        }
    }

    @Override // EJn.Wre
    public List J2(int i2) {
        List list = this.J2[i2];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // EJn.Wre
    public String KN() {
        return this.f1954n;
    }

    @Override // EJn.Wre
    public String O(int i2) {
        return this.f1953O[i2];
    }

    public final void S(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List arrayList = this.J2[this.nr];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.J2[this.nr] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void WPU(Annotation a2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        if (this.Uo == null) {
            this.Uo = new ArrayList(1);
        }
        List list = this.Uo;
        Intrinsics.checkNotNull(list);
        list.add(a2);
    }

    public final EJn.Wre[] Z() {
        return (EJn.Wre[]) this.gh.getValue();
    }

    @Override // EJn.Wre
    public List getAnnotations() {
        List list = this.Uo;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // EJn.Wre
    public EJn.Pl getKind() {
        return Xo.j.f2283n;
    }

    @Override // Du.Pl
    public Set n() {
        return this.xMQ.keySet();
    }

    @Override // EJn.Wre
    public final int nr() {
        return this.f1955t;
    }

    @Override // EJn.Wre
    public int t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.xMQ.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // EJn.Wre
    public boolean xMQ(int i2) {
        return this.KN[i2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ty(DC dc) {
        return T.n(dc, dc.Z());
    }

    @Override // EJn.Wre
    public EJn.Wre Uo(int i2) {
        return o()[i2].getDescriptor();
    }

    public int hashCode() {
        return XQ();
    }

    public /* synthetic */ DC(String str, vd vdVar, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : vdVar, i2);
    }
}
