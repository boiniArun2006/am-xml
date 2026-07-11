package androidx.compose.ui.focus;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010%\u001a\u0004\u0018\u00010\n*\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/focus/FocusTransactionManager;", "", "<init>", "()V", "", "O", "Uo", "J2", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusStateImpl;", c.f62177j, "Landroidx/collection/MutableScatterMap;", "states", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function0;", "rl", "Landroidx/compose/runtime/collection/MutableVector;", "cancellationListener", "", "<set-?>", "t", "Z", "xMQ", "()Z", "ongoingTransaction", "", "nr", "I", "KN", "()I", "generation", "value", "mUb", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;", "gh", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V", "uncommittedFocusState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,122:1\n1101#2:123\n1083#2,2:124\n1#3:126\n641#4,2:127\n641#4,2:129\n423#4,9:162\n76#5,7:131\n365#6,3:138\n329#6,6:141\n339#6,3:148\n342#6,9:152\n368#6:161\n1399#7:147\n1270#7:151\n*S KotlinDebug\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n*L\n32#1:123\n32#1:124,2\n55#1:127,2\n72#1:129,2\n118#1:162,9\n100#1:131,7\n109#1:138,3\n109#1:141,6\n109#1:148,3\n109#1:152,9\n109#1:161\n109#1:147\n109#1:151\n*E\n"})
public final class FocusTransactionManager {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int generation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean ongoingTransaction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap states = ScatterMapKt.t();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableVector cancellationListener = new MutableVector(new Function0[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2() {
        this.states.gh();
        this.ongoingTransaction = false;
        MutableVector mutableVector = this.cancellationListener;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ((Function0) objArr[i2]).invoke();
        }
        this.cancellationListener.KN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Uo() {
        MutableScatterMap mutableScatterMap = this.states;
        Object[] objArr = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            ((FocusTargetNode) objArr[(i2 << 3) + i5]).poH();
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.states.gh();
        this.ongoingTransaction = false;
        this.cancellationListener.KN();
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    public final void gh(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusStateImpl focusStateImpl2 = (FocusStateImpl) this.states.O(focusTargetNode);
        if (focusStateImpl2 == null) {
            focusStateImpl2 = FocusStateImpl.J2;
        }
        if (focusStateImpl2 != focusStateImpl) {
            this.generation++;
        }
        MutableScatterMap mutableScatterMap = this.states;
        if (focusStateImpl != null) {
            mutableScatterMap.aYN(focusTargetNode, focusStateImpl);
        } else {
            InlineClassHelperKt.nr("requires a non-null focus state");
            throw new KotlinNothingValueException();
        }
    }

    public final FocusStateImpl mUb(FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            throw new IllegalStateException("uncommittedFocusState must not be accessed when isTrackFocusEnabled is on");
        }
        return (FocusStateImpl) this.states.O(focusTargetNode);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getOngoingTransaction() {
        return this.ongoingTransaction;
    }
}
