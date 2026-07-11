package Du;

import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.serialization.SerializationException;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ln implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Enum[] f1967n;
    private EJn.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f1968t;

    public Ln(final String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f1967n = values;
        this.f1968t = LazyKt.lazy(new Function0() { // from class: Du.qf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ln.nr(this.f2045n, serialName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre nr(Ln ln2, String str) {
        EJn.Wre wre = ln2.rl;
        return wre == null ? ln2.t(str) : wre;
    }

    private final EJn.Wre t(String str) {
        C1342u c1342u = new C1342u(str, this.f1967n.length);
        for (Enum r02 : this.f1967n) {
            DC.ck(c1342u, r02.name(), false, 2, null);
        }
        return c1342u;
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, Enum value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int iIndexOf = ArraysKt.indexOf(this.f1967n, value);
        if (iIndexOf != -1) {
            encoder.HI(getDescriptor(), iIndexOf);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().KN());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.f1967n);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(gi.I28 i28) {
        Intrinsics.checkNotNullParameter(i28, Apsps.nxecOsk);
        int iS = i28.S(getDescriptor());
        if (iS >= 0) {
            Enum[] enumArr = this.f1967n;
            if (iS < enumArr.length) {
                return enumArr[iS];
            }
        }
        throw new SerializationException(iS + " is not among valid " + getDescriptor().KN() + " enum values, values size is " + this.f1967n.length);
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return (EJn.Wre) this.f1968t.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().KN() + Typography.greater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ln(String serialName, Enum[] values, EJn.Wre descriptor) {
        this(serialName, values);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.rl = descriptor;
    }
}
