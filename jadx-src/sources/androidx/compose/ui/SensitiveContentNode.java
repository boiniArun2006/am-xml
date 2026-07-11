package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R*\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/SensitiveContentNode;", "Landroidx/compose/ui/Modifier$Node;", "", "_isContentSensitive", "<init>", "(Z)V", "", "c", "()V", "Sax", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "v", "Z", "Xw", "isCountedSensitive", "value", "jB", "isContentSensitive", "()Z", "UR", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSensitiveContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensitiveContent.kt\nandroidx/compose/ui/SensitiveContentNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,82:1\n56#2,5:83\n*S KotlinDebug\n*F\n+ 1 SensitiveContent.kt\nandroidx/compose/ui/SensitiveContentNode\n*L\n68#1:83,5\n*E\n"})
final /* data */ class SensitiveContentNode extends Modifier.Node {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean isCountedSensitive;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isContentSensitive;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean _isContentSensitive;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SensitiveContentNode) && this._isContentSensitive == ((SensitiveContentNode) other)._isContentSensitive;
    }

    public int hashCode() {
        return Boolean.hashCode(this._isContentSensitive);
    }

    public String toString() {
        return "SensitiveContentNode(_isContentSensitive=" + this._isContentSensitive + ')';
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        if (this.isCountedSensitive) {
            DelegatableNodeKt.ck(this).s7N();
            this.isCountedSensitive = false;
        }
        super.Sax();
    }

    public final void UR(boolean z2) {
        this.isContentSensitive = z2;
        if (z2 && !this.isCountedSensitive) {
            DelegatableNodeKt.ck(this).iF();
            this.isCountedSensitive = true;
        } else {
            if (z2 || !this.isCountedSensitive) {
                return;
            }
            DelegatableNodeKt.ck(this).s7N();
            this.isCountedSensitive = false;
        }
    }

    public SensitiveContentNode(boolean z2) {
        this._isContentSensitive = z2;
        this.isContentSensitive = z2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        super.c();
        if (this.isContentSensitive) {
            if (this.isCountedSensitive) {
                InlineClassHelperKt.t("invalid sensitive content state");
            }
            DelegatableNodeKt.ck(this).iF();
            this.isCountedSensitive = true;
        }
    }
}
