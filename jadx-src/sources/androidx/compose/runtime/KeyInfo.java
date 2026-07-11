package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/KeyInfo;", "", "", "key", "objectKey", "location", "nodes", "index", "<init>", "(ILjava/lang/Object;III)V", c.f62177j, "I", "()I", "rl", "Ljava/lang/Object;", "nr", "()Ljava/lang/Object;", "t", "O", "getIndex", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KeyInfo {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int nodes;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object objectKey;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int location;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Object getObjectKey() {
        return this.objectKey;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getNodes() {
        return this.nodes;
    }

    public KeyInfo(int i2, Object obj, int i3, int i5, int i7) {
        this.key = i2;
        this.objectKey = obj;
        this.location = i3;
        this.nodes = i5;
        this.index = i7;
    }
}
