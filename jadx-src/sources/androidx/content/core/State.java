package androidx.content.core;

import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Landroidx/datastore/core/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", NodeModuleProcess.PROPERTY_VERSION, "<init>", "(I)V", c.f62177j, "I", "()I", "Landroidx/datastore/core/Data;", "Landroidx/datastore/core/Final;", "Landroidx/datastore/core/ReadException;", "Landroidx/datastore/core/UnInitialized;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class State<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public /* synthetic */ State(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    private State(int i2) {
        this.version = i2;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getVersion() {
        return this.version;
    }
}
