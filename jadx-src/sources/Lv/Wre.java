package Lv;

import HI0.Q;
import QmE.iF;
import android.content.Context;
import com.alightcreative.app.motion.scene.ExportOutcome;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.Scene;
import fX.AbstractC2108w6;
import fX.InterfaceC2107n;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import z.C2466CN3;
import z.DC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Wre {

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f6194O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6195n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f6196t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6196t = obj;
            this.f6194O |= Integer.MIN_VALUE;
            return Wre.n(null, null, null, null, null, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    static final class n implements TFv.CN3, FunctionAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ Function2 f6197n;

        n(Function2 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6197n = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof TFv.CN3) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f6197n;
        }

        @Override // TFv.CN3
        public final /* synthetic */ Object rl(Object obj, Continuation continuation) {
            return this.f6197n.invoke(obj, continuation);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r14v1, types: [Cp.w6] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(Context context, iF iFVar, Scene scene, File file, ExportParams exportParams, cBL.j jVar, Function2 function2, Continuation continuation) throws Throwable {
        j jVar2;
        Cp.w6 w6Var;
        ExportOutcome exportOutcome;
        if (continuation instanceof j) {
            jVar2 = (j) continuation;
            int i2 = jVar2.f6194O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar2.f6194O = i2 - Integer.MIN_VALUE;
            } else {
                jVar2 = new j(continuation);
            }
        }
        Object obj = jVar2.f6196t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar2.f6194O;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC2107n interfaceC2107nN = AbstractC2108w6.n(context, "felliniExport", true);
                try {
                    TFv.Wre wreTy = Lv.n.ty(context, iFVar, file, new CN3(scene, jVar, new Q(context), exportParams, new C2466CN3(interfaceC2107nN.t().rl(), DC.f76234g)), interfaceC2107nN);
                    try {
                        n nVar = new n(function2);
                        jVar2.f6195n = interfaceC2107nN;
                        jVar2.f6194O = 1;
                        if (wreTy.n(nVar, jVar2) != coroutine_suspended) {
                            w6Var = interfaceC2107nN;
                        }
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        e = e3;
                        w6Var = interfaceC2107nN;
                        exportOutcome = new ExportOutcome(null, e);
                    }
                } catch (Throwable th) {
                    th = th;
                    context = interfaceC2107nN;
                    Throwable th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        jVar2.f6195n = th3;
                        jVar2.f6194O = 3;
                        if (Cp.Ml.n(context, th2, jVar2) != coroutine_suspended) {
                            throw th3;
                        }
                    }
                }
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        ExportOutcome exportOutcome2 = (ExportOutcome) jVar2.f6195n;
                        ResultKt.throwOnFailure(obj);
                        return exportOutcome2;
                    }
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th4 = (Throwable) jVar2.f6195n;
                    ResultKt.throwOnFailure(obj);
                    throw th4;
                }
                w6Var = (Cp.w6) jVar2.f6195n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    e = e5;
                    exportOutcome = new ExportOutcome(null, e);
                }
            }
            exportOutcome = new ExportOutcome(null, null);
            jVar2.f6195n = exportOutcome;
            jVar2.f6194O = 2;
            return Cp.Ml.n(w6Var, null, jVar2) == coroutine_suspended ? coroutine_suspended : exportOutcome;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
