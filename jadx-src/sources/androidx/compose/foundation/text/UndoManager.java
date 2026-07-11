package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "", "maxStoredCharacters", "<init>", "(I)V", "", "nr", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "now", "O", "(Landroidx/compose/ui/text/input/TextFieldValue;J)V", c.f62177j, "rl", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Uo", "()Landroidx/compose/ui/text/input/TextFieldValue;", "t", "I", "getMaxStoredCharacters", "()I", "Landroidx/compose/foundation/text/UndoManager$Entry;", "Landroidx/compose/foundation/text/UndoManager$Entry;", "undoStack", "redoStack", "storedCharacters", "Ljava/lang/Long;", "lastSnapshot", "", "J2", "Z", "forceNextSnapshot", "Entry", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UndoManager {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean forceNextSnapshot;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Long lastSnapshot;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int maxStoredCharacters;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int storedCharacters;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Entry undoStack;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Entry redoStack;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/UndoManager$Entry;", "", "next", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "<init>", "(Landroidx/compose/foundation/text/UndoManager$Entry;Landroidx/compose/ui/text/input/TextFieldValue;)V", c.f62177j, "Landroidx/compose/foundation/text/UndoManager$Entry;", "()Landroidx/compose/foundation/text/UndoManager$Entry;", "t", "(Landroidx/compose/foundation/text/UndoManager$Entry;)V", "rl", "Landroidx/compose/ui/text/input/TextFieldValue;", "()Landroidx/compose/ui/text/input/TextFieldValue;", "nr", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Entry {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Entry next;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private TextFieldValue value;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Entry getNext() {
            return this.next;
        }

        public final void nr(TextFieldValue textFieldValue) {
            this.value = textFieldValue;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void t(Entry entry) {
            this.next = entry;
        }

        public Entry(Entry entry, TextFieldValue textFieldValue) {
            this.next = entry;
            this.value = textFieldValue;
        }
    }

    public UndoManager(int i2) {
        this.maxStoredCharacters = i2;
    }

    public final void n() {
        this.forceNextSnapshot = true;
    }

    public final void rl(TextFieldValue value) {
        TextFieldValue value2;
        this.forceNextSnapshot = false;
        Entry entry = this.undoStack;
        if (Intrinsics.areEqual(value, entry != null ? entry.getValue() : null)) {
            return;
        }
        String strXMQ = value.xMQ();
        Entry entry2 = this.undoStack;
        if (Intrinsics.areEqual(strXMQ, (entry2 == null || (value2 = entry2.getValue()) == null) ? null : value2.xMQ())) {
            Entry entry3 = this.undoStack;
            if (entry3 == null) {
                return;
            }
            entry3.nr(value);
            return;
        }
        this.undoStack = new Entry(this.undoStack, value);
        this.redoStack = null;
        int length = this.storedCharacters + value.xMQ().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            nr();
        }
    }

    public /* synthetic */ UndoManager(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 100000 : i2);
    }

    public static /* synthetic */ void J2(UndoManager undoManager, TextFieldValue textFieldValue, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = UndoManager_jvmKt.n();
        }
        undoManager.O(textFieldValue, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void nr() {
        Entry next;
        Entry next2 = this.undoStack;
        if ((next2 != null ? next2.getNext() : null) == null) {
            return;
        }
        while (true) {
            if (next2 == null) {
                next = null;
            } else {
                Entry next3 = next2.getNext();
                if (next3 != null) {
                    next = next3.getNext();
                }
            }
            if (next == null) {
                break;
            } else {
                next2 = next2.getNext();
            }
        }
        if (next2 == null) {
            return;
        }
        next2.t(null);
    }

    public final void O(TextFieldValue value, long now) {
        if (!this.forceNextSnapshot) {
            Long l2 = this.lastSnapshot;
            if (now <= (l2 != null ? l2.longValue() : 0L) + ((long) UndoManagerKt.n())) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(now);
        rl(value);
    }

    public final TextFieldValue Uo() {
        Entry next;
        Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().xMQ().length();
        this.redoStack = new Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    public final TextFieldValue t() {
        Entry entry = this.redoStack;
        if (entry == null) {
            return null;
        }
        this.redoStack = entry.getNext();
        this.undoStack = new Entry(this.undoStack, entry.getValue());
        this.storedCharacters += entry.getValue().xMQ().length();
        return entry.getValue();
    }
}
