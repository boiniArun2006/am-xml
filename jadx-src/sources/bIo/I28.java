package bIo;

import GJW.Pl;
import GJW.eO;
import com.bendingspoons.crisper.internal.AsyncComputationException;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetBiConsumer;
import com.caoccao.javet.interfaces.IJavetUniConsumer;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.caoccao.javet.values.primitive.V8ValueInteger;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.IV8ValuePromise;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueError;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValuePromise;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class I28 {

    public static final class j implements IV8ValuePromise.IListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f43258n;
        final /* synthetic */ Pl rl;

        j(AtomicBoolean atomicBoolean, Pl pl) {
            this.f43258n = atomicBoolean;
            this.rl = pl;
        }

        @Override // com.caoccao.javet.values.reference.IV8ValuePromise.IListener
        public void onCatch(V8Value v8Value) {
            if (this.f43258n.compareAndSet(false, true)) {
                Pl pl = this.rl;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(new AsyncComputationException(String.valueOf(v8Value)))));
            }
        }

        @Override // com.caoccao.javet.values.reference.IV8ValuePromise.IListener
        public void onFulfilled(V8Value v8Value) {
            Intrinsics.checkNotNullParameter(v8Value, "v8Value");
            if (this.f43258n.compareAndSet(false, true)) {
                Pl pl = this.rl;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(v8Value.toClone()));
            }
        }

        @Override // com.caoccao.javet.values.reference.IV8ValuePromise.IListener
        public void onRejected(V8Value v8Value) {
            if (this.f43258n.compareAndSet(false, true)) {
                Pl pl = this.rl;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(new AsyncComputationException(String.valueOf(v8Value)))));
            }
        }
    }

    public static final String J2(V8ValueObject v8ValueObject, String key) {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return v8ValueObject.getString(key);
        } catch (JavetException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(JSONArray jSONArray, V8Value v8Value) throws JSONException {
        if (v8Value instanceof V8ValueBoolean) {
            jSONArray.put(((V8ValueBoolean) v8Value).toPrimitive());
            return;
        }
        if (v8Value instanceof V8ValueInteger) {
            jSONArray.put(((V8ValueInteger) v8Value).toPrimitive());
            return;
        }
        if (v8Value instanceof V8ValueDouble) {
            jSONArray.put(((V8ValueDouble) v8Value).toPrimitive());
            return;
        }
        if (v8Value instanceof V8ValueString) {
            jSONArray.put(((V8ValueString) v8Value).toPrimitive());
            return;
        }
        if (v8Value instanceof V8ValueFunction) {
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (v8Value instanceof V8ValueArray) {
            jSONArray.put(Uo((V8ValueArray) v8Value));
        } else if (v8Value instanceof V8ValueObject) {
            jSONArray.put(xMQ((V8ValueObject) v8Value));
        } else {
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public static final Object O(V8ValuePromise v8ValuePromise, Continuation continuation) throws JavetException {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        v8ValuePromise.register(new j(atomicBoolean, eOVar));
        if (!v8ValuePromise.isPending() && atomicBoolean.compareAndSet(false, true)) {
            V8Value result = v8ValuePromise.getResult();
            if ((result instanceof V8ValueError) || v8ValuePromise.isRejected()) {
                Result.Companion companion = Result.INSTANCE;
                eOVar.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(new AsyncComputationException(result.toString()))));
            } else {
                eOVar.resumeWith(Result.m313constructorimpl(result));
            }
        }
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    public static final JSONArray Uo(V8ValueArray v8ValueArray) throws Throwable {
        Intrinsics.checkNotNullParameter(v8ValueArray, "<this>");
        final JSONArray jSONArray = new JSONArray();
        v8ValueArray.forEach(new IJavetUniConsumer() { // from class: bIo.Ml
            @Override // com.caoccao.javet.interfaces.IJavetUniConsumer
            public final void accept(V8Value v8Value) throws JSONException {
                I28.KN(jSONArray, v8Value);
            }
        });
        return jSONArray;
    }

    public static final pq.Ml az(V8ValueObject v8ValueObject) throws Throwable {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        final pq.Ml ml = new pq.Ml();
        v8ValueObject.forEach(new IJavetBiConsumer() { // from class: bIo.j
            @Override // com.caoccao.javet.interfaces.IJavetBiConsumer
            public final void accept(V8Value v8Value, V8Value v8Value2) {
                I28.ty(ml, (V8ValueString) v8Value, v8Value2);
            }
        });
        return ml;
    }

    public static final pq.w6 gh(V8ValueArray v8ValueArray) throws Throwable {
        Intrinsics.checkNotNullParameter(v8ValueArray, "<this>");
        final pq.w6 w6Var = new pq.w6();
        v8ValueArray.forEach(new IJavetUniConsumer() { // from class: bIo.n
            @Override // com.caoccao.javet.interfaces.IJavetUniConsumer
            public final void accept(V8Value v8Value) {
                I28.qie(w6Var, v8Value);
            }
        });
        return w6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(pq.w6 w6Var, V8Value v8Value) {
        if (v8Value instanceof V8ValueBoolean) {
            w6Var.J2(((V8ValueBoolean) v8Value).toPrimitive());
            return;
        }
        if (v8Value instanceof V8ValueInteger) {
            w6Var.rl(Integer.valueOf(((V8ValueInteger) v8Value).toPrimitive()));
            return;
        }
        if (v8Value instanceof V8ValueDouble) {
            w6Var.rl(Double.valueOf(((V8ValueDouble) v8Value).toPrimitive()));
            return;
        }
        if (v8Value instanceof V8ValueString) {
            String primitive = ((V8ValueString) v8Value).toPrimitive();
            Intrinsics.checkNotNullExpressionValue(primitive, "toPrimitive(...)");
            w6Var.t(primitive);
        } else {
            if (v8Value instanceof V8ValueFunction) {
                return;
            }
            if (v8Value instanceof V8ValueArray) {
                w6Var.nr(gh((V8ValueArray) v8Value));
            } else if (v8Value instanceof V8ValueObject) {
                w6Var.O(az((V8ValueObject) v8Value));
            }
        }
    }

    public static final JSONObject xMQ(V8ValueObject v8ValueObject) throws Throwable {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        final JSONObject jSONObject = new JSONObject();
        v8ValueObject.forEach(new IJavetBiConsumer() { // from class: bIo.w6
            @Override // com.caoccao.javet.interfaces.IJavetBiConsumer
            public final void accept(V8Value v8Value, V8Value v8Value2) throws JSONException {
                I28.mUb(jSONObject, v8Value, v8Value2);
            }
        });
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(JSONObject jSONObject, V8Value v8Value, V8Value v8Value2) throws JSONException {
        String string = v8Value.toString();
        if (v8Value2 instanceof V8ValueBoolean) {
            jSONObject.put(string, ((V8ValueBoolean) v8Value2).toPrimitive());
            return;
        }
        if (v8Value2 instanceof V8ValueInteger) {
            jSONObject.put(string, ((V8ValueInteger) v8Value2).toPrimitive());
            return;
        }
        if (v8Value2 instanceof V8ValueDouble) {
            jSONObject.put(string, ((V8ValueDouble) v8Value2).toPrimitive());
            return;
        }
        if (v8Value2 instanceof V8ValueString) {
            jSONObject.put(string, ((V8ValueString) v8Value2).toPrimitive());
            return;
        }
        if (v8Value2 instanceof V8ValueFunction) {
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (v8Value2 instanceof V8ValueArray) {
            jSONObject.put(string, Uo((V8ValueArray) v8Value2));
        } else if (v8Value2 instanceof V8ValueObject) {
            jSONObject.put(string, xMQ((V8ValueObject) v8Value2));
        } else {
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(pq.Ml ml, V8ValueString v8ValueString, V8Value v8Value) {
        String primitive = v8ValueString.toPrimitive();
        if (v8Value instanceof V8ValueBoolean) {
            Intrinsics.checkNotNull(primitive);
            ml.KN(primitive, ((V8ValueBoolean) v8Value).toPrimitive());
            return;
        }
        if (v8Value instanceof V8ValueInteger) {
            Intrinsics.checkNotNull(primitive);
            ml.nr(primitive, Integer.valueOf(((V8ValueInteger) v8Value).toPrimitive()));
            return;
        }
        if (v8Value instanceof V8ValueDouble) {
            Intrinsics.checkNotNull(primitive);
            ml.nr(primitive, Double.valueOf(((V8ValueDouble) v8Value).toPrimitive()));
            return;
        }
        if (v8Value instanceof V8ValueString) {
            Intrinsics.checkNotNull(primitive);
            String primitive2 = ((V8ValueString) v8Value).toPrimitive();
            Intrinsics.checkNotNullExpressionValue(primitive2, "toPrimitive(...)");
            ml.O(primitive, primitive2);
            return;
        }
        if (!(v8Value instanceof V8ValueFunction)) {
            if (v8Value instanceof V8ValueArray) {
                Intrinsics.checkNotNull(primitive);
                ml.J2(primitive, gh((V8ValueArray) v8Value));
            } else if (v8Value instanceof V8ValueObject) {
                Intrinsics.checkNotNull(primitive);
                ml.Uo(primitive, az((V8ValueObject) v8Value));
            }
        }
    }
}
