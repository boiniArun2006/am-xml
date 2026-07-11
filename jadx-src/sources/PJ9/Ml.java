package PJ9;

import QmE.iF;
import QmE.j;
import android.content.Intent;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract;
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f7669n;
    private Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ActivityResultLauncher f7670t;

    public Ml(ComponentActivity activity, iF eventLogger) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f7669n = eventLogger;
        this.rl = new Function0() { // from class: PJ9.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ml.O();
            }
        };
        this.f7670t = activity.registerForActivityResult(new FirebaseAuthUIActivityResultContract(), new ActivityResultCallback() { // from class: PJ9.n
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                Ml.J2(this.f7688n, (FirebaseAuthUIAuthenticationResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(Ml ml, FirebaseAuthUIAuthenticationResult firebaseAuthUIAuthenticationResult) {
        if (DAz.iF(firebaseAuthUIAuthenticationResult, ml.f7669n)) {
            ml.rl.invoke();
        }
        ml.rl = new Function0() { // from class: PJ9.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ml.Uo();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo() {
        return Unit.INSTANCE;
    }

    public final void nr(Intent intent, Function0 onSuccessCallback) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(onSuccessCallback, "onSuccessCallback");
        this.rl = onSuccessCallback;
        this.f7669n.n(j.Su.f8452n);
        this.f7670t.n(intent);
    }
}
