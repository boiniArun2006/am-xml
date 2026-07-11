package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\f\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u0003\u001a\u0013\u0010\u000e\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0004*\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\"\u001a\u00020!*\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010*\u001a\u00020!*\u00020)H\u0007¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010-\u001a\u00020&*\u00020&2\u0006\u0010,\u001a\u00020&H\u0000¢\u0006\u0004\b-\u0010.\u001a/\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00162\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00162\b\u00101\u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0004\b3\u00104\u001a!\u00108\u001a\u0004\u0018\u000107*\u0006\u0012\u0002\b\u0003052\u0006\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109\u001a#\u0010<\u001a\u00020\u0007*\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010=\"\u001a\u0010A\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010>\u001a\u0004\b?\u0010@\"\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010C\"\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010C\"\u0018\u0010G\u001a\u00020\u0007*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u000f\"\u0018\u0010I\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0003\"\u0018\u0010K\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0003¨\u0006L"}, d2 = {"Lkotlin/text/MatchResult;", "", "ty", "(Lkotlin/text/MatchResult;)Z", "", "ck", "(Lkotlin/text/MatchResult;)I", "", "c", "gh", "(Lkotlin/text/MatchResult;Ljava/lang/String;)Z", "az", "HI", "mUb", "nr", "(Lkotlin/text/MatchResult;)Ljava/lang/String;", "ViF", "(Ljava/lang/String;)I", "radix", "nY", "(Ljava/lang/String;I)I", "parameters", "", "Landroidx/compose/ui/tooling/data/Parameter;", "Ik", "(Ljava/lang/String;)Ljava/util/List;", TtmlNode.TAG_INFORMATION, "Landroidx/compose/ui/tooling/data/SourceInformationContext;", "parent", "te", "(Ljava/lang/String;Landroidx/compose/ui/tooling/data/SourceInformationContext;)Landroidx/compose/ui/tooling/data/SourceInformationContext;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "parentContext", "Landroidx/compose/ui/tooling/data/Group;", "Uo", "(Landroidx/compose/runtime/tooling/CompositionGroup;Landroidx/compose/ui/tooling/data/SourceInformationContext;)Landroidx/compose/ui/tooling/data/Group;", "Landroidx/compose/ui/layout/LayoutInfo;", "node", "Landroidx/compose/ui/unit/IntRect;", "t", "(Landroidx/compose/ui/layout/LayoutInfo;)Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/runtime/tooling/CompositionData;", "rl", "(Landroidx/compose/runtime/tooling/CompositionData;)Landroidx/compose/ui/tooling/data/Group;", InneractiveMediationNameConsts.OTHER, "E2", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)Landroidx/compose/ui/unit/IntRect;", "", "data", "context", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "O", "(Ljava/util/List;Landroidx/compose/ui/tooling/data/SourceInformationContext;)Ljava/util/List;", "Ljava/lang/Class;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Ljava/lang/reflect/Field;", c.f62177j, "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "prefix", "replacement", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/ui/unit/IntRect;", "J2", "()Landroidx/compose/ui/unit/IntRect;", "emptyBox", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "tokenizer", "parametersInformationTokenizer", "KN", "text", "xMQ", "isANumber", "qie", "isClassName", "ui-tooling-data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "SlotTreeKt")
@SourceDebugExtension({"SMAP\nSlotTree.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,822:1\n1#2:823\n1549#3:824\n1620#3,3:825\n2661#3,7:828\n288#3,2:852\n1045#3:857\n65#4:835\n69#4:838\n60#5:836\n70#5:839\n85#5:842\n90#5:844\n22#6:837\n22#6:840\n54#7:841\n59#7:843\n372#8,7:845\n3792#9:854\n4307#9,2:855\n1282#9,2:858\n*S KotlinDebug\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n*L\n501#1:824\n501#1:825,3\n501#1:828,7\n747#1:852,2\n768#1:857\n539#1:835\n540#1:838\n539#1:836\n540#1:839\n541#1:842\n542#1:844\n539#1:837\n540#1:840\n541#1:841\n542#1:843\n701#1:845,7\n763#1:854\n763#1:855,2\n818#1:858,2\n*E\n"})
public final class SlotTreeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final IntRect f34118n = new IntRect(0, 0, 0, 0);
    private static final Regex rl = new Regex("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Regex f34119t = new Regex("(\\d+)|,|[!P()]|:([^,!)]+)");

    private static final SourceLocationInfo fD(Ref.ObjectRef objectRef) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        try {
            MatchResult matchResultIF = (MatchResult) objectRef.element;
            if (matchResultIF == null || !ty(matchResultIF)) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(ck(matchResultIF) + 1);
                matchResultIF = iF(objectRef);
            }
            if (matchResultIF != null && gh(matchResultIF, "@")) {
                MatchResult matchResultIF2 = iF(objectRef);
                if (matchResultIF2 != null && ty(matchResultIF2)) {
                    numValueOf3 = Integer.valueOf(ck(matchResultIF2));
                    MatchResult matchResultIF3 = iF(objectRef);
                    if (matchResultIF3 != null && gh(matchResultIF3, "L")) {
                        MatchResult matchResultIF4 = iF(objectRef);
                        if (matchResultIF4 != null && ty(matchResultIF4)) {
                            numValueOf2 = Integer.valueOf(ck(matchResultIF4));
                        }
                        return null;
                    }
                    numValueOf2 = null;
                }
                return null;
            }
            numValueOf2 = null;
            numValueOf3 = null;
            if (numValueOf != null && numValueOf3 != null && numValueOf2 != null) {
                return new SourceLocationInfo(numValueOf, numValueOf3, numValueOf2);
            }
        } catch (ParseError unused) {
        }
        return null;
    }

    private static final String g(String str, String str2, String str3) {
        if (!StringsKt.startsWith$default(str, str2, false, 2, (Object) null)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        String strSubstring = str.substring(str2.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static final IntRect E2(IntRect intRect, IntRect intRect2) {
        IntRect intRect3 = f34118n;
        if (Intrinsics.areEqual(intRect, intRect3)) {
            return intRect2;
        }
        if (Intrinsics.areEqual(intRect2, intRect3)) {
            return intRect;
        }
        return new IntRect(Math.min(intRect.getLeft(), intRect2.getLeft()), Math.min(intRect.getTop(), intRect2.getTop()), Math.max(intRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), intRect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.max(intRect.getBottom(), intRect2.getBottom()));
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [T, kotlin.text.MatchResult] */
    private static final List Ik(String str) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Regex.find$default(f34119t, str, 0, 2, null);
        List listMutableListOf = CollectionsKt.mutableListOf(0, 1, 2, 3);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = listMutableListOf.size() - 1;
        ArrayList arrayList = new ArrayList();
        try {
            o(objectRef, "P");
            o(objectRef, "(");
            while (!S(objectRef, ")")) {
                if (S(objectRef, "!")) {
                    aYN(objectRef);
                    int iXQ = XQ(objectRef);
                    r(intRef, listMutableListOf, arrayList.size() + iXQ);
                    for (int i2 = 0; i2 < iXQ; i2++) {
                        arrayList.add(new Parameter(((Number) CollectionsKt.first(listMutableListOf)).intValue(), null, 2, null));
                        listMutableListOf.remove(0);
                    }
                } else if (S(objectRef, ",")) {
                    aYN(objectRef);
                } else {
                    int iXQ2 = XQ(objectRef);
                    arrayList.add(new Parameter(iXQ2, WPU(objectRef) ? Z(objectRef) : null));
                    r(intRef, listMutableListOf, iXQ2);
                    listMutableListOf.remove(Integer.valueOf(iXQ2));
                }
            }
            o(objectRef, ")");
            while (listMutableListOf.size() > 0) {
                arrayList.add(new Parameter(((Number) CollectionsKt.first(listMutableListOf)).intValue(), null, 2, null));
                listMutableListOf.remove(0);
            }
            return arrayList;
        } catch (ParseError unused) {
            return CollectionsKt.emptyList();
        } catch (NumberFormatException unused2) {
            return CollectionsKt.emptyList();
        }
    }

    public static final IntRect J2() {
        return f34118n;
    }

    private static final boolean S(Ref.ObjectRef objectRef, String str) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        return matchResult == null || Intrinsics.areEqual(KN(matchResult), str);
    }

    private static final boolean WPU(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        return matchResult != null && qie(matchResult);
    }

    private static final int XQ(Ref.ObjectRef objectRef) throws ParseError {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult == null || !xMQ(matchResult)) {
            throw new ParseError();
        }
        aYN(objectRef);
        return ViF(KN(matchResult));
    }

    private static final String Z(Ref.ObjectRef objectRef) throws ParseError {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult == null || !qie(matchResult)) {
            throw new ParseError();
        }
        aYN(objectRef);
        String strSubstring = KN(matchResult).substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return g(strSubstring, "c#", "androidx.compose.");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, kotlin.text.MatchResult] */
    private static final MatchResult aYN(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult != null) {
            objectRef.element = matchResult.next();
        }
        return (MatchResult) objectRef.element;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, kotlin.text.MatchResult] */
    private static final MatchResult iF(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult != null) {
            objectRef.element = matchResult.next();
        }
        return (MatchResult) objectRef.element;
    }

    private static final void o(Ref.ObjectRef objectRef, String str) throws ParseError {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult == null || !Intrinsics.areEqual(KN(matchResult), str)) {
            throw new ParseError();
        }
        aYN(objectRef);
    }

    private static final void r(Ref.IntRef intRef, List list, int i2) {
        int i3 = i2 - intRef.element;
        if (i3 > 0) {
            if (i3 < 4) {
                i3 = 4;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                list.add(Integer.valueOf(intRef.element + i5 + 1));
            }
            intRef.element += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlin.text.MatchResult] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SourceInformationContext te(String str, SourceInformationContext sourceInformationContext) throws ParseError {
        String strSubstring;
        String sourceFile;
        MatchResult matchResult;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Regex.find$default(rl, str, 0, 2, null);
        ArrayList arrayList = new ArrayList();
        int packageHash = -1;
        int size = -1;
        boolean z2 = false;
        boolean z3 = false;
        String strNr = null;
        List listIk = null;
        do {
            T t3 = objectRef.element;
            if (t3 != 0) {
                Intrinsics.checkNotNull(t3);
                matchResult = (MatchResult) t3;
                if (ty(matchResult) || gh(matchResult, "@")) {
                    SourceLocationInfo sourceLocationInfoFD = fD(objectRef);
                    if (sourceLocationInfoFD != null) {
                        arrayList.add(sourceLocationInfoFD);
                    }
                } else {
                    if (gh(matchResult, "C")) {
                        if (z2) {
                            z3 = true;
                        }
                        iF(objectRef);
                    } else if (mUb(matchResult)) {
                        if (z2) {
                            z3 = true;
                        }
                        strNr = nr(matchResult);
                        iF(objectRef);
                    } else if (HI(matchResult)) {
                        listIk = Ik(KN(matchResult));
                        iF(objectRef);
                    } else if (gh(matchResult, "*")) {
                        size = arrayList.size();
                        iF(objectRef);
                    } else {
                        if (!gh(matchResult, ",")) {
                            if (az(matchResult)) {
                                strSubstring = str.substring(matchResult.getRange().getLast() + 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                String strSubstringAfterLast = StringsKt.substringAfterLast(strSubstring, "#", "");
                                if (strSubstringAfterLast.length() > 0) {
                                    strSubstring = StringsKt.substring(strSubstring, RangesKt.until(0, (strSubstring.length() - strSubstringAfterLast.length()) - 1));
                                    try {
                                        packageHash = nY(strSubstringAfterLast, 36);
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                            if (strSubstring != null) {
                                sourceFile = sourceInformationContext != null ? sourceInformationContext.getSourceFile() : null;
                            } else {
                                sourceFile = strSubstring;
                            }
                            if (strSubstring == null && sourceInformationContext != null) {
                                packageHash = sourceInformationContext.getPackageHash();
                            }
                            return new SourceInformationContext(strNr, sourceFile, packageHash, arrayList, size, listIk, z2, z3);
                        }
                        iF(objectRef);
                    }
                    z2 = true;
                }
            }
            strSubstring = null;
            if (strSubstring != null) {
            }
            if (strSubstring == null) {
                packageHash = sourceInformationContext.getPackageHash();
            }
            return new SourceInformationContext(strNr, sourceFile, packageHash, arrayList, size, listIk, z2, z3);
        } while (!Intrinsics.areEqual(matchResult, objectRef.element));
        return null;
    }

    private static final boolean HI(MatchResult matchResult) {
        if (matchResult.getGroups().get(5) != null) {
            return true;
        }
        return false;
    }

    private static final String KN(MatchResult matchResult) {
        return matchResult.getGroupValues().get(0);
    }

    private static final List O(List list, SourceInformationContext sourceInformationContext) {
        int i2;
        Object next;
        Object obj;
        int iIntValue;
        int iIntValue2;
        List listEmptyList;
        Parameter parameter;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                i2 = 2;
                if (it.hasNext()) {
                    next = it.next();
                    if (next != null && StringsKt.endsWith$default(next.getClass().getName(), ".RecomposeScopeImpl", false, 2, (Object) null)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next != null) {
                try {
                    Field fieldN = n(next.getClass(), "block");
                    if (fieldN != null && (obj = fieldN.get(next)) != null) {
                        Class<?> cls = obj.getClass();
                        Field fieldN2 = n(cls, "$$default");
                        Field fieldN3 = n(cls, "$$changed");
                        if (fieldN2 != null) {
                            Object obj2 = fieldN2.get(obj);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                            iIntValue = ((Integer) obj2).intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (fieldN3 != null) {
                            Object obj3 = fieldN3.get(obj);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                            iIntValue2 = ((Integer) obj3).intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        Field[] declaredFields = cls.getDeclaredFields();
                        ArrayList arrayList = new ArrayList();
                        for (Field field : declaredFields) {
                            if (StringsKt.startsWith$default(field.getName(), "$", false, 2, (Object) null) && !StringsKt.startsWith$default(field.getName(), "$$", false, 2, (Object) null) && !StringsKt.startsWith$default(field.getName(), "$jacoco", false, 2, (Object) null)) {
                                arrayList.add(field);
                            }
                        }
                        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractParameterInfo$$inlined$sortedBy$1
                            @Override // java.util.Comparator
                            public final int compare(Object obj4, Object obj5) {
                                return ComparisonsKt.compareValues(((Field) obj4).getName(), ((Field) obj5).getName());
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        if (sourceInformationContext == null || (listEmptyList = sourceInformationContext.getParameters()) == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        int size = listSortedWith.size();
                        int i3 = 0;
                        while (i3 < size) {
                            if (i3 < listEmptyList.size()) {
                                parameter = (Parameter) listEmptyList.get(i3);
                            } else {
                                parameter = new Parameter(i3, null, i2, null);
                            }
                            if (parameter.getSortedIndex() < listSortedWith.size()) {
                                Field field2 = (Field) listSortedWith.get(parameter.getSortedIndex());
                                field2.setAccessible(true);
                                Object obj4 = field2.get(obj);
                                if (((1 << i3) & iIntValue) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                int i5 = (i3 * 3) + 1;
                                int i7 = ((7 << i5) & iIntValue2) >> i5;
                                int i8 = i7 & 3;
                                if (i8 == 3) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (i8 == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if ((i7 & 4) == 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                String strSubstring = field2.getName().substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                if (z4 && !z2) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                arrayList2.add(new ParameterInformation(strSubstring, obj4, z2, z3, z6, parameter.getInlineClass(), z5));
                            }
                            i3++;
                            i2 = 2;
                        }
                        return arrayList2;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.CharSequence] */
    private static final Group Uo(CompositionGroup compositionGroup, SourceInformationContext sourceInformationContext) throws ParseError {
        SourceInformationContext sourceInformationContextTe;
        SourceLocation sourceLocation;
        List listEmptyList;
        IntRect intRectT;
        SourceLocation sourceLocationUo;
        Object name;
        ?? name2;
        Object key = compositionGroup.getKey();
        String strT = compositionGroup.t();
        if (strT != null) {
            sourceInformationContextTe = te(strT, sourceInformationContext);
            sourceLocation = null;
        } else {
            sourceInformationContextTe = null;
            sourceLocation = null;
        }
        Object objJ2 = compositionGroup.J2();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        CollectionsKt.addAll(arrayList, compositionGroup.getData());
        Iterator it = compositionGroup.getCompositionGroups().iterator();
        while (it.hasNext()) {
            arrayList2.add(Uo((CompositionGroup) it.next(), sourceInformationContextTe));
        }
        boolean z2 = objJ2 instanceof LayoutInfo;
        if (z2) {
            listEmptyList = ((LayoutInfo) objJ2).Ik();
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (z2) {
            intRectT = t((LayoutInfo) objJ2);
        } else if (arrayList2.isEmpty()) {
            intRectT = f34118n;
        } else {
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((Group) it2.next()).getBox());
            }
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                Object next = it3.next();
                while (it3.hasNext()) {
                    next = E2((IntRect) it3.next(), (IntRect) next);
                }
                intRectT = (IntRect) next;
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        }
        if (sourceInformationContextTe != null && sourceInformationContextTe.getIsCall() && sourceInformationContext != null) {
            sourceLocationUo = sourceInformationContext.Uo();
        } else {
            sourceLocationUo = sourceLocation;
        }
        if (objJ2 != null) {
            return new NodeGroup(key, objJ2, intRectT, arrayList, listEmptyList, arrayList2);
        }
        Object objUo = sourceLocation;
        IntRect intRect = intRectT;
        SourceInformationContext sourceInformationContext2 = sourceInformationContextTe;
        if (sourceInformationContext2 != null) {
            name = sourceInformationContext2.getName();
        } else {
            name = objUo;
        }
        if (sourceInformationContext2 != null) {
            name2 = sourceInformationContext2.getName();
        } else {
            name2 = objUo;
        }
        if (name2 != 0 && name2.length() != 0 && (intRect.getBottom() - intRect.getTop() > 0 || intRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - intRect.getLeft() > 0)) {
            objUo = compositionGroup.Uo();
        }
        List listO = O(arrayList, sourceInformationContext2);
        boolean z3 = false;
        if (sourceInformationContext2 != null && sourceInformationContext2.getIsInline()) {
            z3 = true;
        }
        return new CallGroup(key, name, intRect, sourceLocationUo, objUo, listO, arrayList, arrayList2, z3);
    }

    private static final int ViF(String str) throws ParseError {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new ParseError();
        }
    }

    private static final boolean az(MatchResult matchResult) {
        if (matchResult.getGroups().get(4) != null) {
            return true;
        }
        return false;
    }

    private static final int ck(MatchResult matchResult) {
        return ViF(matchResult.getGroupValues().get(1));
    }

    private static final boolean gh(MatchResult matchResult, String str) {
        return Intrinsics.areEqual(KN(matchResult), str);
    }

    private static final boolean mUb(MatchResult matchResult) {
        if (matchResult.getGroups().get(6) != null) {
            return true;
        }
        return false;
    }

    private static final Field n(Class cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                field = declaredFields[i2];
                if (Intrinsics.areEqual(field.getName(), str)) {
                    break;
                }
                i2++;
            } else {
                field = null;
                break;
            }
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    private static final int nY(String str, int i2) throws ParseError {
        try {
            return Integer.parseInt(str, CharsKt.checkRadix(i2));
        } catch (NumberFormatException unused) {
            throw new ParseError();
        }
    }

    private static final String nr(MatchResult matchResult) {
        return matchResult.getGroupValues().get(8);
    }

    private static final boolean qie(MatchResult matchResult) {
        if (matchResult.getGroups().get(2) != null) {
            return true;
        }
        return false;
    }

    public static final Group rl(CompositionData compositionData) {
        Group groupUo;
        CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt.firstOrNull(compositionData.getCompositionGroups());
        if (compositionGroup != null && (groupUo = Uo(compositionGroup, null)) != null) {
            return groupUo;
        }
        return EmptyGroup.xMQ;
    }

    private static final IntRect t(LayoutInfo layoutInfo) {
        LayoutCoordinates layoutCoordinatesR = layoutInfo.r();
        if (layoutInfo.nr() && layoutCoordinatesR.nr()) {
            long jUo = LayoutCoordinatesKt.Uo(layoutCoordinatesR);
            long jN = layoutCoordinatesR.n();
            int iRoundToInt = MathKt.roundToInt(Float.intBitsToFloat((int) (jUo >> 32)));
            int iRoundToInt2 = MathKt.roundToInt(Float.intBitsToFloat((int) (jUo & 4294967295L)));
            return new IntRect(iRoundToInt, iRoundToInt2, ((int) (jN >> 32)) + iRoundToInt, ((int) (jN & 4294967295L)) + iRoundToInt2);
        }
        return new IntRect(0, 0, layoutInfo.getWidth(), layoutInfo.getHeight());
    }

    private static final boolean ty(MatchResult matchResult) {
        if (matchResult.getGroups().get(1) != null) {
            return true;
        }
        return false;
    }

    private static final boolean xMQ(MatchResult matchResult) {
        if (matchResult.getGroups().get(1) != null) {
            return true;
        }
        return false;
    }
}
