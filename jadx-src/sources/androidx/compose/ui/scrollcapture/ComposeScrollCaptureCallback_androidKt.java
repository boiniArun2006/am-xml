package androidx.compose.ui.scrollcapture;

import GJW.C;
import GJW.vd;
import GJW.xuv;
import android.os.CancellationSignal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LGJW/vd;", "Landroid/os/CancellationSignal;", "signal", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "LGJW/xuv;", "t", "(LGJW/vd;Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function2;)LGJW/xuv;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ComposeScrollCaptureCallback_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(xuv xuvVar) {
        xuv.j.rl(xuvVar, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xuv t(vd vdVar, final CancellationSignal cancellationSignal, Function2 function2) {
        final xuv xuvVarNr = C.nr(vdVar, null, null, function2, 3, null);
        xuvVarNr.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.w6
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                ComposeScrollCaptureCallback_androidKt.nr(xuvVarNr);
            }
        });
        return xuvVarNr;
    }
}
