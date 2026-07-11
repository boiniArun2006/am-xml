package androidx.view.serialization;

import DGv.Wre;
import XA.Ml;
import XA.eO;
import androidx.annotation.RestrictTo;
import androidx.view.CollectionNavType;
import androidx.view.NavType;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import gi.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\r\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b#\u0010*R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010&R\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/navigation/serialization/RouteEncoder;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lgi/n;", "LXA/Ml;", "serializer", "", "", "Landroidx/navigation/NavType;", "typeMap", "<init>", "(LXA/Ml;Ljava/util/Map;)V", "value", "", "wTp", "(Ljava/lang/Object;)V", "", "s7N", "(Ljava/lang/Object;)Ljava/util/Map;", "LXA/eO;", "ViF", "(LXA/eO;Ljava/lang/Object;)V", "LEJn/Wre;", "descriptor", "", "index", "", "N", "(LEJn/Wre;I)Z", "nHg", "Ik", "()V", "Lgi/Wre;", "J2", "(LEJn/Wre;)Lgi/Wre;", c.f62177j, "LXA/Ml;", "rl", "Ljava/util/Map;", "LDGv/Ml;", "t", "LDGv/Ml;", "()LDGv/Ml;", "serializersModule", "", "nr", "map", "O", "I", "elementIndex", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
public final class RouteEncoder<T> extends n {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int elementIndex;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Ml serializer;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Map map;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Map typeMap;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final DGv.Ml serializersModule;

    @Override // gi.n, gi.Wre
    public void Ik() {
        wTp(null);
    }

    public RouteEncoder(Ml serializer, Map typeMap) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.serializer = serializer;
        this.typeMap = typeMap;
        this.serializersModule = Wre.n();
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void wTp(Object value) {
        String strO = this.serializer.getDescriptor().O(this.elementIndex);
        NavType navType = (NavType) this.typeMap.get(strO);
        if (navType != null) {
            this.map.put(strO, navType instanceof CollectionNavType ? ((CollectionNavType) navType).qie(value) : CollectionsKt.listOf(navType.xMQ(value)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strO + ". Please provide NavType through typeMap.").toString());
    }

    @Override // gi.n, gi.Wre
    public gi.Wre J2(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (RouteSerializerKt.qie(descriptor)) {
            this.elementIndex = 0;
        }
        return super.J2(descriptor);
    }

    @Override // gi.n
    public boolean N(EJn.Wre descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.elementIndex = index;
        return true;
    }

    @Override // gi.Wre
    public void ViF(eO serializer, Object value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        wTp(value);
    }

    @Override // gi.Wre
    /* JADX INFO: renamed from: n, reason: from getter */
    public DGv.Ml getSerializersModule() {
        return this.serializersModule;
    }

    @Override // gi.n
    public void nHg(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        wTp(value);
    }

    public final Map s7N(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.ViF(this.serializer, value);
        return MapsKt.toMap(this.map);
    }
}
