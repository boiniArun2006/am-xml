package v9;

import GJW.OU;
import GJW.lej;
import GJW.vd;
import LQ.fuX;
import LQ.j;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import t2.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f74678O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74679n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74680t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74678O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return w6.n(null, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    public static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ LQ.CN3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f74681O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ String f74682Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74683n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Uri f74684o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ContentResolver f74685r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f74686t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.ObjectRef objectRef, Continuation continuation, LQ.CN3 cn3, ContentResolver contentResolver, Uri uri, String str) {
            super(2, continuation);
            this.f74681O = objectRef;
            this.J2 = cn3;
            this.f74685r = contentResolver;
            this.f74684o = uri;
            this.f74682Z = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f74681O, continuation, this.J2, this.f74685r, this.f74684o, this.f74682Z);
            nVar.f74686t = obj;
            return nVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, android.os.ParcelFileDescriptor, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f74683n == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    LQ.CN3 cn3 = this.J2;
                    ?? OpenFileDescriptor = this.f74685r.openFileDescriptor(this.f74684o, this.f74682Z);
                    if (OpenFileDescriptor != 0) {
                        Intrinsics.checkNotNullExpressionValue(OpenFileDescriptor, "try {\n            ensure…nownError(ise))\n        }");
                        this.f74681O.element = OpenFileDescriptor;
                        return OpenFileDescriptor;
                    }
                    cn3.n(w6.j.f73440n);
                    throw new KotlinNothingValueException();
                } catch (FileNotFoundException e2) {
                    this.J2.n(new t2.Ml(e2));
                    throw new KotlinNothingValueException();
                } catch (IllegalStateException e3) {
                    this.J2.n(new w6.n(e3));
                    throw new KotlinNothingValueException();
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(ContentResolver contentResolver, Uri uri, String str, Continuation continuation) throws fuX.j, IOException {
        j jVar;
        LQ.fuX fux;
        Throwable th;
        Ref.ObjectRef objectRef;
        LQ.fuX fux2;
        fuX.j jVar2;
        Object objM313constructorimpl;
        Closeable closeable;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objUo = jVar.f74678O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            fux = new LQ.fuX();
            try {
                lej lejVarRl = OU.rl();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    n nVar = new n(objectRef2, null, fux, contentResolver, uri, str);
                    jVar.f74679n = fux;
                    jVar.f74680t = objectRef2;
                    jVar.J2 = 1;
                    objUo = GJW.Dsr.Uo(lejVarRl, nVar, jVar);
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
                jVar2 = e2;
                if (jVar2.rl() != fux) {
                    return new j.n(jVar2.n());
                }
                throw jVar2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) jVar.f74680t;
            fux2 = (LQ.fuX) jVar.f74679n;
            try {
                ResultKt.throwOnFailure(objUo);
            } catch (Throwable th3) {
                th = th3;
                try {
                    Result.Companion companion22 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                } catch (fuX.j e3) {
                    jVar2 = e3;
                    fux = fux2;
                    if (jVar2.rl() != fux) {
                    }
                }
            }
        }
        objM313constructorimpl = Result.m313constructorimpl((Closeable) objUo);
        fux = fux2;
        if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null && (closeable = (Closeable) objectRef.element) != null) {
            closeable.close();
        }
        ResultKt.throwOnFailure(objM313constructorimpl);
        return new j.w6((ParcelFileDescriptor) objM313constructorimpl);
    }

    public static final LQ.j rl(ContentResolver contentResolver, Uri uri) throws fuX.j {
        Intrinsics.checkNotNullParameter(contentResolver, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        LQ.fuX fux = new LQ.fuX();
        try {
            try {
                try {
                    try {
                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                        if (inputStreamOpenInputStream != null) {
                            return new j.w6(inputStreamOpenInputStream);
                        }
                        fux.n(w6.j.f73440n);
                        throw new KotlinNothingValueException();
                    } catch (SecurityException e2) {
                        fux.n(new t2.CN3(e2));
                        throw new KotlinNothingValueException();
                    }
                } catch (FileNotFoundException e3) {
                    fux.n(new t2.Ml(e3));
                    throw new KotlinNothingValueException();
                }
            } catch (IllegalStateException e4) {
                fux.n(new w6.n(e4));
                throw new KotlinNothingValueException();
            }
        } catch (fuX.j e5) {
            if (e5.rl() == fux) {
                return new j.n(e5.n());
            }
            throw e5;
        }
    }
}
