package KfI;

import GJW.Lu;
import android.util.Log;
import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class UGc implements com.google.firebase.sessions.fuX {
    private static final n J2 = new n(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TFv.Wre f5664O;
    private final AtomicReference nr;
    private final CoroutineContext rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataStore f5665t;

    public static final class I28 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f5666n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ UGc f5667t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f5668n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ UGc f5669t;

            /* JADX INFO: renamed from: KfI.UGc$I28$j$j, reason: collision with other inner class name */
            public static final class C0192j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f5671n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f5672t;

                public C0192j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f5671n = obj;
                    this.f5672t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, UGc uGc) {
                this.f5668n = cn3;
                this.f5669t = uGc;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0192j c0192j;
                if (continuation instanceof C0192j) {
                    c0192j = (C0192j) continuation;
                    int i2 = c0192j.f5672t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0192j.f5672t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0192j = new C0192j(continuation);
                    }
                }
                Object obj2 = c0192j.f5671n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0192j.f5672t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f5668n;
                    qz qzVarUo = this.f5669t.Uo((Preferences) obj);
                    c0192j.f5672t = 1;
                    if (cn3.rl(qzVarUo, c0192j) == coroutine_suspended) {
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

        public I28(TFv.Wre wre, UGc uGc) {
            this.f5666n = wre;
            this.f5667t = uGc;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f5666n.n(new j(cn3, this.f5667t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f5673O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5674n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f5675t;

        Ml(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Throwable th, Continuation continuation) {
            Ml ml = new Ml(continuation);
            ml.f5675t = cn3;
            ml.f5673O = th;
            return ml.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5674n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f5675t;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f5673O);
                Preferences preferencesN = PreferencesFactory.n();
                this.f5675t = null;
                this.f5674n = 1;
                if (cn3.rl(preferencesN, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f5676O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5677n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f5679O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5680n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f5681t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(String str, Continuation continuation) {
                super(2, continuation);
                this.f5679O = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f5679O, continuation);
                jVar.f5681t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5680n == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((MutablePreferences) this.f5681t).mUb(w6.f5685n.n(), this.f5679O);
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(String str, Continuation continuation) {
            super(2, continuation);
            this.f5676O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return UGc.this.new Wre(this.f5676O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5677n;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    DataStore dataStore = UGc.this.f5665t;
                    j jVar = new j(this.f5676O, null);
                    this.f5677n = 1;
                    if (PreferencesKt.n(dataStore, jVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (IOException e2) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e2);
            }
            return Unit.INSTANCE;
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5682n;

        /* JADX INFO: renamed from: KfI.UGc$j$j, reason: collision with other inner class name */
        static final class C0193j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ UGc f5684n;

            C0193j(UGc uGc) {
                this.f5684n = uGc;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(qz qzVar, Continuation continuation) {
                this.f5684n.nr.set(qzVar);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return UGc.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5682n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wre = UGc.this.f5664O;
                C0193j c0193j = new C0193j(UGc.this);
                this.f5682n = 1;
                if (wre.n(c0193j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f5685n = new w6();
        private static final Preferences.Key rl = PreferencesKeys.Uo("session_id");

        public final Preferences.Key n() {
            return rl;
        }

        private w6() {
        }
    }

    public UGc(CoroutineContext backgroundDispatcher, DataStore dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.rl = backgroundDispatcher;
        this.f5665t = dataStore;
        this.nr = new AtomicReference();
        this.f5664O = new I28(TFv.fuX.Uo(dataStore.getData(), new Ml(null)), this);
        GJW.C.nr(Lu.n(backgroundDispatcher), null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qz Uo(Preferences preferences) {
        return new qz((String) preferences.rl(w6.f5685n.n()));
    }

    @Override // com.google.firebase.sessions.fuX
    public String n() {
        qz qzVar = (qz) this.nr.get();
        if (qzVar != null) {
            return qzVar.n();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.fuX
    public void rl(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        GJW.C.nr(Lu.n(this.rl), null, null, new Wre(sessionId, null), 3, null);
    }
}
