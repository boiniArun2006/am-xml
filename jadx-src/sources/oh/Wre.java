package oh;

import TFv.fuX;
import ajd.j;
import android.content.Context;
import androidx.content.core.DataStore;
import com.bendingspoons.oracle.models.IdentityToken;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre implements oh.I28 {
    private final TFv.Wre J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TFv.Wre f71529O;
    private final rB.Ml nr;
    private final DataStore rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataStore f71530t;

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71531n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f71532t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(String str, Continuation continuation) {
            super(2, continuation);
            this.f71532t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new CN3(this.f71532t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((CN3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f71531n == 0) {
                ResultKt.throwOnFailure(obj);
                return this.f71532t;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71533n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ IdentityToken f71534t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(IdentityToken identityToken, Continuation continuation) {
            super(2, continuation);
            this.f71534t = identityToken;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I28(this.f71534t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((I28) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f71533n == 0) {
                ResultKt.throwOnFailure(obj);
                return this.f71534t.getToken();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71536n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f71537t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71537t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Wre.this.rl(null, this);
        }
    }

    /* JADX INFO: renamed from: oh.Wre$Wre, reason: collision with other inner class name */
    static final class C1085Wre extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71539n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f71540t;

        C1085Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71540t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Wre.this.nr(null, this);
        }
    }

    static final class j extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71542n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f71543t;

        j(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Throwable th, Continuation continuation) {
            j jVar = Wre.this.new j(continuation);
            jVar.f71543t = cn3;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71542n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f71543t;
                rB.I28.rl(Wre.this.nr, CollectionsKt.listOf("read_state"), j.EnumC0481j.J2, "Could not read identity token", null, null, 24, null);
                this.f71542n = 1;
                if (cn3.rl(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71545n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f71546t;

        n(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Throwable th, Continuation continuation) {
            n nVar = Wre.this.new n(continuation);
            nVar.f71546t = cn3;
            return nVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71545n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f71546t;
                rB.I28.rl(Wre.this.nr, CollectionsKt.listOf("read_state"), j.EnumC0481j.J2, "Could not read refresh token", null, null, 24, null);
                this.f71545n = 1;
                if (cn3.rl(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class w6 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f71547n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f71548t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f71549n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Wre f71550t;

            /* JADX INFO: renamed from: oh.Wre$w6$j$j, reason: collision with other inner class name */
            public static final class C1086j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f71552n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f71553t;

                public C1086j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f71552n = obj;
                    this.f71553t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, Wre wre) {
                this.f71549n = cn3;
                this.f71550t = wre;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1086j c1086j;
                if (continuation instanceof C1086j) {
                    c1086j = (C1086j) continuation;
                    int i2 = c1086j.f71553t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1086j.f71553t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1086j = new C1086j(continuation);
                    }
                }
                C1086j c1086j2 = c1086j;
                Object obj2 = c1086j2.f71552n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1086j2.f71553t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f71549n;
                    String str = (String) obj;
                    IdentityToken identityTokenRl = null;
                    if (str != null) {
                        try {
                            identityTokenRl = IdentityToken.INSTANCE.rl(str);
                        } catch (Exception e2) {
                            rB.I28.rl(this.f71550t.nr, CollectionsKt.listOf("read_state"), j.EnumC0481j.J2, "Could not parse identity token: " + e2.getMessage(), null, null, 24, null);
                        }
                    }
                    c1086j2.f71553t = 1;
                    if (cn3.rl(identityTokenRl, c1086j2) == coroutine_suspended) {
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

        public w6(TFv.Wre wre, Wre wre2) {
            this.f71547n = wre;
            this.f71548t = wre2;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f71547n.n(new j(cn3, this.f71548t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public Wre(Context context, rB.Ml spiderSense) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        oh.j jVar = new oh.j(context);
        this.rl = jVar;
        oh.n nVar = new oh.n(context);
        this.f71530t = nVar;
        this.nr = d3.j.J2(spiderSense, "oracle", "auth_persistence");
        this.f71529O = new w6(fuX.Uo(jVar.getData(), new j(null)), this);
        this.J2 = fuX.Uo(nVar.getData(), new n(null));
    }

    @Override // oh.I28
    public TFv.Wre n() {
        return this.J2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oh.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(String str, Continuation continuation) throws Exception {
        C1085Wre c1085Wre;
        Exception exc;
        Wre wre;
        if (continuation instanceof C1085Wre) {
            c1085Wre = (C1085Wre) continuation;
            int i2 = c1085Wre.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1085Wre.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c1085Wre = new C1085Wre(continuation);
            }
        }
        Object objN = c1085Wre.f71540t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1085Wre.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            try {
                DataStore dataStore = this.f71530t;
                CN3 cn3 = new CN3(str, null);
                c1085Wre.f71539n = this;
                c1085Wre.J2 = 1;
                objN = dataStore.n(cn3, c1085Wre);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wre = this;
            } catch (Exception e2) {
                exc = e2;
                wre = this;
                rB.I28.rl(wre.nr, CollectionsKt.listOf("write_state"), j.EnumC0481j.J2, "Could not store refresh token: " + exc.getMessage(), null, null, 24, null);
                throw exc;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre = (Wre) c1085Wre.f71539n;
            try {
                ResultKt.throwOnFailure(objN);
            } catch (Exception e3) {
                exc = e3;
                rB.I28.rl(wre.nr, CollectionsKt.listOf("write_state"), j.EnumC0481j.J2, "Could not store refresh token: " + exc.getMessage(), null, null, 24, null);
                throw exc;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oh.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(IdentityToken identityToken, Continuation continuation) throws Exception {
        Ml ml;
        Exception exc;
        Wre wre;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objN = ml.f71537t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            try {
                DataStore dataStore = this.rl;
                I28 i28 = new I28(identityToken, null);
                ml.f71536n = this;
                ml.J2 = 1;
                objN = dataStore.n(i28, ml);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wre = this;
            } catch (Exception e2) {
                exc = e2;
                wre = this;
                rB.I28.rl(wre.nr, CollectionsKt.listOf("write_state"), j.EnumC0481j.J2, "Could not store identity token: " + exc.getMessage(), null, null, 24, null);
                throw exc;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre = (Wre) ml.f71536n;
            try {
                ResultKt.throwOnFailure(objN);
            } catch (Exception e3) {
                exc = e3;
                rB.I28.rl(wre.nr, CollectionsKt.listOf("write_state"), j.EnumC0481j.J2, "Could not store identity token: " + exc.getMessage(), null, null, 24, null);
                throw exc;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // oh.I28
    public TFv.Wre t() {
        return this.f71529O;
    }
}
