package Kp;

import GJW.Lu;
import GJW.OU;
import GJW.P;
import HI0.afx;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final yB.j f5857n = yB.CN3.rl(false, 1, null);
    private static final Wzh.j rl = new Wzh.j(Lu.n(OU.rl()), null, 2, 0 == true ? 1 : 0);

    static final class j extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f5858O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5859n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5860r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f5861t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f5860r |= Integer.MIN_VALUE;
            return n.n(null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: Kp.n$n, reason: collision with other inner class name */
    static final class C0199n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Uri f5862O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5863n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f5864t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0199n(Context context, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f5864t = context;
            this.f5862O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0199n(this.f5864t, this.f5862O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5863n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = this.f5864t;
            Uri uri = this.f5862O;
            this.f5863n = 1;
            Object objT = N1.j.t(context, uri, this);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objT;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Uri uri, Continuation continuation) {
            return ((C0199n) create(uri, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(Context context, Uri uri, Continuation continuation) {
        j jVar;
        yB.j jVar2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f5860r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f5860r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f5860r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (Intrinsics.areEqual(uri.getScheme(), "am")) {
                    File fileGh = afx.gh(context);
                    String schemeSpecificPart = uri.getSchemeSpecificPart();
                    Intrinsics.checkNotNullExpressionValue(schemeSpecificPart, "getSchemeSpecificPart(...)");
                    uri = Uri.fromFile(FilesKt.resolve(fileGh, schemeSpecificPart));
                }
                jVar2 = f5857n;
                jVar.f5859n = context;
                jVar.f5861t = uri;
                jVar.f5858O = jVar2;
                jVar.f5860r = 1;
                if (jVar2.Z(null, jVar) != coroutine_suspended) {
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            yB.j jVar3 = (yB.j) jVar.f5858O;
            uri = (Uri) jVar.f5861t;
            Context context2 = (Context) jVar.f5859n;
            ResultKt.throwOnFailure(obj);
            jVar2 = jVar3;
            context = context2;
            P pMUb = rl.mUb(uri, new C0199n(context, uri, null));
            jVar2.T(null);
            jVar.f5859n = null;
            jVar.f5861t = null;
            jVar.f5858O = null;
            jVar.f5860r = 2;
            Object objAwait = pMUb.await(jVar);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        } catch (Throwable th) {
            jVar2.T(null);
            throw th;
        }
    }
}
