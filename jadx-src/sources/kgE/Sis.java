package kgE;

import GJW.OU;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alightcreative.gl.egl.il.inFlMLxL;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kgE.Sis;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Sis {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy f70090n = LazyKt.lazy(new Function0() { // from class: kgE.P
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Sis.mUb();
        }
    });
    private static final List rl = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static com.alightcreative.account.o f70091t = new com.alightcreative.account.o(null, null, null, null, false, null, null, null, null, false, 1023, null);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.account.o f70092O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70093n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f70094t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(com.alightcreative.account.o oVar, Continuation continuation) {
            super(2, continuation);
            this.f70092O = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O(com.alightcreative.account.o oVar) {
            return "IAP: Update purchase state: " + oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f70092O, continuation);
            jVar.f70094t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f70093n == 0) {
                ResultKt.throwOnFailure(obj);
                GJW.vd vdVar = (GJW.vd) this.f70094t;
                if (!Intrinsics.areEqual(Sis.f70091t, this.f70092O)) {
                    final com.alightcreative.account.o oVar = this.f70092O;
                    XoT.C.Uo(vdVar, new Function0() { // from class: kgE.pO
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Sis.j.O(oVar);
                        }
                    });
                    Sis.f70091t = this.f70092O;
                    List list = Sis.rl;
                    com.alightcreative.account.o oVar2 = this.f70092O;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        l4Z l4z = (l4Z) ((WeakReference) it.next()).get();
                        if (l4z != null) {
                            l4z.n(oVar2);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HI(l4Z l4z, WeakReference obs) {
        Intrinsics.checkNotNullParameter(obs, "obs");
        l4Z l4z2 = (l4Z) obs.get();
        return l4z2 == null || Intrinsics.areEqual(l4z2, l4z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String KN(com.alightcreative.account.o oVar, Context context) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zIk = XoT.fuX.Ik(context);
        Throwable th = (Throwable) CollectionsKt.firstOrNull(oVar.Uo());
        if (zIk) {
            if (th == 0 || !(th instanceof CN3)) {
                if (th != 0) {
                    return neA.j.f71189M.rl() + ": " + th.getMessage();
                }
                neA.j jVar = neA.j.f71191O;
                return jVar.rl() + ": " + jVar.t();
            }
            CN3 cn3 = (CN3) th;
            if (cn3.n() == null) {
                return cn3.getCode() + ": " + cn3.getMessage();
            }
            return cn3.getCode() + "-E" + cn3.n() + ": " + cn3.getMessage();
        }
        if (th == 0 || !(th instanceof CN3)) {
            if (th != 0) {
                return neA.j.f71189M.rl() + ": " + neA.j.J2.t() + " / " + th.getMessage();
            }
            neA.j jVar2 = neA.j.J2;
            return jVar2.rl() + "-" + neA.j.f71191O.rl() + ": " + jVar2.t();
        }
        CN3 cn32 = (CN3) th;
        if (cn32.n() == null) {
            neA.j jVar3 = neA.j.J2;
            return jVar3.rl() + "-" + cn32.getCode() + ": " + jVar3.t();
        }
        neA.j jVar4 = neA.j.J2;
        return jVar4.rl() + "-" + cn32.getCode() + "-E" + cn32.n() + ": " + jVar4.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(l4Z l4z) {
        l4z.n(f70091t);
    }

    public static final void gh(final l4Z observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!HI0.aC.n()) {
            throw new IllegalStateException(inFlMLxL.geT);
        }
        List list = rl;
        list.add(new WeakReference(observer));
        CollectionsKt.removeAll(list, new Function1() { // from class: kgE.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Sis.qie((WeakReference) obj));
            }
        });
        xMQ().post(new Runnable() { // from class: kgE.iF
            @Override // java.lang.Runnable
            public final void run() {
                Sis.az(observer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mUb() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean qie(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    public static final void ty(final l4Z observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!HI0.aC.n()) {
            throw new IllegalStateException("Check failed.");
        }
        CollectionsKt.removeAll(rl, new Function1() { // from class: kgE.yg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Sis.HI(observer, (WeakReference) obj));
            }
        });
    }

    private static final Handler xMQ() {
        return (Handler) f70090n.getValue();
    }

    public static final Object ck(com.alightcreative.account.o oVar, Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(OU.t(), new j(oVar, null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }
}
