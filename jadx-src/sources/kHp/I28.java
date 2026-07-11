package kHp;

import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class I28 implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataStore f69802n;

    public static final class j implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f69803n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Preferences.Key f69804t;

        /* JADX INFO: renamed from: kHp.I28$j$j, reason: collision with other inner class name */
        public static final class C1018j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f69805n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Preferences.Key f69806t;

            /* JADX INFO: renamed from: kHp.I28$j$j$j, reason: collision with other inner class name */
            public static final class C1019j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f69808n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f69809t;

                public C1019j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f69808n = obj;
                    this.f69809t |= Integer.MIN_VALUE;
                    return C1018j.this.rl(null, this);
                }
            }

            public C1018j(TFv.CN3 cn3, Preferences.Key key) {
                this.f69805n = cn3;
                this.f69806t = key;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1019j c1019j;
                if (continuation instanceof C1019j) {
                    c1019j = (C1019j) continuation;
                    int i2 = c1019j.f69809t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1019j.f69809t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1019j = new C1019j(continuation);
                    }
                }
                Object obj2 = c1019j.f69808n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1019j.f69809t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f69805n;
                    Object objRl = ((Preferences) obj).rl(this.f69806t);
                    c1019j.f69809t = 1;
                    if (cn3.rl(objRl, c1019j) == coroutine_suspended) {
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

        public j(TFv.Wre wre, Preferences.Key key) {
            this.f69803n = wre;
            this.f69804t = key;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f69803n.n(new C1018j(cn3, this.f69804t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Preferences.Key f69810O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69811n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69812t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Preferences.Key key, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f69810O = key;
            this.J2 = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f69810O, this.J2, continuation);
            nVar.f69812t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f69811n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f69812t).mUb(this.f69810O, this.J2);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((n) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public I28(DataStore datastore) {
        Intrinsics.checkNotNullParameter(datastore, "datastore");
        this.f69802n = datastore;
    }

    @Override // kHp.Ml
    public Object n(Preferences.Key key, Continuation continuation) {
        return TFv.fuX.g(new j(this.f69802n.getData(), key), continuation);
    }

    @Override // kHp.Ml
    public Object rl(Preferences.Key key, Object obj, Continuation continuation) {
        Object objN = PreferencesKt.n(this.f69802n, new n(key, obj, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
