package com.google.firebase.functions;

import N03.fuX;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.functions.FunctionsRegistrar;
import com.google.firebase.functions.w6;
import com.google.firebase.qz;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oW.InterfaceC2314n;
import uOq.g9s;
import uOq.z;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/google/firebase/functions/FunctionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LuOq/w6;", "getComponents", "()Ljava/util/List;", "Companion", "j", "com.google.firebase-firebase-functions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FunctionsRegistrar implements ComponentRegistrar {
    private static final j Companion = new j(null);
    private static final String LIBRARY_NAME = "fire-fn";

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I28 getComponents$lambda$0(g9s liteExecutor, g9s uiExecutor, uOq.Ml c2) {
        Intrinsics.checkNotNullParameter(liteExecutor, "$liteExecutor");
        Intrinsics.checkNotNullParameter(uiExecutor, "$uiExecutor");
        Intrinsics.checkNotNullParameter(c2, "c");
        w6.j jVarN = com.google.firebase.functions.j.n();
        Object objN = c2.n(Context.class);
        Intrinsics.checkNotNullExpressionValue(objN, "c.get(Context::class.java)");
        w6.j jVarN2 = jVarN.n((Context) objN);
        Object objN2 = c2.n(qz.class);
        Intrinsics.checkNotNullExpressionValue(objN2, "c.get(FirebaseOptions::class.java)");
        w6.j jVarT = jVarN2.t((qz) objN2);
        Object objKN = c2.KN(liteExecutor);
        Intrinsics.checkNotNullExpressionValue(objKN, "c.get(liteExecutor)");
        w6.j jVarRl = jVarT.rl((Executor) objKN);
        Object objKN2 = c2.KN(uiExecutor);
        Intrinsics.checkNotNullExpressionValue(objKN2, "c.get(uiExecutor)");
        w6.j jVarNr = jVarRl.nr((Executor) objKN2);
        oSp.n nVarO = c2.O(InterfaceC2314n.class);
        Intrinsics.checkNotNullExpressionValue(nVarO, "c.getProvider(InternalAuthProvider::class.java)");
        w6.j jVarUo = jVarNr.Uo(nVarO);
        oSp.n nVarO2 = c2.O(Qc1.j.class);
        Intrinsics.checkNotNullExpressionValue(nVarO2, "c.getProvider(FirebaseIn…ceIdInternal::class.java)");
        w6.j jVarO = jVarUo.O(nVarO2);
        oSp.j jVarXMQ = c2.xMQ(InterfaceC2436n.class);
        Intrinsics.checkNotNullExpressionValue(jVarXMQ, "c.getDeferred(InteropApp…okenProvider::class.java)");
        return jVarO.J2(jVarXMQ).build().n();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uOq.w6> getComponents() {
        final g9s g9sVarN = g9s.n(F2O.w6.class, Executor.class);
        Intrinsics.checkNotNullExpressionValue(g9sVarN, "qualified(Lightweight::c…va, Executor::class.java)");
        final g9s g9sVarN2 = g9s.n(F2O.Ml.class, Executor.class);
        Intrinsics.checkNotNullExpressionValue(g9sVarN2, "qualified(UiThread::clas…va, Executor::class.java)");
        return CollectionsKt.listOf((Object[]) new uOq.w6[]{uOq.w6.t(I28.class).KN(LIBRARY_NAME).rl(z.mUb(Context.class)).rl(z.mUb(qz.class)).rl(z.xMQ(InterfaceC2314n.class)).rl(z.qie(Qc1.j.class)).rl(z.n(InterfaceC2436n.class)).rl(z.gh(g9sVarN)).rl(z.gh(g9sVarN2)).J2(new uOq.CN3() { // from class: mCM.Xo
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return FunctionsRegistrar.getComponents$lambda$0(g9sVarN, g9sVarN2, ml);
            }
        }).nr(), fuX.rl(LIBRARY_NAME, "21.2.1")});
    }
}
