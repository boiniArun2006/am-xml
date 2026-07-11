package Asx;

import QmE.Ml;
import QmE.iF;
import ga6.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import td9.lej;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f124n;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Asx.j f125t;

    static final class j extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f126O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f127S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f129n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f130o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f131r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f132t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130o = obj;
            this.f127S |= Integer.MIN_VALUE;
            return w6.this.n(this);
        }
    }

    public w6(List initializers, iF eventLogger) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f124n = initializers;
        this.rl = eventLogger;
        this.f125t = Asx.j.f120n;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0086 -> B:21:0x0087). Please report as a decompilation issue!!! */
    @Override // Asx.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        Collection arrayList;
        w6 w6Var;
        w6 w6Var2;
        Iterator it;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f127S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f127S = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objN = jVar.f130o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f127S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            this.rl.n(Ml.f8352n);
            this.f125t = Asx.j.f123t;
            List list = this.f124n;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            w6Var = this;
            w6Var2 = w6Var;
            it = list.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (Collection) jVar.f131r;
            w6Var = (w6) jVar.J2;
            it = (Iterator) jVar.f126O;
            Collection collection = (Collection) jVar.f132t;
            w6Var2 = (w6) jVar.f129n;
            ResultKt.throwOnFailure(objN);
            arrayList.add((x0X.n) objN);
            arrayList = collection;
            if (it.hasNext()) {
                lej lejVar = (lej) it.next();
                jVar.f129n = w6Var2;
                jVar.f132t = arrayList;
                jVar.f126O = it;
                jVar.J2 = w6Var;
                jVar.f131r = arrayList;
                jVar.f127S = 1;
                objN = lejVar.n(jVar);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                collection = arrayList;
                arrayList.add((x0X.n) objN);
                arrayList = collection;
                if (it.hasNext()) {
                    x0X.n nVarT = w6Var.t((List) arrayList);
                    boolean z2 = nVarT instanceof n.C1266n;
                    if (!z2) {
                        if (!(nVarT instanceof n.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        w6Var2.f125t = Asx.j.f119O;
                        w6Var2.rl.n(QmE.n.f8610n);
                    }
                    if (!z2) {
                        if (nVarT instanceof n.w6) {
                            return nVarT;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    ga6.j jVar2 = (ga6.j) ((n.C1266n) nVarT).n();
                    w6Var2.f125t = Asx.j.J2;
                    iF iFVar = w6Var2.rl;
                    String strRl = jVar2.rl();
                    if (strRl == null) {
                        strRl = jVar2.O().toString();
                    }
                    iFVar.n(new QmE.w6(strRl));
                    return nVarT;
                }
            }
        }
    }

    @Override // Asx.n
    public Asx.j rl() {
        return this.f125t;
    }

    private final x0X.n t(List list) {
        Object objNr;
        Iterator it = list.iterator();
        while (true) {
            objNr = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ga6.j jVar = (ga6.j) x0X.w6.rl((x0X.n) next);
            if (jVar != null) {
                objNr = jVar.nr();
            }
            if (objNr == j.w6.f67631r) {
                objNr = next;
                break;
            }
        }
        x0X.n nVar = (x0X.n) objNr;
        if (nVar == null) {
            return new n.w6(Unit.INSTANCE);
        }
        return nVar;
    }
}
