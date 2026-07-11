package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001#B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R/\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0012R\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager;", "", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "initialStagingUndo", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text/input/internal/undo/UndoManager;)V", "", "nr", "()V", "Landroidx/compose/foundation/text/input/TextFieldState;", "state", "gh", "(Landroidx/compose/foundation/text/input/TextFieldState;)V", "xMQ", "op", "KN", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;)V", "t", c.f62177j, "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "<set-?>", "rl", "Landroidx/compose/runtime/MutableState;", "Uo", "()Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "mUb", "stagingUndo", "", "J2", "()Z", "canUndo", "O", "canRedo", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n85#2:252\n113#2,2:253\n602#3,8:255\n602#3,8:263\n1#4:271\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n*L\n44#1:252\n44#1:253,2\n70#1:255,8\n95#1:263,8\n*E\n"})
public final class TextUndoManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final UndoManager undoManager;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState stagingUndo;
    public static final int nr = 8;

    public TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager) {
        this.undoManager = undoManager;
        this.stagingUndo = SnapshotStateKt__SnapshotStateKt.O(textUndoOperation, null, 2, null);
    }

    public final void t() {
        mUb(null);
        this.undoManager.nr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextUndoOperation Uo() {
        return (TextUndoOperation) this.stagingUndo.getValue();
    }

    private final void mUb(TextUndoOperation textUndoOperation) {
        this.stagingUndo.setValue(textUndoOperation);
    }

    private final void nr() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            TextUndoOperation textUndoOperationUo = Uo();
            if (textUndoOperationUo != null) {
                this.undoManager.KN(textUndoOperationUo);
            }
            mUb(null);
        } finally {
            companion.az(snapshotNr, snapshotO, function1Uo);
        }
    }

    public final boolean J2() {
        return this.undoManager.J2() || Uo() != null;
    }

    public final void KN(TextUndoOperation op) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            TextUndoOperation textUndoOperationUo = Uo();
            if (textUndoOperationUo == null) {
                mUb(op);
                return;
            }
            TextUndoOperation textUndoOperationRl = TextUndoManagerKt.rl(textUndoOperationUo, op);
            if (textUndoOperationRl != null) {
                mUb(textUndoOperationRl);
            } else {
                nr();
                mUb(op);
            }
        } finally {
            companion.az(snapshotNr, snapshotO, function1Uo);
        }
    }

    public final boolean O() {
        return this.undoManager.O() && Uo() == null;
    }

    public final void gh(TextFieldState state) {
        if (!J2()) {
            return;
        }
        nr();
        TextUndoOperationKt.rl(state, (TextUndoOperation) this.undoManager.mUb());
    }

    public final void xMQ(TextFieldState state) {
        if (!O()) {
            return;
        }
        TextUndoOperationKt.n(state, (TextUndoOperation) this.undoManager.xMQ());
    }

    public /* synthetic */ TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : textUndoOperation, (i2 & 2) != 0 ? new UndoManager(null, null, 100, 3, null) : undoManager);
    }
}
