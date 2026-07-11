package androidx.compose.foundation;

import GJW.C;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DrawModifierNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Landroidx/compose/foundation/IndicationNodeFactory;", "<init>", "()V", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/node/DelegatableNode;", "rl", "(Landroidx/compose/foundation/interaction/InteractionSource;)Landroidx/compose/ui/node/DelegatableNode;", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "DefaultDebugIndicationInstance", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultDebugIndication implements IndicationNodeFactory {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DefaultDebugIndication f16095n = new DefaultDebugIndication();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "", "c", "()V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "v", "Landroidx/compose/foundation/interaction/InteractionSource;", "", "Xw", "Z", "isPressed", "jB", "isHovered", "U", "isFocused", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class DefaultDebugIndicationInstance extends Modifier.Node implements DrawModifierNode {

        /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
        private boolean isFocused;

        /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
        private boolean isPressed;

        /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
        private boolean isHovered;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final InteractionSource interactionSource;

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void N(ContentDrawScope contentDrawScope) {
            contentDrawScope.l2();
            if (this.isPressed) {
                DrawScope.h(contentDrawScope, Color.az(Color.INSTANCE.n(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.t(), 0.0f, null, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, null);
            } else if (this.isHovered || this.isFocused) {
                DrawScope.h(contentDrawScope, Color.az(Color.INSTANCE.n(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.t(), 0.0f, null, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, null);
            }
        }

        public DefaultDebugIndicationInstance(InteractionSource interactionSource) {
            this.interactionSource = interactionSource;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void c() {
            C.nr(Xli(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3, null);
        }
    }

    public boolean equals(Object other) {
        return other == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        return -1;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode rl(InteractionSource interactionSource) {
        return new DefaultDebugIndicationInstance(interactionSource);
    }

    private DefaultDebugIndication() {
    }
}
