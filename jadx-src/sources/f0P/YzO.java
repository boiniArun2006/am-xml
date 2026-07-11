package f0P;

import com.alightcreative.app.motion.scene.BlendingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class YzO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f65131n;
    private static final Map rl;

    static {
        gnv gnvVar = new gnv(OU.f64564t, BlendingMode.NORMAL, 2131231102, 2132017343);
        OU ou2 = OU.f64558O;
        gnv gnvVar2 = new gnv(ou2, BlendingMode.MULTIPLY, 2131231101, 2132017342);
        OU ou3 = OU.J2;
        gnv gnvVar3 = new gnv(ou3, BlendingMode.SCREEN, 2131231106, 2132017347);
        OU ou4 = OU.f64559S;
        gnv gnvVar4 = new gnv(ou4, BlendingMode.MASK, 2131231100, 2132017341);
        gnv gnvVar5 = new gnv(ou4, BlendingMode.EXCLUDE, 2131231090, 2132017331);
        OU ou5 = OU.f64562o;
        gnv gnvVar6 = new gnv(ou5, BlendingMode.DIFF, 2131231088, 2132017329);
        gnv gnvVar7 = new gnv(ou3, BlendingMode.LIGHTEN, 2131231094, 2132017335);
        gnv gnvVar8 = new gnv(ou2, BlendingMode.DARKEN, 2131231086, 2132017327);
        gnv gnvVar9 = new gnv(ou3, BlendingMode.LIGHTER_COLOR, 2131231095, 2132017336);
        gnv gnvVar10 = new gnv(ou2, BlendingMode.DARKER_COLOR, 2131231087, 2132017328);
        gnv gnvVar11 = new gnv(ou2, BlendingMode.COLOR_BURN, 2131231084, 2132017325);
        gnv gnvVar12 = new gnv(ou2, BlendingMode.LINEAR_BURN, 2131231096, 2132017337);
        gnv gnvVar13 = new gnv(ou3, BlendingMode.COLOR_DODGE, 2131231085, 2132017326);
        gnv gnvVar14 = new gnv(ou3, BlendingMode.LINEAR_DODGE, 2131231097, 2132017338);
        OU ou6 = OU.f64563r;
        gnv gnvVar15 = new gnv(ou6, BlendingMode.OVERLAY, 2131231103, 2132017344);
        gnv gnvVar16 = new gnv(ou6, BlendingMode.SOFT_LIGHT, 2131231107, 2132017348);
        gnv gnvVar17 = new gnv(ou6, BlendingMode.HARD_LIGHT, 2131231092, 2132017333);
        gnv gnvVar18 = new gnv(ou6, BlendingMode.SOFT_OVERLAY, 2131231108, 2132017349);
        gnv gnvVar19 = new gnv(ou6, BlendingMode.VIVID_LIGHT, 2131231110, 2132017351);
        gnv gnvVar20 = new gnv(ou6, BlendingMode.LINEAR_LIGHT, 2131231098, 2132017339);
        gnv gnvVar21 = new gnv(ou6, BlendingMode.PIN_LIGHT, 2131231104, 2132017345);
        OU ou7 = OU.f64560Z;
        List listListOf = CollectionsKt.listOf((Object[]) new gnv[]{gnvVar, gnvVar2, gnvVar3, gnvVar4, gnvVar5, gnvVar6, gnvVar7, gnvVar8, gnvVar9, gnvVar10, gnvVar11, gnvVar12, gnvVar13, gnvVar14, gnvVar15, gnvVar16, gnvVar17, gnvVar18, gnvVar19, gnvVar20, gnvVar21, new gnv(ou7, BlendingMode.HUE, 2131231093, 2132017334), new gnv(ou7, BlendingMode.SATURATION, 2131231105, 2132017346), new gnv(ou7, BlendingMode.COLOR, 2131231083, 2132017324), new gnv(ou7, BlendingMode.LUMINANCE, 2131231099, 2132017340), new gnv(ou5, BlendingMode.EXCLUSION, 2131231091, 2132017332), new gnv(ou5, BlendingMode.SUBTRACT, 2131231109, 2132017350), new gnv(ou5, BlendingMode.DIVIDE, 2131231089, 2132017330)});
        f65131n = listListOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
        for (Object obj : listListOf) {
            linkedHashMap.put(((gnv) obj).n(), obj);
        }
        rl = linkedHashMap;
    }
}
