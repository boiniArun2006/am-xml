package hVe;

import QVk.n;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f67959n = new n();

    public static final n.j n(Map componentAttribution, Map shortcutAttribution, Map map, Map map2, Rect rect, String str, PointF pointF, Map map3, Object obj, boolean z2, Uri uri) {
        Intrinsics.checkNotNullParameter(componentAttribution, "componentAttribution");
        Intrinsics.checkNotNullParameter(shortcutAttribution, "shortcutAttribution");
        n.j jVar = new n.j();
        if (rect != null) {
            jVar.KN = rect.width();
            jVar.xMQ = rect.height();
        }
        jVar.mUb = str;
        if (pointF != null) {
            jVar.gh = Float.valueOf(pointF.x);
            jVar.qie = Float.valueOf(pointF.y);
        }
        jVar.J2 = obj;
        jVar.az = z2;
        jVar.Uo = uri;
        jVar.f8220t = map;
        jVar.nr = map3;
        jVar.rl = shortcutAttribution;
        jVar.f8219n = componentAttribution;
        jVar.f8218O = map2;
        return jVar;
    }

    private n() {
    }
}
