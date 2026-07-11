package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTFv/CN3;", "", "", "<anonymous>", "(LTFv/CN3;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {114, Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements Function2<TFv.CN3, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContentResolver J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f33137O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Context f33138S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ ILs.CN3 f33139Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f33140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 f33141o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Uri f33142r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f33143t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.J2, this.f33142r, this.f33141o, this.f33139Z, this.f33138S, continuation);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f33137O = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, ILs.CN3 cn3, Context context, Continuation continuation) {
        super(2, continuation);
        this.J2 = contentResolver;
        this.f33142r = uri;
        this.f33141o = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.f33139Z = cn3;
        this.f33138S = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r4.rl(r9, r8) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TFv.CN3 cn3;
        ILs.Dsr it;
        TFv.CN3 cn32;
        Object objRl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f33143t;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        it = (ILs.Dsr) this.f33140n;
                        cn32 = (TFv.CN3) this.f33137O;
                        ResultKt.throwOnFailure(obj);
                        cn3 = cn32;
                        this.f33137O = cn3;
                        this.f33140n = it;
                        this.f33143t = 1;
                        objRl = it.rl(this);
                        if (objRl == coroutine_suspended) {
                            cn32 = cn3;
                            obj = objRl;
                            if (!((Boolean) obj).booleanValue()) {
                                it.next();
                                Float fBoxFloat = Boxing.boxFloat(Settings.Global.getFloat(this.f33138S.getContentResolver(), "animator_duration_scale", 1.0f));
                                this.f33137O = cn32;
                                this.f33140n = it;
                                this.f33143t = 2;
                            } else {
                                this.J2.unregisterContentObserver(this.f33141o);
                                return Unit.INSTANCE;
                            }
                        } else {
                            return coroutine_suspended;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    it = (ILs.Dsr) this.f33140n;
                    cn32 = (TFv.CN3) this.f33137O;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (TFv.CN3) this.f33137O;
                this.J2.registerContentObserver(this.f33142r, false, this.f33141o);
                it = this.f33139Z.iterator();
                this.f33137O = cn3;
                this.f33140n = it;
                this.f33143t = 1;
                objRl = it.rl(this);
                if (objRl == coroutine_suspended) {
                }
            }
        } catch (Throwable th) {
            this.J2.unregisterContentObserver(this.f33141o);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
