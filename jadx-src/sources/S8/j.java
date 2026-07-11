package S8;

import TFv.CN3;
import TFv.Wre;
import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements S3.w6 {
    private final DataStore rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0303j f8930t = new C0303j(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Preferences.Key f8929O = PreferencesKeys.Uo("favourite_experiment");

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f8931O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8932n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f8933t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(String str, Continuation continuation) {
            super(2, continuation);
            this.f8931O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = new Ml(this.f8931O, continuation);
            ml.f8933t = obj;
            return ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8932n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f8933t).mUb(j.f8929O, this.f8931O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((Ml) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: S8.j$j, reason: collision with other inner class name */
    public static final class C0303j {
        public /* synthetic */ C0303j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0303j() {
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f8934n;

        /* JADX INFO: renamed from: S8.j$n$j, reason: collision with other inner class name */
        public static final class C0304j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f8935n;

            /* JADX INFO: renamed from: S8.j$n$j$j, reason: collision with other inner class name */
            public static final class C0305j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f8937n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f8938t;

                public C0305j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f8937n = obj;
                    this.f8938t |= Integer.MIN_VALUE;
                    return C0304j.this.rl(null, this);
                }
            }

            public C0304j(CN3 cn3) {
                this.f8935n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0305j c0305j;
                if (continuation instanceof C0305j) {
                    c0305j = (C0305j) continuation;
                    int i2 = c0305j.f8938t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0305j.f8938t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0305j = new C0305j(continuation);
                    }
                }
                Object obj2 = c0305j.f8937n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0305j.f8938t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    CN3 cn3 = this.f8935n;
                    Object objRl = ((Preferences) obj).rl(j.f8929O);
                    c0305j.f8938t = 1;
                    if (cn3.rl(objRl, c0305j) == coroutine_suspended) {
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

        public n(Wre wre) {
            this.f8934n = wre;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f8934n.n(new C0304j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8939n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f8940t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(continuation);
            w6Var.f8940t = obj;
            return w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8939n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f8940t).xMQ(j.f8929O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((w6) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public j(DataStore dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.rl = dataStore;
    }

    @Override // S3.w6
    public Wre n() {
        return new n(this.rl.getData());
    }

    @Override // S3.w6
    public Object rl(Continuation continuation) {
        Object objN = PreferencesKt.n(this.rl, new w6(null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    @Override // S3.w6
    public Object t(String str, Continuation continuation) {
        Object objN = PreferencesKt.n(this.rl, new Ml(str, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
