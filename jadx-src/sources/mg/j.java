package mg;

import GJW.Dsr;
import GJW.OU;
import GJW.vd;
import LQ.CN3;
import LQ.fuX;
import LQ.j;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.Closeable;
import java.io.InputStream;
import kG.CN3;
import kG.fuX;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements fuX {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Ml f70954O = new Ml(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CoroutineContext f70955n;
    private final Function1 nr;
    private final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f70956t;

    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f70957O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70958n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f70959r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70960t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70957O = obj;
            this.f70959r |= Integer.MIN_VALUE;
            return j.this.n(null, null, this);
        }
    }

    private static final class Ml {
        public /* synthetic */ Ml(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Ml() {
        }
    }

    public static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ CN3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f70961O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ j f70962Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70963n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Uri f70964o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f70965r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f70966t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Ref.ObjectRef objectRef, Continuation continuation, CN3 cn3, Context context, Uri uri, j jVar) {
            super(2, continuation);
            this.f70961O = objectRef;
            this.J2 = cn3;
            this.f70965r = context;
            this.f70964o = uri;
            this.f70962Z = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = new Wre(this.f70961O, continuation, this.J2, this.f70965r, this.f70964o, this.f70962Z);
            wre.f70966t = obj;
            return wre;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object, mg.w6] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws fuX.j {
            int iIntValue;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f70963n == 0) {
                ResultKt.throwOnFailure(obj);
                CN3 cn3 = this.J2;
                ContentResolver contentResolver = this.f70965r.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver, "context.contentResolver");
                LQ.j jVarRl = v9.w6.rl(contentResolver, this.f70964o);
                if (jVarRl instanceof j.n) {
                    jVarRl = new j.n(new CN3.j((t2.w6) ((j.n) jVarRl).n()));
                } else if (!(jVarRl instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Closeable closeable = (Closeable) cn3.O(jVarRl);
                try {
                    InputStream inputStream = (InputStream) closeable;
                    UnP.w6 w6Var = (UnP.w6) this.f70962Z.rl.invoke();
                    lT.j jVar = (lT.j) this.f70962Z.f70956t.invoke(w6Var);
                    f6d.j jVar2 = (f6d.j) this.f70962Z.nr.invoke(jVar);
                    ContentResolver contentResolver2 = this.f70965r.getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver2, "context.contentResolver");
                    Integer numRl = mg.n.rl(contentResolver2, this.f70964o);
                    if (numRl != null) {
                        iIntValue = numRl.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    LQ.CN3 cn32 = this.J2;
                    LQ.j jVarUo = this.f70962Z.Uo(jVar2, inputStream, iIntValue);
                    if (jVarUo instanceof j.n) {
                        jVar2.clear();
                    } else {
                        boolean z2 = jVarUo instanceof j.w6;
                    }
                    cn32.O(jVarUo);
                    int iN = jVar2.n();
                    LQ.CN3 cn33 = this.J2;
                    boolean z3 = true;
                    if (iN <= 1) {
                        z3 = false;
                    }
                    if (z3) {
                        this.f70962Z.KN(w6Var, new Oe.w6(jVar2.getWidth(), jVar2.getHeight()));
                        ?? w6Var2 = new mg.w6(jVar2, jVar, null, 4, null);
                        CloseableKt.closeFinally(closeable, null);
                        this.f70961O.element = w6Var2;
                        return w6Var2;
                    }
                    jVar2.clear();
                    cn33.n(new CN3.n("Invalid GIF found at " + this.f70964o + "! This GIF is not an animation and should be treated as a normal static image."));
                    throw new KotlinNothingValueException();
                } finally {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: mg.j$j, reason: collision with other inner class name */
    public static final class C1061j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1061j f70967n = new C1061j();

        C1061j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final UnP.I28 invoke() {
            return new UnP.I28(1L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f70968n = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final lT.j invoke(UnP.w6 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new lT.j(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f70969n = new w6();

        w6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final f6d.I28 invoke(lT.j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new f6d.I28(it);
        }
    }

    public j(CoroutineContext readGIFContext, Function0 bitmapPoolProvider, Function1 gifBitmapProvider, Function1 gifDecoderFactory) {
        Intrinsics.checkNotNullParameter(readGIFContext, "readGIFContext");
        Intrinsics.checkNotNullParameter(bitmapPoolProvider, "bitmapPoolProvider");
        Intrinsics.checkNotNullParameter(gifBitmapProvider, "gifBitmapProvider");
        Intrinsics.checkNotNullParameter(gifDecoderFactory, "gifDecoderFactory");
        this.f70955n = readGIFContext;
        this.rl = bitmapPoolProvider;
        this.f70956t = gifBitmapProvider;
        this.nr = gifDecoderFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kG.fuX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Context context, Uri uri, Continuation continuation) throws fuX.j {
        I28 i28;
        LQ.fuX fux;
        Throwable th;
        Ref.ObjectRef objectRef;
        LQ.fuX fux2;
        fuX.j jVar;
        Object objM313constructorimpl;
        w9.fuX fux3;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f70959r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f70959r = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objUo = i28.f70957O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f70959r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            fux = new LQ.fuX();
            try {
                CoroutineContext coroutineContext = this.f70955n;
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Wre wre = new Wre(objectRef2, null, fux, context, uri, this);
                    i28.f70958n = fux;
                    i28.f70960t = objectRef2;
                    i28.f70959r = 1;
                    objUo = Dsr.Uo(coroutineContext, wre, i28);
                    if (objUo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                    fux2 = fux;
                } catch (Throwable th2) {
                    th = th2;
                    objectRef = objectRef2;
                    fux2 = fux;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
            } catch (fuX.j e2) {
                jVar = e2;
                if (jVar.rl() != fux) {
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) i28.f70960t;
            fux2 = (LQ.fuX) i28.f70958n;
            try {
                ResultKt.throwOnFailure(objUo);
            } catch (Throwable th3) {
                th = th3;
                try {
                    Result.Companion companion22 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                } catch (fuX.j e3) {
                    jVar = e3;
                    fux = fux2;
                    if (jVar.rl() != fux) {
                        return new j.n(jVar.n());
                    }
                    throw jVar;
                }
            }
        }
        objM313constructorimpl = Result.m313constructorimpl((w9.fuX) objUo);
        fux = fux2;
        if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null && (fux3 = (w9.fuX) objectRef.element) != null) {
            fux3.release();
        }
        ResultKt.throwOnFailure(objM313constructorimpl);
        return new j.w6((mg.w6) objM313constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KN(UnP.w6 w6Var, Oe.w6 w6Var2) {
        w6Var.rl((float) Math.ceil(((w6Var2.t() * w6Var2.rl()) * 4) / w6Var.nr()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LQ.j Uo(f6d.j jVar, InputStream inputStream, int i2) {
        int iRl = jVar.rl(inputStream, i2);
        if (iRl != 0) {
            if (iRl != 1) {
                return new j.n(new kG.Ml("GIFDecoder returned status " + iRl));
            }
            return new j.n(new kG.n("GIFDecoder returned status " + iRl));
        }
        return new j.w6(Unit.INSTANCE);
    }

    public /* synthetic */ j(CoroutineContext coroutineContext, Function0 function0, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? OU.rl() : coroutineContext, (i2 & 2) != 0 ? C1061j.f70967n : function0, (i2 & 4) != 0 ? n.f70968n : function1, (i2 & 8) != 0 ? w6.f70969n : function12);
    }
}
