package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.LayoutInfo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Landroidx/compose/ui/tooling/ViewInfo;", "allViewInfoRoots", c.f62177j, "(Ljava/util/List;)Ljava/util/List;", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,115:1\n1549#2:116\n1620#2,3:117\n1373#2:120\n1461#2,5:121\n1549#2:126\n1620#2,3:127\n766#2:130\n857#2,2:131\n1477#2:133\n1502#2,3:134\n1505#2,3:144\n1855#2,2:147\n1549#2:149\n1620#2,3:150\n372#3,7:137\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n*L\n75#1:116\n75#1:117,3\n81#1:120\n81#1:121,5\n82#1:126\n82#1:127,3\n83#1:130\n83#1:131,2\n84#1:133\n84#1:134,3\n84#1:144,3\n89#1:147,2\n111#1:149\n111#1:150,3\n84#1:137,7\n*E\n"})
public final class ShadowViewInfo_androidKt {
    public static final List n(List list) {
        if (list.size() < 2) {
            return list;
        }
        ArrayList<ShadowViewInfo> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShadowViewInfo((ViewInfo) it.next()));
        }
        ArrayList<ShadowViewInfo> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((ShadowViewInfo) it2.next()).getAllNodes());
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (ShadowViewInfo shadowViewInfo : arrayList2) {
            arrayList3.add(TuplesKt.to(shadowViewInfo.nr(), shadowViewInfo));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((Pair) obj).getFirst() != null) {
                arrayList4.add(obj);
            }
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            LayoutInfo layoutInfo = (LayoutInfo) ((Pair) obj2).getFirst();
            Object arrayList5 = linkedHashMap.get(layoutInfo);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(layoutInfo, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        for (final ShadowViewInfo shadowViewInfo2 : arrayList) {
            ShadowViewInfo shadowViewInfo3 = (ShadowViewInfo) SequencesKt.firstOrNull(SequencesKt.map(SequencesKt.filter(SequencesKt.flatMapIterable(shadowViewInfo2.getAllNodes(), new Function1<ShadowViewInfo, List<? extends Pair<? extends LayoutInfo, ? extends ShadowViewInfo>>>() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$stitchTrees$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final List invoke(ShadowViewInfo shadowViewInfo4) {
                    Map map = linkedHashMap;
                    LayoutInfo layoutInfoNr = shadowViewInfo4.nr();
                    List list2 = (List) map.get(layoutInfoNr != null ? layoutInfoNr.n() : null);
                    return list2 == null ? CollectionsKt.emptyList() : list2;
                }
            }), new Function1<Pair<? extends LayoutInfo, ? extends ShadowViewInfo>, Boolean>() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$stitchTrees$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Pair pair) {
                    return Boolean.valueOf(!Intrinsics.areEqual(((ShadowViewInfo) pair.getSecond()).n(), shadowViewInfo2));
                }
            }), new Function1<Pair<? extends LayoutInfo, ? extends ShadowViewInfo>, ShadowViewInfo>() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$stitchTrees$1$3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final ShadowViewInfo invoke(Pair pair) {
                    return (ShadowViewInfo) pair.component2();
                }
            }));
            if (shadowViewInfo3 != null) {
                shadowViewInfo2.O(shadowViewInfo3);
                linkedHashSet.remove(shadowViewInfo2);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((ShadowViewInfo) it3.next()).J2());
        }
        return arrayList6;
    }
}
