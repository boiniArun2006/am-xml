package com.alightcreative.app.motion.activities.creatorprogram.redeem;

import QmE.iF;
import cg.o;
import com.alightcreative.app.motion.activities.creatorprogram.redeem.CN3;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.safedk.android.analytics.AppLovinBridge;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import ga6.j;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mCM.QJ;
import mCM.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class fuX {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f45001t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f45002n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n implements OnCompleteListener {
        final /* synthetic */ Continuation rl;

        n(Continuation continuation) {
            this.rl = continuation;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.isSuccessful()) {
                CN3 cn3Nr = fuX.this.nr(((l3D) task.getResult()).f70669n);
                if (!Intrinsics.areEqual(cn3Nr, CN3.I28.f44960n)) {
                    M3.j.n(new ga6.j(new IllegalStateException("Redeem tokens error: " + cn3Nr), j.w6.J2, j.EnumC0949j.f67614Z, null, null, 24, null), fuX.this.f45002n);
                }
                this.rl.resumeWith(Result.m313constructorimpl(cn3Nr));
                return;
            }
            Exception exception = task.getException();
            if (exception == null) {
                exception = new IllegalStateException("Redeem tokens error");
            }
            M3.j.n(new ga6.j(exception, j.w6.J2, j.EnumC0949j.f67614Z, null, null, 24, null), fuX.this.f45002n);
            Continuation continuation = this.rl;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(CN3.Ml.f44961n));
        }
    }

    public fuX(iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f45002n = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final CN3 nr(Object obj) {
        boolean z2 = obj instanceof Map;
        Map map = z2 ? (Map) obj : null;
        String str = map != null ? (String) map.getOrDefault("result", null) : null;
        Map map2 = z2 ? (Map) obj : null;
        String str2 = map2 != null ? (String) map2.getOrDefault(JavetError.PARAMETER_REASON, null) : null;
        if (Intrinsics.areEqual(str, "success")) {
            return CN3.I28.f44960n;
        }
        if (!Intrinsics.areEqual(str, MRAIDPresenter.ERROR)) {
            return CN3.Ml.f44961n;
        }
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1966938570:
                    if (str2.equals("unauthenticated")) {
                        return CN3.Wre.f44962n;
                    }
                    break;
                case 297113252:
                    if (str2.equals("insufficient-tokens")) {
                        return CN3.w6.f44965n;
                    }
                    break;
                case 943995819:
                    if (str2.equals("gift-not-found")) {
                        return CN3.n.f44964n;
                    }
                    break;
                case 1732803467:
                    if (str2.equals("campaign-not-found")) {
                        return CN3.j.f44963n;
                    }
                    break;
            }
        }
        return CN3.Ml.f44961n;
    }

    public final Object t(cg.n nVar, o oVar, String str, cg.j jVar, String str2, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        QJ qjCk = com.google.firebase.functions.n.mUb.t().ck("redeemTokens");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("campaign", nVar.rl());
        mapCreateMapBuilder.put("gift", oVar.n().rl());
        mapCreateMapBuilder.put(AppLovinBridge.f61288f, AppLovinBridge.f61290h);
        mapCreateMapBuilder.put(Scopes.EMAIL, str);
        if (jVar != null) {
        }
        if (str2 != null) {
            mapCreateMapBuilder.put("phone", str2);
        }
        qjCk.rl(MapsKt.build(mapCreateMapBuilder)).addOnCompleteListener(new n(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
