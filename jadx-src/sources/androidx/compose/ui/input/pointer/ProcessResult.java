package androidx.compose.ui.input.pointer;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/ProcessResult;", "", "", "value", c.f62177j, "(I)I", "", "nr", "(I)Ljava/lang/String;", "t", InneractiveMediationNameConsts.OTHER, "", "rl", "(ILjava/lang/Object;)Z", "I", "getValue", "()I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class ProcessResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    public static int n(int i2) {
        return i2;
    }

    public static String nr(int i2) {
        return "ProcessResult(value=" + i2 + ')';
    }

    public static boolean rl(int i2, Object obj) {
        return (obj instanceof ProcessResult) && i2 == ((ProcessResult) obj).getValue();
    }

    public static int t(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return rl(this.value, obj);
    }

    public int hashCode() {
        return t(this.value);
    }

    public String toString() {
        return nr(this.value);
    }
}
