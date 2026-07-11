package androidx.compose.foundation.gestures;

import GJW.Pl;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "<init>", "()V", "Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "t", "(Landroidx/compose/foundation/gestures/ContentInViewNode$Request;)Z", "", "nr", "", "cause", "rl", "(Ljava/lang/Throwable;)V", "Landroidx/compose/runtime/collection/MutableVector;", c.f62177j, "Landroidx/compose/runtime/collection/MutableVector;", "requests", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,137:1\n1101#2:138\n1083#2,2:139\n516#3:141\n48#3:142\n472#3:143\n472#3:144\n447#3,9:145\n48#3:154\n472#3:155\n519#3:156\n44#3:157\n587#3,2:158\n472#3:160\n516#3:163\n13309#4,2:161\n50#5,5:164\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:138\n43#1:139,2\n48#1:141\n72#1:142\n73#1:143\n92#1:144\n108#1:145,9\n112#1:154\n113#1:155\n120#1:156\n122#1:157\n133#1:158,2\n133#1:160\n134#1:163\n133#1:161,2\n134#1:164,5\n*E\n"})
public final class BringIntoViewRequestPriorityQueue {
    public static final int rl = MutableVector.J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableVector requests = new MutableVector(new ContentInViewNode.Request[16], 0);

    public final boolean t(final ContentInViewNode.Request request) {
        Rect rect = (Rect) request.getCurrentBounds().invoke();
        if (rect == null) {
            Pl continuation = request.getContinuation();
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            return false;
        }
        request.getContinuation().J2(new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f16578n.requests.ck(request);
            }
        });
        IntRange intRangeUntil = RangesKt.until(0, this.requests.getSize());
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first <= last) {
            while (true) {
                Rect rect2 = (Rect) ((ContentInViewNode.Request) this.requests.content[last]).getCurrentBounds().invoke();
                if (rect2 != null) {
                    Rect rectAYN = rect.aYN(rect2);
                    if (Intrinsics.areEqual(rectAYN, rect)) {
                        this.requests.n(last + 1, request);
                        return true;
                    }
                    if (!Intrinsics.areEqual(rectAYN, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= last) {
                            while (true) {
                                ((ContentInViewNode.Request) this.requests.content[last]).getContinuation().cancel(cancellationException);
                                if (size == last) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (last == first) {
                    break;
                }
                last--;
            }
        }
        this.requests.n(0, request);
        return true;
    }

    public final void nr() {
        IntRange intRangeUntil = RangesKt.until(0, this.requests.getSize());
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first <= last) {
            while (true) {
                ((ContentInViewNode.Request) this.requests.content[first]).getContinuation().resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.requests.KN();
    }

    public final void rl(Throwable cause) {
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize();
        Pl[] plArr = new Pl[size];
        for (int i2 = 0; i2 < size; i2++) {
            plArr[i2] = ((ContentInViewNode.Request) mutableVector.content[i2]).getContinuation();
        }
        for (int i3 = 0; i3 < size; i3++) {
            plArr[i3].cancel(cause);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        InlineClassHelperKt.t("uncancelled requests present");
    }
}
