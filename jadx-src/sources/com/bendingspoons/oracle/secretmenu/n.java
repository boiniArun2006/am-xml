package com.bendingspoons.oracle.secretmenu;

import DSG.Wre;
import TFv.CN3;
import TFv.fuX;
import Yz.qz;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bH.CN3;
import bH.o;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.secretmenu.n;
import com.safedk.android.utils.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import qE.Ew;
import qE.nKK;
import qE.s4;
import qu.Dsr;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n {

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f51448O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51449n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f51450t;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new I28(this.f51450t, this.f51448O, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Dsr dsr, Context context, Continuation continuation) {
            super(1, continuation);
            this.f51450t = dsr;
            this.f51448O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51449n == 0) {
                ResultKt.throwOnFailure(obj);
                RedeemGiftCodeActivity.INSTANCE.t(this.f51450t);
                Intent intent = new Intent(this.f51448O, (Class<?>) RedeemGiftCodeActivity.class);
                intent.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f51448O, intent);
                return Wre.j.EnumC0054j.f1447n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f51451O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51452n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f51453t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Ml(this.f51453t, this.f51451O, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Dsr dsr, Context context, Continuation continuation) {
            super(1, continuation);
            this.f51453t = dsr;
            this.f51451O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51452n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Dsr dsr = this.f51453t;
                this.f51452n = 1;
                obj = Ew.rl(dsr, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Context context = this.f51451O;
            if (nVar instanceof n.C1266n) {
                Toast.makeText(context, "Refresh failed", 0).show();
                return Wre.j.EnumC0054j.f1447n;
            }
            if (nVar instanceof n.w6) {
                Toast.makeText(context, "Settings refreshed", 0).show();
                return Wre.j.EnumC0054j.f1449t;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class j implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Dsr.n.InterfaceC1121n f51454O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f51455n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f51456t;

        j(Context context, Dsr dsr, Dsr.n.InterfaceC1121n interfaceC1121n) {
            this.f51455n = context;
            this.f51456t = dsr;
            this.f51454O = interfaceC1121n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UX1.j t(Context context) {
            return qu.j.f72495O.n(context);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl((Function1) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Function1 it, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1428478149, i2, -1, "com.bendingspoons.oracle.secretmenu.registerOracleServiceItems.<anonymous> (OracleServiceSecretMenuItemsProvider.kt:47)");
            }
            Dsr dsr = this.f51456t;
            Dsr.n.InterfaceC1121n interfaceC1121n = this.f51454O;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("Main", dsr.getConfig().t());
            for (Map.Entry entry : interfaceC1121n.J2().entrySet()) {
                mapCreateMapBuilder.put((String) entry.getKey(), (String) entry.getValue());
            }
            Map mapBuild = MapsKt.build(mapCreateMapBuilder);
            composer.eF(1020761825);
            boolean zE2 = composer.E2(this.f51455n);
            final Context context = this.f51455n;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: com.bendingspoons.oracle.secretmenu.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.j.t(context);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            UX1.Wre.t(mapBuild, (Function0) objIF, false, null, composer, 0, 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.secretmenu.n$n, reason: collision with other inner class name */
    static final class C0727n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f51457O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51458n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f51459t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C0727n(this.f51459t, this.f51457O, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0727n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0727n(Dsr dsr, Context context, Continuation continuation) {
            super(1, continuation);
            this.f51459t = dsr;
            this.f51457O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51458n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Dsr dsr = this.f51459t;
                this.f51458n = 1;
                obj = Yd3.j.n(dsr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar instanceof n.w6) {
                Toast.makeText(this.f51457O, "User deleted! Restart your app please.", 0).show();
                return Wre.j.EnumC0054j.f1446O;
            }
            Context context = this.f51457O;
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type com.bendingspoons.core.functional.Either.Error<com.bendingspoons.networking.NetworkError<com.bendingspoons.oracle.models.ErrorResponse>>");
            Toast.makeText(context, "Error: " + Reflection.getOrCreateKotlinClass(((n.C1266n) nVar).n().getClass()).getSimpleName(), 0).show();
            return Wre.j.EnumC0054j.f1447n;
        }
    }

    static final class w6 implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ qu.I28 f51460n;

        public static final class j implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f51461n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SimpleDateFormat f51462t;

            /* JADX INFO: renamed from: com.bendingspoons.oracle.secretmenu.n$w6$j$j, reason: collision with other inner class name */
            public static final class C0728j implements CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ CN3 f51463n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ SimpleDateFormat f51464t;

                /* JADX INFO: renamed from: com.bendingspoons.oracle.secretmenu.n$w6$j$j$j, reason: collision with other inner class name */
                public static final class C0729j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f51466n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f51467t;

                    public C0729j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f51466n = obj;
                        this.f51467t |= Integer.MIN_VALUE;
                        return C0728j.this.rl(null, this);
                    }
                }

                public C0728j(CN3 cn3, SimpleDateFormat simpleDateFormat) {
                    this.f51463n = cn3;
                    this.f51464t = simpleDateFormat;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0729j c0729j;
                    String str;
                    if (continuation instanceof C0729j) {
                        c0729j = (C0729j) continuation;
                        int i2 = c0729j.f51467t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0729j.f51467t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0729j = new C0729j(continuation);
                        }
                    }
                    Object obj2 = c0729j.f51466n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0729j.f51467t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        CN3 cn3 = this.f51463n;
                        Date date = (Date) obj;
                        if (date == null) {
                            str = "";
                        } else {
                            Duration.Companion companion = Duration.INSTANCE;
                            long jT2 = n.t(DurationKt.toDuration(System.currentTimeMillis() - date.getTime(), DurationUnit.MILLISECONDS));
                            str = this.f51464t.format(date) + " (" + Duration.m1692toStringimpl(jT2) + " ago)";
                        }
                        c0729j.f51467t = 1;
                        if (cn3.rl(str, c0729j) == coroutine_suspended) {
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

            public j(TFv.Wre wre, SimpleDateFormat simpleDateFormat) {
                this.f51461n = wre;
                this.f51462t = simpleDateFormat;
            }

            @Override // TFv.Wre
            public Object n(CN3 cn3, Continuation continuation) {
                Object objN = this.f51461n.n(new C0728j(cn3, this.f51462t), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bendingspoons.oracle.secretmenu.n$w6$n, reason: collision with other inner class name */
        public static final class C0730n implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f51468n;

            /* JADX INFO: renamed from: com.bendingspoons.oracle.secretmenu.n$w6$n$j */
            public static final class j implements CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ CN3 f51469n;

                /* JADX INFO: renamed from: com.bendingspoons.oracle.secretmenu.n$w6$n$j$j, reason: collision with other inner class name */
                public static final class C0731j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f51471n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f51472t;

                    public C0731j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f51471n = obj;
                        this.f51472t |= Integer.MIN_VALUE;
                        return j.this.rl(null, this);
                    }
                }

                public j(CN3 cn3) {
                    this.f51469n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0731j c0731j;
                    if (continuation instanceof C0731j) {
                        c0731j = (C0731j) continuation;
                        int i2 = c0731j.f51472t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0731j.f51472t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0731j = new C0731j(continuation);
                        }
                    }
                    Object obj2 = c0731j.f51471n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0731j.f51472t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        CN3 cn3 = this.f51469n;
                        nKK nkk = nKK.f72310n;
                        String rawBody = ((OracleResponse) obj).getRawBody();
                        Intrinsics.checkNotNull(rawBody);
                        Map mapN = nkk.n(rawBody);
                        if (mapN != null) {
                            c0731j.f51472t = 1;
                            if (cn3.rl(mapN, c0731j) == coroutine_suspended) {
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

            public C0730n(TFv.Wre wre) {
                this.f51468n = wre;
            }

            @Override // TFv.Wre
            public Object n(CN3 cn3, Continuation continuation) {
                Object objN = this.f51468n.n(new j(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        w6(qu.I28 i28) {
            this.f51460n = i28;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((Function1) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Function1 it, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1448432052, i2, -1, "com.bendingspoons.oracle.secretmenu.registerOracleServiceItems.<anonymous> (OracleServiceSecretMenuItemsProvider.kt:92)");
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());
            C0730n c0730n = new C0730n(qu.Wre.t(this.f51460n));
            qu.I28 i28 = this.f51460n;
            qz.aYN(c0730n, i28 instanceof s4 ? new j(((s4) i28).qie(), simpleDateFormat) : fuX.E2(""), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(bH.CN3 cn3, Context context, Dsr oracleService, qu.I28 oracleResponseStore) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oracleService, "oracleService");
        Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
        Dsr.n.InterfaceC1121n interfaceC1121nKN = oracleService.getConfig().KN();
        if (interfaceC1121nKN.n()) {
            o.n(cn3, new Wre.w6("Oracle", "🔮", "Choose the endpoint among the ones defined in OracleService.Config, or use a custom one.", ComposableLambdaKt.rl(-1428478149, true, new j(context, oracleService, interfaceC1121nKN))));
        }
        if (interfaceC1121nKN.rl()) {
            cn3.n(CN3.I28.f43224n, new Wre.j("Oracle: delete user", "🧽", null, new C0727n(oracleService, context, null), 4, null));
        }
        if (interfaceC1121nKN.O()) {
            cn3.n(CN3.I28.f43224n, new Wre.w6("Oracle: settings", "⚙️", null, ComposableLambdaKt.rl(1448432052, true, new w6(oracleResponseStore)), 4, null));
        }
        if (interfaceC1121nKN.nr()) {
            cn3.n(CN3.I28.f43224n, new Wre.j("Oracle: refresh settings", "🦄", null, new Ml(oracleService, context, null), 4, null));
        }
        CN3.I28 i28 = CN3.I28.f43225t;
        String string = context.getString(qu.qz.mUb);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        cn3.n(i28, new Wre.j(string, "🎁", null, new I28(oracleService, context, null), 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long t(long j2) {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnit durationUnit = DurationUnit.DAYS;
        return Duration.m1651compareToLRDsOJo(j2, DurationKt.toDuration(2, durationUnit)) >= 0 ? DurationKt.toDuration(Duration.m1660getInWholeDaysimpl(j2), durationUnit) : Duration.m1651compareToLRDsOJo(j2, DurationKt.toDuration(1, durationUnit)) >= 0 ? DurationKt.toDuration(Duration.m1661getInWholeHoursimpl(j2), DurationUnit.HOURS) : Duration.m1651compareToLRDsOJo(j2, DurationKt.toDuration(1, DurationUnit.HOURS)) >= 0 ? DurationKt.toDuration(Duration.m1664getInWholeMinutesimpl(j2), DurationUnit.MINUTES) : DurationKt.toDuration(Duration.m1666getInWholeSecondsimpl(j2), DurationUnit.SECONDS);
    }
}
