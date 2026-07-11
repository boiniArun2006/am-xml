package gwe;

import aB.AbstractC1501Ml;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import gwe.aC;
import gwe.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 implements aC {
    public static final n ty = new n(null);
    private final int J2;
    private volatile int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f67905O;
    private final ConcurrentHashMap Uo;
    private Set az;
    private int gh;
    private final fuX mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC1501Ml f67906n;
    private final y8.Ml nr;
    private Map qie;
    private final zdu.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f04.w6 f67907t;
    private volatile boolean xMQ;

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pj0.j f67908n;
        private boolean rl;

        public j(Pj0.j bitmapRef) {
            Intrinsics.checkNotNullParameter(bitmapRef, "bitmapRef");
            this.f67908n = bitmapRef;
        }

        public final Pj0.j n() {
            return this.f67908n;
        }

        public final void nr(boolean z2) {
            this.rl = z2;
        }

        public final boolean rl() {
            return !this.rl && this.f67908n.isValid();
        }

        public final void t() {
            Pj0.j.M7(this.f67908n);
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    public CN3(AbstractC1501Ml platformBitmapFactory, zdu.w6 bitmapFrameRenderer, f04.w6 fpsCompressor, y8.Ml animationInformation, int i2) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(fpsCompressor, "fpsCompressor");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f67906n = platformBitmapFactory;
        this.rl = bitmapFrameRenderer;
        this.f67907t = fpsCompressor;
        this.nr = animationInformation;
        this.f67905O = i2;
        int iCoerceAtLeast = RangesKt.coerceAtLeast((mUb(gh()) * i2) / 1000, 1);
        this.J2 = iCoerceAtLeast;
        this.Uo = new ConcurrentHashMap();
        this.mUb = new fuX(gh().n());
        this.gh = -1;
        this.qie = MapsKt.emptyMap();
        this.az = SetsKt.emptySet();
        t(mUb(gh()));
        this.KN = (int) (iCoerceAtLeast * 0.5f);
    }

    private final boolean J2(int i2, int i3, int i5, int i7) {
        int iIntValue;
        Pj0.j jVarN;
        List listNr = this.mUb.nr(i2, this.J2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listNr) {
            if (this.az.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        Set setKeySet = this.Uo.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        ArrayDeque arrayDeque = new ArrayDeque(SetsKt.minus(setKeySet, (Iterable) set));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (this.Uo.get(Integer.valueOf(iIntValue2)) == null) {
                int i8 = this.gh;
                if (i8 != -1 && !set.contains(Integer.valueOf(i8))) {
                    return false;
                }
                Integer num = (Integer) arrayDeque.pollFirst();
                int iIntValue3 = num != null ? num.intValue() : -1;
                j jVar = (j) this.Uo.get(Integer.valueOf(iIntValue3));
                Pj0.j jVarZ = (jVar == null || (jVarN = jVar.n()) == null) ? null : jVarN.Z();
                if (jVarZ == null) {
                    Pj0.j jVarN2 = this.f67906n.n(i3, i5);
                    Intrinsics.checkNotNullExpressionValue(jVarN2, "createBitmap(...)");
                    jVar = new j(jVarN2);
                    jVarZ = jVar.n().clone();
                }
                jVar.nr(true);
                try {
                    ty(jVarZ, iIntValue2, i3, i5);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(jVarZ, null);
                    this.Uo.remove(Integer.valueOf(iIntValue3));
                    jVar.nr(false);
                    this.Uo.put(Integer.valueOf(iIntValue2), jVar);
                } finally {
                }
            }
        }
        if (arrayList.isEmpty()) {
            iIntValue = (int) (this.J2 * 0.5f);
        } else {
            int size = arrayList.size();
            iIntValue = ((Number) arrayList.get(RangesKt.coerceIn((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.KN = iIntValue;
        return true;
    }

    private final gwe.j KN(int i2) {
        gwe.j jVar;
        Iterator<Integer> it = new IntRange(0, this.mUb.rl()).iterator();
        do {
            jVar = null;
            if (!it.hasNext()) {
                break;
            }
            int iN = this.mUb.n(i2 - ((IntIterator) it).nextInt());
            j jVar2 = (j) this.Uo.get(Integer.valueOf(iN));
            if (jVar2 != null) {
                if (!jVar2.rl()) {
                    jVar2 = null;
                }
                if (jVar2 != null) {
                    jVar = new gwe.j(iN, jVar2.n());
                }
            }
        } while (jVar == null);
        return jVar;
    }

    static /* synthetic */ boolean Uo(CN3 cn3, int i2, int i3, int i5, int i7, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            i7 = 0;
        }
        return cn3.J2(i2, i3, i5, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(CN3 this$0, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        while (true) {
            CN3 cn3 = this$0;
            int i5 = i2;
            int i7 = i3;
            if (Uo(cn3, RangesKt.coerceAtLeast(this$0.gh, 0), i5, i7, 0, 8, null)) {
                cn3.xMQ = false;
                return;
            } else {
                this$0 = cn3;
                i2 = i5;
                i3 = i7;
            }
        }
    }

    private final int mUb(y8.Ml ml) {
        return (int) RangesKt.coerceAtLeast(TimeUnit.SECONDS.toMillis(1L) / ((long) (ml.mUb() / ml.n())), 1L);
    }

    private final void qie(final int i2, final int i3) {
        if (this.xMQ) {
            return;
        }
        this.xMQ = true;
        f04.n.f64049n.rl(new Runnable() { // from class: gwe.Wre
            @Override // java.lang.Runnable
            public final void run() {
                CN3.az(this.f67913n, i2, i3);
            }
        });
    }

    @Override // gwe.aC
    public void clear() {
        Collection collectionValues = this.Uo.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((j) it.next()).t();
        }
        this.Uo.clear();
        this.gh = -1;
    }

    public y8.Ml gh() {
        return this.nr;
    }

    @Override // gwe.aC
    public void n(int i2, int i3, Function0 onAnimationLoaded) {
        Intrinsics.checkNotNullParameter(onAnimationLoaded, "onAnimationLoaded");
        qie(i2, i3);
        onAnimationLoaded.invoke();
    }

    @Override // gwe.aC
    public o rl(int i2, int i3, int i5) {
        Integer num = (Integer) this.qie.get(Integer.valueOf(i2));
        if (num == null) {
            return xMQ(i2);
        }
        int iIntValue = num.intValue();
        this.gh = iIntValue;
        j jVar = (j) this.Uo.get(num);
        if (jVar == null || !jVar.rl()) {
            jVar = null;
        }
        if (jVar == null) {
            qie(i3, i5);
            return xMQ(iIntValue);
        }
        if (this.mUb.t(this.KN, iIntValue, this.J2)) {
            qie(i3, i5);
        }
        return new o(jVar.n().clone(), o.j.f67920n);
    }

    private final Pj0.j HI(Pj0.j jVar, Bitmap bitmap) {
        if (jVar.isValid() && !Intrinsics.areEqual(jVar.eF(), bitmap)) {
            Canvas canvas = new Canvas((Bitmap) jVar.eF());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return jVar;
    }

    private final void O(Pj0.j jVar) {
        if (jVar.isValid()) {
            new Canvas((Bitmap) jVar.eF()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    private final void ty(Pj0.j jVar, int i2, int i3, int i5) {
        Pj0.j jVarN;
        Pj0.j jVarZ;
        gwe.j jVarKN = KN(i2);
        if (jVarKN != null && (jVarN = jVarKN.n()) != null && (jVarZ = jVarN.Z()) != null) {
            try {
                int iRl = jVarKN.rl();
                if (iRl < i2) {
                    Object objEF = jVarZ.eF();
                    Intrinsics.checkNotNullExpressionValue(objEF, "get(...)");
                    HI(jVar, (Bitmap) objEF);
                    Iterator<Integer> it = new IntRange(iRl + 1, i2).iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((IntIterator) it).nextInt();
                        zdu.w6 w6Var = this.rl;
                        Object objEF2 = jVar.eF();
                        Intrinsics.checkNotNullExpressionValue(objEF2, "get(...)");
                        w6Var.n(iNextInt, (Bitmap) objEF2);
                    }
                    CloseableKt.closeFinally(jVarZ, null);
                    return;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(jVarZ, null);
            } finally {
            }
        }
        O(jVar);
        Iterator<Integer> it2 = new IntRange(0, i2).iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((IntIterator) it2).nextInt();
            zdu.w6 w6Var2 = this.rl;
            Object objEF3 = jVar.eF();
            Intrinsics.checkNotNullExpressionValue(objEF3, "get(...)");
            w6Var2.n(iNextInt2, (Bitmap) objEF3);
        }
    }

    private final o xMQ(int i2) {
        gwe.j jVarKN = KN(i2);
        if (jVarKN != null) {
            Pj0.j jVarClone = jVarKN.n().clone();
            Intrinsics.checkNotNullExpressionValue(jVarClone, "clone(...)");
            this.gh = jVarKN.rl();
            return new o(jVarClone, o.j.f67922t);
        }
        return new o(null, o.j.f67919O);
    }

    @Override // gwe.aC
    public void onStop() {
        aC.j.n(this);
    }

    @Override // gwe.aC
    public void t(int i2) {
        Map mapN = this.f67907t.n(gh().mUb() * RangesKt.coerceAtLeast(gh().rl(), 1), gh().n(), RangesKt.coerceAtMost(i2, mUb(gh())));
        this.qie = mapN;
        this.az = CollectionsKt.toSet(mapN.values());
    }
}
