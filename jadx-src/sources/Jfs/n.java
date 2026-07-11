package Jfs;

import FX.Ml;
import QmE.iF;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import ga6.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mCM.l3D;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f4660t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f4661n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: Jfs.n$n, reason: collision with other inner class name */
    static final class C0161n implements OnCompleteListener {
        final /* synthetic */ Continuation rl;

        C0161n(Continuation continuation) {
            this.rl = continuation;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (!task.isSuccessful()) {
                Continuation continuation = this.rl;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m313constructorimpl(new n.C1266n(M3.j.n(M3.n.nr(new IllegalStateException("Firebase getRanking not successful.", task.getException()), j.w6.J2, j.EnumC0949j.J2, null, null, 12, null), n.this.f4661n))));
                return;
            }
            x0X.n nVarO = n.this.O(((l3D) task.getResult()).f70669n);
            Continuation continuation2 = this.rl;
            boolean z2 = nVarO instanceof n.C1266n;
            if (!z2) {
                if (!(nVarO instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list = (List) ((n.w6) nVarO).n();
                Result.Companion companion2 = Result.INSTANCE;
                continuation2.resumeWith(Result.m313constructorimpl(new n.w6(list)));
            }
            Continuation continuation3 = this.rl;
            n nVar = n.this;
            if (!z2) {
                if (!(nVarO instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                Throwable th = (Throwable) ((n.C1266n) nVarO).n();
                Result.Companion companion3 = Result.INSTANCE;
                continuation3.resumeWith(Result.m313constructorimpl(new n.C1266n(M3.j.n(M3.n.nr(th, j.w6.J2, j.EnumC0949j.J2, null, null, 12, null), nVar.f4661n))));
            }
        }
    }

    public n(iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f4661n = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List J2(Object obj) {
        String strRl;
        boolean z2 = obj instanceof Map;
        Map map = z2 ? (Map) obj : null;
        Object orDefault = map != null ? map.getOrDefault("result", null) : null;
        String str = orDefault instanceof String ? (String) orDefault : null;
        Map map2 = z2 ? (Map) obj : null;
        Object orDefault2 = map2 != null ? map2.getOrDefault(JavetError.PARAMETER_REASON, null) : null;
        String str2 = orDefault2 instanceof String ? (String) orDefault2 : null;
        Map map3 = z2 ? (Map) obj : null;
        Object orDefault3 = map3 != null ? map3.getOrDefault("ranking", null) : null;
        List<Map> list = orDefault3 instanceof List ? (List) orDefault3 : null;
        if (!Intrinsics.areEqual(str, "success")) {
            if (!Intrinsics.areEqual(str, MRAIDPresenter.ERROR)) {
                throw new IllegalStateException("Firebase getRanking error: unexpected result.");
            }
            if (!Intrinsics.areEqual(str2, "campaign-not-found")) {
                throw new IllegalStateException("Firebase getRanking error: unknown reason.");
            }
            throw new IllegalStateException("Firebase getRanking error: campaign-not-found, campaign=" + cg.n.f43806O + ".");
        }
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map map4 : list) {
            Object orDefault4 = map4.getOrDefault("downloads", 0);
            Intrinsics.checkNotNull(orDefault4, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) orDefault4).intValue();
            ArrayList arrayList2 = new ArrayList();
            Object orDefault5 = map4.getOrDefault("tiktok", null);
            String str3 = orDefault5 instanceof String ? (String) orDefault5 : null;
            if (str3 != null) {
                if (StringsKt.isBlank(str3)) {
                    str3 = null;
                }
                if (str3 != null) {
                    arrayList2.add(new Ml.n(str3));
                }
            }
            Object orDefault6 = map4.getOrDefault("instagram", null);
            String str4 = orDefault6 instanceof String ? (String) orDefault6 : null;
            if (str4 != null) {
                if (StringsKt.isBlank(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    arrayList2.add(new Ml.j(str4));
                }
            }
            Object orDefault7 = map4.getOrDefault("youtube", null);
            String str5 = orDefault7 instanceof String ? (String) orDefault7 : null;
            if (str5 != null) {
                if (StringsKt.isBlank(str5)) {
                    str5 = null;
                }
                if (str5 != null) {
                    arrayList2.add(new Ml.w6(str5));
                }
            }
            FX.Ml ml = (FX.Ml) CollectionsKt.firstOrNull((List) arrayList2);
            FX.j jVar = (ml == null || (strRl = ml.rl()) == null) ? null : new FX.j(strRl, iIntValue, arrayList2);
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n O(final Object obj) {
        return x0X.w6.n(new Function0() { // from class: Jfs.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.J2(obj);
            }
        });
    }

    public final Object nr(Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        com.google.firebase.functions.n.mUb.t().ck("getRanking").rl(MapsKt.mapOf(TuplesKt.to("campaign", cg.n.f43806O.rl()))).addOnCompleteListener(new C0161n(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
