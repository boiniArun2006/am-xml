package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "Landroidx/compose/foundation/content/ReceiveContentNode;", "receiveContentNode", "<init>", "(Landroidx/compose/foundation/content/ReceiveContentNode;)V", "Landroidx/compose/foundation/content/ReceiveContentListener;", "nr", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "rl", "Landroidx/compose/foundation/content/ReceiveContentNode;", "O", "()Landroidx/compose/foundation/content/ReceiveContentNode;", "t", "Landroidx/compose/foundation/content/ReceiveContentListener;", c.f62177j, "receiveContentListener", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ReceiveContentNode receiveContentNode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ReceiveContentListener receiveContentListener = new ReceiveContentListener() { // from class: androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private int nodeEnterCount;

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void t() {
            this.nodeEnterCount = 0;
            this.rl.getReceiveContentNode().getReceiveContentListener().t();
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public TransferableContent O(TransferableContent transferableContent) {
            TransferableContent transferableContentO = this.rl.getReceiveContentNode().getReceiveContentListener().O(transferableContent);
            if (transferableContentO == null) {
                return null;
            }
            ReceiveContentListener receiveContentListenerNr = this.rl.nr();
            return receiveContentListenerNr == null ? transferableContentO : receiveContentListenerNr.O(transferableContentO);
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void n() {
            int i2 = this.nodeEnterCount + 1;
            this.nodeEnterCount = i2;
            if (i2 == 1) {
                this.rl.getReceiveContentNode().getReceiveContentListener().n();
            }
            ReceiveContentListener receiveContentListenerNr = this.rl.nr();
            if (receiveContentListenerNr != null) {
                receiveContentListenerNr.n();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void nr() {
            int i2 = this.nodeEnterCount;
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i2 - 1, 0);
            this.nodeEnterCount = iCoerceAtLeast;
            if (iCoerceAtLeast == 0 && i2 > 0) {
                this.rl.getReceiveContentNode().getReceiveContentListener().nr();
            }
            ReceiveContentListener receiveContentListenerNr = this.rl.nr();
            if (receiveContentListenerNr != null) {
                receiveContentListenerNr.nr();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void rl() {
            this.rl.getReceiveContentNode().getReceiveContentListener().rl();
            this.nodeEnterCount = 0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final ReceiveContentListener nr() {
        ReceiveContentConfiguration receiveContentConfigurationRl = ReceiveContentConfigurationKt.rl(this.receiveContentNode);
        if (receiveContentConfigurationRl != null) {
            return receiveContentConfigurationRl.getReceiveContentListener();
        }
        return null;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final ReceiveContentNode getReceiveContentNode() {
        return this.receiveContentNode;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    /* JADX INFO: renamed from: n, reason: from getter */
    public ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    public DynamicReceiveContentConfiguration(ReceiveContentNode receiveContentNode) {
        this.receiveContentNode = receiveContentNode;
    }
}
