package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "Landroidx/compose/ui/Modifier$Node;", "", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "callback", "<init>", "(JJLkotlin/jvm/functions/Function1;)V", "UR", "()V", "c", "Sax", "v", "J", "getThrottleMillis", "()J", "ex", "(J)V", "Xw", "getDebounceMillis", "NC9", "jB", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "W5k", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "U", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "getHandle", "()Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "setHandle", "(Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;)V", "handle", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OnLayoutRectChangedNode extends Modifier.Node {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private DelegatableNode.RegistrationHandle handle;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private long debounceMillis;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function1 callback;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long throttleMillis;

    public final void NC9(long j2) {
        this.debounceMillis = j2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.n();
        }
    }

    public final void UR() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.n();
        }
        this.handle = OnLayoutRectChangedModifierKt.n(this, this.throttleMillis, this.debounceMillis, this.callback);
    }

    public final void W5k(Function1 function1) {
        this.callback = function1;
    }

    public final void ex(long j2) {
        this.throttleMillis = j2;
    }

    public OnLayoutRectChangedNode(long j2, long j3, Function1 function1) {
        this.throttleMillis = j2;
        this.debounceMillis = j3;
        this.callback = function1;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        UR();
    }
}
