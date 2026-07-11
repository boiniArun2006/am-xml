package ase;

import LQ.CN3;
import LQ.fuX;
import LQ.j;
import android.content.ContentResolver;
import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {

    static final class j extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f43103O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f43104Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43105n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f43106o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f43107r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43108t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43106o = obj;
            this.f43104Z |= Integer.MIN_VALUE;
            return Ml.rl(null, null, null, 0, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    public static /* synthetic */ Object O(w6 w6Var, Context context, Uri uri, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return nr(w6Var, context, uri, i2, continuation);
    }

    public static final Object nr(w6 w6Var, Context context, Uri uri, int i2, Continuation continuation) {
        if (Build.VERSION.SDK_INT >= 26) {
            return rl(w6Var, context, uri, i2, continuation);
        }
        Object objT = t(w6Var, uri, i2, continuation);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : (LQ.j) objT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12, types: [LQ.fuX] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(w6 w6Var, Context context, Uri uri, int i2, Continuation continuation) throws fuX.j, IOException {
        j jVar;
        w6 w6Var2;
        CN3 cn3;
        CN3 cn32;
        Closeable closeable;
        Closeable closeable2;
        Throwable th;
        CN3 cn33;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.f43104Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f43104Z = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objN = jVar.f43106o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = jVar.f43104Z;
        try {
            try {
                if (i5 == 0) {
                    ResultKt.throwOnFailure(objN);
                    fuX fux = new fuX();
                    try {
                        if (!Intrinsics.areEqual(uri.getScheme(), FileUploadManager.f61570h) && !Intrinsics.areEqual(uri.getScheme(), AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                            throw new IllegalArgumentException(("Only the SCHEME_FILE and SCHEME_CONTENT are supported. Found path: " + ((Object) uri)).toString());
                        }
                        ContentResolver contentResolver = context.getContentResolver();
                        Intrinsics.checkNotNullExpressionValue(contentResolver, "context.contentResolver");
                        jVar.f43105n = w6Var;
                        jVar.f43108t = fux;
                        jVar.f43103O = fux;
                        jVar.J2 = fux;
                        jVar.f43107r = i2;
                        jVar.f43104Z = 1;
                        Object objN2 = v9.w6.n(contentResolver, uri, "w", jVar);
                        if (objN2 != coroutine_suspended) {
                            w6Var2 = w6Var;
                            cn3 = fux;
                            CN3 cn34 = cn3;
                            objN = objN2;
                            cn32 = cn34;
                            uri = cn34;
                        }
                        return coroutine_suspended;
                    } catch (fuX.j e2) {
                        e = e2;
                        uri = fux;
                        if (e.rl() == uri) {
                            return new j.n(e.n());
                        }
                        throw e;
                    }
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CN3 cn35 = (CN3) jVar.f43103O;
                    closeable2 = (Closeable) jVar.f43108t;
                    uri = (fuX) jVar.f43105n;
                    try {
                        ResultKt.throwOnFailure(objN);
                        cn33 = cn35;
                        uri = uri;
                        MediaMuxer mediaMuxer = (MediaMuxer) cn33.O((LQ.j) objN);
                        CloseableKt.closeFinally(closeable2, null);
                        return new j.w6(mediaMuxer);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(closeable2, th);
                            throw th3;
                        }
                    }
                }
                i2 = jVar.f43107r;
                cn3 = (CN3) jVar.J2;
                CN3 cn36 = (CN3) jVar.f43103O;
                fuX fux2 = (fuX) jVar.f43108t;
                w6Var2 = (w6) jVar.f43105n;
                ResultKt.throwOnFailure(objN);
                cn32 = cn36;
                uri = fux2;
                FileDescriptor fileDescriptor = ((ParcelFileDescriptor) closeable).getFileDescriptor();
                Intrinsics.checkNotNullExpressionValue(fileDescriptor, "fileDescriptor.fileDescriptor");
                jVar.f43105n = uri;
                jVar.f43108t = closeable;
                jVar.f43103O = cn32;
                jVar.J2 = null;
                jVar.f43104Z = 2;
                objN = w6Var2.n(fileDescriptor, i2, jVar);
                if (objN != coroutine_suspended) {
                    CN3 cn37 = cn32;
                    closeable2 = closeable;
                    cn33 = cn37;
                    uri = uri;
                    MediaMuxer mediaMuxer2 = (MediaMuxer) cn33.O((LQ.j) objN);
                    CloseableKt.closeFinally(closeable2, null);
                    return new j.w6(mediaMuxer2);
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                closeable2 = closeable;
                th = th4;
                throw th;
            }
            closeable = (Closeable) cn3.O((LQ.j) objN);
        } catch (fuX.j e3) {
            e = e3;
        }
    }

    private static final Object t(w6 w6Var, Uri uri, int i2, Continuation continuation) {
        if (Intrinsics.areEqual(uri.getScheme(), FileUploadManager.f61570h)) {
            String path = uri.getPath();
            if (path != null) {
                Intrinsics.checkNotNullExpressionValue(path, "checkNotNull(outputUri.p…in the Uri: $outputUri\" }");
                return w6Var.rl(path, i2, continuation);
            }
            throw new IllegalStateException(("Null path in the Uri: " + uri).toString());
        }
        throw new IllegalArgumentException(("Only the SCHEME_FILE is supported on android versions < O. Found path: " + uri).toString());
    }
}
