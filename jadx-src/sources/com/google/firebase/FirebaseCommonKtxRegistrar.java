package com.google.firebase;

import GJW.R6;
import GJW.lej;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import uOq.g9s;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LuOq/w6;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class Ml implements uOq.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f60038n = new Ml();

        @Override // uOq.CN3
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final lej n(uOq.Ml ml) {
            Object objKN = ml.KN(g9s.n(F2O.Ml.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objKN, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return R6.rl((Executor) objKN);
        }
    }

    public static final class j implements uOq.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f60039n = new j();

        @Override // uOq.CN3
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final lej n(uOq.Ml ml) {
            Object objKN = ml.KN(g9s.n(F2O.j.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objKN, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return R6.rl((Executor) objKN);
        }
    }

    public static final class n implements uOq.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f60040n = new n();

        @Override // uOq.CN3
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final lej n(uOq.Ml ml) {
            Object objKN = ml.KN(g9s.n(F2O.w6.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objKN, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return R6.rl((Executor) objKN);
        }
    }

    public static final class w6 implements uOq.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f60041n = new w6();

        @Override // uOq.CN3
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final lej n(uOq.Ml ml) {
            Object objKN = ml.KN(g9s.n(F2O.n.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objKN, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return R6.rl((Executor) objKN);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uOq.w6> getComponents() {
        uOq.w6 w6VarNr = uOq.w6.O(g9s.n(F2O.j.class, lej.class)).rl(z.gh(g9s.n(F2O.j.class, Executor.class))).J2(j.f60039n).nr();
        Intrinsics.checkNotNullExpressionValue(w6VarNr, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        uOq.w6 w6VarNr2 = uOq.w6.O(g9s.n(F2O.w6.class, lej.class)).rl(z.gh(g9s.n(F2O.w6.class, Executor.class))).J2(n.f60040n).nr();
        Intrinsics.checkNotNullExpressionValue(w6VarNr2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        uOq.w6 w6VarNr3 = uOq.w6.O(g9s.n(F2O.n.class, lej.class)).rl(z.gh(g9s.n(F2O.n.class, Executor.class))).J2(w6.f60041n).nr();
        Intrinsics.checkNotNullExpressionValue(w6VarNr3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        uOq.w6 w6VarNr4 = uOq.w6.O(g9s.n(F2O.Ml.class, lej.class)).rl(z.gh(g9s.n(F2O.Ml.class, Executor.class))).J2(Ml.f60038n).nr();
        Intrinsics.checkNotNullExpressionValue(w6VarNr4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return CollectionsKt.listOf((Object[]) new uOq.w6[]{w6VarNr, w6VarNr2, w6VarNr3, w6VarNr4});
    }
}
