package androidx.compose.ui.tooling;

import androidx.compose.ui.unit.IntRect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Landroidx/compose/ui/tooling/ViewInfo;", "Lkotlin/Function1;", "", "filter", c.f62177j, "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "indentation", "", "rl", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Ljava/lang/String;", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewInfoUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfoUtil.android.kt\nandroidx/compose/ui/tooling/ViewInfoUtil_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1360#2:69\n1446#2,2:70\n1360#2:72\n1446#2,5:73\n1448#2,3:78\n1855#2,2:81\n*S KotlinDebug\n*F\n+ 1 ViewInfoUtil.android.kt\nandroidx/compose/ui/tooling/ViewInfoUtil_androidKt\n*L\n24#1:69\n24#1:70,2\n26#1:72\n26#1:73,5\n24#1:78,3\n57#1:81,2\n*E\n"})
public final class ViewInfoUtil_androidKt {
    public static final List n(List list, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewInfo viewInfo = (ViewInfo) it.next();
            List<ViewInfo> listN = n(viewInfo.getChildren(), function1);
            ArrayList arrayList2 = new ArrayList();
            for (ViewInfo viewInfo2 : listN) {
                CollectionsKt.addAll(arrayList2, viewInfo2.getLocation() == null ? viewInfo2.getChildren() : CollectionsKt.listOf(viewInfo2));
            }
            CollectionsKt.addAll(arrayList, ((Boolean) function1.invoke(viewInfo)).booleanValue() ? CollectionsKt.listOf(new ViewInfo(viewInfo.getFileName(), viewInfo.getCom.caoccao.javet.exceptions.JavetError.PARAMETER_LINE_NUMBER java.lang.String(), viewInfo.getBounds(), viewInfo.getLocation(), arrayList2, viewInfo.getLayoutInfo())) : CollectionsKt.listOf(new ViewInfo("<root>", -1, IntRect.INSTANCE.n(), null, arrayList2, null)));
        }
        return arrayList;
    }

    public static final String rl(List list, int i2, Function1 function1) {
        String strRepeat = StringsKt.repeat(".", i2);
        StringBuilder sb = new StringBuilder();
        for (ViewInfo viewInfo : CollectionsKt.sortedWith(n(list, function1), ComparisonsKt.compareBy(new Function1<ViewInfo, Comparable<?>>() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$toDebugString$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Comparable invoke(ViewInfo viewInfo2) {
                return viewInfo2.getFileName();
            }
        }, new Function1<ViewInfo, Comparable<?>>() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$toDebugString$3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Comparable invoke(ViewInfo viewInfo2) {
                return Integer.valueOf(viewInfo2.getCom.caoccao.javet.exceptions.JavetError.PARAMETER_LINE_NUMBER java.lang.String());
            }
        }, new Function1<ViewInfo, Comparable<?>>() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$toDebugString$4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Comparable invoke(ViewInfo viewInfo2) {
                return Integer.valueOf(viewInfo2.n().size());
            }
        }))) {
            if (viewInfo.getLocation() != null) {
                sb.append(strRepeat + '|' + viewInfo.getFileName() + ':' + viewInfo.getCom.caoccao.javet.exceptions.JavetError.PARAMETER_LINE_NUMBER java.lang.String());
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append(strRepeat + "|<root>");
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
            String string = StringsKt.trim((CharSequence) rl(viewInfo.getChildren(), i2 + 1, function1)).toString();
            if (string.length() > 0) {
                sb.append(string);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ String t(List list, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            function1 = new Function1<ViewInfo, Boolean>() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$toDebugString$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(ViewInfo viewInfo) {
                    return Boolean.TRUE;
                }
            };
        }
        return rl(list, i2, function1);
    }
}
