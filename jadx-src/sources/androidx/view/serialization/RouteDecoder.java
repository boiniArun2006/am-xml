package androidx.view.serialization;

import DGv.Ml;
import EJn.Wre;
import XA.w6;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import gi.I28;
import gi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010+\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/navigation/serialization/RouteDecoder;", "Lgi/j;", "", "wTp", "()Ljava/lang/Object;", "LEJn/Wre;", "descriptor", "", "nY", "(LEJn/Wre;)I", "s7N", "", "gh", "()Ljava/lang/Void;", "", "E2", "()Z", "Lgi/I28;", "az", "(LEJn/Wre;)Lgi/I28;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LXA/w6;", "deserializer", "qie", "(LXA/w6;)Ljava/lang/Object;", "Landroidx/navigation/serialization/ArgStore;", "rl", "Landroidx/navigation/serialization/ArgStore;", "store", "t", "I", "elementIndex", "", "nr", "Ljava/lang/String;", "elementName", "LDGv/Ml;", "O", "LDGv/Ml;", c.f62177j, "()LDGv/Ml;", "getSerializersModule$annotations", "()V", "serializersModule", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/RouteDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
public final class RouteDecoder extends j {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Ml serializersModule;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private String elementName;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ArgStore store;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int elementIndex;

    @Override // gi.j, gi.I28
    public Void gh() {
        return null;
    }

    private final Object wTp() {
        Object objRl = this.store.rl(this.elementName);
        if (objRl != null) {
            return objRl;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.elementName).toString());
    }

    @Override // gi.j, gi.I28
    public boolean E2() {
        return this.store.rl(this.elementName) != null;
    }

    @Override // gi.j, gi.I28
    public I28 az(Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (RouteSerializerKt.qie(descriptor)) {
            this.elementName = descriptor.O(0);
            this.elementIndex = 0;
        }
        return super.az(descriptor);
    }

    @Override // gi.I28, gi.w6
    /* JADX INFO: renamed from: n, reason: from getter */
    public Ml getSerializersModule() {
        return this.serializersModule;
    }

    @Override // gi.w6
    public int nY(Wre descriptor) {
        String strO;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = this.elementIndex;
        do {
            i2++;
            if (i2 >= descriptor.nr()) {
                return -1;
            }
            strO = descriptor.O(i2);
        } while (!this.store.n(strO));
        this.elementIndex = i2;
        this.elementName = strO;
        return i2;
    }

    @Override // gi.I28
    public Object qie(w6 deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, QiDPjiOCZHDS.FSIYD);
        return wTp();
    }

    @Override // gi.j
    public Object s7N() {
        return wTp();
    }
}
