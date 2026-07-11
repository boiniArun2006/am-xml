package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import com.applovin.sdk.AppLovinEventParameters;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/input/MoveCursorCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", V8ValueTypedArray.PROPERTY_BUFFER, "", c.f62177j, "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getAmount", AppLovinEventParameters.REVENUE_AMOUNT, "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MoveCursorCommand implements EditCommand {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int amount;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) other).amount;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getAmount() {
        return this.amount;
    }

    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void n(EditingBuffer buffer) {
        if (buffer.Uo() == -1) {
            buffer.HI(buffer.getSelectionStart());
        }
        int selectionStart = buffer.getSelectionStart();
        String string = buffer.toString();
        int i2 = this.amount;
        int i3 = 0;
        if (i2 > 0) {
            while (i3 < i2) {
                int iN = JvmCharHelpers_androidKt.n(string, selectionStart);
                if (iN == -1) {
                    break;
                }
                i3++;
                selectionStart = iN;
            }
        } else {
            int i5 = -i2;
            while (i3 < i5) {
                int iRl = JvmCharHelpers_androidKt.rl(string, selectionStart);
                if (iRl == -1) {
                    break;
                }
                i3++;
                selectionStart = iRl;
            }
        }
        buffer.HI(selectionStart);
    }
}
