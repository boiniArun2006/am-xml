package com.bendingspoons.concierge.ui.secretmenu;

import DSG.Wre;
import Dk.InterfaceC1335n;
import Dk.o;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import bH.CN3;
import com.safedk.android.utils.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {

    /* JADX INFO: renamed from: com.bendingspoons.concierge.ui.secretmenu.j$j, reason: collision with other inner class name */
    static final class C0719j extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f51228O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51229n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC1335n f51230t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C0719j(this.f51230t, this.f51228O, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0719j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0719j(InterfaceC1335n interfaceC1335n, Context context, Continuation continuation) {
            super(1, continuation);
            this.f51230t = interfaceC1335n;
            this.f51228O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51229n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC1335n interfaceC1335n = this.f51230t;
                this.f51229n = 1;
                obj = interfaceC1335n.J2(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Context context = this.f51228O;
            if (nVar instanceof n.C1266n) {
                Toast.makeText(context, "Error: " + ((zD.j) ((n.C1266n) nVar).n()).rl(), 0).show();
                return Wre.j.EnumC0054j.f1447n;
            }
            if (nVar instanceof n.w6) {
                Toast.makeText(context, "User identity changed.", 0).show();
                return Wre.j.EnumC0054j.f1446O;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f51231O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51232n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC1335n f51233t;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f51233t, this.f51231O, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(InterfaceC1335n interfaceC1335n, Context context, Continuation continuation) {
            super(1, continuation);
            this.f51233t = interfaceC1335n;
            this.f51231O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51232n == 0) {
                ResultKt.throwOnFailure(obj);
                IDsActivity.INSTANCE.t(this.f51233t);
                Intent intent = new Intent(this.f51231O, (Class<?>) IDsActivity.class);
                intent.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f51231O, intent);
                return Wre.j.EnumC0054j.f1447n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void n(CN3 cn3, InterfaceC1335n concierge, Context context) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(context, "context");
        CN3.I28 i28 = CN3.I28.f43224n;
        String string = context.getString(o.f1921n);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        cn3.n(i28, new Wre.j(string, "👽", null, new C0719j(concierge, context, null), 4, null));
        CN3.I28 i282 = CN3.I28.f43225t;
        String string2 = context.getString(o.rl);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        cn3.n(i282, new Wre.j(string2, "🆔", null, new n(concierge, context, null), 4, null));
    }
}
