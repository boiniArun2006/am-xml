package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRangeKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001$B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "initialChanges", "<init>", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker;)V", "Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "mergedOverlappingChange", "", "preMin", "preMax", "postDelta", "", "nr", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;III)V", "preStart", "preEnd", "postLength", "J2", "(III)V", "O", "()V", "changeIndex", "Landroidx/compose/ui/text/TextRange;", "t", "(I)J", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "_changes", "rl", "_changesTemp", "()I", "changeCount", "Change", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChangeTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1101#2:199\n1083#2,2:200\n1101#2:202\n1083#2,2:203\n423#3,6:205\n641#3,2:211\n429#3,3:213\n472#3:216\n641#3,2:217\n472#3:219\n472#3:221\n435#3,9:222\n516#3:231\n641#3,2:232\n1#4:220\n*S KotlinDebug\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n*L\n31#1:199\n31#1:200,2\n32#1:202\n32#1:203,2\n35#1:205,6\n36#1:211,2\n35#1:213,3\n78#1:216\n109#1:217,2\n131#1:219\n134#1:221\n138#1:222,9\n155#1:231\n188#1:232,2\n*E\n"})
public final class ChangeTracker implements TextFieldBuffer.ChangeList {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private MutableVector _changes;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private MutableVector _changesTemp;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u001a\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "", "", "preStart", "preEnd", "originalStart", "originalEnd", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "I", "nr", "KN", "(I)V", "rl", "t", "Uo", "J2", "O", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class Change {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private int preStart;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
        private int originalEnd;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private int preEnd;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private int originalStart;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Change)) {
                return false;
            }
            Change change = (Change) other;
            return this.preStart == change.preStart && this.preEnd == change.preEnd && this.originalStart == change.originalStart && this.originalEnd == change.originalEnd;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.preStart) * 31) + Integer.hashCode(this.preEnd)) * 31) + Integer.hashCode(this.originalStart)) * 31) + Integer.hashCode(this.originalEnd);
        }

        public String toString() {
            return "Change(preStart=" + this.preStart + ", preEnd=" + this.preEnd + ", originalStart=" + this.originalStart + ", originalEnd=" + this.originalEnd + ')';
        }

        public final void J2(int i2) {
            this.originalStart = i2;
        }

        public final void KN(int i2) {
            this.preStart = i2;
        }

        public final void O(int i2) {
            this.originalEnd = i2;
        }

        public final void Uo(int i2) {
            this.preEnd = i2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final int getPreStart() {
            return this.preStart;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final int getOriginalStart() {
            return this.originalStart;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getPreEnd() {
            return this.preEnd;
        }

        public Change(int i2, int i3, int i5, int i7) {
            this.preStart = i2;
            this.preEnd = i3;
            this.originalStart = i5;
            this.originalEnd = i7;
        }
    }

    public ChangeTracker(ChangeTracker changeTracker) {
        MutableVector mutableVector;
        this._changes = new MutableVector(new Change[16], 0);
        this._changesTemp = new MutableVector(new Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker._changes) == null) {
            return;
        }
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Change change = (Change) objArr[i2];
            this._changes.rl(new Change(change.getPreStart(), change.getPreEnd(), change.getOriginalStart(), change.getOriginalEnd()));
        }
    }

    private final void nr(Change mergedOverlappingChange, int preMin, int preMax, int postDelta) {
        int preEnd;
        if (this._changesTemp.getSize() == 0) {
            preEnd = 0;
        } else {
            Change change = (Change) this._changesTemp.ty();
            preEnd = change.getPreEnd() - change.getOriginalEnd();
        }
        if (mergedOverlappingChange == null) {
            int i2 = preMin - preEnd;
            mergedOverlappingChange = new Change(preMin, preMax + postDelta, i2, (preMax - preMin) + i2);
        } else {
            if (mergedOverlappingChange.getPreStart() > preMin) {
                mergedOverlappingChange.KN(preMin);
                mergedOverlappingChange.J2(preMin);
            }
            if (preMax > mergedOverlappingChange.getPreEnd()) {
                int preEnd2 = mergedOverlappingChange.getPreEnd() - mergedOverlappingChange.getOriginalEnd();
                mergedOverlappingChange.Uo(preMax);
                mergedOverlappingChange.O(preMax - preEnd2);
            }
            mergedOverlappingChange.Uo(mergedOverlappingChange.getPreEnd() + postDelta);
        }
        this._changesTemp.rl(mergedOverlappingChange);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J2(int preStart, int preEnd, int postLength) {
        int preEnd2;
        if (preStart == preEnd && postLength == 0) {
            return;
        }
        int iMin = Math.min(preStart, preEnd);
        int iMax = Math.max(preStart, preEnd);
        int i2 = postLength - (iMax - iMin);
        Change change = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < this._changes.getSize(); i3++) {
            Change change2 = (Change) this._changes.content[i3];
            int preStart2 = change2.getPreStart();
            if ((iMin > preStart2 || preStart2 > iMax) && (iMin > (preEnd2 = change2.getPreEnd()) || preEnd2 > iMax)) {
                int preStart3 = change2.getPreStart();
                if (iMin > change2.getPreEnd() || preStart3 > iMin) {
                    int preStart4 = change2.getPreStart();
                    if (iMax > change2.getPreEnd() || preStart4 > iMax) {
                        if (change2.getPreStart() > iMax && !z2) {
                            nr(change, iMin, iMax, i2);
                            z2 = true;
                        }
                        if (z2) {
                            change2.KN(change2.getPreStart() + i2);
                            change2.Uo(change2.getPreEnd() + i2);
                        }
                        this._changesTemp.rl(change2);
                    } else if (change == null) {
                        change = change2;
                    } else {
                        change.Uo(change2.getPreEnd());
                        change.O(change2.getOriginalEnd());
                    }
                }
            }
        }
        if (!z2) {
            nr(change, iMin, iMax, i2);
        }
        MutableVector mutableVector = this._changes;
        this._changes = this._changesTemp;
        this._changesTemp = mutableVector;
        mutableVector.KN();
    }

    public final void O() {
        this._changes.KN();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public long n(int changeIndex) {
        Change change = (Change) this._changes.content[changeIndex];
        return TextRangeKt.rl(change.getOriginalStart(), change.getOriginalEnd());
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public int rl() {
        return this._changes.getSize();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public long t(int changeIndex) {
        Change change = (Change) this._changes.content[changeIndex];
        return TextRangeKt.rl(change.getPreStart(), change.getPreEnd());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList(changes=[");
        MutableVector mutableVector = this._changes;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Change change = (Change) objArr[i2];
            sb.append('(' + change.getOriginalStart() + ',' + change.getOriginalEnd() + ")->(" + change.getPreStart() + ',' + change.getPreEnd() + ')');
            if (i2 < rl() - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : changeTracker);
    }
}
