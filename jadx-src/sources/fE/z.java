package fE;

import GJW.OU;
import GJW.vd;
import android.content.Context;
import android.content.SharedPreferences;
import com.bendingspoons.monopoly.product.RecurrenceMode;
import com.bendingspoons.monopoly.product.SubscriptionProduct;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import foC.j;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class z implements eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final foC.j f66848n;
    private final j.C0927j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f66847t = new j(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Moshi f66846O = et.w6.nr(null, CollectionsKt.listOf(PolymorphicJsonAdapterFactory.of(RecurrenceMode.class, "type").withSubtype(RecurrenceMode.InfiniteRecurring.class, "infinite_recurring").withSubtype(RecurrenceMode.NonRecurring.class, "non_recurring").withSubtype(RecurrenceMode.FiniteRecurring.class, "finite_recurring")), 1, null);

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66849n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return z.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f66849n == 0) {
                ResultKt.throwOnFailure(obj);
                foC.j jVarXMQ = z.this.xMQ();
                j.C0927j c0927j = z.this.rl;
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                synchronized (jVarXMQ) {
                    try {
                        if (jVarXMQ.t()) {
                            jVarXMQ.O().put(c0927j, boolBoxBoolean);
                        }
                        String strN = c0927j.n();
                        SharedPreferences.Editor editorEdit = jVarXMQ.J2().edit();
                        editorEdit.putBoolean(strN, boolBoxBoolean.booleanValue());
                        editorEdit.apply();
                        jVarXMQ.n(c0927j, boolBoxBoolean);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final eO n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new z(new foC.j("Monopoly", context, false, false, z.f66846O, null, null, 100, null));
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66851n;

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ foC.j f66853n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f66854t;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                try {
                    String string = this.f66853n.J2().getString(this.f66854t, "");
                    if (string != null) {
                        return this.f66853n.nr().adapter(Boolean.class).fromJson(string);
                    }
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            }

            public j(foC.j jVar, String str) {
                this.f66853n = jVar;
                this.f66854t = str;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return z.this.new n(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0017, B:11:0x0022, B:13:0x0028, B:17:0x0036, B:23:0x0040, B:25:0x005b, B:44:0x00e6, B:47:0x00ee, B:27:0x006a, B:29:0x0076, B:30:0x0085, B:32:0x0091, B:33:0x00a2, B:35:0x00ae, B:36:0x00be, B:38:0x00ca, B:40:0x00d6, B:41:0x00d9, B:42:0x00e0, B:43:0x00e1), top: B:58:0x0017 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            boolean zBooleanValue;
            Object objInvoke;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f66851n == 0) {
                ResultKt.throwOnFailure(obj);
                foC.j jVarXMQ = z.this.xMQ();
                j.C0927j c0927j = z.this.rl;
                synchronized (jVarXMQ) {
                    obj2 = null;
                    zBooleanValue = false;
                    if (jVarXMQ.rl(c0927j)) {
                        if (jVarXMQ.t()) {
                            Object obj3 = jVarXMQ.O().get(c0927j);
                            if (obj3 instanceof Boolean) {
                                obj2 = obj3;
                            }
                            obj2 = (Boolean) obj2;
                            if (obj2 == null) {
                                String strN = c0927j.n();
                                j jVar = new j(jVarXMQ, strN);
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                    objInvoke = Boxing.boxBoolean(jVarXMQ.J2().getBoolean(strN, false));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                    objInvoke = (Boolean) Boxing.boxInt(jVarXMQ.J2().getInt(strN, 0));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                    objInvoke = (Boolean) Boxing.boxLong(jVarXMQ.J2().getLong(strN, 0L));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                    objInvoke = (Boolean) Boxing.boxFloat(jVarXMQ.J2().getFloat(strN, 0.0f));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                    Object string = jVarXMQ.J2().getString(strN, "");
                                    if (string != null) {
                                        objInvoke = (Boolean) string;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                    }
                                } else {
                                    objInvoke = jVar.invoke();
                                }
                                obj2 = objInvoke;
                                if (jVarXMQ.t() && obj2 != null) {
                                    jVarXMQ.O().put(c0927j, obj2);
                                }
                            }
                        }
                    }
                }
                Boolean bool = (Boolean) obj2;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66855n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return z.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f66855n == 0) {
                ResultKt.throwOnFailure(obj);
                foC.j jVarXMQ = z.this.xMQ();
                j.C0927j c0927j = z.this.rl;
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                synchronized (jVarXMQ) {
                    try {
                        if (jVarXMQ.t()) {
                            jVarXMQ.O().put(c0927j, boolBoxBoolean);
                        }
                        String strN = c0927j.n();
                        SharedPreferences.Editor editorEdit = jVarXMQ.J2().edit();
                        editorEdit.putBoolean(strN, boolBoxBoolean.booleanValue());
                        editorEdit.apply();
                        jVarXMQ.n(c0927j, boolBoxBoolean);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public z(foC.j storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f66848n = storage;
        this.rl = new j.C0927j("purchaseFailedKey");
    }

    @Override // fE.eO
    public Object n(Continuation continuation) {
        foC.j jVar = this.f66848n;
        j.C0927j c0927j = this.rl;
        Boolean boolBoxBoolean = Boxing.boxBoolean(false);
        synchronized (jVar) {
            try {
                if (jVar.t()) {
                    jVar.O().put(c0927j, boolBoxBoolean);
                }
                String strN = c0927j.n();
                SharedPreferences.Editor editorEdit = jVar.J2().edit();
                editorEdit.putBoolean(strN, boolBoxBoolean.booleanValue());
                editorEdit.apply();
                jVar.n(c0927j, boolBoxBoolean);
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0008, B:9:0x0013, B:11:0x0019, B:14:0x0026, B:20:0x0030, B:22:0x004c, B:40:0x00d5, B:43:0x00dd, B:23:0x005c, B:25:0x0068, B:26:0x0077, B:28:0x0083, B:29:0x0094, B:31:0x00a0, B:32:0x00b0, B:34:0x00bc, B:37:0x00c9, B:38:0x00d0, B:39:0x00d1), top: B:52:0x0008 }] */
    @Override // fE.eO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(String str, Continuation continuation) {
        Object objInvoke;
        j.C0927j c0927j = new j.C0927j(str);
        foC.j jVar = this.f66848n;
        synchronized (jVar) {
            if (!jVar.rl(c0927j)) {
                objInvoke = null;
            } else if (jVar.t()) {
                Object obj = jVar.O().get(c0927j);
                if (!(obj instanceof String)) {
                    obj = null;
                }
                objInvoke = (String) obj;
                if (objInvoke == null) {
                    String strN = c0927j.n();
                    QJ qj = new QJ(jVar, strN);
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        objInvoke = (String) Boxing.boxBoolean(jVar.J2().getBoolean(strN, false));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        objInvoke = (String) Boxing.boxInt(jVar.J2().getInt(strN, 0));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        objInvoke = (String) Boxing.boxLong(jVar.J2().getLong(strN, 0L));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                        objInvoke = (String) Boxing.boxFloat(jVar.J2().getFloat(strN, 0.0f));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        objInvoke = jVar.J2().getString(strN, "");
                        if (objInvoke == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else {
                        objInvoke = qj.invoke();
                    }
                    if (jVar.t() && objInvoke != null) {
                        jVar.O().put(c0927j, objInvoke);
                    }
                }
            }
        }
        String str2 = (String) objInvoke;
        if (str2 != null) {
            return f66846O.adapter(SubscriptionProduct.class).fromJson(str2);
        }
        return null;
    }

    public final foC.j xMQ() {
        return this.f66848n;
    }

    @Override // fE.eO
    public Object J2(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(OU.rl(), new Ml(null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }

    @Override // fE.eO
    public Object O(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(OU.rl(), new w6(null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }

    @Override // fE.eO
    public Object nr(SubscriptionProduct subscriptionProduct, Continuation continuation) {
        String productId = subscriptionProduct.getProductId();
        String json = f66846O.adapter(SubscriptionProduct.class).toJson(subscriptionProduct);
        j.C0927j c0927j = new j.C0927j(productId);
        foC.j jVar = this.f66848n;
        Intrinsics.checkNotNull(json);
        synchronized (jVar) {
            try {
                if (jVar.t()) {
                    jVar.O().put(c0927j, json);
                }
                String strN = c0927j.n();
                SharedPreferences.Editor editorEdit = jVar.J2().edit();
                editorEdit.putString(strN, json);
                editorEdit.apply();
                jVar.n(c0927j, json);
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // fE.eO
    public Object t(Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new n(null), continuation);
    }
}
