package Du;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AZy implements gi.Wre, gi.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f1944n = new ArrayList();

    protected abstract Object M(EJn.Wre wre, int i2);

    protected abstract void M7(Object obj, String str);

    protected abstract void P5(Object obj, short s2);

    protected abstract void U(Object obj, long j2);

    protected abstract void bzg(Object obj, float f3);

    protected abstract void jB(Object obj, int i2);

    protected abstract void nHg(Object obj, boolean z2);

    protected abstract void p5(EJn.Wre wre);

    protected abstract void rV9(Object obj, EJn.Wre wre, int i2);

    protected abstract void s7N(Object obj, byte b2);

    protected abstract void v(Object obj, double d2);

    protected abstract void wTp(Object obj, char c2);

    protected final void B(Object obj) {
        this.f1944n.add(obj);
    }

    protected final Object E() {
        return CollectionsKt.lastOrNull((List) this.f1944n);
    }

    protected final Object FX() {
        if (this.f1944n.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList arrayList = this.f1944n;
        return arrayList.remove(CollectionsKt.getLastIndex(arrayList));
    }

    @Override // gi.Wre
    public final void HI(EJn.Wre enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        rV9(FX(), enumDescriptor, i2);
    }

    @Override // gi.Wre
    public gi.Wre J2(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Xw(FX(), descriptor);
    }

    @Override // gi.Ml
    public final void O(EJn.Wre descriptor, int i2, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        M7(M(descriptor, i2), value);
    }

    @Override // gi.Ml
    public void S(EJn.Wre descriptor, int i2, XA.eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (N(descriptor, i2)) {
            ViF(serializer, obj);
        }
    }

    @Override // gi.Wre
    public final void T(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        M7(FX(), value);
    }

    @Override // gi.Ml
    public final void WPU(EJn.Wre descriptor, int i2, long j2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        U(M(descriptor, i2), j2);
    }

    @Override // gi.Ml
    public void X(EJn.Wre descriptor, int i2, XA.eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (N(descriptor, i2)) {
            ty(serializer, obj);
        }
    }

    protected gi.Wre Xw(Object obj, EJn.Wre inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        B(obj);
        return this;
    }

    @Override // gi.Ml
    public final gi.Wre Z(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Xw(M(descriptor, i2), descriptor.Uo(i2));
    }

    @Override // gi.Ml
    public final void ck(EJn.Wre descriptor, int i2, double d2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        v(M(descriptor, i2), d2);
    }

    @Override // gi.Ml
    public final void e(EJn.Wre descriptor, int i2, byte b2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        s7N(M(descriptor, i2), b2);
    }

    protected final Object eF() {
        return CollectionsKt.last((List) this.f1944n);
    }

    @Override // gi.Ml
    public final void fD(EJn.Wre descriptor, int i2, int i3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        jB(M(descriptor, i2), i3);
    }

    @Override // gi.Ml
    public final void gh(EJn.Wre descriptor, int i2, short s2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        P5(M(descriptor, i2), s2);
    }

    @Override // gi.Ml
    public final void qie(EJn.Wre descriptor, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        nHg(M(descriptor, i2), z2);
    }

    @Override // gi.Ml
    public final void t(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.f1944n.isEmpty()) {
            FX();
        }
        p5(descriptor);
    }

    @Override // gi.Ml
    public final void te(EJn.Wre descriptor, int i2, float f3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        bzg(M(descriptor, i2), f3);
    }

    @Override // gi.Ml
    public final void xMQ(EJn.Wre descriptor, int i2, char c2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        wTp(M(descriptor, i2), c2);
    }

    private final boolean N(EJn.Wre wre, int i2) {
        B(M(wre, i2));
        return true;
    }

    @Override // gi.Wre
    public final void E2(int i2) {
        jB(FX(), i2);
    }

    @Override // gi.Wre
    public final void KN(byte b2) {
        s7N(FX(), b2);
    }

    @Override // gi.Wre
    public final void Uo(double d2) {
        v(FX(), d2);
    }

    @Override // gi.Wre
    public final void XQ(boolean z2) {
        nHg(FX(), z2);
    }

    @Override // gi.Wre
    public final void aYN(float f3) {
        bzg(FX(), f3);
    }

    @Override // gi.Wre
    public final void az(long j2) {
        U(FX(), j2);
    }

    @Override // gi.Wre
    public final void nY(char c2) {
        wTp(FX(), c2);
    }

    @Override // gi.Wre
    public final void o(short s2) {
        P5(FX(), s2);
    }
}
