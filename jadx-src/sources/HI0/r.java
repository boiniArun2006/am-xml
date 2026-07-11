package HI0;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class r {

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f3877O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3878n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3879t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3877O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return r.n(null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Uri f3880O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3881n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Q f3882t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Q q2, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f3882t = q2;
            this.f3880O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f3882t, this.f3880O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3881n == 0) {
                ResultKt.throwOnFailure(obj);
                this.f3882t.nr(this.f3880O, "r").close();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(Q q2, Uri uri, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f3877O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (Intrinsics.areEqual(uri.getScheme(), kPg.fuX.f69922n.rl())) {
                    return UGc.f3841n;
                }
                GJW.lej lejVarRl = GJW.OU.rl();
                n nVar = new n(q2, uri, null);
                jVar.f3878n = q2;
                jVar.f3879t = uri;
                jVar.J2 = 1;
                if (GJW.Dsr.Uo(lejVarRl, nVar, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uri = (Uri) jVar.f3879t;
                ResultKt.throwOnFailure(obj);
            }
            return UGc.f3841n;
        } catch (FileNotFoundException unused) {
            return UGc.f3843t;
        } catch (IOException e2) {
            XoT.C.ty(q2, "Error checking if file exists: " + uri, e2);
            return UGc.f3840O;
        } catch (SecurityException e3) {
            XoT.C.ty(q2, "Error checking if file exists: " + uri, e3);
            return UGc.f3840O;
        }
    }
}
