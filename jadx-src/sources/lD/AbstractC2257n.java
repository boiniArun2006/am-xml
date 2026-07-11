package lD;

import LQ.fuX;
import LQ.j;
import MoG.o;
import N1.Wre;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.Closeable;
import java.io.InputStream;
import kG.CN3;
import kG.fuX;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import w9.Dsr;

/* JADX INFO: renamed from: lD.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC2257n {

    /* JADX INFO: renamed from: lD.n$j */
    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f70393O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70394n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70395t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70393O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return AbstractC2257n.n(null, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(Context context, Uri uri, Wre wre, Continuation continuation) {
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
        Object objN = jVar.f70393O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            fuX fuxN = JI5.j.n();
            jVar.f70394n = uri;
            jVar.f70395t = wre;
            jVar.J2 = 1;
            objN = fuxN.n(context, uri, jVar);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            uri2 = uri;
            wre2 = wre;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre2 = (Wre) jVar.f70395t;
            Uri uri3 = (Uri) jVar.f70394n;
            ResultKt.throwOnFailure(objN);
            uri2 = uri3;
        }
        Object w6Var = (LQ.j) objN;
        if (!(w6Var instanceof j.n)) {
            if (!(w6Var instanceof j.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            kG.Wre wre3 = (kG.Wre) ((j.w6) w6Var).n();
            try {
                o oVar = new o(uri2, d2n.j.f63374t.nr(wre3.getRange().t()), new Oe.j(wre3.getSize(), 0), null);
                Dsr.n(wre3, null);
                w6Var = new j.w6(Wre.rl(wre2, null, null, null, null, d2n.j.rl(oVar.rl()), null, null, null, oVar, 239, null));
            } finally {
            }
        }
        if (w6Var instanceof j.n) {
            return new j.n(new N1.Ml((CN3) ((j.n) w6Var).n()));
        }
        if (w6Var instanceof j.w6) {
            return w6Var;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean rl(Uri uri, ContentResolver resolver) throws fuX.j {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        LQ.j jVarRl = v9.w6.rl(resolver, uri);
        if (jVarRl instanceof j.n) {
            return false;
        }
        if (!(jVarRl instanceof j.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Closeable closeable = (Closeable) ((j.w6) jVarRl).n();
        try {
            InputStream inputStream = (InputStream) closeable;
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 3; i2++) {
                sb.append((char) inputStream.read());
            }
            boolean zAreEqual = Intrinsics.areEqual(sb.toString(), "GIF");
            CloseableKt.closeFinally(closeable, null);
            return zAreEqual;
        } finally {
        }
    }
}
