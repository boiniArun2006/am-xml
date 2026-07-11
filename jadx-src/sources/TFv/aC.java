package TFv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract /* synthetic */ class aC {

    static final class j extends ContinuationImpl {
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f10373O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10374n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f10375o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f10376r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f10377t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10376r = obj;
            this.f10375o |= Integer.MIN_VALUE;
            return aC.nr(null, null, false, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    public static final Object t(CN3 cn3, ILs.Q q2, Continuation continuation) {
        Object objNr = nr(cn3, q2, true, continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    public static final Wre O(ILs.Q q2) {
        return new w6(q2, false, null, 0, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.rl(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(CN3 cn3, ILs.Q q2, boolean z2, Continuation continuation) {
        j jVar;
        ILs.Dsr it;
        ILs.Dsr dsr;
        CN3 cn32;
        Object objRl;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f10375o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f10375o = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f10376r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f10375o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                fuX.WPU(cn3);
                it = q2.iterator();
                jVar.f10374n = cn3;
                jVar.f10377t = q2;
                jVar.f10373O = it;
                jVar.J2 = z2;
                jVar.f10375o = 1;
                objRl = it.rl(jVar);
                if (objRl != coroutine_suspended) {
                }
            } else if (i3 == 1) {
                z2 = jVar.J2;
                dsr = (ILs.Dsr) jVar.f10373O;
                q2 = (ILs.Q) jVar.f10377t;
                cn32 = (CN3) jVar.f10374n;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = jVar.J2;
                dsr = (ILs.Dsr) jVar.f10373O;
                q2 = (ILs.Q) jVar.f10377t;
                cn32 = (CN3) jVar.f10374n;
                ResultKt.throwOnFailure(obj);
                it = dsr;
                cn3 = cn32;
                jVar.f10374n = cn3;
                jVar.f10377t = q2;
                jVar.f10373O = it;
                jVar.J2 = z2;
                jVar.f10375o = 1;
                objRl = it.rl(jVar);
                if (objRl != coroutine_suspended) {
                    return coroutine_suspended;
                }
                cn32 = cn3;
                dsr = it;
                obj = objRl;
                if (((Boolean) obj).booleanValue()) {
                    if (z2) {
                        ILs.Pl.n(q2, null);
                    }
                    return Unit.INSTANCE;
                }
                Object next = dsr.next();
                jVar.f10374n = cn32;
                jVar.f10377t = q2;
                jVar.f10373O = dsr;
                jVar.J2 = z2;
                jVar.f10375o = 2;
            }
        } finally {
        }
    }

    public static final Wre rl(ILs.Q q2) {
        return new w6(q2, true, null, 0, null, 28, null);
    }
}
