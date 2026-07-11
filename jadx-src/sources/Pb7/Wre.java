package Pb7;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Wre {
    public static final V8ValueObject n(I28 i28, V8Runtime runtime) throws JavetException {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        if (i28 instanceof CN3) {
            return ((CN3) i28).t();
        }
        V8ValueObject v8ValueObjectCreateV8ValueObject = runtime.createV8ValueObject();
        for (String str : i28.rl()) {
            Pl plN = i28.n(str);
            if (plN instanceof Ml) {
                v8ValueObjectCreateV8ValueObject.set(str, Boolean.valueOf(((Ml) plN).J2()));
            } else if (plN instanceof fuX) {
                v8ValueObjectCreateV8ValueObject.set(str, Double.valueOf(((fuX) plN).J2()));
            } else if (plN instanceof aC) {
                v8ValueObjectCreateV8ValueObject.set(str, Integer.valueOf(((aC) plN).J2()));
            } else if (plN instanceof o) {
                v8ValueObjectCreateV8ValueObject.set(str, ((o) plN).J2());
            } else if (plN instanceof Dsr) {
                v8ValueObjectCreateV8ValueObject.set(str, ((Dsr) plN).n());
            } else if (Intrinsics.areEqual(plN, qz.f7710n)) {
                v8ValueObjectCreateV8ValueObject.setUndefined(str);
            } else if (plN instanceof j) {
                V8ValueArray v8ValueArrayN = n.n((j) plN, runtime);
                try {
                    v8ValueObjectCreateV8ValueObject.set(str, v8ValueArrayN);
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(v8ValueArrayN, null);
                } finally {
                }
            } else {
                if (!(plN instanceof I28)) {
                    throw new NoWhenBranchMatchedException();
                }
                V8ValueObject v8ValueObjectN = n((I28) plN, runtime);
                try {
                    v8ValueObjectCreateV8ValueObject.set(str, v8ValueObjectN);
                    Unit unit2 = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(v8ValueObjectN, null);
                } finally {
                }
            }
        }
        Intrinsics.checkNotNull(v8ValueObjectCreateV8ValueObject);
        return v8ValueObjectCreateV8ValueObject;
    }
}
