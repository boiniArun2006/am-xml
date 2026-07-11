package gi;

import Du.Fl;
import XA.eO;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n implements Wre, Ml {
    @Override // gi.Wre
    public Wre J2(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    public boolean N(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    @Override // gi.Wre
    public Ml rl(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    public void t(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // gi.Wre
    public void HI(EJn.Wre enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        nHg(Integer.valueOf(i2));
    }

    @Override // gi.Wre
    public void Ik() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // gi.Ml
    public final void O(EJn.Wre descriptor, int i2, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (N(descriptor, i2)) {
            T(value);
        }
    }

    @Override // gi.Ml
    public void S(EJn.Wre descriptor, int i2, eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (N(descriptor, i2)) {
            ViF(serializer, obj);
        }
    }

    @Override // gi.Wre
    public void T(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        nHg(value);
    }

    @Override // gi.Ml
    public final void WPU(EJn.Wre descriptor, int i2, long j2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (N(descriptor, i2)) {
            az(j2);
        }
    }

    public void X(EJn.Wre descriptor, int i2, eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (N(descriptor, i2)) {
            ty(serializer, obj);
        }
    }

    @Override // gi.Ml
    public final Wre Z(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return N(descriptor, i2) ? J2(descriptor.Uo(i2)) : Fl.f1959n;
    }

    @Override // gi.Ml
    public final void ck(EJn.Wre descriptor, int i2, double d2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (N(descriptor, i2)) {
            Uo(d2);
        }
    }

    @Override // gi.Ml
    public final void e(EJn.Wre descriptor, int i2, byte b2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (N(descriptor, i2)) {
            KN(b2);
        }
    }

    @Override // gi.Ml
    public final void fD(EJn.Wre descriptor, int i2, int i3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (N(descriptor, i2)) {
            E2(i3);
        }
    }

    @Override // gi.Ml
    public final void gh(EJn.Wre descriptor, int i2, short s2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (N(descriptor, i2)) {
            o(s2);
        }
    }

    public void nHg(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    @Override // gi.Ml
    public final void qie(EJn.Wre descriptor, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (N(descriptor, i2)) {
            XQ(z2);
        }
    }

    @Override // gi.Ml
    public final void te(EJn.Wre descriptor, int i2, float f3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (N(descriptor, i2)) {
            aYN(f3);
        }
    }

    @Override // gi.Ml
    public final void xMQ(EJn.Wre descriptor, int i2, char c2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (N(descriptor, i2)) {
            nY(c2);
        }
    }

    @Override // gi.Wre
    public void E2(int i2) {
        nHg(Integer.valueOf(i2));
    }

    @Override // gi.Wre
    public void KN(byte b2) {
        nHg(Byte.valueOf(b2));
    }

    @Override // gi.Wre
    public void Uo(double d2) {
        nHg(Double.valueOf(d2));
    }

    @Override // gi.Wre
    public void XQ(boolean z2) {
        nHg(Boolean.valueOf(z2));
    }

    @Override // gi.Wre
    public void aYN(float f3) {
        nHg(Float.valueOf(f3));
    }

    @Override // gi.Wre
    public void az(long j2) {
        nHg(Long.valueOf(j2));
    }

    @Override // gi.Wre
    public void nY(char c2) {
        nHg(Character.valueOf(c2));
    }

    @Override // gi.Wre
    public void o(short s2) {
        nHg(Short.valueOf(s2));
    }
}
