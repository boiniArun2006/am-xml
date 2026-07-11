package Du;

import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class V implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final XA.Ml f1994n;
    private final EJn.Wre nr;
    private final XA.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final XA.Ml f1995t;

    public V(XA.Ml aSerializer, XA.Ml bSerializer, XA.Ml cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.f1994n = aSerializer;
        this.rl = bSerializer;
        this.f1995t = cSerializer;
        this.nr = EJn.qz.nr("kotlin.Triple", new EJn.Wre[0], new Function1() { // from class: Du.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.O(this.f1989n, (EJn.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(V v2, EJn.j buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        EJn.j.rl(buildClassSerialDescriptor, "first", v2.f1994n.getDescriptor(), null, false, 12, null);
        EJn.j.rl(buildClassSerialDescriptor, "second", v2.rl.getDescriptor(), null, false, 12, null);
        EJn.j.rl(buildClassSerialDescriptor, "third", v2.f1995t.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public Triple deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        gi.w6 w6VarRl = decoder.rl(getDescriptor());
        return w6VarRl.HI() ? t(w6VarRl) : nr(w6VarRl);
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, Triple value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        gi.Ml mlRl = encoder.rl(getDescriptor());
        mlRl.S(getDescriptor(), 0, this.f1994n, value.getFirst());
        mlRl.S(getDescriptor(), 1, this.rl, value.getSecond());
        mlRl.S(getDescriptor(), 2, this.f1995t, value.getThird());
        mlRl.t(getDescriptor());
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.nr;
    }

    private final Triple nr(gi.w6 w6Var) {
        gi.w6 w6Var2;
        Object objO = Qik.f1983n;
        Object objO2 = Qik.f1983n;
        Object objO3 = Qik.f1983n;
        while (true) {
            int iNY = w6Var.nY(getDescriptor());
            if (iNY != -1) {
                if (iNY != 0) {
                    if (iNY != 1) {
                        if (iNY == 2) {
                            objO3 = gi.w6.O(w6Var, getDescriptor(), 2, this.f1995t, null, 8, null);
                        } else {
                            throw new SerializationException("Unexpected index " + iNY);
                        }
                    } else {
                        w6Var2 = w6Var;
                        objO2 = gi.w6.O(w6Var2, getDescriptor(), 1, this.rl, null, 8, null);
                    }
                } else {
                    w6Var2 = w6Var;
                    objO = gi.w6.O(w6Var2, getDescriptor(), 0, this.f1994n, null, 8, null);
                }
                w6Var = w6Var2;
            } else {
                w6Var.t(getDescriptor());
                if (objO != Qik.f1983n) {
                    if (objO2 != Qik.f1983n) {
                        if (objO3 != Qik.f1983n) {
                            return new Triple(objO, objO2, objO3);
                        }
                        throw new SerializationException("Element 'third' is missing");
                    }
                    throw new SerializationException("Element 'second' is missing");
                }
                throw new SerializationException("Element 'first' is missing");
            }
        }
    }

    private final Triple t(gi.w6 w6Var) {
        Object objO = gi.w6.O(w6Var, getDescriptor(), 0, this.f1994n, null, 8, null);
        Object objO2 = gi.w6.O(w6Var, getDescriptor(), 1, this.rl, null, 8, null);
        Object objO3 = gi.w6.O(w6Var, getDescriptor(), 2, this.f1995t, null, 8, null);
        w6Var.t(getDescriptor());
        return new Triple(objO, objO2, objO3);
    }
}
