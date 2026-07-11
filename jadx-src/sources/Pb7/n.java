package Pb7;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueArray;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {
    public static final V8ValueArray n(j jVar, V8Runtime runtime) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        if (jVar instanceof w6) {
            return ((w6) jVar).t();
        }
        V8ValueArray v8ValueArrayCreateV8ValueArray = runtime.createV8ValueArray();
        int iRl = jVar.rl();
        for (int i2 = 0; i2 < iRl; i2++) {
            V8Value v8ValueN = Xo.n(jVar.n(i2), runtime);
            try {
                v8ValueArrayCreateV8ValueArray.push(v8ValueN);
                Unit unit = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(v8ValueN, null);
            } finally {
            }
        }
        Intrinsics.checkNotNull(v8ValueArrayCreateV8ValueArray);
        return v8ValueArrayCreateV8ValueArray;
    }
}
