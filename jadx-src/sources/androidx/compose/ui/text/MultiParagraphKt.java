package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "", "index", c.f62177j, "(Ljava/util/List;I)I", "", "y", "t", "(Ljava/util/List;F)I", "Landroidx/compose/ui/text/TextRange;", "range", "Lkotlin/Function1;", "", FileUploadManager.f61572j, "nr", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "lineIndex", "rl", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1227:1\n1092#1,11:1236\n1092#1,11:1255\n1092#1,11:1266\n114#2,8:1228\n114#2,8:1247\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1022#1:1236,11\n1048#1:1255,11\n1082#1:1266,11\n1018#1:1228,8\n1029#1:1247,8\n*E\n"})
public final class MultiParagraphKt {
    public static final int t(List list, float f3) {
        if (f3 <= 0.0f) {
            return 0;
        }
        if (f3 >= ((ParagraphInfo) CollectionsKt.last(list)).getBottom()) {
            return CollectionsKt.getLastIndex(list);
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i3);
            byte b2 = paragraphInfo.getTop() > f3 ? (byte) 1 : paragraphInfo.getBottom() <= f3 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int n(List list, int i2) {
        boolean z2;
        int i3;
        byte b2;
        int endIndex = ((ParagraphInfo) CollectionsKt.last(list)).getEndIndex();
        boolean z3 = false;
        if (i2 <= ((ParagraphInfo) CollectionsKt.last(list)).getEndIndex()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.n("Index " + i2 + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= size) {
                i3 = (i5 + size) >>> 1;
                ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i3);
                if (paragraphInfo.getStartIndex() > i2) {
                    b2 = 1;
                } else if (paragraphInfo.getEndIndex() <= i2) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                if (b2 < 0) {
                    i5 = i3 + 1;
                } else {
                    if (b2 <= 0) {
                        break;
                    }
                    size = i3 - 1;
                }
            } else {
                i3 = -(i5 + 1);
                break;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            z3 = true;
        }
        if (!z3) {
            InlineClassHelperKt.n("Found paragraph index " + i3 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i2 + ", paragraphs=[" + ListUtilsKt.O(list, null, null, null, 0, null, new Function1<ParagraphInfo, CharSequence>() { // from class: androidx.compose.ui.text.MultiParagraphKt$findParagraphByIndex$2$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(ParagraphInfo paragraphInfo2) {
                    return '[' + paragraphInfo2.getStartIndex() + ", " + paragraphInfo2.getEndIndex() + ')';
                }
            }, 31, null) + ']');
        }
        return i3;
    }

    public static final void nr(List list, long j2, Function1 function1) {
        int size = list.size();
        for (int iN = n(list, TextRange.qie(j2)); iN < size; iN++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(iN);
            if (paragraphInfo.getStartIndex() < TextRange.gh(j2)) {
                if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                    function1.invoke(paragraphInfo);
                }
            } else {
                return;
            }
        }
    }

    public static final int rl(List list, int i2) {
        byte b2;
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i5 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i5);
            if (paragraphInfo.getStartLineIndex() > i2) {
                b2 = 1;
            } else if (paragraphInfo.getEndLineIndex() <= i2) {
                b2 = -1;
            } else {
                b2 = 0;
            }
            if (b2 < 0) {
                i3 = i5 + 1;
            } else if (b2 > 0) {
                size = i5 - 1;
            } else {
                return i5;
            }
        }
        return -(i3 + 1);
    }
}
