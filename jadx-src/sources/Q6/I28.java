package Q6;

import F6.w6;
import MoG.Xo;
import Q6.Ml;
import Q6.j;
import d2n.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class I28 implements F6.w6 {
    public static final j J2 = new j(null);
    private static final long KN;
    private static final long Uo;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final yB.j f7920O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Q6.Ml f7921n;
    private n nr;
    private final Q6.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final fuX f7922t;

    /* JADX INFO: renamed from: Q6.I28$I28, reason: collision with other inner class name */
    static final class C0280I28 extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f7923O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7924n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f7925o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7927t;

        C0280I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f7925o |= Integer.MIN_VALUE;
            return I28.this.KN(null, 0, null, this);
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f7928O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7929n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f7930r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7931t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7928O = obj;
            this.f7930r |= Integer.MIN_VALUE;
            return I28.this.n(this);
        }
    }

    static final class Wre extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7933n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7934t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7934t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.gh(this);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final F6.j f7935n;
        private final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Set f7936t;

        public /* synthetic */ n(F6.j jVar, long j2, Set set, DefaultConstructorMarker defaultConstructorMarker) {
            this(jVar, j2, set);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f7935n, nVar.f7935n) && d2n.Ml.KN(this.rl, nVar.rl) && Intrinsics.areEqual(this.f7936t, nVar.f7936t);
        }

        private n(F6.j jVar, long j2, Set set) {
            this.f7935n = jVar;
            this.rl = j2;
            this.f7936t = set;
        }

        public static /* synthetic */ n rl(n nVar, F6.j jVar, long j2, Set set, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                jVar = nVar.f7935n;
            }
            if ((i2 & 2) != 0) {
                j2 = nVar.rl;
            }
            if ((i2 & 4) != 0) {
                set = nVar.f7936t;
            }
            return nVar.n(jVar, j2, set);
        }

        public final Set O() {
            return this.f7936t;
        }

        public int hashCode() {
            return (((this.f7935n.hashCode() * 31) + d2n.Ml.qie(this.rl)) * 31) + this.f7936t.hashCode();
        }

        public final n n(F6.j slice, long j2, Set terminatedItems) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            Intrinsics.checkNotNullParameter(terminatedItems, "terminatedItems");
            return new n(slice, j2, terminatedItems, null);
        }

        public final F6.j nr() {
            return this.f7935n;
        }

        public final long t() {
            return this.rl;
        }

        public String toString() {
            return "State(slice=" + this.f7935n + ", lastProcessedTime=" + ((Object) d2n.Ml.ck(this.rl)) + ", terminatedItems=" + this.f7936t + ')';
        }
    }

    static final class w6 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7937O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f7939Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7940g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7941n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f7942o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7943r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7944t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7939Z = obj;
            this.f7940g |= Integer.MIN_VALUE;
            return I28.this.rl(null, this);
        }
    }

    public I28(Q6.Ml fragmentProvider, Q6.j processor, fuX soundBlocksConverter) {
        Intrinsics.checkNotNullParameter(fragmentProvider, "fragmentProvider");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(soundBlocksConverter, "soundBlocksConverter");
        this.f7921n = fragmentProvider;
        this.rl = processor;
        this.f7922t = soundBlocksConverter;
        this.f7920O = yB.CN3.rl(false, 1, null);
    }

    private final boolean mUb(n nVar, String str) {
        Set setO;
        return (nVar == null || (setO = nVar.O()) == null || !setO.contains(Xo.j.n(str))) ? false : true;
    }

    static {
        j.C0832j c0832j = d2n.j.f63374t;
        Uo = c0832j.t(1000L);
        KN = c0832j.O(1.0d);
    }

    private final Q6.n J2(F6.j jVar, F6.j jVar2) {
        Set setEmptySet;
        Set setEmptySet2;
        F6.j jVarNr;
        Set setEmptySet3 = jVar2 == null ? SetsKt.emptySet() : Uo(jVar2);
        n nVar = this.nr;
        if (nVar == null || (jVarNr = nVar.nr()) == null || (setEmptySet = F6.n.t(jVarNr)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        if (jVar2 == null || (setEmptySet2 = F6.n.t(jVar2)) == null) {
            setEmptySet2 = SetsKt.emptySet();
        }
        return new Q6.n(setEmptySet3, SetsKt.minus(SetsKt.minus(setEmptySet, (Iterable) setEmptySet2), (Iterable) F6.n.t(jVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        if (r8.t(r9, r4, r2) == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(F6.j jVar, int i2, Q6.n nVar, Continuation continuation) {
        C0280I28 c0280i28;
        F6.j jVar2;
        int i3;
        I28 i28;
        if (continuation instanceof C0280I28) {
            c0280i28 = (C0280I28) continuation;
            int i5 = c0280i28.f7925o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0280i28.f7925o = i5 - Integer.MIN_VALUE;
            } else {
                c0280i28 = new C0280I28(continuation);
            }
        }
        Object objRl = c0280i28.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c0280i28.f7925o;
        if (i7 == 0) {
            ResultKt.throwOnFailure(objRl);
            Ml.j jVar3 = new Ml.j(Uo(jVar), nVar);
            Q6.Ml ml = this.f7921n;
            c0280i28.f7924n = this;
            jVar2 = jVar;
            c0280i28.f7927t = jVar2;
            c0280i28.f7923O = i2;
            c0280i28.f7925o = 1;
            objRl = ml.rl(jVar3, c0280i28);
            if (objRl != coroutine_suspended) {
                i3 = i2;
                i28 = this;
            }
            return coroutine_suspended;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRl);
            return Unit.INSTANCE;
        }
        i3 = c0280i28.f7923O;
        jVar2 = (F6.j) c0280i28.f7927t;
        i28 = (I28) c0280i28.f7924n;
        ResultKt.throwOnFailure(objRl);
        Map map = (Map) objRl;
        List listN = i28.f7922t.n(jVar2);
        Q6.j jVar4 = i28.rl;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator it = map.entrySet().iterator();
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String strUo = ((Xo.j) entry.getKey()).Uo();
                boolean z2 = false;
                for (Object obj2 : listN) {
                    if (Xo.j.nr(((aC) obj2).n(), strUo)) {
                        if (z2) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj = obj2;
                        z2 = true;
                    }
                }
                if (!z2) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                linkedHashMap.put((aC) obj, entry.getValue());
            } else {
                c0280i28.f7924n = null;
                c0280i28.f7927t = null;
                c0280i28.f7925o = 2;
            }
        }
    }

    private final Object O(F6.j jVar, as.CN3 cn3, Q6.n nVar, Continuation continuation) {
        Dsr dsr = new Dsr(this.f7922t.n(jVar), jVar.O(), cn3);
        Set setN = nVar.n();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setN, 10));
        Iterator it = setN.iterator();
        while (it.hasNext()) {
            arrayList.add(Xo.j.n(((Q6.w6) it.next()).n().n()));
        }
        return this.rl.rl(new j.C0282j(dsr, CollectionsKt.toSet(arrayList), nVar.rl()), continuation);
    }

    private final Set Uo(F6.j jVar) {
        Set<MoG.fuX> setT = jVar.t();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setT, 10));
        for (MoG.fuX fux : setT) {
            d2n.Wre wreJ2 = d2n.CN3.J2(jVar.O(), fux.rl());
            if (wreJ2 == null) {
                throw new IllegalStateException(("Time range " + fux.rl() + " of audible block does not intersect with time range " + jVar.O() + " of composition slice").toString());
            }
            arrayList.add(new Q6.w6((MoG.I28) fux.n(), bK.w6.rl(wreJ2, fux.rl().O(), ((MoG.I28) fux.n()).nr().O(), ((MoG.I28) fux.n()).O()), ((d2n.Ml.KN(wreJ2.nr(), fux.rl().nr()) || d2n.Ml.KN(wreJ2.nr(), jVar.nr().Uo().nr())) && !mUb(this.nr, ((MoG.I28) fux.n()).n())) ? KN : d2n.j.f63374t.J2(), null));
        }
        return CollectionsKt.toSet(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gh(Continuation continuation) {
        Wre wre;
        I28 i28;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.J2 = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object obj = wre.f7934t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Q6.j jVar = this.rl;
            wre.f7933n = this;
            wre.J2 = 1;
            if (jVar.n(wre) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i28 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i28 = (I28) wre.f7933n;
            ResultKt.throwOnFailure(obj);
        }
        i28.nr = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // F6.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) throws Throwable {
        Ml ml;
        yB.j jVar;
        I28 i28;
        I28 i282;
        yB.j jVar2;
        Throwable th;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f7930r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f7930r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj = ml.f7928O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f7930r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.f7920O;
                ml.f7929n = this;
                ml.f7931t = jVar;
                ml.f7930r = 1;
                if (jVar.Z(null, ml) != coroutine_suspended) {
                    i28 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar2 = (yB.j) ml.f7929n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        jVar2.T(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        jVar2.T(null);
                        throw th;
                    }
                }
                yB.j jVar3 = (yB.j) ml.f7931t;
                i282 = (I28) ml.f7929n;
                try {
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar3;
                    ml.f7929n = jVar;
                    ml.f7931t = null;
                    ml.f7930r = 3;
                    if (i282.gh(ml) != coroutine_suspended) {
                        jVar2 = jVar;
                        Unit unit2 = Unit.INSTANCE;
                        jVar2.T(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    jVar2 = jVar3;
                    jVar2.T(null);
                    throw th;
                }
            }
            yB.j jVar4 = (yB.j) ml.f7931t;
            i28 = (I28) ml.f7929n;
            ResultKt.throwOnFailure(obj);
            jVar = jVar4;
            Q6.Ml ml2 = i28.f7921n;
            ml.f7929n = i28;
            ml.f7931t = jVar;
            ml.f7930r = 2;
            if (ml2.n(ml) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i282 = i28;
            ml.f7929n = jVar;
            ml.f7931t = null;
            ml.f7930r = 3;
            if (i282.gh(ml) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            jVar2 = jVar;
            th = th4;
            jVar2.T(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168 A[Catch: all -> 0x018c, TryCatch #5 {all -> 0x018c, blocks: (B:58:0x014b, B:59:0x0162, B:61:0x0168, B:63:0x0184, B:68:0x0191, B:69:0x01a0, B:71:0x01a6, B:72:0x01be, B:54:0x0124, B:37:0x00c5, B:44:0x00f2), top: B:101:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a6 A[Catch: all -> 0x018c, LOOP:1: B:69:0x01a0->B:71:0x01a6, LOOP_END, TryCatch #5 {all -> 0x018c, blocks: (B:58:0x014b, B:59:0x0162, B:61:0x0168, B:63:0x0184, B:68:0x0191, B:69:0x01a0, B:71:0x01a6, B:72:0x01be, B:54:0x0124, B:37:0x00c5, B:44:0x00f2), top: B:101:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fb A[Catch: all -> 0x020b, TRY_LEAVE, TryCatch #4 {all -> 0x020b, blocks: (B:80:0x01f4, B:82:0x01fb, B:87:0x020e, B:88:0x0215), top: B:100:0x01f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020e A[Catch: all -> 0x020b, TRY_ENTER, TryCatch #4 {all -> 0x020b, blocks: (B:80:0x01f4, B:82:0x01fb, B:87:0x020e, B:88:0x0215), top: B:100:0x01f4 }] */
    /* JADX WARN: Type inference failed for: r10v17, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v27, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r4v30 */
    @Override // F6.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(w6.j jVar, Continuation continuation) throws Throwable {
        w6 w6Var;
        ?? r42;
        Object obj;
        ?? r43;
        w6.j jVar2;
        yB.j jVar3;
        I28 i28;
        F6.j jVarT;
        w6.j jVar4;
        F6.j jVarO;
        F6.j jVar5;
        yB.j jVar6;
        F6.j jVar7;
        w6.j jVar8;
        F6.j jVar9;
        I28 i282;
        F6.j jVar10;
        ?? r44;
        Object objO;
        ?? r10;
        F6.j jVar11;
        I28 i283;
        Iterator it;
        Iterator it2;
        n nVar;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f7940g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f7940g = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object obj2 = w6Var.f7939Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f7940g;
        try {
        } catch (Throwable th) {
            th = th;
            r42 = 1;
        }
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                yB.j jVar12 = this.f7920O;
                w6Var.f7941n = this;
                jVar2 = jVar;
                w6Var.f7944t = jVar2;
                w6Var.f7937O = jVar12;
                w6Var.f7940g = 1;
                if (jVar12.Z(null, w6Var) != coroutine_suspended) {
                    jVar3 = jVar12;
                    i28 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    jVarO = (F6.j) w6Var.f7942o;
                    jVar5 = (F6.j) w6Var.f7943r;
                    jVar7 = (F6.j) w6Var.J2;
                    jVar6 = (yB.j) w6Var.f7937O;
                    jVar4 = (w6.j) w6Var.f7944t;
                    i28 = (I28) w6Var.f7941n;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        jVarT = jVar7;
                        jVar3 = jVar6;
                        jVar8 = jVar4;
                        I28 i284 = i28;
                        if (jVarO == null) {
                            jVar9 = jVar5;
                            i282 = i284;
                            r44 = jVar3;
                            as.CN3 cn3Nr = jVar8.nr();
                            Q6.n nVarJ2 = i282.J2(jVarT, jVar9);
                            w6Var.f7941n = i282;
                            w6Var.f7944t = r44;
                            w6Var.f7937O = jVarT;
                            w6Var.J2 = null;
                            w6Var.f7943r = null;
                            w6Var.f7942o = null;
                            w6Var.f7940g = 4;
                            objO = i282.O(jVarT, cn3Nr, nVarJ2, w6Var);
                            if (objO != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        Q6.n nVarJ22 = i284.J2(jVarO, jVar5 != null ? Q6.Wre.O(jVar5, jVarO.O().nr()) : null);
                        int iT = jVar8.nr().t();
                        w6Var.f7941n = i284;
                        w6Var.f7944t = jVar8;
                        w6Var.f7937O = jVar3;
                        w6Var.J2 = jVarT;
                        w6Var.f7943r = jVar5;
                        w6Var.f7942o = jVarO;
                        w6Var.f7940g = 3;
                        if (i284.KN(jVarO, iT, nVarJ22, w6Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jVar9 = jVar5;
                        i282 = i284;
                        jVar10 = jVarT;
                        w6.j jVar13 = jVar8;
                        long jNr = jVarO.O().nr();
                        Set setT = jVarO.t();
                        ArrayList arrayList = new ArrayList();
                        it = setT.iterator();
                        while (it.hasNext()) {
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                        }
                        i282.nr = new n(jVar10, jNr, CollectionsKt.toSet(arrayList2), null);
                        jVar8 = jVar13;
                        jVarT = jVar10;
                        r44 = jVar3;
                        as.CN3 cn3Nr2 = jVar8.nr();
                        Q6.n nVarJ23 = i282.J2(jVarT, jVar9);
                        w6Var.f7941n = i282;
                        w6Var.f7944t = r44;
                        w6Var.f7937O = jVarT;
                        w6Var.J2 = null;
                        w6Var.f7943r = null;
                        w6Var.f7942o = null;
                        w6Var.f7940g = 4;
                        objO = i282.O(jVarT, cn3Nr2, nVarJ23, w6Var);
                        if (objO != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                        r43 = jVar6;
                        r43.T(obj);
                        throw th;
                    }
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    F6.j jVar14 = (F6.j) w6Var.f7937O;
                    r42 = (yB.j) w6Var.f7944t;
                    i283 = (I28) w6Var.f7941n;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        r10 = r42;
                        jVar11 = jVar14;
                    } catch (Throwable th3) {
                        th = th3;
                        obj = null;
                        r43 = r42;
                        r43.T(obj);
                        throw th;
                    }
                    try {
                        nVar = i283.nr;
                        if (nVar != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i283.nr = n.rl(nVar, jVar11, 0L, null, 6, null);
                        r10.T(null);
                        return obj2;
                    } catch (Throwable th4) {
                        th = th4;
                        r44 = r10;
                        obj = null;
                        r43 = r44;
                        r43.T(obj);
                        throw th;
                    }
                }
                jVarO = (F6.j) w6Var.f7942o;
                jVar9 = (F6.j) w6Var.f7943r;
                F6.j jVar15 = (F6.j) w6Var.J2;
                jVar3 = (yB.j) w6Var.f7937O;
                jVar8 = (w6.j) w6Var.f7944t;
                I28 i285 = (I28) w6Var.f7941n;
                ResultKt.throwOnFailure(obj2);
                jVar10 = jVar15;
                i282 = i285;
                w6.j jVar132 = jVar8;
                long jNr2 = jVarO.O().nr();
                Set setT2 = jVarO.t();
                ArrayList arrayList3 = new ArrayList();
                it = setT2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it3 = it;
                    if (d2n.CN3.nr(jVarO.O(), ((MoG.fuX) next).rl().nr())) {
                        arrayList3.add(next);
                    }
                    it = it3;
                }
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList22.add(Xo.j.n(((MoG.I28) ((MoG.fuX) it2.next()).n()).n()));
                }
                i282.nr = new n(jVar10, jNr2, CollectionsKt.toSet(arrayList22), null);
                jVar8 = jVar132;
                jVarT = jVar10;
                r44 = jVar3;
                try {
                    as.CN3 cn3Nr22 = jVar8.nr();
                    Q6.n nVarJ232 = i282.J2(jVarT, jVar9);
                    w6Var.f7941n = i282;
                    w6Var.f7944t = r44;
                    w6Var.f7937O = jVarT;
                    w6Var.J2 = null;
                    w6Var.f7943r = null;
                    w6Var.f7942o = null;
                    w6Var.f7940g = 4;
                    objO = i282.O(jVarT, cn3Nr22, nVarJ232, w6Var);
                    if (objO != coroutine_suspended) {
                        r10 = r44;
                        jVar11 = jVarT;
                        obj2 = objO;
                        i283 = i282;
                        nVar = i283.nr;
                        if (nVar != null) {
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th5) {
                    th = th5;
                    obj = null;
                    r43 = r44;
                    r43.T(obj);
                    throw th;
                }
            }
            yB.j jVar16 = (yB.j) w6Var.f7937O;
            w6.j jVar17 = (w6.j) w6Var.f7944t;
            I28 i286 = (I28) w6Var.f7941n;
            ResultKt.throwOnFailure(obj2);
            jVar3 = jVar16;
            jVar2 = jVar17;
            i28 = i286;
            jVarT = jVar2.t();
            F6.j jVarO2 = jVar2.O();
            Q6.Wre.J2(jVarT, jVarO2);
            F6.j jVarNr = Q6.Wre.nr(jVarT, Uo);
            n nVar2 = i28.nr;
            if (nVar2 == null || !i28.xMQ(nVar2.nr(), jVarT)) {
                w6Var.f7941n = i28;
                w6Var.f7944t = jVar2;
                w6Var.f7937O = jVar3;
                w6Var.J2 = jVarT;
                w6Var.f7943r = jVarO2;
                w6Var.f7942o = jVarNr;
                w6Var.f7940g = 2;
                if (i28.gh(w6Var) != coroutine_suspended) {
                    jVar4 = jVar2;
                    jVarO = jVarNr;
                    jVar5 = jVarO2;
                    jVar6 = jVar3;
                    jVar7 = jVarT;
                    jVarT = jVar7;
                    jVar3 = jVar6;
                    jVar8 = jVar4;
                    I28 i2842 = i28;
                    if (jVarO == null) {
                    }
                }
                return coroutine_suspended;
            }
            jVar8 = jVar2;
            jVarO = Q6.Wre.O(jVarNr, nVar2.t());
            jVar5 = jVarO2;
            I28 i28422 = i28;
            if (jVarO == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            r44 = jVar3;
            obj = null;
            r43 = r44;
            r43.T(obj);
            throw th;
        }
    }

    private final boolean xMQ(F6.j jVar, F6.j jVar2) {
        if (d2n.Ml.KN(jVar.O().nr(), jVar2.O().O()) && F6.n.rl(jVar, jVar2) && Intrinsics.areEqual(F6.j.rl(jVar, null, jVar2.O(), 1, null), jVar2)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ I28(Q6.Ml ml, Q6.j jVar, fuX fux, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ml, (i2 & 2) != 0 ? new NtE.j(null, null, null, null, 15, null) : jVar, (i2 & 4) != 0 ? new NtE.CN3(0L, 1, null) : fux);
    }
}
