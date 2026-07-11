package sP;

import GJW.OU;
import GJW.lej;
import GJW.vd;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import d8q.j;
import java.util.zip.ZipInputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX implements sP.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73242n;
    private final Lazy nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w6 f73243t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73245n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73246t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73246t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return fuX.this.n(this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73247n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73249n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ fuX f73250t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(fuX fux, Continuation continuation) {
                super(2, continuation);
                this.f73250t = fux;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f73250t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73249n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    w6 w6Var = this.f73250t.f73243t;
                    String strGh = this.f73250t.gh();
                    ZipInputStream zipInputStream = new ZipInputStream(this.f73250t.f73242n.getAssets().open(this.f73250t.rl));
                    this.f73249n = 1;
                    if (w6Var.mUb(strGh, zipInputStream, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        n(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return fuX.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73247n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                lej lejVarRl = OU.rl();
                j jVar = new j(fuX.this, null);
                this.f73247n = 1;
                if (GJW.Dsr.Uo(lejVarRl, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public fuX(Context context, String zippedAssetPath, w6 fileManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zippedAssetPath, "zippedAssetPath");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        this.f73242n = context;
        this.rl = zippedAssetPath;
        this.f73243t = fileManager;
        this.nr = LazyKt.lazy(new Function0() { // from class: sP.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.mUb(this.f73217n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az() {
        return "Assets initialized.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String gh() {
        return (String) this.nr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(fuX fux) {
        String strRemoveSuffix;
        String lastPathSegment = Uri.parse(fux.rl).getLastPathSegment();
        if (lastPathSegment != null && (strRemoveSuffix = StringsKt.removeSuffix(lastPathSegment, (CharSequence) ".zip")) != null) {
            return strRemoveSuffix;
        }
        throw new IllegalArgumentException("Invalid asset path: " + fux.rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qie(Throwable th) {
        return "Error copying asset and unzipping: " + th;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[PHI: r2
      0x00ab: PHI (r2v7 x0X.n) = (r2v4 x0X.n), (r2v4 x0X.n), (r2v11 x0X.n) binds: [B:33:0x009c, B:35:0x00a8, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sP.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        x0X.n nVar;
        KW9.Wre wreJ2;
        x0X.n nVar2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objUo = jVar.f73246t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            n nVar3 = new n(null);
            jVar.J2 = 1;
            objUo = x0X.w6.Uo(nVar3, jVar);
            if (objUo != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar2 = (x0X.n) jVar.f73245n;
                ResultKt.throwOnFailure(objUo);
                nVar = nVar2;
                KW9.j.f5464n.n("LocalAssetProvider", new Function0() { // from class: sP.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.az();
                    }
                });
                return nVar;
            }
            nVar = (x0X.n) jVar.f73245n;
            ResultKt.throwOnFailure(objUo);
            wreJ2 = KW9.Wre.rl.J2();
            if (wreJ2 != null) {
                jVar.f73245n = nVar;
                jVar.J2 = 3;
                if (wreJ2.ck(true, jVar) != coroutine_suspended) {
                    nVar2 = nVar;
                    nVar = nVar2;
                }
                return coroutine_suspended;
            }
            KW9.j.f5464n.n("LocalAssetProvider", new Function0() { // from class: sP.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.az();
                }
            });
            return nVar;
        }
        ResultKt.throwOnFailure(objUo);
        x0X.n c1266n = (x0X.n) objUo;
        if (c1266n instanceof n.C1266n) {
            final Throwable th = (Throwable) ((n.C1266n) c1266n).n();
            KW9.j.f5464n.n("LocalAssetProvider", new Function0() { // from class: sP.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.qie(th);
                }
            });
            c1266n = new n.C1266n(new j.C0835j(th));
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        nVar = c1266n;
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        KW9.Wre wreJ22 = KW9.Wre.rl.J2();
        if (wreJ22 != null) {
            jVar.f73245n = nVar;
            jVar.J2 = 2;
            if (wreJ22.HI("hardcoded", jVar) != coroutine_suspended) {
                wreJ2 = KW9.Wre.rl.J2();
                if (wreJ2 != null) {
                }
            }
            return coroutine_suspended;
        }
        KW9.j.f5464n.n("LocalAssetProvider", new Function0() { // from class: sP.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.az();
            }
        });
        return nVar;
    }

    @Override // sP.j
    public Object rl(Continuation continuation) {
        return "https://appassets.androidplatform.net/injet/" + gh() + KfLR.yUsIlIILfFWFKjn;
    }
}
