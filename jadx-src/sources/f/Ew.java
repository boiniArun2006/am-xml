package f;

import GJW.vd;
import JK.w6;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import f.DAz;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xAo.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ew {

    static final class j extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f63965O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Q.Xo f63966S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ sqD.w6 f63967Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63968n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ nKK f63969o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f63970r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63971t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(nKK nkk, sqD.w6 w6Var, Q.Xo xo, Continuation continuation) {
            super(2, continuation);
            this.f63969o = nkk;
            this.f63967Z = w6Var;
            this.f63966S = xo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f63969o, this.f63967Z, this.f63966S, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0047 -> B:18:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004e -> B:18:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0062 -> B:18:0x0065). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws JSONException {
            Q.Xo xo;
            int length;
            int i2;
            JSONArray jSONArray;
            Long lN2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f63970r;
            if (i3 != 0) {
                if (i3 == 1) {
                    length = this.J2;
                    i2 = this.f63965O;
                    xo = (Q.Xo) this.f63971t;
                    jSONArray = (JSONArray) this.f63968n;
                    ResultKt.throwOnFailure(obj);
                    i2++;
                    if (i2 < length) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                        JK.w6 w6VarT = Ew.t(jSONObject);
                        if (w6VarT != null && (lN2 = Ew.n(jSONObject)) != null) {
                            long jLongValue = lN2.longValue();
                            this.f63968n = jSONArray;
                            this.f63971t = xo;
                            this.f63965O = i2;
                            this.J2 = length;
                            this.f63970r = 1;
                            if (xo.O(w6VarT, jLongValue, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        i2++;
                        if (i2 < length) {
                            this.f63967Z.t(DAz.j.f63964n);
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                JSONArray jSONArrayRl = this.f63969o.rl();
                xo = this.f63966S;
                length = jSONArrayRl.length();
                i2 = 0;
                jSONArray = jSONArrayRl;
                if (i2 < length) {
                }
            }
        }
    }

    public static final Long n(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Double dRl = bIo.Wre.rl(jSONObject, "duration_hours");
        if (dRl != null) {
            return Long.valueOf((long) (dRl.doubleValue() * 3600000));
        }
        return null;
    }

    public static final nKK nr(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONArray jSONArrayN = Ln.n(jSONObject, "unlockedFeatures");
        if (jSONArrayN == null) {
            jSONArrayN = new JSONArray();
        }
        return new nKK(jSONArrayN);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final JK.w6 t(JSONObject jSONObject) {
        String strO;
        String str;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String strO2 = bIo.Wre.O(jSONObject, "project_id");
        if (strO2 == null || (strO = bIo.Wre.O(jSONObject, "feature_id")) == null) {
            return null;
        }
        switch (strO.hashCode()) {
            case -1064852796:
                if (strO.equals("cameraObject")) {
                    return new w6.n(strO2);
                }
                break;
            case -973763417:
                if (strO.equals("layerParenting")) {
                    return new w6.C0153w6(strO2);
                }
                break;
            case -782905624:
                if (strO.equals("watermarkRemoval")) {
                    return new w6.I28(strO2);
                }
                break;
            case 634941421:
                if (strO.equals("advancedEasing")) {
                    return new w6.j(strO2);
                }
                break;
        }
        if (!StringsKt.startsWith$default(strO, "premiumEffect", false, 2, (Object) null) || (str = (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) strO, new String[]{"/"}, false, 0, 6, (Object) null), 1)) == null) {
            return null;
        }
        return new w6.Ml(strO2, str);
    }

    public static final Object rl(ComponentActivity componentActivity, sqD.w6 w6Var, nKK nkk, Q.Xo xo, Continuation continuation) {
        return GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new j(nkk, w6Var, xo, null), 3, null);
    }
}
