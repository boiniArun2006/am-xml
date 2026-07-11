package v5Z;

import GJW.Pl;
import GJW.eO;
import Sa.AbstractC1468n;
import Sa.C1467j;
import android.content.Context;
import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import com.alightcreative.app.motion.templates.Template;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j implements pP.Wre {
    public static final C1238j gh = new C1238j(null);
    public static final int qie = 8;
    private final Preferences.Key J2;
    private final TFv.Wre KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Preferences.Key f74610O;
    private final Preferences.Key Uo;
    private final TFv.Wre mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataStore f74611n;
    private final Object nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f74612t;
    private final TFv.Wre xMQ;

    public static final class CN3 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f74613n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f74614t;

        /* JADX INFO: renamed from: v5Z.j$CN3$j, reason: collision with other inner class name */
        public static final class C1231j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f74615n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ j f74616t;

            /* JADX INFO: renamed from: v5Z.j$CN3$j$j, reason: collision with other inner class name */
            public static final class C1232j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f74618n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f74619t;

                public C1232j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f74618n = obj;
                    this.f74619t |= Integer.MIN_VALUE;
                    return C1231j.this.rl(null, this);
                }
            }

            public C1231j(TFv.CN3 cn3, j jVar) {
                this.f74615n = cn3;
                this.f74616t = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1232j c1232j;
                if (continuation instanceof C1232j) {
                    c1232j = (C1232j) continuation;
                    int i2 = c1232j.f74619t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1232j.f74619t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1232j = new C1232j(continuation);
                    }
                }
                Object obj2 = c1232j.f74618n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1232j.f74619t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f74615n;
                    Boolean bool = (Boolean) ((Preferences) obj).rl(this.f74616t.Uo);
                    Boolean boolBoxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
                    c1232j.f74619t = 1;
                    if (cn3.rl(boolBoxBoolean, c1232j) == coroutine_suspended) {
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

        public CN3(TFv.Wre wre, j jVar) {
            this.f74613n = wre;
            this.f74614t = jVar;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f74613n.n(new C1231j(cn3, this.f74614t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74621n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74622t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(String str, Continuation continuation) {
            super(2, continuation);
            this.J2 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Dsr dsr = j.this.new Dsr(this.J2, continuation);
            dsr.f74622t = obj;
            return dsr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Set setPlus;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f74621n == 0) {
                ResultKt.throwOnFailure(obj);
                Preferences preferences = (Preferences) this.f74622t;
                Set setEmptySet = (Set) preferences.rl(j.this.J2);
                if (setEmptySet == null) {
                    setEmptySet = SetsKt.emptySet();
                }
                if (setEmptySet.contains(this.J2)) {
                    setPlus = SetsKt.minus((Set<? extends String>) setEmptySet, this.J2);
                } else {
                    setPlus = SetsKt.plus((Set<? extends String>) setEmptySet, this.J2);
                }
                MutablePreferences mutablePreferencesT = preferences.t();
                mutablePreferencesT.mUb(j.this.J2, setPlus);
                return mutablePreferencesT;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Preferences preferences, Continuation continuation) {
            return ((Dsr) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class I28 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f74623n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f74624t;

        /* JADX INFO: renamed from: v5Z.j$I28$j, reason: collision with other inner class name */
        public static final class C1233j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f74625n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ j f74626t;

            /* JADX INFO: renamed from: v5Z.j$I28$j$j, reason: collision with other inner class name */
            public static final class C1234j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f74628n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f74629t;

                public C1234j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f74628n = obj;
                    this.f74629t |= Integer.MIN_VALUE;
                    return C1233j.this.rl(null, this);
                }
            }

            public C1233j(TFv.CN3 cn3, j jVar) {
                this.f74625n = cn3;
                this.f74626t = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1234j c1234j;
                if (continuation instanceof C1234j) {
                    c1234j = (C1234j) continuation;
                    int i2 = c1234j.f74629t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1234j.f74629t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1234j = new C1234j(continuation);
                    }
                }
                Object obj2 = c1234j.f74628n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1234j.f74629t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f74625n;
                    Set setEmptySet = (Set) ((Preferences) obj).rl(this.f74626t.f74610O);
                    if (setEmptySet == null) {
                        setEmptySet = SetsKt.emptySet();
                    }
                    c1234j.f74629t = 1;
                    if (cn3.rl(setEmptySet, c1234j) == coroutine_suspended) {
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

        public I28(TFv.Wre wre, j jVar) {
            this.f74623n = wre;
            this.f74624t = jVar;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f74623n.n(new C1233j(cn3, this.f74624t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74631n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74632t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(boolean z2, Continuation continuation) {
            super(2, continuation);
            this.J2 = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = j.this.new Ml(this.J2, continuation);
            ml.f74632t = obj;
            return ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f74631n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f74632t).mUb(j.this.Uo, Boxing.boxBoolean(this.J2));
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

    public static final class Wre implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f74633n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f74634t;

        /* JADX INFO: renamed from: v5Z.j$Wre$j, reason: collision with other inner class name */
        public static final class C1235j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f74635n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ j f74636t;

            /* JADX INFO: renamed from: v5Z.j$Wre$j$j, reason: collision with other inner class name */
            public static final class C1236j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f74638n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f74639t;

                public C1236j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f74638n = obj;
                    this.f74639t |= Integer.MIN_VALUE;
                    return C1235j.this.rl(null, this);
                }
            }

            public C1235j(TFv.CN3 cn3, j jVar) {
                this.f74635n = cn3;
                this.f74636t = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1236j c1236j;
                if (continuation instanceof C1236j) {
                    c1236j = (C1236j) continuation;
                    int i2 = c1236j.f74639t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1236j.f74639t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1236j = new C1236j(continuation);
                    }
                }
                Object obj2 = c1236j.f74638n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1236j.f74639t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f74635n;
                    Set setEmptySet = (Set) ((Preferences) obj).rl(this.f74636t.J2);
                    if (setEmptySet == null) {
                        setEmptySet = SetsKt.emptySet();
                    }
                    c1236j.f74639t = 1;
                    if (cn3.rl(setEmptySet, c1236j) == coroutine_suspended) {
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

        public Wre(TFv.Wre wre, j jVar) {
            this.f74633n = wre;
            this.f74634t = jVar;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f74633n.n(new C1235j(cn3, this.f74634t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class fuX extends SuspendLambda implements Function1 {
        final /* synthetic */ j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f74640O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74641n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f74642t;

        /* JADX INFO: renamed from: v5Z.j$fuX$j, reason: collision with other inner class name */
        static final class C1237j implements Response.Listener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Pl f74643n;

            C1237j(Pl pl) {
                this.f74643n = pl;
            }

            @Override // com.android.volley.Response.Listener
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final void onResponse(String str) {
                Pl pl = this.f74643n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            }
        }

        static final class n implements Response.ErrorListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Pl f74644n;

            n(Pl pl) {
                this.f74644n = pl;
            }

            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                Pl pl = this.f74644n;
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.checkNotNull(volleyError);
                pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(volleyError)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(String str, j jVar, Continuation continuation) {
            super(1, continuation);
            this.f74640O = str;
            this.J2 = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new fuX(this.f74640O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74642t;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (!StringsKt.isBlank(this.f74640O)) {
                    String str = this.J2.rl + "/v1/templates/public-templates/" + this.f74640O + "/increment-downloads-count";
                    this.f74641n = str;
                    this.f74642t = 1;
                    eO eOVar = new eO(IntrinsicsKt.intercepted(this), 1);
                    eOVar.e();
                    AbstractC1468n.n().add(new StringRequest(1, str, new C1237j(eOVar), new n(eOVar)));
                    Object objWPU = eOVar.WPU();
                    if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (objWPU == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalArgumentException("Template ID must not be blank");
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((fuX) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: v5Z.j$j, reason: collision with other inner class name */
    public static final class C1238j {
        public /* synthetic */ C1238j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1238j() {
        }
    }

    static final class n extends SuspendLambda implements Function1 {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f74645O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74646n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ j f74647r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f74648t;

        /* JADX INFO: renamed from: v5Z.j$n$j, reason: collision with other inner class name */
        public static final class C1239j implements Response.Listener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Pl f74649n;

            public C1239j(Pl pl) {
                this.f74649n = pl;
            }

            @Override // com.android.volley.Response.Listener
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final void onResponse(List list) {
                Object objM313constructorimpl = Result.m313constructorimpl(list);
                Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
                if (thM316exceptionOrNullimpl == null) {
                    this.f74649n.resumeWith(Result.m313constructorimpl((List) objM313constructorimpl));
                } else {
                    this.f74649n.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl)));
                }
            }
        }

        /* JADX INFO: renamed from: v5Z.j$n$n, reason: collision with other inner class name */
        public static final class C1240n implements Response.ErrorListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Pl f74650n;

            public C1240n(Pl pl) {
                this.f74650n = pl;
            }

            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.checkNotNull(volleyError);
                Object objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(volleyError));
                Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
                if (thM316exceptionOrNullimpl == null) {
                    this.f74650n.resumeWith(Result.m313constructorimpl((List) objM313constructorimpl));
                } else {
                    this.f74650n.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl)));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i2, boolean z2, j jVar, Continuation continuation) {
            super(1, continuation);
            this.f74645O = i2;
            this.J2 = z2;
            this.f74647r = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f74645O, this.J2, this.f74647r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74648t;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.f74645O >= 0) {
                    if (!this.J2) {
                        Object obj2 = this.f74647r.nr;
                        j jVar = this.f74647r;
                        int i3 = this.f74645O;
                        synchronized (obj2) {
                            List list = (List) jVar.f74612t.get(Boxing.boxInt(i3));
                            if (list != null) {
                                return list;
                            }
                        }
                    }
                    int i5 = this.f74645O * 200;
                    String str = this.f74647r.rl + "/v1/templates/public-templates?limit=200&offset=" + i5;
                    this.f74646n = str;
                    this.f74648t = 1;
                    eO eOVar = new eO(IntrinsicsKt.intercepted(this), 1);
                    eOVar.e();
                    AbstractC1468n.n().add(new C1467j(str, Template.class, new C1239j(eOVar), new C1240n(eOVar)));
                    obj = eOVar.WPU();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalArgumentException("Page must be non-negative");
                }
            }
            List list2 = (List) obj;
            Object obj3 = this.f74647r.nr;
            j jVar2 = this.f74647r;
            int i7 = this.f74645O;
            synchronized (obj3) {
                jVar2.f74612t.put(Boxing.boxInt(i7), list2);
                Unit unit = Unit.INSTANCE;
            }
            return list2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74652n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74653t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str, Continuation continuation) {
            super(2, continuation);
            this.J2 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = j.this.new w6(this.J2, continuation);
            w6Var.f74653t = obj;
            return w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f74652n == 0) {
                ResultKt.throwOnFailure(obj);
                Preferences preferences = (Preferences) this.f74653t;
                Set setEmptySet = (Set) preferences.rl(j.this.f74610O);
                if (setEmptySet == null) {
                    setEmptySet = SetsKt.emptySet();
                }
                MutablePreferences mutablePreferencesT = preferences.t();
                mutablePreferencesT.mUb(j.this.f74610O, SetsKt.plus((Set<? extends String>) setEmptySet, this.J2));
                return mutablePreferencesT;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Preferences preferences, Continuation continuation) {
            return ((w6) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DataStore dataStoreRl = v5Z.n.rl(context);
        this.f74611n = dataStoreRl;
        this.rl = "https://alight-motion.bendingspoons.com";
        this.f74612t = new LinkedHashMap();
        this.nr = new Object();
        this.f74610O = PreferencesKeys.KN("seenTemplateIdsKey");
        this.J2 = PreferencesKeys.KN("savedTemplateIdsKey");
        this.Uo = PreferencesKeys.n("hasEverSwipedReelsVerticallyKey");
        this.KN = new I28(dataStoreRl.getData(), this);
        this.xMQ = new Wre(dataStoreRl.getData(), this);
        this.mUb = new CN3(dataStoreRl.getData(), this);
    }

    @Override // pP.Wre
    public TFv.Wre J2() {
        return this.mUb;
    }

    @Override // pP.Wre
    public TFv.Wre KN() {
        return this.xMQ;
    }

    @Override // pP.Wre
    public Object O(int i2, boolean z2, Continuation continuation) {
        return x0X.w6.Uo(new n(i2, z2, this, null), continuation);
    }

    @Override // pP.Wre
    public TFv.Wre Uo() {
        return this.KN;
    }

    @Override // pP.Wre
    public Object n(boolean z2, Continuation continuation) {
        Object objN = PreferencesKt.n(this.f74611n, new Ml(z2, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    @Override // pP.Wre
    public Object nr(String str, Continuation continuation) {
        Object objN = this.f74611n.n(new w6(str, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    @Override // pP.Wre
    public Object rl(String str, Continuation continuation) {
        return x0X.w6.Uo(new fuX(str, this, null), continuation);
    }

    @Override // pP.Wre
    public Object t(String str, Continuation continuation) {
        Object objN = this.f74611n.n(new Dsr(str, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
