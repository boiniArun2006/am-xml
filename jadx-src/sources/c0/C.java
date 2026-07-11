package c0;

import TFv.Lu;
import TFv.SPz;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C implements Z.Dsr, LayoutModifier {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SPz f43448n = Lu.n(Constraints.n(AbstractC1676c.KN()));

    public static final class j implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f43449n;

        /* JADX INFO: renamed from: c0.C$j$j, reason: collision with other inner class name */
        public static final class C0580j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f43450n;

            /* JADX INFO: renamed from: c0.C$j$j$j, reason: collision with other inner class name */
            public static final class C0581j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f43452n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f43453t;

                public C0581j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f43452n = obj;
                    this.f43453t |= Integer.MIN_VALUE;
                    return C0580j.this.rl(null, this);
                }
            }

            public C0580j(TFv.CN3 cn3) {
                this.f43450n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0581j c0581j;
                if (continuation instanceof C0581j) {
                    c0581j = (C0581j) continuation;
                    int i2 = c0581j.f43453t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0581j.f43453t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0581j = new C0581j(continuation);
                    }
                }
                Object obj2 = c0581j.f43452n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0581j.f43453t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f43450n;
                    Z.fuX fuxCk = AbstractC1676c.ck(((Constraints) obj).getValue());
                    if (fuxCk != null) {
                        c0581j.f43453t = 1;
                        if (cn3.rl(fuxCk, c0581j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public j(TFv.Wre wre) {
            this.f43449n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f43449n.n(new C0580j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.xMQ(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @Override // Z.Dsr
    public Object n(Continuation continuation) {
        return TFv.fuX.ViF(new j(this.f43448n), continuation);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        this.f43448n.setValue(Constraints.n(j2));
        final Placeable placeableDR0 = measurable.dR0(j2);
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1() { // from class: c0.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C.t(placeableDR0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }
}
