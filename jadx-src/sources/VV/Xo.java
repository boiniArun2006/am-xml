package VV;

import FQq.AbstractC1347z;
import FQq.Q;
import FQq.UGc;
import GJW.OU;
import GJW.eO;
import GJW.vd;
import VV.qz;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.z;
import java.io.IOException;
import java.io.InputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Xo {

    static final class CN3 extends SuspendLambda implements Function2 {
        final /* synthetic */ String E2;
        final /* synthetic */ Function3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f10932O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ String f10933S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ String f10934Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f10935e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f10936g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10937n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ qz f10938o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f10939r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f10940t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(Function3 function3, Context context, qz qzVar, String str, String str2, String str3, String str4, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.J2 = function3;
            this.f10939r = context;
            this.f10938o = qzVar;
            this.f10934Z = str;
            this.f10933S = str2;
            this.f10936g = str3;
            this.E2 = str4;
            this.f10935e = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new CN3(this.J2, this.f10939r, this.f10938o, this.f10934Z, this.f10933S, this.f10936g, this.E2, this.f10935e, continuation);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:6|(3:47|7|8)|43|30|31) */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (((java.lang.Boolean) r14).booleanValue() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (r14 == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:43:0x0093). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i2;
            Throwable th;
            int i3;
            Throwable th2;
            CN3 cn3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f10932O;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        i3 = this.f10940t;
                        th2 = (Throwable) this.f10937n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            cn3 = this;
                        } catch (Throwable th3) {
                            th = th3;
                            i2 = i3 + 1;
                            if (!Xo.o(this.f10935e).fD()) {
                            }
                            if (!Xo.o(this.f10935e).iF()) {
                            }
                            return Unit.INSTANCE;
                        }
                        Xo.o(cn3.f10935e).HI((FQq.Dsr) obj);
                        int i7 = i3;
                        th = th2;
                        i2 = i7;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i2 = this.f10940t;
                    th = (Throwable) this.f10937n;
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                i2 = 0;
                th = null;
            }
            if (!Xo.o(this.f10935e).fD()) {
                if (i2 != 0) {
                    Function3 function3 = this.J2;
                    Integer numBoxInt = Boxing.boxInt(i2);
                    Intrinsics.checkNotNull(th);
                    this.f10937n = th;
                    this.f10940t = i2;
                    this.f10932O = 1;
                    obj = function3.invoke(numBoxInt, th, this);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    Throwable th4 = th;
                    i3 = i2;
                    th2 = th4;
                    try {
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        int i8 = i3;
                        th = th6;
                        i2 = i8 + 1;
                        if (!Xo.o(this.f10935e).fD()) {
                        }
                        if (!Xo.o(this.f10935e).iF()) {
                        }
                        return Unit.INSTANCE;
                    }
                    Context context = this.f10939r;
                    qz qzVar = this.f10938o;
                    String strMUb = Xo.mUb(this.f10934Z);
                    String strMUb2 = Xo.mUb(this.f10933S);
                    String strXMQ = Xo.xMQ(this.f10936g);
                    String str = this.E2;
                    this.f10937n = th2;
                    this.f10940t = i3;
                    this.f10932O = 2;
                    cn3 = this;
                    obj = Xo.az(context, qzVar, strMUb, strMUb2, strXMQ, str, cn3);
                }
                return coroutine_suspended;
            }
            if (!Xo.o(this.f10935e).iF() && th != null) {
                Xo.o(this.f10935e).ck(th);
            }
            return Unit.INSTANCE;
        }
    }

    static final class I28 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f10941O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10942n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f10943o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f10944r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f10945t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10944r = obj;
            this.f10943o |= Integer.MIN_VALUE;
            return Xo.az(null, null, null, null, null, null, this);
        }

        I28(Continuation continuation) {
            super(continuation);
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f10946O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10947n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FQq.Dsr f10948t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(FQq.Dsr dsr, Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.f10948t = dsr;
            this.f10946O = context;
            this.J2 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f10948t, this.f10946O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10947n == 0) {
                ResultKt.throwOnFailure(obj);
                for (UGc uGc : this.f10948t.mUb().values()) {
                    Intrinsics.checkNotNull(uGc);
                    Xo.HI(uGc);
                    Xo.ck(this.f10946O, uGc, this.J2);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class Wre extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10949n;

        Wre(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return n(((Number) obj).intValue(), (Throwable) obj2, (Continuation) obj3);
        }

        public final Object n(int i2, Throwable th, Continuation continuation) {
            return new Wre(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10949n == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class j implements Q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ GJW.Pl f10950n;

        j(GJW.Pl pl) {
            this.f10950n = pl;
        }

        @Override // FQq.Q
        public final void onResult(Object obj) {
            if (this.f10950n.isCompleted()) {
                return;
            }
            this.f10950n.resumeWith(Result.m313constructorimpl(obj));
        }
    }

    static final class n implements Q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ GJW.Pl f10951n;

        n(GJW.Pl pl) {
            this.f10951n = pl;
        }

        @Override // FQq.Q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final void onResult(Throwable th) {
            if (this.f10951n.isCompleted()) {
                return;
            }
            GJW.Pl pl = this.f10951n;
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(th);
            pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(th)));
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f10952O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10953n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f10954r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FQq.Dsr f10955t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(FQq.Dsr dsr, Context context, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f10955t = dsr;
            this.f10952O = context;
            this.J2 = str;
            this.f10954r = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f10955t, this.f10952O, this.J2, this.f10954r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10953n == 0) {
                ResultKt.throwOnFailure(obj);
                for (ES.w6 w6Var : this.f10955t.Uo().values()) {
                    Context context = this.f10952O;
                    Intrinsics.checkNotNull(w6Var);
                    Xo.Ik(context, w6Var, this.J2, this.f10954r);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        if (StringsKt.endsWith$default((CharSequence) str, '/', false, 2, (Object) null)) {
            return str;
        }
        return str + "/";
    }

    private static final Object KN(z zVar, Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        zVar.nr(new j(eOVar)).t(new n(eOVar));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    private static final Typeface Z(Typeface typeface, String str) {
        int i2 = 0;
        boolean zContains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) "Italic", false, 2, (Object) null);
        boolean zContains$default2 = StringsKt.contains$default((CharSequence) str, (CharSequence) "Bold", false, 2, (Object) null);
        if (zContains$default && zContains$default2) {
            i2 = 3;
        } else if (zContains$default) {
            i2 = 2;
        } else if (zContains$default2) {
            i2 = 1;
        }
        return typeface.getStyle() == i2 ? typeface : Typeface.create(typeface, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object az(Context context, qz qzVar, String str, String str2, String str3, String str4, Continuation continuation) {
        I28 i28;
        String str5;
        Context context2;
        FQq.Dsr dsr;
        String str6;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f10943o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f10943o = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objKN = i28.f10944r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f10943o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objKN);
            z zVarTy = ty(context, qzVar, str4, false);
            if (zVarTy == null) {
                throw new IllegalArgumentException(("Unable to create parsing task for " + qzVar + ".").toString());
            }
            i28.f10942n = context;
            i28.f10945t = str;
            i28.f10941O = str2;
            i28.J2 = str3;
            i28.f10943o = 1;
            objKN = KN(zVarTy, i28);
            if (objKN != coroutine_suspended) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FQq.Dsr dsr2 = (FQq.Dsr) i28.f10942n;
                ResultKt.throwOnFailure(objKN);
                return dsr2;
            }
            dsr = (FQq.Dsr) i28.J2;
            str6 = (String) i28.f10941O;
            str5 = (String) i28.f10945t;
            context2 = (Context) i28.f10942n;
            ResultKt.throwOnFailure(objKN);
            i28.f10942n = dsr;
            i28.f10945t = null;
            i28.f10941O = null;
            i28.J2 = null;
            i28.f10943o = 3;
            return gh(context2, dsr, str5, str6, i28) != coroutine_suspended ? coroutine_suspended : dsr;
        }
        str3 = (String) i28.J2;
        str2 = (String) i28.f10941O;
        str = (String) i28.f10945t;
        context = (Context) i28.f10942n;
        ResultKt.throwOnFailure(objKN);
        FQq.Dsr dsr3 = (FQq.Dsr) objKN;
        i28.f10942n = context;
        i28.f10945t = str2;
        i28.f10941O = str3;
        i28.J2 = dsr3;
        i28.f10943o = 2;
        if (qie(context, dsr3, str, i28) != coroutine_suspended) {
            str5 = str2;
            context2 = context;
            dsr = dsr3;
            str6 = str3;
            i28.f10942n = dsr;
            i28.f10945t = null;
            i28.f10941O = null;
            i28.J2 = null;
            i28.f10943o = 3;
            if (gh(context2, dsr, str5, str6, i28) != coroutine_suspended) {
            }
        }
    }

    public static final C r(qz spec, String str, String str2, String str3, String str4, Function3 function3, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        composer.te(-1248473602);
        String str5 = (i3 & 2) != 0 ? null : str;
        String str6 = (i3 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i3 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i3 & 16) != 0 ? "__LottieInternalDefaultCacheKey__" : str4;
        Function3 wre = (i3 & 32) != 0 ? new Wre(null) : function3;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1248473602, i2, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:82)");
        }
        Context context = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
        composer.te(1388713922);
        int i5 = i2 & 14;
        int i7 = i5 ^ 6;
        boolean z2 = (i7 > 4 && composer.p5(spec)) || (i2 & 6) == 4;
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(new o(), null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        composer.M7();
        composer.te(1388714213);
        boolean z3 = ((i7 > 4 && composer.p5(spec)) || (i2 & 6) == 4) | ((((57344 & i2) ^ 24576) > 16384 && composer.p5(str8)) || (i2 & 24576) == 16384);
        Object objIF2 = composer.iF();
        if (z3 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = ty(context, spec, str8, true);
            composer.o(objIF2);
        }
        composer.M7();
        EffectsKt.nr(spec, str8, new CN3(wre, context, spec, str5, str6, str7, str8, mutableState, null), composer, i5 | 512 | ((i2 >> 9) & 112));
        o oVarO = o(mutableState);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.M7();
        return oVarO;
    }

    private static final z ty(Context context, qz qzVar, String str, boolean z2) {
        if (qzVar instanceof qz.j) {
            return Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__") ? AbstractC1347z.S(context, ((qz.j) qzVar).J2()) : AbstractC1347z.WPU(context, ((qz.j) qzVar).J2(), str);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(UGc uGc) {
        if (uGc.rl() == null) {
            String strT = uGc.t();
            Intrinsics.checkNotNull(strT);
            if (StringsKt.startsWith$default(strT, "data:", false, 2, (Object) null) && StringsKt.indexOf$default((CharSequence) strT, "base64,", 0, false, 6, (Object) null) > 0) {
                try {
                    String strSubstring = strT.substring(StringsKt.indexOf$default((CharSequence) strT, ',', 0, false, 6, (Object) null) + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    byte[] bArrDecode = Base64.decode(strSubstring, 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    uGc.Uo(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                } catch (IllegalArgumentException e2) {
                    x0.CN3.nr("data URL did not have correct base64 format.", e2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ik(Context context, ES.w6 w6Var, String str, String str2) {
        String str3 = str + w6Var.n() + str2;
        try {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                Intrinsics.checkNotNull(typefaceCreateFromAsset);
                String strT = w6Var.t();
                Intrinsics.checkNotNullExpressionValue(strT, "getStyle(...)");
                w6Var.O(Z(typefaceCreateFromAsset, strT));
            } catch (Exception e2) {
                x0.CN3.rl("Failed to create " + w6Var.n() + " typeface with style=" + w6Var.t() + "!", e2);
            }
        } catch (Exception e3) {
            x0.CN3.rl("Failed to find typeface in assets with path " + str3 + ".", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(Context context, UGc uGc, String str) {
        if (uGc.rl() == null && str != null) {
            String strT = uGc.t();
            try {
                InputStream inputStreamOpen = context.getAssets().open(str + strT);
                Intrinsics.checkNotNull(inputStreamOpen);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    uGc.Uo(x0.eO.az(BitmapFactory.decodeStream(inputStreamOpen, null, options), uGc.J2(), uGc.nr()));
                } catch (IllegalArgumentException e2) {
                    x0.CN3.nr("Unable to decode image.", e2);
                }
            } catch (IOException e3) {
                x0.CN3.nr("Unable to open asset.", e3);
            }
        }
    }

    private static final Object gh(Context context, FQq.Dsr dsr, String str, String str2, Continuation continuation) {
        if (dsr.Uo().isEmpty()) {
            return Unit.INSTANCE;
        }
        Object objUo = GJW.Dsr.Uo(OU.rl(), new w6(dsr, context, str, str2, null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o o(MutableState mutableState) {
        return (o) mutableState.getValue();
    }

    private static final Object qie(Context context, FQq.Dsr dsr, String str, Continuation continuation) {
        if (!dsr.r()) {
            return Unit.INSTANCE;
        }
        Object objUo = GJW.Dsr.Uo(OU.rl(), new Ml(dsr, context, str, null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(String str) {
        if (StringsKt.isBlank(str) || StringsKt.startsWith$default(str, ".", false, 2, (Object) null)) {
            return str;
        }
        return "." + str;
    }
}
