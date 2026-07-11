package androidx.compose.foundation.gestures;

import GJW.AbstractC1363t;
import ILs.CN3;
import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", f = "Transformable.kt", i = {0, 1}, l = {272, 284}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,399:1\n69#2:400\n70#3:401\n22#4:402\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n*L\n276#1:400\n276#1:401\n276#1:402\n*E\n"})
final class TransformableKt$detectZoomByCtrlMouseScroll$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ScrollConfig J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f17210O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17211n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ CN3 f17212r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f17213t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransformableKt$detectZoomByCtrlMouseScroll$2 transformableKt$detectZoomByCtrlMouseScroll$2 = new TransformableKt$detectZoomByCtrlMouseScroll$2(this.f17210O, this.J2, this.f17212r, continuation);
        transformableKt$detectZoomByCtrlMouseScroll$2.f17213t = obj;
        return transformableKt$detectZoomByCtrlMouseScroll$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((TransformableKt$detectZoomByCtrlMouseScroll$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableKt$detectZoomByCtrlMouseScroll$2(CoroutineContext coroutineContext, ScrollConfig scrollConfig, CN3 cn3, Continuation continuation) {
        super(2, continuation);
        this.f17210O = coroutineContext;
        this.J2 = scrollConfig;
        this.f17212r = cn3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r13 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x0017, TRY_ENTER, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:26:0x008c, B:28:0x0090, B:23:0x0055, B:19:0x003b, B:22:0x0048, B:14:0x0027), top: B:35:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:26:0x008c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        long packedValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f17211n;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        awaitPointerEventScope = (AwaitPointerEventScope) this.f17213t;
                        ResultKt.throwOnFailure(obj);
                        Offset offset = (Offset) obj;
                        if (offset != null) {
                            packedValue = offset.getPackedValue();
                            this.f17212r.nr(new TransformEvent.TransformDelta((float) Math.pow(2.0f, Float.intBitsToFloat((int) (packedValue & 4294967295L)) / 545.0f), Offset.INSTANCE.t(), 0.0f, null));
                            ScrollConfig scrollConfig = this.J2;
                            this.f17213t = awaitPointerEventScope;
                            this.f17211n = 2;
                            obj = TransformableKt.O(awaitPointerEventScope, scrollConfig, this);
                        } else {
                            this.f17212r.nr(TransformEvent.TransformStopped.f17180n);
                            if (!AbstractC1363t.ck(this.f17210O)) {
                                ScrollConfig scrollConfig2 = this.J2;
                                this.f17213t = awaitPointerEventScope;
                                this.f17211n = 1;
                                obj = TransformableKt.J2(awaitPointerEventScope, scrollConfig2, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                packedValue = ((Offset) obj).getPackedValue();
                                this.f17212r.nr(TransformEvent.TransformStarted.f17179n);
                                this.f17212r.nr(new TransformEvent.TransformDelta((float) Math.pow(2.0f, Float.intBitsToFloat((int) (packedValue & 4294967295L)) / 545.0f), Offset.INSTANCE.t(), 0.0f, null));
                                ScrollConfig scrollConfig3 = this.J2;
                                this.f17213t = awaitPointerEventScope;
                                this.f17211n = 2;
                                obj = TransformableKt.O(awaitPointerEventScope, scrollConfig3, this);
                            } else {
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f17213t;
                    ResultKt.throwOnFailure(obj);
                    packedValue = ((Offset) obj).getPackedValue();
                    this.f17212r.nr(TransformEvent.TransformStarted.f17179n);
                    this.f17212r.nr(new TransformEvent.TransformDelta((float) Math.pow(2.0f, Float.intBitsToFloat((int) (packedValue & 4294967295L)) / 545.0f), Offset.INSTANCE.t(), 0.0f, null));
                    ScrollConfig scrollConfig32 = this.J2;
                    this.f17213t = awaitPointerEventScope;
                    this.f17211n = 2;
                    obj = TransformableKt.O(awaitPointerEventScope, scrollConfig32, this);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.f17213t;
                if (!AbstractC1363t.ck(this.f17210O)) {
                }
            }
        } catch (Throwable th) {
            this.f17212r.nr(TransformEvent.TransformStopped.f17180n);
            throw th;
        }
    }
}
