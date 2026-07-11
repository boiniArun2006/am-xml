package jgV;

import TFv.CN3;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.pico.domain.entities.additionalInfo.pico.PicoAdditionalInfo;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Ml {

    public static final class j implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f69606n;

        /* JADX INFO: renamed from: jgV.Ml$j$j, reason: collision with other inner class name */
        public static final class C0996j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f69607n;

            /* JADX INFO: renamed from: jgV.Ml$j$j$j, reason: collision with other inner class name */
            public static final class C0997j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f69609n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f69610t;

                public C0997j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f69609n = obj;
                    this.f69610t |= Integer.MIN_VALUE;
                    return C0996j.this.rl(null, this);
                }
            }

            public C0996j(CN3 cn3) {
                this.f69607n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0997j c0997j;
                if (continuation instanceof C0997j) {
                    c0997j = (C0997j) continuation;
                    int i2 = c0997j.f69610t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0997j.f69610t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0997j = new C0997j(continuation);
                    }
                }
                Object obj2 = c0997j.f69609n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0997j.f69610t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    CN3 cn3 = this.f69607n;
                    Map<String, Integer> experiments = ((OracleResponse) obj).getSettings().getExperiments();
                    c0997j.f69610t = 1;
                    if (cn3.rl(experiments, c0997j) == coroutine_suspended) {
                        return coroutine_suspended;
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
            this.f69606n = wre;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f69606n.n(new C0996j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class n implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f69611n;

        public static final class j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f69612n;

            /* JADX INFO: renamed from: jgV.Ml$n$j$j, reason: collision with other inner class name */
            public static final class C0998j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f69614n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f69615t;

                public C0998j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f69614n = obj;
                    this.f69615t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(CN3 cn3) {
                this.f69612n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0998j c0998j;
                if (continuation instanceof C0998j) {
                    c0998j = (C0998j) continuation;
                    int i2 = c0998j.f69615t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0998j.f69615t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0998j = new C0998j(continuation);
                    }
                }
                Object obj2 = c0998j.f69614n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0998j.f69615t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    CN3 cn3 = this.f69612n;
                    OracleResponse oracleResponse = (OracleResponse) obj;
                    PicoAdditionalInfo.Monetization monetization = new PicoAdditionalInfo.Monetization(!oracleResponse.getMe().getActiveSubscriptions().isEmpty() || oracleResponse.getSettings().isFreeUser(), Boxing.boxBoolean(oracleResponse.getSettings().isFreeUser()));
                    c0998j.f69615t = 1;
                    if (cn3.rl(monetization, c0998j) == coroutine_suspended) {
                        return coroutine_suspended;
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

        public n(TFv.Wre wre) {
            this.f69611n = wre;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f69611n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final TFv.Wre n(qu.I28 i28) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        return new n(qu.Wre.t(i28));
    }

    public static final TFv.Wre rl(qu.I28 i28) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        return new j(qu.Wre.t(i28));
    }
}
