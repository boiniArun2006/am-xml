package gi;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j implements I28, w6 {
    @Override // gi.I28
    public boolean E2() {
        return true;
    }

    @Override // gi.I28
    public I28 az(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // gi.I28
    public Void gh() {
        return null;
    }

    @Override // gi.I28
    public w6 rl(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    public void t(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // gi.w6
    public final String Ik(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return g();
    }

    @Override // gi.w6
    public final char J2(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return aYN();
    }

    @Override // gi.I28
    public int S(EJn.Wre enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objS7N).intValue();
    }

    @Override // gi.w6
    public final byte T(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return N();
    }

    @Override // gi.w6
    public final float Uo(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return o();
    }

    @Override // gi.w6
    public final short ViF(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return r();
    }

    @Override // gi.w6
    public final int XQ(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return xMQ();
    }

    @Override // gi.w6
    public I28 ck(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return az(descriptor.Uo(i2));
    }

    @Override // gi.w6
    public final Object e(EJn.Wre descriptor, int i2, XA.w6 deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().rl() || E2()) ? nHg(deserializer, obj) : gh();
    }

    public Object fD(EJn.Wre descriptor, int i2, XA.w6 deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return nHg(deserializer, obj);
    }

    @Override // gi.w6
    public final double iF(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Z();
    }

    @Override // gi.w6
    public final boolean mUb(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return WPU();
    }

    public Object nHg(XA.w6 deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return qie(deserializer);
    }

    public Object s7N() {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // gi.w6
    public final long te(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return ty();
    }

    @Override // gi.I28
    public byte N() {
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objS7N).byteValue();
    }

    @Override // gi.I28
    public boolean WPU() {
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objS7N).booleanValue();
    }

    @Override // gi.I28
    public double Z() {
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objS7N).doubleValue();
    }

    @Override // gi.I28
    public char aYN() {
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objS7N).charValue();
    }

    @Override // gi.I28
    public String g() {
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.String");
        return (String) objS7N;
    }

    @Override // gi.I28
    public float o() {
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objS7N).floatValue();
    }

    @Override // gi.I28
    public short r() {
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objS7N).shortValue();
    }

    @Override // gi.I28
    public long ty() {
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objS7N).longValue();
    }

    @Override // gi.I28
    public int xMQ() {
        Object objS7N = s7N();
        Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objS7N).intValue();
    }
}
