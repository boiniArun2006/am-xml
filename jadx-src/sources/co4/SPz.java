package co4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class SPz implements l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xo f43845n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f43846t;

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        j() {
            super(1, Intrinsics.Kotlin.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(SPz.O(SPz.this, obj));
        }
    }

    static final class n extends Lambda implements Function2 {
        n() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n(obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void n(Object obj, boolean z2) {
            for (qz qzVar : SPz.this.f43846t) {
                qzVar.n().t(obj, Boolean.valueOf(z2 != Intrinsics.areEqual(qzVar.n().n(obj), Boolean.TRUE)));
            }
        }
    }

    public SPz(Xo format, boolean z2) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f43845n = format;
        this.rl = z2;
        List listRl = eO.rl(format);
        ArrayList arrayList = new ArrayList();
        Iterator it = listRl.iterator();
        while (it.hasNext()) {
            qz qzVarRl = ((o) it.next()).t().rl();
            if (qzVarRl != null) {
                arrayList.add(qzVarRl);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        this.f43846t = set;
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(SPz sPz, Object obj) {
        boolean z2 = false;
        for (qz qzVar : sPz.f43846t) {
            if (Intrinsics.areEqual(qzVar.n().n(obj), Boolean.TRUE)) {
                z2 = true;
            } else if (!qzVar.rl(obj)) {
                return false;
            }
        }
        return z2;
    }

    public final Xo J2() {
        return this.f43845n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SPz)) {
            return false;
        }
        SPz sPz = (SPz) obj;
        return Intrinsics.areEqual(this.f43845n, sPz.f43845n) && this.rl == sPz.rl;
    }

    public int hashCode() {
        return (this.f43845n.hashCode() * 31) + Boolean.hashCode(this.rl);
    }

    @Override // co4.Xo
    public q6b.I28 n() {
        return new q6b.Wre(this.f43845n.n(), new j(), this.rl);
    }

    @Override // co4.Xo
    public stX.eO rl() {
        return stX.qz.rl(CollectionsKt.listOf((Object[]) new stX.eO[]{new stX.eO(CollectionsKt.listOf(new stX.QJ(new n(), this.rl, "sign for " + this.f43846t)), CollectionsKt.emptyList()), this.f43845n.rl()}));
    }

    public String toString() {
        return "SignedFormatStructure(" + this.f43845n + ')';
    }
}
