package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "", "newCursorPosition", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "", "text", "(Ljava/lang/String;I)V", "Landroidx/compose/ui/text/input/EditingBuffer;", V8ValueTypedArray.PROPERTY_BUFFER, "", c.f62177j, "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "rl", "I", "t", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SetComposingTextCommand implements EditCommand {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString annotatedString;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final int newCursorPosition;

    public SetComposingTextCommand(AnnotatedString annotatedString, int i2) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) other;
        return Intrinsics.areEqual(t(), setComposingTextCommand.t()) && this.newCursorPosition == setComposingTextCommand.newCursorPosition;
    }

    public SetComposingTextCommand(String str, int i2) {
        this(new AnnotatedString(str, null, 2, null), i2);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String t() {
        return this.annotatedString.getText();
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + t() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    public int hashCode() {
        return (t().hashCode() * 31) + this.newCursorPosition;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void n(EditingBuffer buffer) {
        int length;
        if (buffer.qie()) {
            int compositionStart = buffer.getCompositionStart();
            buffer.az(buffer.getCompositionStart(), buffer.getCompositionEnd(), t());
            if (t().length() > 0) {
                buffer.ty(compositionStart, t().length() + compositionStart);
            }
        } else {
            int selectionStart = buffer.getSelectionStart();
            buffer.az(buffer.getSelectionStart(), buffer.getSelectionEnd(), t());
            if (t().length() > 0) {
                buffer.ty(selectionStart, t().length() + selectionStart);
            }
        }
        int iUo = buffer.Uo();
        int i2 = this.newCursorPosition;
        if (i2 > 0) {
            length = (iUo + i2) - 1;
        } else {
            length = (iUo + i2) - t().length();
        }
        buffer.HI(RangesKt.coerceIn(length, 0, buffer.KN()));
    }
}
