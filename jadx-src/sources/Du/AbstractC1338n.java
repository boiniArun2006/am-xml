package Du;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;

/* JADX INFO: renamed from: Du.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class AbstractC1338n implements XA.Ml {
    public abstract KClass J2();

    public XA.eO O(gi.Wre encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.getSerializersModule().J2(J2(), value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // XA.w6
    public final Object deserialize(gi.I28 decoder) {
        Object objT;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        EJn.Wre descriptor = getDescriptor();
        gi.w6 w6VarRl = decoder.rl(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (w6VarRl.HI()) {
            objT = t(w6VarRl);
        } else {
            Object objO = null;
            while (true) {
                int iNY = w6VarRl.nY(getDescriptor());
                if (iNY != -1) {
                    if (iNY == 0) {
                        objectRef.element = w6VarRl.Ik(getDescriptor(), iNY);
                    } else {
                        if (iNY != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) objectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iNY);
                            throw new SerializationException(sb.toString());
                        }
                        T t3 = objectRef.element;
                        if (t3 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        objectRef.element = t3;
                        objO = gi.w6.O(w6VarRl, getDescriptor(), iNY, XA.Dsr.n(this, w6VarRl, (String) t3), null, 8, null);
                    }
                } else {
                    if (objO == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.element)).toString());
                    }
                    Intrinsics.checkNotNull(objO, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    objT = objO;
                }
            }
        }
        w6VarRl.t(descriptor);
        return objT;
    }

    public XA.w6 nr(gi.w6 decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.getSerializersModule().O(J2(), str);
    }

    @Override // XA.eO
    public final void serialize(gi.Wre encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        XA.eO eOVarRl = XA.Dsr.rl(this, encoder, value);
        EJn.Wre descriptor = getDescriptor();
        gi.Ml mlRl = encoder.rl(descriptor);
        mlRl.O(getDescriptor(), 0, eOVarRl.getDescriptor().KN());
        EJn.Wre descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(eOVarRl, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        mlRl.S(descriptor2, 1, eOVarRl, value);
        mlRl.t(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(gi.w6 w6Var) {
        return gi.w6.O(w6Var, getDescriptor(), 1, XA.Dsr.n(this, w6Var, w6Var.Ik(getDescriptor(), 0)), null, 8, null);
    }
}
