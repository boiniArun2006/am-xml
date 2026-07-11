package androidx.view.serialization;

import DGv.Ml;
import DGv.Wre;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import gi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/savedstate/serialization/EmptyArrayDecoder;", "Lgi/j;", "<init>", "()V", "LEJn/Wre;", "descriptor", "", "nY", "(LEJn/Wre;)I", "LDGv/Ml;", "t", "LDGv/Ml;", c.f62177j, "()LDGv/Ml;", "serializersModule", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class EmptyArrayDecoder extends j {
    public static final EmptyArrayDecoder rl = new EmptyArrayDecoder();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final Ml serializersModule = Wre.n();

    @Override // gi.w6
    public int nY(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    @Override // gi.I28, gi.w6
    /* JADX INFO: renamed from: n */
    public Ml getSerializersModule() {
        return serializersModule;
    }

    private EmptyArrayDecoder() {
    }
}
