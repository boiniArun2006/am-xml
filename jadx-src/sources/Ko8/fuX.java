package Ko8;

import GJW.OU;
import GJW.vd;
import Ko8.fuX;
import QmE.iF;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneType;
import ga6.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class fuX implements Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f5811n;
    private final iF rl;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f5812O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5813n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Continuation continuation) {
            super(2, continuation);
            this.f5812O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new j(this.f5812O, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement O(Scene scene) {
            if (scene.getType() == SceneType.PRESET) {
                if (scene.getElements().size() == 1) {
                    return SceneElement.copy$default(scene.getElements().get(0), null, 0, 0, 0L, null, scene.getTitle(), null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -33, 127, null);
                }
                throw new IllegalStateException("Check failed.");
            }
            throw new IllegalStateException("Check failed.");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5813n == 0) {
                ResultKt.throwOnFailure(obj);
                x0X.n nVarN = fuX.this.f5811n.n(this.f5812O);
                fuX fux = fuX.this;
                if (nVarN instanceof n.C1266n) {
                    return nVarN;
                }
                if (nVarN instanceof n.w6) {
                    final Scene scene = (Scene) ((n.w6) nVarN).n();
                    return M3.j.rl(M3.n.n(x0X.w6.n(new Function0() { // from class: Ko8.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return fuX.j.O(scene);
                        }
                    }), j.w6.f67628O, j.EnumC0949j.f67618r, j.n.f67621O, "A project exists for the given project ID but it is not a preset."), fux.rl);
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public fuX(o getSceneByProjectIdUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(getSceneByProjectIdUseCase, "getSceneByProjectIdUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f5811n = getSceneByProjectIdUseCase;
        this.rl = eventLogger;
    }

    @Override // Ko8.Wre
    public Object n(String str, Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new j(str, null), continuation);
    }
}
