package N1;

import GJW.Dsr;
import GJW.OU;
import GJW.vd;
import LQ.fuX;
import LQ.j;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lD.AbstractC2256j;
import lD.AbstractC2257n;
import lD.AbstractC2258w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: N1.j$j, reason: collision with other inner class name */
    static final class C0234j extends SuspendLambda implements Function2 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f6949O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Uri f6950S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Context f6951Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6952n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f6953o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6954r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6955t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0234j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0062: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:21:0x0062 */
        /* JADX WARN: Removed duplicated region for block: B:103:0x022d A[Catch: j -> 0x0061, TRY_LEAVE, TryCatch #1 {j -> 0x0061, blocks: (B:18:0x0058, B:101:0x0227, B:103:0x022d, B:109:0x0254, B:111:0x0258, B:115:0x0263, B:116:0x0268, B:26:0x0088, B:79:0x01c4, B:81:0x01ca, B:87:0x01f2, B:89:0x01f6, B:93:0x0202, B:94:0x0207, B:32:0x00b4, B:59:0x0169, B:61:0x016f, B:67:0x0197, B:69:0x019b, B:73:0x01a7, B:74:0x01ac), top: B:142:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0254 A[Catch: j -> 0x0061, TRY_ENTER, TryCatch #1 {j -> 0x0061, blocks: (B:18:0x0058, B:101:0x0227, B:103:0x022d, B:109:0x0254, B:111:0x0258, B:115:0x0263, B:116:0x0268, B:26:0x0088, B:79:0x01c4, B:81:0x01ca, B:87:0x01f2, B:89:0x01f6, B:93:0x0202, B:94:0x0207, B:32:0x00b4, B:59:0x0169, B:61:0x016f, B:67:0x0197, B:69:0x019b, B:73:0x01a7, B:74:0x01ac), top: B:142:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x02ce  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x02d8  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x016f A[Catch: j -> 0x0061, TRY_LEAVE, TryCatch #1 {j -> 0x0061, blocks: (B:18:0x0058, B:101:0x0227, B:103:0x022d, B:109:0x0254, B:111:0x0258, B:115:0x0263, B:116:0x0268, B:26:0x0088, B:79:0x01c4, B:81:0x01ca, B:87:0x01f2, B:89:0x01f6, B:93:0x0202, B:94:0x0207, B:32:0x00b4, B:59:0x0169, B:61:0x016f, B:67:0x0197, B:69:0x019b, B:73:0x01a7, B:74:0x01ac), top: B:142:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0197 A[Catch: j -> 0x0061, TRY_ENTER, TryCatch #1 {j -> 0x0061, blocks: (B:18:0x0058, B:101:0x0227, B:103:0x022d, B:109:0x0254, B:111:0x0258, B:115:0x0263, B:116:0x0268, B:26:0x0088, B:79:0x01c4, B:81:0x01ca, B:87:0x01f2, B:89:0x01f6, B:93:0x0202, B:94:0x0207, B:32:0x00b4, B:59:0x0169, B:61:0x016f, B:67:0x0197, B:69:0x019b, B:73:0x01a7, B:74:0x01ac), top: B:142:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01ca A[Catch: j -> 0x0061, TRY_LEAVE, TryCatch #1 {j -> 0x0061, blocks: (B:18:0x0058, B:101:0x0227, B:103:0x022d, B:109:0x0254, B:111:0x0258, B:115:0x0263, B:116:0x0268, B:26:0x0088, B:79:0x01c4, B:81:0x01ca, B:87:0x01f2, B:89:0x01f6, B:93:0x0202, B:94:0x0207, B:32:0x00b4, B:59:0x0169, B:61:0x016f, B:67:0x0197, B:69:0x019b, B:73:0x01a7, B:74:0x01ac), top: B:142:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01f2 A[Catch: j -> 0x0061, TRY_ENTER, TryCatch #1 {j -> 0x0061, blocks: (B:18:0x0058, B:101:0x0227, B:103:0x022d, B:109:0x0254, B:111:0x0258, B:115:0x0263, B:116:0x0268, B:26:0x0088, B:79:0x01c4, B:81:0x01ca, B:87:0x01f2, B:89:0x01f6, B:93:0x0202, B:94:0x0207, B:32:0x00b4, B:59:0x0169, B:61:0x016f, B:67:0x0197, B:69:0x019b, B:73:0x01a7, B:74:0x01ac), top: B:142:0x0009 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws fuX.j, IOException {
            Object obj2;
            Context context;
            LQ.CN3 fux;
            String mimeTypeFromExtension;
            Wre wre;
            Object objNr;
            LQ.CN3 cn3;
            Object objJ2;
            LQ.CN3 cn32;
            Object objN;
            LQ.CN3 cn33;
            Uri uri;
            Object objNr2;
            LQ.CN3 cn34;
            Uri uri2;
            Object objN2;
            LQ.CN3 cn35;
            Uri uri3;
            LQ.j jVar;
            Object objN3;
            Object objJ22;
            LQ.CN3 cn36;
            LQ.j jVar2;
            Object objN4;
            Object objJ23;
            LQ.CN3 cn37;
            LQ.j jVar3;
            Object objN5;
            Object objJ24;
            LQ.CN3 cn38;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.f6953o;
            try {
                try {
                    switch (r2) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            context = this.f6951Z;
                            Uri uri4 = this.f6950S;
                            fux = new fuX();
                            LQ.j jVarN = v9.Ml.n(context, uri4);
                            if (jVarN instanceof j.n) {
                                fux.n(AbstractC2256j.n((t2.I28) ((j.n) jVarN).n()));
                                throw new KotlinNothingValueException();
                            }
                            if (!(jVarN instanceof j.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((InputStream) ((j.w6) jVarN).n()).close();
                            if (Intrinsics.areEqual(AppLovinEventTypes.USER_VIEWED_CONTENT, uri4.getScheme())) {
                                mimeTypeFromExtension = context.getContentResolver().getType(uri4);
                            } else {
                                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri4.toString());
                                Intrinsics.checkNotNullExpressionValue(fileExtensionFromUrl, "getFileExtensionFromUrl(uri.toString())");
                                String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                            }
                            String str = mimeTypeFromExtension;
                            Pair pairRl = j.rl(context, uri4);
                            wre = new Wre(uri4, str, pairRl != null ? (String) pairRl.getFirst() : null, pairRl != null ? (Integer) pairRl.getSecond() : null, null, null, null, null, null, 496, null);
                            if (str == null) {
                                ContentResolver contentResolver = context.getContentResolver();
                                Intrinsics.checkNotNullExpressionValue(contentResolver, "contentResolver");
                                if (AbstractC2257n.rl(uri4, contentResolver)) {
                                    this.f6952n = context;
                                    this.f6955t = uri4;
                                    this.f6949O = fux;
                                    this.J2 = fux;
                                    this.f6954r = wre;
                                    this.f6953o = 1;
                                    objN2 = AbstractC2257n.n(context, uri4, wre, this);
                                    if (objN2 != coroutine_suspended) {
                                        cn35 = fux;
                                        uri3 = uri4;
                                        jVar = (LQ.j) objN2;
                                        if (jVar instanceof j.n) {
                                            if (!(jVar instanceof j.w6)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            objN3 = ((j.w6) jVar).n();
                                            wre = (Wre) objN3;
                                            return new j.w6(wre);
                                        }
                                        this.f6952n = cn35;
                                        this.f6955t = fux;
                                        this.f6949O = null;
                                        this.J2 = null;
                                        this.f6954r = null;
                                        this.f6953o = 2;
                                        objJ22 = AbstractC2258w6.J2(context, uri3, wre, this);
                                        if (objJ22 != coroutine_suspended) {
                                            cn36 = fux;
                                            objN3 = (Wre) cn36.O((LQ.j) objJ22);
                                            wre = (Wre) objN3;
                                            return new j.w6(wre);
                                        }
                                    }
                                } else {
                                    this.f6952n = context;
                                    this.f6955t = uri4;
                                    this.f6949O = fux;
                                    this.J2 = fux;
                                    this.f6954r = wre;
                                    this.f6953o = 3;
                                    objNr2 = lD.Ml.nr(context, uri4, wre, this);
                                    if (objNr2 != coroutine_suspended) {
                                        cn34 = fux;
                                        uri2 = uri4;
                                        jVar2 = (LQ.j) objNr2;
                                        if (jVar2 instanceof j.n) {
                                            if (!(jVar2 instanceof j.w6)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            objN4 = ((j.w6) jVar2).n();
                                            wre = (Wre) objN4;
                                            return new j.w6(wre);
                                        }
                                        this.f6952n = cn34;
                                        this.f6955t = fux;
                                        this.f6949O = null;
                                        this.J2 = null;
                                        this.f6954r = null;
                                        this.f6953o = 4;
                                        objJ23 = AbstractC2258w6.J2(context, uri2, wre, this);
                                        if (objJ23 != coroutine_suspended) {
                                            cn37 = fux;
                                            objN4 = (Wre) cn37.O((LQ.j) objJ23);
                                            wre = (Wre) objN4;
                                            return new j.w6(wre);
                                        }
                                    }
                                }
                            } else if (Intrinsics.areEqual(str, "image/gif")) {
                                this.f6952n = context;
                                this.f6955t = uri4;
                                this.f6949O = fux;
                                this.J2 = fux;
                                this.f6954r = wre;
                                this.f6953o = 5;
                                objN = AbstractC2257n.n(context, uri4, wre, this);
                                if (objN != coroutine_suspended) {
                                    cn33 = fux;
                                    uri = uri4;
                                    jVar3 = (LQ.j) objN;
                                    if (jVar3 instanceof j.n) {
                                        if (!(jVar3 instanceof j.w6)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        objN5 = ((j.w6) jVar3).n();
                                        wre = (Wre) objN5;
                                        return new j.w6(wre);
                                    }
                                    this.f6952n = cn33;
                                    this.f6955t = fux;
                                    this.f6949O = null;
                                    this.J2 = null;
                                    this.f6954r = null;
                                    this.f6953o = 6;
                                    objJ24 = AbstractC2258w6.J2(context, uri, wre, this);
                                    if (objJ24 != coroutine_suspended) {
                                        cn38 = fux;
                                        objN5 = (Wre) cn38.O((LQ.j) objJ24);
                                        wre = (Wre) objN5;
                                        return new j.w6(wre);
                                    }
                                }
                            } else {
                                if (!AbstractC2258w6.xMQ(str)) {
                                    if (lD.Ml.t(str)) {
                                        this.f6952n = fux;
                                        this.f6955t = fux;
                                        this.f6953o = 8;
                                        objNr = lD.Ml.nr(context, uri4, wre, this);
                                        if (objNr != coroutine_suspended) {
                                            cn3 = fux;
                                            wre = (Wre) cn3.O((LQ.j) objNr);
                                        }
                                    }
                                    return new j.w6(wre);
                                }
                                this.f6952n = fux;
                                this.f6955t = fux;
                                this.f6953o = 7;
                                objJ2 = AbstractC2258w6.J2(context, uri4, wre, this);
                                if (objJ2 != coroutine_suspended) {
                                    cn32 = fux;
                                    wre = (Wre) cn32.O((LQ.j) objJ2);
                                    return new j.w6(wre);
                                }
                            }
                            return coroutine_suspended;
                        case 1:
                            Wre wre2 = (Wre) this.f6954r;
                            LQ.CN3 cn39 = (LQ.CN3) this.J2;
                            cn35 = (fuX) this.f6949O;
                            uri3 = (Uri) this.f6955t;
                            context = (Context) this.f6952n;
                            ResultKt.throwOnFailure(obj);
                            wre = wre2;
                            fux = cn39;
                            objN2 = obj;
                            jVar = (LQ.j) objN2;
                            if (jVar instanceof j.n) {
                            }
                            break;
                        case 2:
                            cn36 = (LQ.CN3) this.f6955t;
                            ResultKt.throwOnFailure(obj);
                            objJ22 = obj;
                            objN3 = (Wre) cn36.O((LQ.j) objJ22);
                            wre = (Wre) objN3;
                            return new j.w6(wre);
                        case 3:
                            Wre wre3 = (Wre) this.f6954r;
                            LQ.CN3 cn310 = (LQ.CN3) this.J2;
                            cn34 = (fuX) this.f6949O;
                            uri2 = (Uri) this.f6955t;
                            context = (Context) this.f6952n;
                            ResultKt.throwOnFailure(obj);
                            wre = wre3;
                            fux = cn310;
                            objNr2 = obj;
                            jVar2 = (LQ.j) objNr2;
                            if (jVar2 instanceof j.n) {
                            }
                            break;
                        case 4:
                            cn37 = (LQ.CN3) this.f6955t;
                            ResultKt.throwOnFailure(obj);
                            objJ23 = obj;
                            objN4 = (Wre) cn37.O((LQ.j) objJ23);
                            wre = (Wre) objN4;
                            return new j.w6(wre);
                        case 5:
                            Wre wre4 = (Wre) this.f6954r;
                            LQ.CN3 cn311 = (LQ.CN3) this.J2;
                            cn33 = (fuX) this.f6949O;
                            uri = (Uri) this.f6955t;
                            context = (Context) this.f6952n;
                            ResultKt.throwOnFailure(obj);
                            wre = wre4;
                            fux = cn311;
                            objN = obj;
                            jVar3 = (LQ.j) objN;
                            if (jVar3 instanceof j.n) {
                            }
                            break;
                        case 6:
                            cn38 = (LQ.CN3) this.f6955t;
                            ResultKt.throwOnFailure(obj);
                            objJ24 = obj;
                            objN5 = (Wre) cn38.O((LQ.j) objJ24);
                            wre = (Wre) objN5;
                            return new j.w6(wre);
                        case 7:
                            cn32 = (LQ.CN3) this.f6955t;
                            ResultKt.throwOnFailure(obj);
                            objJ2 = obj;
                            wre = (Wre) cn32.O((LQ.j) objJ2);
                            return new j.w6(wre);
                        case 8:
                            cn3 = (LQ.CN3) this.f6955t;
                            ResultKt.throwOnFailure(obj);
                            objNr = obj;
                            wre = (Wre) cn3.O((LQ.j) objNr);
                            return new j.w6(wre);
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (fuX.j e2) {
                    e = e2;
                    if (e.rl() != r2) {
                        return new j.n(e.n());
                    }
                    throw e;
                }
            } catch (fuX.j e3) {
                e = e3;
                r2 = obj2;
                if (e.rl() != r2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0234j(Context context, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f6951Z = context;
            this.f6950S = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0234j(this.f6951Z, this.f6950S, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair rl(Context context, Uri uri) {
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_size", "_display_name"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_size");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("_display_name");
            if (!cursorQuery.moveToFirst()) {
                CloseableKt.closeFinally(cursorQuery, null);
                return null;
            }
            String string = cursorQuery.getString(columnIndexOrThrow2);
            Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
            Pair pair = TuplesKt.to(string, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : -1));
            CloseableKt.closeFinally(cursorQuery, null);
            return pair;
        } finally {
        }
    }

    public static final Object t(Context context, Uri uri, Continuation continuation) {
        return Dsr.Uo(OU.rl(), new C0234j(context, uri, null), continuation);
    }
}
