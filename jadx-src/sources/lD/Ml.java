package lD;

import LQ.j;
import MoG.QJ;
import MoG.eO;
import MoG.z;
import N1.Wre;
import Oe.j;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import uPp.CN3;
import uPp.Dsr;
import uPp.I28;
import uPp.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f70390O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70391n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70392t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70390O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Ml.nr(null, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    private static final z J2(CN3.n nVar) {
        return new z(nVar.Uo(), new eO.n(nVar.xMQ(), nVar.t(), new Oe.j(new Oe.w6(nVar.qie(), nVar.J2()), j.n.f7488t.n(nVar.gh())), nVar.mUb(), nVar.KN(), nVar.O()));
    }

    private static final z O(CN3.j jVar) {
        return new z(jVar.O(), new eO.j(jVar.J2(), jVar.t(), jVar.Uo(), jVar.rl(), null));
    }

    private static final z n(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof CN3.j) {
                arrayList.add(obj);
            }
        }
        CN3.j jVar = (CN3.j) CollectionsKt.firstOrNull((List) arrayList);
        if (jVar != null) {
            return O(jVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(Context context, Uri uri, Wre wre, Continuation continuation) {
        j jVar;
        Uri uri2;
        Wre wre2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objN = jVar.f70390O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            aC aCVarN = pK.j.n();
            jVar.f70391n = uri;
            jVar.f70392t = wre;
            jVar.J2 = 1;
            objN = aCVarN.n(context, uri, jVar);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            uri2 = uri;
            wre2 = wre;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre2 = (Wre) jVar.f70392t;
            Uri uri3 = (Uri) jVar.f70391n;
            ResultKt.throwOnFailure(objN);
            uri2 = uri3;
        }
        Object w6Var = (LQ.j) objN;
        if (!(w6Var instanceof j.n)) {
            if (!(w6Var instanceof j.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Dsr dsr = (Dsr) ((j.w6) w6Var).n();
            d2n.j jVarN = dsr.n();
            if (jVarN == null) {
                return new j.n(new N1.Ml("Unexpected null duration"));
            }
            long jNr = d2n.j.f63374t.nr(jVarN.WPU());
            z zVarN = n(dsr.rl());
            MoG.Wre wre3 = zVarN != null ? new MoG.Wre(uri2, jNr, zVarN, null) : null;
            z zVarRl = rl(dsr.rl());
            w6Var = new j.w6(Wre.rl(wre2, null, null, null, null, d2n.j.rl(jNr), zVarRl != null ? new QJ(uri2, jNr, zVarRl, null) : null, wre3, null, null, 399, null));
        }
        if (w6Var instanceof j.n) {
            return new j.n(new N1.Ml((I28) ((j.n) w6Var).n()));
        }
        if (w6Var instanceof j.w6) {
            return w6Var;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final z rl(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof CN3.n) {
                arrayList.add(obj);
            }
        }
        CN3.n nVar = (CN3.n) CollectionsKt.firstOrNull((List) arrayList);
        if (nVar != null) {
            return J2(nVar);
        }
        return null;
    }

    public static final boolean t(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith$default(str, "video/", false, 2, (Object) null) || StringsKt.startsWith$default(str, "audio/", false, 2, (Object) null);
    }
}
