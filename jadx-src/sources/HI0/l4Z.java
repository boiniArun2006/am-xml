package HI0;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class l4Z {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Function1 f3869O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f3870n;
    private boolean nr;
    private final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f3871t;

    public l4Z(Executor executor, Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f3870n = executor;
        this.rl = action;
        this.J2 = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(l4Z l4z, Object obj) {
        Function1 function1 = l4z.f3869O;
        if (function1 != null) {
            function1.invoke(obj);
        }
        l4z.f3871t = false;
        if (l4z.nr) {
            l4z.nr();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O(l4Z l4z) {
        return l4z.rl.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(l4Z l4z, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        List list = l4z.J2;
        if (list != null && list.isEmpty()) {
            throw throwable;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((Function1) it.next()).invoke(throwable)).booleanValue()) {
                return Unit.INSTANCE;
            }
        }
        throw throwable;
    }

    public final l4Z KN(Function1 resultHandler) {
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        if (this.f3871t) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f3869O != null) {
            throw new IllegalStateException("multiple 'then' blocks not allowed");
        }
        this.f3869O = resultHandler;
        return this;
    }

    public final void nr() {
        if (this.f3871t) {
            this.nr = true;
            return;
        }
        this.f3871t = true;
        this.nr = false;
        AsyncTaskC1374z asyncTaskC1374zUo = qz.t(this.f3870n, new Function0() { // from class: HI0.yg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l4Z.O(this.f3886n);
            }
        }).Uo(new Function1() { // from class: HI0.pO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l4Z.J2(this.f3874n, obj);
            }
        });
        Function1 function1 = new Function1() { // from class: HI0.Sis
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l4Z.Uo(this.f3839n, (Throwable) obj);
            }
        };
        if (asyncTaskC1374zUo.getStatus() != AsyncTask.Status.PENDING) {
            throw new IllegalStateException("Check failed.");
        }
        asyncTaskC1374zUo.J2(new eO(asyncTaskC1374zUo.nr(), Reflection.getOrCreateKotlinClass(Throwable.class), asyncTaskC1374zUo, function1));
    }
}
