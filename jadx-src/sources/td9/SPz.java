package td9;

import QmE.iF;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ga6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class SPz implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f73536n;

    public SPz(iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73536n = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(SPz sPz, Task task) {
        Object obj;
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            mCM.l3D l3d = (mCM.l3D) task.getResult();
            final Long lT2 = (l3d == null || (obj = l3d.f70669n) == null) ? null : Ge.j.t(obj);
            if (lT2 == null) {
                XoT.C.HI(sPz, new Function0() { // from class: td9.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SPz.mUb();
                    }
                });
                M3.j.n(new ga6.j(new IllegalStateException("null result"), j.w6.J2, j.EnumC0949j.f67611O, null, null, 24, null), sPz.f73536n);
                return;
            } else {
                com.alightcreative.app.motion.persist.j.INSTANCE.setProjectPackageFreeUserMaxDownloadSize(lT2.longValue());
                XoT.C.Uo(sPz, new Function0() { // from class: td9.UGc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SPz.xMQ(lT2);
                    }
                });
                Unit unit = Unit.INSTANCE;
                return;
            }
        }
        Exception exception = task.getException();
        if (exception == null) {
            XoT.C.HI(sPz, new Function0() { // from class: td9.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SPz.gh();
                }
            });
        } else {
            XoT.C.ty(sPz, "unable to get max download size", exception);
        }
        j.w6 w6Var = j.w6.J2;
        j.EnumC0949j enumC0949j = j.EnumC0949j.f67611O;
        Exception exception2 = task.getException();
        if (exception2 == null) {
            exception2 = new RuntimeException();
        }
        M3.j.n(new ga6.j(exception2, w6Var, enumC0949j, null, null, 24, null), sPz.f73536n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(final SPz sPz) {
        com.google.firebase.functions.n.mUb.t().ck("getProjectPackageFreeUserMaxDownloadSize").n().addOnCompleteListener(new OnCompleteListener() { // from class: td9.s4
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                SPz.KN(this.f73571n, task);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh() {
        return "unable to get max download size (unknown reason)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb() {
        return "unable to get max download size (null result)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(Long l2) {
        return "got max download size: " + l2;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SPz.Uo(this.f73545n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.f73536n);
    }
}
