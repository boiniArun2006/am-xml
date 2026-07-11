package DTN;

import android.content.Context;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f1469n;
    private final TFv.Wre rl;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f1470O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1471n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f1472t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f1470O = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f1470O, continuation);
            jVar.f1472t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1471n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f1472t).mUb(Wre.f1479t, Boxing.boxBoolean(this.f1470O));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((j) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class n implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f1473n;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f1474n;

            /* JADX INFO: renamed from: DTN.Ml$n$j$j, reason: collision with other inner class name */
            public static final class C0057j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f1476n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f1477t;

                public C0057j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f1476n = obj;
                    this.f1477t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f1474n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0057j c0057j;
                if (continuation instanceof C0057j) {
                    c0057j = (C0057j) continuation;
                    int i2 = c0057j.f1477t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0057j.f1477t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0057j = new C0057j(continuation);
                    }
                }
                Object obj2 = c0057j.f1476n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0057j.f1477t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f1474n;
                    Boolean bool = (Boolean) ((Preferences) obj).rl(Wre.f1479t);
                    Boolean boolBoxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
                    c0057j.f1477t = 1;
                    if (cn3.rl(boolBoxBoolean, c0057j) == coroutine_suspended) {
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
            this.f1473n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f1473n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public Ml(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1469n = context;
        this.rl = new n(Wre.nr(context).getData());
    }

    public final TFv.Wre n() {
        return this.rl;
    }

    public final Object rl(boolean z2, Continuation continuation) {
        Object objN = PreferencesKt.n(Wre.nr(this.f1469n), new j(z2, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public final Object t(Continuation continuation) {
        return TFv.fuX.ViF(this.rl, continuation);
    }
}
