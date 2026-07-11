package Pb7;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.caoccao.javet.values.primitive.V8ValueInteger;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.primitive.V8ValueUndefined;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Xo {
    public static final V8Value n(Pl pl, V8Runtime runtime) throws JavetException {
        Intrinsics.checkNotNullParameter(pl, "<this>");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        if (pl instanceof Ml) {
            V8ValueBoolean v8ValueBooleanCreateV8ValueBoolean = runtime.createV8ValueBoolean(((Ml) pl).J2());
            Intrinsics.checkNotNullExpressionValue(v8ValueBooleanCreateV8ValueBoolean, "createV8ValueBoolean(...)");
            return v8ValueBooleanCreateV8ValueBoolean;
        }
        if (pl instanceof fuX) {
            V8ValueDouble v8ValueDoubleCreateV8ValueDouble = runtime.createV8ValueDouble(((fuX) pl).J2());
            Intrinsics.checkNotNullExpressionValue(v8ValueDoubleCreateV8ValueDouble, "createV8ValueDouble(...)");
            return v8ValueDoubleCreateV8ValueDouble;
        }
        if (pl instanceof aC) {
            V8ValueInteger v8ValueIntegerCreateV8ValueInteger = runtime.createV8ValueInteger(((aC) pl).J2());
            Intrinsics.checkNotNullExpressionValue(v8ValueIntegerCreateV8ValueInteger, "createV8ValueInteger(...)");
            return v8ValueIntegerCreateV8ValueInteger;
        }
        if (pl instanceof o) {
            V8ValueString v8ValueStringCreateV8ValueString = runtime.createV8ValueString(((o) pl).J2());
            Intrinsics.checkNotNullExpressionValue(v8ValueStringCreateV8ValueString, "createV8ValueString(...)");
            return v8ValueStringCreateV8ValueString;
        }
        if (Intrinsics.areEqual(pl, qz.f7710n)) {
            V8ValueUndefined v8ValueUndefinedCreateV8ValueUndefined = runtime.createV8ValueUndefined();
            Intrinsics.checkNotNullExpressionValue(v8ValueUndefinedCreateV8ValueUndefined, "createV8ValueUndefined(...)");
            return v8ValueUndefinedCreateV8ValueUndefined;
        }
        if (pl instanceof Dsr) {
            return ((Dsr) pl).n();
        }
        if (pl instanceof I28) {
            return Wre.n((I28) pl, runtime);
        }
        if (pl instanceof j) {
            return n.n((j) pl, runtime);
        }
        throw new NoWhenBranchMatchedException();
    }
}
