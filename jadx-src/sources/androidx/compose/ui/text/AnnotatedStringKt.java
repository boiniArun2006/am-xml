package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u001aG\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aK\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0018\u00010\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010\u0018\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"\"\u0014\u0010%\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyles", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "nr", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Landroidx/compose/ui/text/AnnotatedString;", "defaultParagraphStyle", "mUb", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/ParagraphStyle;)Ljava/util/List;", "", TtmlNode.START, TtmlNode.END, "Lkotlin/Function1;", "", "predicate", "Uo", "(Landroidx/compose/ui/text/AnnotatedString;IILkotlin/jvm/functions/Function1;)Ljava/util/List;", "gh", "(Landroidx/compose/ui/text/AnnotatedString;II)Landroidx/compose/ui/text/AnnotatedString;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "ranges", "J2", "(Ljava/util/List;II)Ljava/util/List;", "lStart", "lEnd", "rStart", "rEnd", "xMQ", "(IIII)Z", "O", "()Landroidx/compose/ui/text/AnnotatedString;", c.f62177j, "Landroidx/compose/ui/text/AnnotatedString;", "EmptyAnnotatedString", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1607:1\n34#2,6:1608\n34#2,6:1614\n34#2,6:1621\n247#2,6:1627\n34#2,4:1633\n39#2:1657\n253#2:1658\n230#2,3:1659\n34#2,6:1662\n233#2:1668\n247#2,6:1669\n34#2,6:1675\n253#2:1681\n150#2,3:1682\n34#2,6:1685\n153#2:1691\n247#2,6:1700\n34#2,6:1706\n253#2:1712\n1045#3:1620\n101#4,10:1637\n101#4,10:1647\n114#5,8:1692\n1#6:1713\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1030#1:1608,6\n1031#1:1614,6\n1073#1:1621,6\n1183#1:1627,6\n1183#1:1633,4\n1183#1:1657\n1183#1:1658\n1209#1:1659,3\n1209#1:1662,6\n1209#1:1668\n1212#1:1669,6\n1212#1:1675,6\n1212#1:1681\n1245#1:1682,3\n1245#1:1685,6\n1245#1:1691\n1521#1:1700,6\n1521#1:1706,6\n1521#1:1712\n1066#1:1620\n1186#1:1637,10\n1187#1:1647,10\n1515#1:1692,8\n*E\n"})
public final class AnnotatedStringKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AnnotatedString f33352n = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final List J2(List list, int i2, int i3) {
        if (!(i2 <= i3)) {
            InlineClassHelperKt.n("start (" + i2 + ") should be less than or equal to end (" + i3 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i5);
            if (xMQ(i2, i3, range.getStart(), range.getEnd())) {
                arrayList.add(new AnnotatedString.Range(range.getItem(), Math.max(i2, range.getStart()) - i2, Math.min(i3, range.getEnd()) - i2, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List Uo(AnnotatedString annotatedString, int i2, int i3, Function1 function1) {
        List annotations;
        if (i2 == i3 || (annotations = annotatedString.getAnnotations()) == null) {
            return null;
        }
        if (i2 != 0 || i3 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(annotations.size());
            int size = annotations.size();
            for (int i5 = 0; i5 < size; i5++) {
                AnnotatedString.Range range = (AnnotatedString.Range) annotations.get(i5);
                if ((function1 != null ? ((Boolean) function1.invoke(range.getItem())).booleanValue() : true) && xMQ(i2, i3, range.getStart(), range.getEnd())) {
                    arrayList.add(new AnnotatedString.Range((AnnotatedString.Annotation) range.getItem(), RangesKt.coerceIn(range.getStart(), i2, i3) - i2, RangesKt.coerceIn(range.getEnd(), i2, i3) - i2, range.getTag()));
                }
            }
            return arrayList;
        }
        if (function1 == null) {
            return annotations;
        }
        ArrayList arrayList2 = new ArrayList(annotations.size());
        int size2 = annotations.size();
        for (int i7 = 0; i7 < size2; i7++) {
            Object obj = annotations.get(i7);
            if (((Boolean) function1.invoke(((AnnotatedString.Range) obj).getItem())).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean xMQ(int i2, int i3, int i5, int i7) {
        return ((i2 < i7) & (i5 < i3)) | (((i2 == i3) | (i5 == i7)) & (i2 == i5));
    }

    static /* synthetic */ List KN(AnnotatedString annotatedString, int i2, int i3, Function1 function1, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            function1 = null;
        }
        return Uo(annotatedString, i2, i3, function1);
    }

    public static final AnnotatedString O() {
        return f33352n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString gh(AnnotatedString annotatedString, int i2, int i3) {
        String strSubstring;
        if (i2 != i3) {
            strSubstring = annotatedString.getText().substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List listUo = Uo(annotatedString, i2, i3, new Function1<AnnotatedString.Annotation, Boolean>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$substringWithoutParagraphStyles$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(AnnotatedString.Annotation annotation) {
                return Boolean.valueOf(!(annotation instanceof ParagraphStyle));
            }
        });
        if (listUo == null) {
            listUo = CollectionsKt.emptyList();
        }
        return new AnnotatedString(strSubstring, listUo);
    }

    public static final List mUb(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        List listEmptyList;
        List paragraphStylesOrNull = annotatedString.getParagraphStylesOrNull();
        if (paragraphStylesOrNull == null || (listEmptyList = CollectionsKt.sortedWith(paragraphStylesOrNull, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) obj).getStart()), Integer.valueOf(((AnnotatedString.Range) obj2).getStart()));
            }
        })) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = listEmptyList.size();
        int end = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listEmptyList.get(i2);
            AnnotatedString.Range rangeO = AnnotatedString.Range.O(range, paragraphStyle.qie((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (end < rangeO.getStart() && !arrayDeque.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) arrayDeque.last();
                if (rangeO.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, rangeO.getStart()));
                    end = rangeO.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, range2.getEnd()));
                    end = range2.getEnd();
                    while (!arrayDeque.isEmpty() && end == ((AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                        arrayDeque.removeLast();
                    }
                }
            }
            if (end < rangeO.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, end, rangeO.getStart()));
                end = rangeO.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayDeque.lastOrNull();
            if (range3 == null) {
                arrayDeque.add(new AnnotatedString.Range(rangeO.getItem(), rangeO.getStart(), rangeO.getEnd()));
            } else if (range3.getStart() == rangeO.getStart() && range3.getEnd() == rangeO.getEnd()) {
                arrayDeque.removeLast();
                arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).qie((ParagraphStyle) rangeO.getItem()), rangeO.getStart(), rangeO.getEnd()));
            } else if (range3.getStart() == range3.getEnd()) {
                arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                arrayDeque.removeLast();
                arrayDeque.add(new AnnotatedString.Range(rangeO.getItem(), rangeO.getStart(), rangeO.getEnd()));
            } else {
                if (range3.getEnd() < rangeO.getEnd()) {
                    throw new IllegalArgumentException();
                }
                arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).qie((ParagraphStyle) rangeO.getItem()), rangeO.getStart(), rangeO.getEnd()));
            }
        }
        while (end <= annotatedString.getText().length() && !arrayDeque.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) arrayDeque.last();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), end, range4.getEnd()));
            end = range4.getEnd();
            while (!arrayDeque.isEmpty() && end == ((AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                arrayDeque.removeLast();
            }
        }
        if (end < annotatedString.getText().length()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, end, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List nr(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add((AnnotatedString.Range) list.get(i2));
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList.add((AnnotatedString.Range) list2.get(i3));
        }
        return arrayList;
    }
}
