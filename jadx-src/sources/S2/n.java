package S2;

import S2.w6;
import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f8918n;

    public static final class j implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f8919n;
        final /* synthetic */ long nr;
        final /* synthetic */ InstallReferrerClient rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Continuation f8920t;

        /* JADX INFO: renamed from: S2.n$j$j, reason: collision with other inner class name */
        static final class C0301j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ InstallReferrerClient f8921n;

            C0301j(InstallReferrerClient installReferrerClient) {
                this.f8921n = installReferrerClient;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final ReferrerDetails invoke() {
                return this.f8921n.rl();
            }
        }

        j(Ref.BooleanRef booleanRef, InstallReferrerClient installReferrerClient, Continuation continuation, long j2) {
            this.f8919n = booleanRef;
            this.rl = installReferrerClient;
            this.f8920t = continuation;
            this.nr = j2;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void n(int i2) {
            Ref.BooleanRef booleanRef = this.f8919n;
            if (booleanRef.element) {
                return;
            }
            booleanRef.element = true;
            if (i2 != 0) {
                this.rl.n();
                xFr.n.n(this.f8920t, new n.C1266n(new w6.Ml(i2)));
                return;
            }
            Object objN = x0X.w6.n(new C0301j(this.rl));
            if (objN instanceof n.C1266n) {
                objN = new n.C1266n(new w6.n((Throwable) ((n.C1266n) objN).n()));
            } else if (!(objN instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(objN instanceof n.C1266n)) {
                if (!(objN instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objN2 = ((n.w6) objN).n();
                objN = objN2 != null ? new n.w6(objN2) : new n.C1266n(w6.j.f8923n);
            }
            long j2 = this.nr;
            if (!(objN instanceof n.C1266n)) {
                if (!(objN instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                ReferrerDetails referrerDetails = (ReferrerDetails) ((n.w6) objN).n();
                objN = new n.w6(new S2.j(System.currentTimeMillis() - j2, referrerDetails.nr(), referrerDetails.O(), referrerDetails.n(), referrerDetails.rl(), referrerDetails.t(), referrerDetails.J2(), referrerDetails.Uo()));
            }
            this.rl.n();
            xFr.n.n(this.f8920t, objN);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void rl() {
            Ref.BooleanRef booleanRef = this.f8919n;
            if (booleanRef.element) {
                return;
            }
            booleanRef.element = true;
            xFr.n.n(this.f8920t, new n.C1266n(w6.C0302w6.f8925n));
        }
    }

    public n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8918n = context;
    }

    public final Object n(Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        long jCurrentTimeMillis = System.currentTimeMillis();
        InstallReferrerClient installReferrerClientN = InstallReferrerClient.t(this.f8918n).n();
        installReferrerClientN.nr(new j(new Ref.BooleanRef(), installReferrerClientN, safeContinuation, jCurrentTimeMillis));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
