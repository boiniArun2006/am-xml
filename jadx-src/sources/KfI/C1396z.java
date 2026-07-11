package KfI;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: KfI.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1396z {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f5761t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5762n;
    private final String rl;

    /* JADX INFO: renamed from: KfI.z$j */
    public static final class j {

        /* JADX INFO: renamed from: KfI.z$j$j, reason: collision with other inner class name */
        static final class C0196j extends ContinuationImpl {
            int J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f5764n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f5765t;

            C0196j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f5765t = obj;
                this.J2 |= Integer.MIN_VALUE;
                return j.this.n(null, this);
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [s9b.I28] */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, s9b.I28] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object n(s9b.I28 i28, Continuation continuation) {
            C0196j c0196j;
            ?? r10;
            String str;
            ?? r9;
            if (continuation instanceof C0196j) {
                c0196j = (C0196j) continuation;
                int i2 = c0196j.J2;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0196j.J2 = i2 - Integer.MIN_VALUE;
                } else {
                    c0196j = new C0196j(continuation);
                }
            }
            Object objN = c0196j.f5765t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c0196j.J2;
            String str2 = "";
            try {
                try {
                } catch (Exception e2) {
                    Log.w("InstallationId", "Error getting authentication token.", e2);
                    r10 = i28;
                    str = "";
                }
            } catch (Exception e3) {
                Log.w("InstallationId", "Error getting Firebase installation id .", e3);
                r9 = i28;
            }
            if (i3 == 0) {
                ResultKt.throwOnFailure(objN);
                Task taskN = i28.n(false);
                Intrinsics.checkNotNullExpressionValue(taskN, "firebaseInstallations.getToken(false)");
                c0196j.f5764n = i28;
                c0196j.J2 = 1;
                objN = oM.n.n(taskN, c0196j);
                i28 = i28;
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) c0196j.f5764n;
                    ResultKt.throwOnFailure(objN);
                    i28 = str3;
                    Intrinsics.checkNotNullExpressionValue(objN, "{\n          firebaseInst…ions.id.await()\n        }");
                    str2 = (String) objN;
                    r9 = i28;
                    return new C1396z(str2, r9, null);
                }
                s9b.I28 i282 = (s9b.I28) c0196j.f5764n;
                ResultKt.throwOnFailure(objN);
                i28 = i282;
            }
            String strRl = ((com.google.firebase.installations.Wre) objN).rl();
            Intrinsics.checkNotNullExpressionValue(strRl, "{\n          firebaseInst…).await().token\n        }");
            r10 = i28;
            str = strRl;
            Task id = r10.getId();
            Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallations.id");
            c0196j.f5764n = str;
            c0196j.J2 = 2;
            objN = oM.n.n(id, c0196j);
            i28 = str;
        }
    }

    public /* synthetic */ C1396z(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private C1396z(String str, String str2) {
        this.f5762n = str;
        this.rl = str2;
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f5762n;
    }
}
