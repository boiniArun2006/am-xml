package Du;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class dT implements gi.I28, gi.w6 {
    private final ArrayList rl = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2011t;

    protected abstract long E(Object obj);

    protected abstract String FX(Object obj);

    protected abstract Object J(EJn.Wre wre, int i2);

    protected abstract short M(Object obj);

    protected abstract float M7(Object obj);

    protected abstract int P5(Object obj, EJn.Wre wre);

    protected abstract double U(Object obj);

    protected abstract byte Xw(Object obj);

    protected abstract boolean bzg(Object obj);

    protected abstract int eF(Object obj);

    @Override // gi.I28
    public final Void gh() {
        return null;
    }

    protected abstract char jB(Object obj);

    protected final Object B() {
        return CollectionsKt.lastOrNull((List) this.rl);
    }

    public final ArrayList D() {
        return this.rl;
    }

    protected final void I(Object obj) {
        this.rl.add(obj);
    }

    @Override // gi.w6
    public final String Ik(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return FX(J(descriptor, i2));
    }

    @Override // gi.w6
    public final char J2(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return jB(J(descriptor, i2));
    }

    @Override // gi.I28
    public final int S(EJn.Wre enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return P5(a(), enumDescriptor);
    }

    @Override // gi.w6
    public final byte T(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Xw(J(descriptor, i2));
    }

    @Override // gi.w6
    public final float Uo(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return M7(J(descriptor, i2));
    }

    @Override // gi.w6
    public final short ViF(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return M(J(descriptor, i2));
    }

    @Override // gi.w6
    public final int XQ(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return eF(J(descriptor, i2));
    }

    protected final Object a() {
        ArrayList arrayList = this.rl;
        Object objRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.f2011t = true;
        return objRemove;
    }

    @Override // gi.I28
    public gi.I28 az(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return p5(a(), descriptor);
    }

    @Override // gi.w6
    public final gi.I28 ck(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return p5(J(descriptor, i2), descriptor.Uo(i2));
    }

    @Override // gi.w6
    public final Object e(EJn.Wre descriptor, int i2, final XA.w6 deserializer, final Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return GR(J(descriptor, i2), new Function0() { // from class: Du.ozJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return dT.wTp(this.f2039n, deserializer, obj);
            }
        });
    }

    @Override // gi.w6
    public final Object fD(EJn.Wre descriptor, int i2, final XA.w6 deserializer, final Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return GR(J(descriptor, i2), new Function0() { // from class: Du.nSC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return dT.v(this.f2033n, deserializer, obj);
            }
        });
    }

    @Override // gi.w6
    public final double iF(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return U(J(descriptor, i2));
    }

    @Override // gi.w6
    public final boolean mUb(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return bzg(J(descriptor, i2));
    }

    protected gi.I28 p5(Object obj, EJn.Wre inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        I(obj);
        return this;
    }

    protected Object rV9(XA.w6 deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return qie(deserializer);
    }

    @Override // gi.w6
    public final long te(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return E(J(descriptor, i2));
    }

    private final Object GR(Object obj, Function0 function0) {
        I(obj);
        Object objInvoke = function0.invoke();
        if (!this.f2011t) {
            a();
        }
        this.f2011t = false;
        return objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object v(dT dTVar, XA.w6 w6Var, Object obj) {
        return dTVar.rV9(w6Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object wTp(dT dTVar, XA.w6 w6Var, Object obj) {
        if (!w6Var.getDescriptor().rl() && !dTVar.E2()) {
            return dTVar.gh();
        }
        return dTVar.rV9(w6Var, obj);
    }

    @Override // gi.I28
    public final byte N() {
        return Xw(a());
    }

    @Override // gi.I28
    public final boolean WPU() {
        return bzg(a());
    }

    @Override // gi.I28
    public final double Z() {
        return U(a());
    }

    @Override // gi.I28
    public final char aYN() {
        return jB(a());
    }

    @Override // gi.I28
    public final String g() {
        return FX(a());
    }

    @Override // gi.I28
    public final float o() {
        return M7(a());
    }

    @Override // gi.I28
    public final short r() {
        return M(a());
    }

    @Override // gi.I28
    public final long ty() {
        return E(a());
    }

    @Override // gi.I28
    public final int xMQ() {
        return eF(a());
    }
}
