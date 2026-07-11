package I;

import XoT.C;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final V8Runtime f4007n;
    private final List rl;

    public n(V8Runtime v82) {
        Intrinsics.checkNotNullParameter(v82, "v8");
        this.f4007n = v82;
        this.rl = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(n nVar) {
        return "[JS] Freed " + nVar.rl.size() + " objects";
    }

    public final V8Runtime J2() {
        return this.f4007n;
    }

    public final void Uo(V8ValueObject v8ValueObject, String key, Function1 valueInit) {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueInit, "valueInit");
        V8ValueObject v8ValueObjectT = t();
        valueInit.invoke(v8ValueObjectT);
        v8ValueObject.set(key, v8ValueObjectT);
    }

    public final void nr() {
        JavetResourceUtils.safeClose(this.rl);
        C.Uo(this, new Function0() { // from class: I.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.O(this.f4006n);
            }
        });
        this.rl.clear();
    }

    public final V8ValueArray rl() {
        V8ValueArray v8ValueArrayCreateV8ValueArray = this.f4007n.createV8ValueArray();
        List list = this.rl;
        Intrinsics.checkNotNull(v8ValueArrayCreateV8ValueArray);
        list.add(v8ValueArrayCreateV8ValueArray);
        Intrinsics.checkNotNullExpressionValue(v8ValueArrayCreateV8ValueArray, "also(...)");
        return v8ValueArrayCreateV8ValueArray;
    }

    public final V8ValueObject t() {
        V8ValueObject v8ValueObjectCreateV8ValueObject = this.f4007n.createV8ValueObject();
        List list = this.rl;
        Intrinsics.checkNotNull(v8ValueObjectCreateV8ValueObject);
        list.add(v8ValueObjectCreateV8ValueObject);
        Intrinsics.checkNotNullExpressionValue(v8ValueObjectCreateV8ValueObject, "also(...)");
        return v8ValueObjectCreateV8ValueObject;
    }
}
