package androidx.compose.ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.RenderIntent;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/graphics/colorspace/Connector;", c.f62177j, "Landroidx/collection/MutableIntObjectMap;", "()Landroidx/collection/MutableIntObjectMap;", "Connectors", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n1#1,328:1\n326#1:329\n326#1:330\n326#1:331\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n315#1:329\n317#1:330\n319#1:331\n*E\n"})
public final class ConnectorKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final MutableIntObjectMap f31611n;

    static {
        ColorSpaces colorSpaces = ColorSpaces.f31604n;
        int id = colorSpaces.X().getId();
        int id2 = colorSpaces.X().getId();
        RenderIntent.Companion companion = RenderIntent.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        f31611n = IntObjectMapKt.nr(id | (id2 << 6) | (companion.rl() << 12), Connector.INSTANCE.t(colorSpaces.X()), colorSpaces.X().getId() | (colorSpaces.fD().getId() << 6) | (companion.rl() << 12), new Connector(colorSpaces.X(), colorSpaces.fD(), companion.rl(), defaultConstructorMarker), colorSpaces.fD().getId() | (colorSpaces.X().getId() << 6) | (companion.rl() << 12), new Connector(colorSpaces.fD(), colorSpaces.X(), companion.rl(), defaultConstructorMarker));
    }

    public static final MutableIntObjectMap n() {
        return f31611n;
    }
}
