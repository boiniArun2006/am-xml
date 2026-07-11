package Du;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Sis implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final XA.Ml f1991n;
    private final XA.Ml rl;

    public /* synthetic */ Sis(XA.Ml ml, XA.Ml ml2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ml, ml2);
    }

    protected abstract Object J2(Object obj, Object obj2);

    protected abstract Object nr(Object obj);

    protected abstract Object rl(Object obj);

    private Sis(XA.Ml ml, XA.Ml ml2) {
        this.f1991n = ml;
        this.rl = ml2;
    }

    protected final XA.Ml O() {
        return this.rl;
    }

    @Override // XA.w6
    public Object deserialize(gi.I28 decoder) {
        Object objJ2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        EJn.Wre descriptor = getDescriptor();
        gi.w6 w6VarRl = decoder.rl(descriptor);
        if (w6VarRl.HI()) {
            objJ2 = J2(gi.w6.O(w6VarRl, getDescriptor(), 0, t(), null, 8, null), gi.w6.O(w6VarRl, getDescriptor(), 1, O(), null, 8, null));
        } else {
            Object objO = Qik.f1983n;
            Object objO2 = Qik.f1983n;
            while (true) {
                int iNY = w6VarRl.nY(getDescriptor());
                if (iNY != -1) {
                    if (iNY == 0) {
                        objO = gi.w6.O(w6VarRl, getDescriptor(), 0, t(), null, 8, null);
                    } else {
                        if (iNY != 1) {
                            throw new SerializationException("Invalid index: " + iNY);
                        }
                        objO2 = gi.w6.O(w6VarRl, getDescriptor(), 1, O(), null, 8, null);
                    }
                } else {
                    if (objO == Qik.f1983n) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objO2 == Qik.f1983n) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    objJ2 = J2(objO, objO2);
                }
            }
        }
        w6VarRl.t(descriptor);
        return objJ2;
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        gi.Ml mlRl = encoder.rl(getDescriptor());
        mlRl.S(getDescriptor(), 0, this.f1991n, rl(obj));
        mlRl.S(getDescriptor(), 1, this.rl, nr(obj));
        mlRl.t(getDescriptor());
    }

    protected final XA.Ml t() {
        return this.f1991n;
    }
}
