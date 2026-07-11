package td9;

import QmE.iF;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import ga6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ew implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f73508n;

    public Ew(iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73508n = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(com.google.firebase.iid.o oVar) {
        Log.d("IID_TOKEN", oVar.n());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(Ew ew, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        M3.j.n(M3.n.nr(it, j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), ew.f73508n);
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.ci
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ew.J2(this.f73546n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.f73508n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(final Ew ew) {
        Task taskMUb = FirebaseInstanceId.xMQ().mUb();
        final Function1 function1 = new Function1() { // from class: td9.g9s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ew.Uo((com.google.firebase.iid.o) obj);
            }
        };
        taskMUb.addOnSuccessListener(new OnSuccessListener() { // from class: td9.afx
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Ew.KN(function1, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: td9.Z
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Ew.xMQ(this.f73540n, exc);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
