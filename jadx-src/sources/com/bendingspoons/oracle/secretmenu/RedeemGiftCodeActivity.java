package com.bendingspoons.oracle.secretmenu;

import GJW.C;
import GJW.OU;
import GJW.vd;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.LifecycleOwnerKt;
import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.oracle.models.ErrorResponse;
import com.bendingspoons.oracle.secretmenu.RedeemGiftCodeActivity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qu.Dsr;
import qu.o;
import qu.qz;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bendingspoons/oracle/secretmenu/RedeemGiftCodeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", c.f62177j, "j", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RedeemGiftCodeActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Dsr f51442t;

    /* JADX INFO: renamed from: com.bendingspoons.oracle.secretmenu.RedeemGiftCodeActivity$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Dsr n() {
            Dsr dsr = RedeemGiftCodeActivity.f51442t;
            if (dsr != null) {
                return dsr;
            }
            Intrinsics.throwUninitializedPropertyAccessException("oracleService");
            return null;
        }

        public final boolean rl() {
            return RedeemGiftCodeActivity.f51442t != null;
        }

        public final void t(Dsr dsr) {
            Intrinsics.checkNotNullParameter(dsr, "<set-?>");
            RedeemGiftCodeActivity.f51442t = dsr;
        }
    }

    public static final class n implements NUH.j {

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ RedeemGiftCodeActivity J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f51444O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f51445n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f51446t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(String str, RedeemGiftCodeActivity redeemGiftCodeActivity, Continuation continuation) {
                super(2, continuation);
                this.f51444O = str;
                this.J2 = redeemGiftCodeActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f51444O, this.J2, continuation);
                jVar.f51446t = obj;
                return jVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                RedeemGiftCodeActivity redeemGiftCodeActivity;
                Integer errorCode;
                String string;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f51445n;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            redeemGiftCodeActivity = (RedeemGiftCodeActivity) this.f51446t;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        String str = this.f51444O;
                        RedeemGiftCodeActivity redeemGiftCodeActivity2 = this.J2;
                        Result.Companion companion = Result.INSTANCE;
                        Dsr dsrN = RedeemGiftCodeActivity.INSTANCE.n();
                        this.f51446t = redeemGiftCodeActivity2;
                        this.f51445n = 1;
                        obj = Yd3.n.n(dsrN, str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        redeemGiftCodeActivity = redeemGiftCodeActivity2;
                    }
                    x0X.n nVar = (x0X.n) obj;
                    if (nVar instanceof n.w6) {
                        Toast.makeText(redeemGiftCodeActivity.getApplicationContext(), redeemGiftCodeActivity.getString(qz.qie), 0).show();
                    } else if (nVar instanceof n.C1266n) {
                        NetworkError networkError = (NetworkError) ((n.C1266n) nVar).n();
                        if (networkError instanceof NetworkError.j) {
                            ErrorResponse errorResponse = (ErrorResponse) ((NetworkError.j) networkError).n();
                            if (errorResponse != null) {
                                errorCode = errorResponse.getErrorCode();
                            } else {
                                errorCode = null;
                            }
                            if (errorCode != null && errorCode.intValue() == 820) {
                                string = redeemGiftCodeActivity.getString(qz.J2);
                            } else if (errorCode != null && errorCode.intValue() == 821) {
                                string = redeemGiftCodeActivity.getString(qz.Uo);
                            } else if (errorCode != null && errorCode.intValue() == 822) {
                                string = redeemGiftCodeActivity.getString(qz.KN);
                            } else if (errorCode != null && errorCode.intValue() == 823) {
                                string = redeemGiftCodeActivity.getString(qz.xMQ);
                            } else {
                                string = redeemGiftCodeActivity.getString(qz.rl);
                            }
                            Intrinsics.checkNotNull(string);
                            Toast.makeText(redeemGiftCodeActivity.getApplicationContext(), string, 0).show();
                        } else {
                            Toast.makeText(redeemGiftCodeActivity.getApplicationContext(), redeemGiftCodeActivity.getString(qz.rl), 0).show();
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    redeemGiftCodeActivity.finish();
                    Result.m313constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m313constructorimpl(ResultKt.createFailure(th));
                }
                return Unit.INSTANCE;
            }
        }

        n() {
        }

        @Override // NUH.j
        public void n(DialogInterface dialog, int i2, String text) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(text, "text");
            C.nr(LifecycleOwnerKt.n(RedeemGiftCodeActivity.this), OU.t(), null, new j(text, RedeemGiftCodeActivity.this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eTf(RedeemGiftCodeActivity redeemGiftCodeActivity, DialogInterface dialogInterface) {
        redeemGiftCodeActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(RedeemGiftCodeActivity redeemGiftCodeActivity, DialogInterface dialogInterface, int i2) {
        redeemGiftCodeActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(o.rl);
        if (!INSTANCE.rl()) {
            finish();
            return;
        }
        String string = getString(qz.f72497O);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(qz.gh);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(qz.f72499t);
        String string4 = getString(qz.nr);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        w6.O(this, string, string2, (RendererCapabilities.DECODER_SUPPORT_MASK & 4) != 0 ? "" : string3, string4, (RendererCapabilities.DECODER_SUPPORT_MASK & 16) != 0 ? null : new n(), (RendererCapabilities.DECODER_SUPPORT_MASK & 32) != 0 ? null : getString(qz.f72498n), (RendererCapabilities.DECODER_SUPPORT_MASK & 64) != 0 ? null : new DialogInterface.OnClickListener() { // from class: NUH.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RedeemGiftCodeActivity.m(this.f7082n, dialogInterface, i2);
            }
        }, (RendererCapabilities.DECODER_SUPPORT_MASK & 128) != 0 ? null : null, (RendererCapabilities.DECODER_SUPPORT_MASK & 256) != 0 ? null : null, (RendererCapabilities.DECODER_SUPPORT_MASK & 512) != 0).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: NUH.w6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                RedeemGiftCodeActivity.eTf(this.f7083n, dialogInterface);
            }
        });
    }
}
