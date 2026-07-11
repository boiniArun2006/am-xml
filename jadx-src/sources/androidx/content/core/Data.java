package androidx.content.core;

import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/datastore/core/Data;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/State;", "value", "", "hashCode", NodeModuleProcess.PROPERTY_VERSION, "<init>", "(Ljava/lang/Object;II)V", "", "rl", "()V", "Ljava/lang/Object;", "t", "()Ljava/lang/Object;", "I", "getHashCode", "()I", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Data<T> extends State<T> {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object value;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int hashCode;

    public Data(Object obj, int i2, int i3) {
        super(i3, null);
        this.value = obj;
        this.hashCode = i2;
    }

    public final void rl() {
        Object obj = this.value;
        if ((obj != null ? obj.hashCode() : 0) != this.hashCode) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Object getValue() {
        return this.value;
    }
}
