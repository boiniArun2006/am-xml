package IB;

import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class s4 {
    private final LinkedList J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final WeakHashMap f4066O;
    private long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f4067n;
    private final long nr;
    private final Function1 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f4068t;

    public s4(Function1 releaser, Function1 canRelease, Function1 sizeOf, long j2) {
        Intrinsics.checkNotNullParameter(releaser, "releaser");
        Intrinsics.checkNotNullParameter(canRelease, "canRelease");
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        this.f4067n = releaser;
        this.rl = canRelease;
        this.f4068t = sizeOf;
        this.nr = j2;
        this.f4066O = new WeakHashMap();
        this.J2 = new LinkedList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long O(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    private final void KN() {
        if (this.f4066O.size() == this.J2.size()) {
            return;
        }
        Collection collectionValues = this.f4066O.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        final Set set = CollectionsKt.toSet(collectionValues);
        CollectionsKt.removeAll((List) this.J2, new Function1() { // from class: IB.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s4.xMQ(set, this, obj));
            }
        });
    }

    private final void gh() {
        if (this.Uo <= this.nr || this.J2.isEmpty()) {
            return;
        }
        Iterator it = this.J2.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext() && this.Uo > this.nr) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (ty(next, true)) {
                it.remove();
            }
        }
    }

    private final boolean ty(Object obj, boolean z2) {
        if (!((Boolean) this.rl.invoke(obj)).booleanValue()) {
            return false;
        }
        if (z2) {
            this.f4066O.values().remove(obj);
        }
        long jLongValue = ((Number) this.f4068t.invoke(obj)).longValue();
        this.f4067n.invoke(obj);
        this.Uo -= jLongValue;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(Set set, s4 s4Var, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !set.contains(it) && s4Var.ty(it, false);
    }

    public final List J2() {
        List list = CollectionsKt.toList(this.J2);
        this.J2.clear();
        this.f4066O.clear();
        this.Uo = 0L;
        return list;
    }

    public final Object Uo(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        KN();
        Object obj = this.f4066O.get(key);
        if (obj == null) {
            return null;
        }
        if (!this.J2.remove(obj)) {
            throw new IllegalStateException("Check failed.");
        }
        this.J2.addLast(obj);
        return obj;
    }

    public final Object mUb(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objRemove = this.f4066O.remove(key);
        if (objRemove == null) {
            return null;
        }
        this.J2.remove(objRemove);
        this.Uo -= ((Number) this.f4068t.invoke(objRemove)).longValue();
        KN();
        return objRemove;
    }

    public final void qie(Object key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(obj, qfEYuUHwj.sSc);
        KN();
        Object objPut = this.f4066O.put(key, obj);
        if (objPut != null) {
            this.J2.remove(objPut);
            if (!ty(objPut, false)) {
                this.J2.addFirst(objPut);
            }
        }
        this.Uo += ((Number) this.f4068t.invoke(obj)).longValue();
        gh();
        this.J2.addLast(obj);
    }

    public final void az() {
        KN();
        gh();
    }

    public /* synthetic */ s4(Function1 function1, Function1 function12, Function1 function13, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i2 & 2) != 0 ? new Function1() { // from class: IB.QJ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s4.nr(obj));
            }
        } : function12, (i2 & 4) != 0 ? new Function1() { // from class: IB.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(s4.O(obj));
            }
        } : function13, (i2 & 8) != 0 ? Long.MAX_VALUE : j2);
    }
}
