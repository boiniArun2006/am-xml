package androidx.compose.foundation.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", c.f62177j, "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/runtime/collection/MutableVector;", "rl", "()Landroidx/compose/runtime/collection/MutableVector;", "nodes", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,159:1\n1101#2:160\n1083#2,2:161\n423#3,9:163\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n97#1:160\n97#1:161,2\n100#1:163,9\n*E\n"})
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableVector nodes = new MutableVector(new BringIntoViewRequesterNode[16], 0);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:19:0x006c). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Rect rect, Continuation continuation) {
        BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        final Rect rect2;
        int i2;
        Object[] objArr;
        int i3;
        if (continuation instanceof BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (BringIntoViewRequesterImpl$bringIntoView$1) continuation;
            int i5 = bringIntoViewRequesterImpl$bringIntoView$1.f19040Z;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.f19040Z = i5 - Integer.MIN_VALUE;
            } else {
                bringIntoViewRequesterImpl$bringIntoView$1 = new BringIntoViewRequesterImpl$bringIntoView$1(this, continuation);
            }
        }
        Object obj = bringIntoViewRequesterImpl$bringIntoView$1.f19043r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = bringIntoViewRequesterImpl$bringIntoView$1.f19040Z;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableVector mutableVector = this.nodes;
            Object[] objArr2 = mutableVector.content;
            int size = mutableVector.getSize();
            rect2 = rect;
            i2 = size;
            objArr = objArr2;
            i3 = 0;
            if (i3 < i2) {
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = bringIntoViewRequesterImpl$bringIntoView$1.J2;
            i3 = bringIntoViewRequesterImpl$bringIntoView$1.f19039O;
            objArr = (Object[]) bringIntoViewRequesterImpl$bringIntoView$1.f19044t;
            Rect rect3 = (Rect) bringIntoViewRequesterImpl$bringIntoView$1.f19041n;
            ResultKt.throwOnFailure(obj);
            rect2 = rect3;
            i3++;
            if (i3 < i2) {
                BringIntoViewRequesterNode bringIntoViewRequesterNode = (BringIntoViewRequesterNode) objArr[i3];
                Function0<Rect> function0 = new Function0<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Rect invoke() {
                        return rect2;
                    }
                };
                bringIntoViewRequesterImpl$bringIntoView$1.f19041n = rect2;
                bringIntoViewRequesterImpl$bringIntoView$1.f19044t = objArr;
                bringIntoViewRequesterImpl$bringIntoView$1.f19039O = i3;
                bringIntoViewRequesterImpl$bringIntoView$1.J2 = i2;
                bringIntoViewRequesterImpl$bringIntoView$1.f19040Z = 1;
                if (BringIntoViewModifierNodeKt.n(bringIntoViewRequesterNode, function0, bringIntoViewRequesterImpl$bringIntoView$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3++;
                if (i3 < i2) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final MutableVector getNodes() {
        return this.nodes;
    }
}
