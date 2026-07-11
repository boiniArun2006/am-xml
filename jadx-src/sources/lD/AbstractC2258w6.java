package lD;

import GJW.Dsr;
import GJW.OU;
import GJW.vd;
import LQ.CN3;
import LQ.fuX;
import LQ.j;
import MoG.qz;
import N1.Wre;
import Oe.j;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t2.I28;

/* JADX INFO: renamed from: lD.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC2258w6 {

    /* JADX INFO: renamed from: lD.w6$j */
    static final class j extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f70396O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f70397Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70398n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f70399o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f70400r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70401t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70399o = obj;
            this.f70397Z |= Integer.MIN_VALUE;
            return AbstractC2258w6.J2(null, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: lD.w6$n */
    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Uri f70402O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70403n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f70404t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Context context, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f70404t = context;
            this.f70402O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f70404t, this.f70402O, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x018d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws fuX.j {
            LQ.j nVar;
            Object w6Var;
            LQ.j nVar2;
            LQ.j jVarN;
            InputStream inputStream;
            LQ.j jVarN2;
            Object objM313constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f70403n == 0) {
                ResultKt.throwOnFailure(obj);
                j.C0208j c0208j = LQ.j.f6082n;
                Context context = this.f70404t;
                Uri uri = this.f70402O;
                fuX fux = new fuX();
                try {
                    jVarN2 = v9.Ml.n(context, uri);
                } catch (fuX.j e2) {
                    if (e2.rl() == fux) {
                        nVar = new j.n(e2.n());
                    } else {
                        throw e2;
                    }
                }
                if (!(jVarN2 instanceof j.n)) {
                    if (jVarN2 instanceof j.w6) {
                        inputStream = (InputStream) ((j.w6) jVarN2).n();
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM313constructorimpl = Result.m313constructorimpl(new ExifInterface(inputStream));
                        } catch (Throwable th) {
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
                        if (thM316exceptionOrNullimpl == null) {
                            Oe.j jVar = (Oe.j) fux.O(AbstractC2258w6.mUb((ExifInterface) objM313constructorimpl));
                            CloseableKt.closeFinally(inputStream, null);
                            jVarN2 = new j.w6(jVar);
                        } else {
                            fux.n(new N1.Ml(thM316exceptionOrNullimpl));
                            throw new KotlinNothingValueException();
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(nVar instanceof j.n)) {
                        Object objN = ((j.n) nVar).n();
                        fuX fux2 = new fuX();
                        try {
                            jVarN = v9.Ml.n(context, uri);
                        } catch (fuX.j e3) {
                            if (e3.rl() == fux2) {
                                nVar2 = new j.n(e3.n());
                            } else {
                                throw e3;
                            }
                        }
                        if (!(jVarN instanceof j.n)) {
                            if (jVarN instanceof j.w6) {
                                inputStream = (InputStream) ((j.w6) jVarN).n();
                                try {
                                    Oe.j jVar2 = (Oe.j) fux2.O(AbstractC2258w6.gh(inputStream));
                                    CloseableKt.closeFinally(inputStream, null);
                                    jVarN = new j.w6(jVar2);
                                } finally {
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!(nVar2 instanceof j.n)) {
                                w6Var = new j.n(CollectionsKt.listOf(objN, ((j.n) nVar2).n()));
                            } else if (nVar2 instanceof j.w6) {
                                w6Var = new j.w6(((j.w6) nVar2).n());
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (jVarN instanceof j.n) {
                            jVarN = new j.n(AbstractC2256j.n((I28) ((j.n) jVarN).n()));
                        } else if (!(jVarN instanceof j.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar2 = new j.w6((Oe.j) fux2.O(jVarN));
                        if (!(nVar2 instanceof j.n)) {
                        }
                    } else if (nVar instanceof j.w6) {
                        w6Var = new j.w6(((j.w6) nVar).n());
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(w6Var instanceof j.n)) {
                        return new j.n(new N1.Ml((List) ((j.n) w6Var).n()));
                    }
                    if (w6Var instanceof j.w6) {
                        return w6Var;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (jVarN2 instanceof j.n) {
                    jVarN2 = new j.n(AbstractC2256j.n((I28) ((j.n) jVarN2).n()));
                } else if (!(jVarN2 instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar = new j.w6((Oe.j) fux.O(jVarN2));
                if (!(nVar instanceof j.n)) {
                }
                if (!(w6Var instanceof j.n)) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J2(Context context, Uri uri, Wre wre, Continuation continuation) throws fuX.j {
        j jVar;
        LQ.j nVar;
        Object w6Var;
        Uri uri2;
        Wre wre2;
        Object obj;
        fuX.j jVar2;
        fuX fux;
        CN3 cn3;
        LQ.j nVar2;
        Object w6Var2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f70397Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f70397Z = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        j jVar3 = jVar;
        Object objUo = jVar3.f70399o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar3.f70397Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            j.C0208j c0208j = LQ.j.f6082n;
            fuX fux2 = new fuX();
            try {
                LQ.j jVarKN = KN(context, uri);
                if (jVarKN instanceof j.n) {
                    jVarKN = new j.n(new N1.Ml((N1.n) ((j.n) jVarKN).n()));
                } else if (!(jVarKN instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar = new j.w6((Oe.j) fux2.O(jVarKN));
            } catch (fuX.j e2) {
                if (e2.rl() != fux2) {
                    throw e2;
                }
                nVar = new j.n(e2.n());
            }
            if (!(nVar instanceof j.n)) {
                if (!(nVar instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                w6Var = new j.w6(((j.w6) nVar).n());
                w6Var2 = w6Var;
                Wre wre3 = wre;
                if (!(w6Var2 instanceof j.n)) {
                    if (!(w6Var2 instanceof j.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w6Var2 = new j.w6(Wre.rl(wre3, null, null, null, null, null, null, null, new qz(uri, (Oe.j) ((j.w6) w6Var2).n()), null, 383, null));
                }
                if (!(w6Var2 instanceof j.n)) {
                    return new j.n(new N1.Ml((List) ((j.n) w6Var2).n()));
                }
                if (w6Var2 instanceof j.w6) {
                    return w6Var2;
                }
                throw new NoWhenBranchMatchedException();
            }
            Object objN = ((j.n) nVar).n();
            fuX fux3 = new fuX();
            try {
                jVar3.f70398n = uri;
                jVar3.f70401t = wre;
                jVar3.f70396O = fux3;
                jVar3.J2 = objN;
                jVar3.f70400r = fux3;
                jVar3.f70397Z = 1;
                objUo = Uo(context, uri, jVar3);
                if (objUo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uri2 = uri;
                wre2 = wre;
                obj = objN;
                fux = fux3;
                cn3 = fux;
            } catch (fuX.j e3) {
                uri2 = uri;
                wre2 = wre;
                obj = objN;
                jVar2 = e3;
                fux = fux3;
                if (jVar2.rl() == fux) {
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fux = (fuX) jVar3.f70400r;
            obj = jVar3.J2;
            cn3 = (CN3) jVar3.f70396O;
            wre2 = (Wre) jVar3.f70401t;
            uri2 = (Uri) jVar3.f70398n;
            try {
                ResultKt.throwOnFailure(objUo);
            } catch (fuX.j e4) {
                jVar2 = e4;
                if (jVar2.rl() == fux) {
                    throw jVar2;
                }
                nVar2 = new j.n(jVar2.n());
            }
        }
        nVar2 = new j.w6((Oe.j) cn3.O((LQ.j) objUo));
        wre = wre2;
        if (nVar2 instanceof j.n) {
            w6Var = new j.n(CollectionsKt.listOf(obj, ((j.n) nVar2).n()));
        } else {
            if (!(nVar2 instanceof j.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            w6Var = new j.w6(((j.w6) nVar2).n());
        }
        uri = uri2;
        w6Var2 = w6Var;
        Wre wre32 = wre;
        if (!(w6Var2 instanceof j.n)) {
        }
        if (!(w6Var2 instanceof j.n)) {
        }
    }

    private static final LQ.j KN(Context context, Uri uri) throws fuX.j {
        fuX fux = new fuX();
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"width", "height", "orientation"}, null, null, null);
            if (cursorQuery == null) {
                fux.n(new N1.Ml("Database cursor was null for uri: " + uri + '.'));
                throw new KotlinNothingValueException();
            }
            Intrinsics.checkNotNullExpressionValue(cursorQuery, "ensureNotNull(\n        c…s null for uri: $uri.\") }");
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("width");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("height");
                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("orientation");
                if (!cursorQuery.moveToFirst()) {
                    fux.n(new N1.Ml("No images found in database for uri " + uri));
                    throw new KotlinNothingValueException();
                }
                LQ.j jVarNr = nr(cursorQuery, columnIndexOrThrow, "width");
                if (jVarNr instanceof j.n) {
                    jVarNr = new j.n(new N1.Ml((String) ((j.n) jVarNr).n()));
                } else if (!(jVarNr instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iIntValue = ((Number) fux.O(jVarNr)).intValue();
                LQ.j jVarNr2 = nr(cursorQuery, columnIndexOrThrow2, "height");
                if (jVarNr2 instanceof j.n) {
                    jVarNr2 = new j.n(new N1.Ml((String) ((j.n) jVarNr2).n()));
                } else if (!(jVarNr2 instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iIntValue2 = ((Number) fux.O(jVarNr2)).intValue();
                Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow3) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow3));
                int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
                if (!(iIntValue > 0 || iIntValue2 > 0)) {
                    fux.n(new N1.Ml("Invalid media dimensions: width: " + iIntValue + ", height: " + iIntValue2 + " for uri: " + uri));
                    throw new KotlinNothingValueException();
                }
                j.n nVarRl = j.n.f7488t.rl(iIntValue3);
                if (nVarRl != null) {
                    Oe.j jVar = new Oe.j(new Oe.w6(iIntValue, iIntValue2), nVarRl);
                    CloseableKt.closeFinally(cursorQuery, null);
                    return new j.w6(jVar);
                }
                fux.n(new N1.Ml("Invalid media orientation: " + iIntValue3 + " for uri: " + uri));
                throw new KotlinNothingValueException();
            } finally {
            }
        } catch (fuX.j e2) {
            if (e2.rl() == fux) {
                return new j.n(e2.n());
            }
            throw e2;
        }
    }

    private static final Integer O(ExifInterface exifInterface) {
        Integer numValueOf = Integer.valueOf(exifInterface.Uo("ImageWidth", -1));
        if (numValueOf.intValue() > 0) {
            return numValueOf;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LQ.j gh(InputStream inputStream) throws fuX.j {
        fuX fux = new fuX();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean z2 = true;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStream, null, options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (i2 <= 0 || i3 <= 0) {
                z2 = false;
            }
            if (z2) {
                return new j.w6(new Oe.j(new Oe.w6(i2, i3), j.n.DEGREE_0));
            }
            fux.n(new N1.Ml("Found width " + i2 + " and height " + i3 + '.'));
            throw new KotlinNothingValueException();
        } catch (fuX.j e2) {
            if (e2.rl() == fux) {
                return new j.n(e2.n());
            }
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LQ.j mUb(ExifInterface exifInterface) throws fuX.j {
        fuX fux = new fuX();
        try {
            Integer numO = O(exifInterface);
            if (numO == null) {
                fux.n(new N1.Ml("No width found in ExifInterface."));
                throw new KotlinNothingValueException();
            }
            int iIntValue = numO.intValue();
            Integer numT = t(exifInterface);
            if (numT != null) {
                return new j.w6(new Oe.j(new Oe.w6(iIntValue, numT.intValue()), exifInterface.ck()));
            }
            fux.n(new N1.Ml("No height found in ExifInterface."));
            throw new KotlinNothingValueException();
        } catch (fuX.j e2) {
            if (e2.rl() == fux) {
                return new j.n(e2.n());
            }
            throw e2;
        }
    }

    private static final LQ.j nr(Cursor cursor, int i2, String str) throws fuX.j {
        fuX fux = new fuX();
        try {
            Integer numValueOf = cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2));
            if (numValueOf != null) {
                return new j.w6(Integer.valueOf(numValueOf.intValue()));
            }
            fux.n("The " + str + " value in the database was null. Searched in column " + i2);
            throw new KotlinNothingValueException();
        } catch (fuX.j e2) {
            if (e2.rl() == fux) {
                return new j.n(e2.n());
            }
            throw e2;
        }
    }

    private static final Integer t(ExifInterface exifInterface) {
        Integer numValueOf = Integer.valueOf(exifInterface.Uo("ImageLength", -1));
        if (numValueOf.intValue() > 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean xMQ(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith$default(str, "image/", false, 2, (Object) null);
    }

    private static final Object Uo(Context context, Uri uri, Continuation continuation) {
        return Dsr.Uo(OU.rl(), new n(context, uri, null), continuation);
    }
}
