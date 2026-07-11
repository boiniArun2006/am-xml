package androidx.compose.ui.text;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0005KLMNOB)\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002¢\u0006\u0004\b\b\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0007¢\u0006\u0004\b,\u0010*J)\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b.\u0010*J\u001d\u0010/\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020%2\b\u0010\u001d\u001a\u0004\u0018\u000101H\u0096\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b8\u00109J1\u0010<\u001a\u00020\u00002\"\u0010;\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030:¢\u0006\u0004\b<\u0010=J7\u0010>\u001a\u00020\u00002(\u0010;\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020:¢\u0006\u0004\b>\u0010=R*\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\bC\u00107R(\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010?\u001a\u0004\bD\u0010AR(\u0010G\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bF\u0010AR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010AR\u0014\u0010J\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", "index", "", "rl", "(I)C", "startIndex", "endIndex", "r", "(II)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "range", "o", "(J)Landroidx/compose/ui/text/AnnotatedString;", InneractiveMediationNameConsts.OTHER, "Ik", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/AnnotatedString;", "tag", TtmlNode.START, TtmlNode.END, "xMQ", "(Ljava/lang/String;II)Ljava/util/List;", "", "HI", "(Ljava/lang/String;II)Z", "Landroidx/compose/ui/text/TtsAnnotation;", "gh", "(II)Ljava/util/List;", "Landroidx/compose/ui/text/UrlAnnotation;", "qie", "Landroidx/compose/ui/text/LinkAnnotation;", "O", "ty", "(II)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "az", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "Lkotlin/Function1;", "transform", "ck", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/AnnotatedString;", c.f62177j, "Ljava/util/List;", "t", "()Ljava/util/List;", "Ljava/lang/String;", "mUb", "KN", "spanStylesOrNull", "J2", "paragraphStylesOrNull", "Uo", "nr", "length", "Annotation", "Builder", "Companion", "ExhaustiveAnnotation", "Range", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1607:1\n34#2,6:1608\n247#2,6:1634\n34#2,6:1640\n253#2:1646\n102#2,2:1647\n34#2,6:1649\n104#2:1655\n247#2,6:1656\n34#2,6:1662\n253#2:1668\n230#2,3:1669\n34#2,6:1672\n233#2:1678\n230#2,3:1679\n34#2,6:1682\n233#2:1688\n230#2,3:1689\n34#2,6:1692\n233#2:1698\n102#2,2:1699\n34#2,6:1701\n104#2:1707\n1045#3:1614\n366#4:1615\n70#4:1616\n114#5,8:1617\n114#5,8:1626\n1#6:1625\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n121#1:1608,6\n221#1:1634,6\n221#1:1640,6\n221#1:1646\n231#1:1647,2\n231#1:1649,6\n231#1:1655\n246#1:1656,6\n246#1:1662,6\n246#1:1668\n263#1:1669,3\n263#1:1672,6\n263#1:1678\n281#1:1679,3\n281#1:1682,6\n281#1:1688\n297#1:1689,3\n297#1:1692,6\n297#1:1698\n306#1:1699,2\n306#1:1701,6\n306#1:1707\n137#1:1614\n148#1:1615\n151#1:1616\n153#1:1617,8\n177#1:1626,8\n*E\n"})
public final class AnnotatedString implements CharSequence {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final List paragraphStylesOrNull;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final List spanStylesOrNull;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List annotations;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Saver f33338o = SaversKt.KN();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/UrlAnnotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Annotation {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002@AB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010\u0006J\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J3\u00100\u001a\u00020\u000b2\"\u0010/\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020.0-\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020.0-0,H\u0000¢\u0006\u0004\b0\u00101J9\u00103\u001a\u00020\u000b2(\u0010/\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020.0-\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020.0-020,H\u0000¢\u0006\u0004\b3\u00101R\u0018\u0010\b\u001a\u000604j\u0002`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00106R\"\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020908078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010:R\"\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020.08078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010>¨\u0006B"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "", "KN", "(Ljava/lang/String;)V", "", "nr", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString$Builder;", TtmlNode.START, TtmlNode.END, "O", "(Ljava/lang/CharSequence;II)Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "char", "t", "(C)Landroidx/compose/ui/text/AnnotatedString$Builder;", "J2", "Uo", "(Landroidx/compose/ui/text/AnnotatedString;II)V", "Landroidx/compose/ui/text/SpanStyle;", "style", "rl", "(Landroidx/compose/ui/text/SpanStyle;II)V", "tag", "annotation", c.f62177j, "(Ljava/lang/String;Ljava/lang/String;II)V", "az", "(Landroidx/compose/ui/text/SpanStyle;)I", "gh", "()V", "index", "qie", "ty", "()Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "transform", "mUb", "(Lkotlin/jvm/functions/Function1;)V", "", "xMQ", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "", "Ljava/util/List;", "styleStack", "annotations", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "bulletScope", "BulletScope", "MutableRange", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n34#2,6:1608\n34#2,6:1614\n150#2,3:1644\n34#2,6:1647\n153#2:1653\n529#2,3:1654\n34#2,4:1657\n532#2:1661\n150#2,3:1662\n34#2,6:1665\n153#2:1671\n533#2,2:1672\n39#2:1674\n535#2:1675\n77#3,8:1620\n77#3,8:1628\n77#3,8:1636\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n540#1:1608,6\n558#1:1614,6\n964#1:1644,3\n964#1:1647,6\n964#1:1653\n981#1:1654,3\n981#1:1657,4\n981#1:1661\n982#1:1662,3\n982#1:1665,6\n982#1:1671\n981#1:1672,2\n981#1:1674\n981#1:1675\n823#1:1620,8\n935#1:1628,8\n952#1:1636,8\n*E\n"})
    public static final class Builder implements Appendable {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final BulletScope bulletScope;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final List annotations;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final StringBuilder text;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final List styleStack;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\b\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001$B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u0017\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "item", "", TtmlNode.START, TtmlNode.END, "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "Landroidx/compose/ui/text/AnnotatedString$Range;", "rl", "(I)Landroidx/compose/ui/text/AnnotatedString$Range;", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "I", "getStart", "t", "getEnd", "(I)V", "nr", "Ljava/lang/String;", "getTag", "O", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n77#2,8:1608\n77#2,8:1616\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n*L\n417#1:1608,8\n428#1:1616,8\n*E\n"})
        private static final /* data */ class MutableRange<T> {

            /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final Object item;

            /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
            private final String tag;

            /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
            private final int start;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            private int end;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange$Companion;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/text/AnnotatedString$Range;", "range", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", c.f62177j, "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final MutableRange n(Range range) {
                    return new MutableRange(range.getItem(), range.getStart(), range.getEnd(), range.getTag());
                }
            }

            public MutableRange(Object obj, int i2, int i3, String str) {
                this.item = obj;
                this.start = i2;
                this.end = i3;
                this.tag = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return Intrinsics.areEqual(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.areEqual(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                Object obj = this.item;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public static /* synthetic */ Range t(MutableRange mutableRange, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i2 = Integer.MIN_VALUE;
                }
                return mutableRange.rl(i2);
            }

            public final void n(int i2) {
                this.end = i2;
            }

            public final Range rl(int defaultEnd) {
                int i2 = this.end;
                if (i2 != Integer.MIN_VALUE) {
                    defaultEnd = i2;
                }
                if (!(defaultEnd != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.t("Item.end should be set first");
                }
                return new Range(this.item, this.start, defaultEnd, this.tag);
            }

            public /* synthetic */ MutableRange(Object obj, int i2, int i3, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i2, (i5 & 4) != 0 ? Integer.MIN_VALUE : i3, (i5 & 8) != 0 ? "" : str);
            }
        }

        public Builder(int i2) {
            this.text = new StringBuilder(i2);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR,\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "builder", "<init>", "(Landroidx/compose/ui/text/AnnotatedString$Builder;)V", c.f62177j, "Landroidx/compose/ui/text/AnnotatedString$Builder;", "getBuilder$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/ui/text/Bullet;", "rl", "Ljava/util/List;", "getBulletListSettingStack$ui_text_release", "()Ljava/util/List;", "bulletListSettingStack", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BulletScope {

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final Builder builder;

            /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
            private final List bulletListSettingStack = new ArrayList();

            public BulletScope(Builder builder) {
                this.builder = builder;
            }
        }

        public final void J2(AnnotatedString text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List annotations = text.getAnnotations();
            if (annotations != null) {
                int size = annotations.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Range range = (Range) annotations.get(i2);
                    this.annotations.add(new MutableRange(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void KN(String text) {
            this.text.append(text);
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Builder append(CharSequence text, int start, int end) {
            if (text instanceof AnnotatedString) {
                Uo((AnnotatedString) text, start, end);
                return this;
            }
            this.text.append(text, start, end);
            return this;
        }

        public final void Uo(AnnotatedString text, int start, int end) {
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            List listKN = AnnotatedStringKt.KN(text, start, end, null, 4, null);
            if (listKN != null) {
                int size = listKN.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Range range = (Range) listKN.get(i2);
                    this.annotations.add(new MutableRange(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final int az(SpanStyle style) {
            MutableRange mutableRange = new MutableRange(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final void gh() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelperKt.t("Nothing to pop.");
            }
            ((MutableRange) this.styleStack.remove(r0.size() - 1)).n(this.text.length());
        }

        public final void mUb(Function1 transform) {
            int size = this.annotations.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.annotations.set(i2, MutableRange.INSTANCE.n((Range) transform.invoke(MutableRange.t((MutableRange) this.annotations.get(i2), 0, 1, null))));
            }
        }

        public final void n(String tag, String annotation, int start, int end) {
            this.annotations.add(new MutableRange(StringAnnotation.n(StringAnnotation.rl(annotation)), start, end, tag));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public Builder append(CharSequence text) {
            if (text instanceof AnnotatedString) {
                J2((AnnotatedString) text);
                return this;
            }
            this.text.append(text);
            return this;
        }

        public final void qie(int index) {
            if (!(index < this.styleStack.size())) {
                InlineClassHelperKt.t(index + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= index) {
                gh();
            }
        }

        public final void rl(SpanStyle style, int start, int end) {
            this.annotations.add(new MutableRange(style, start, end, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Builder append(char c2) {
            this.text.append(c2);
            return this;
        }

        public final AnnotatedString ty() {
            String string = this.text.toString();
            List list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((MutableRange) list.get(i2)).rl(this.text.length()));
            }
            return new AnnotatedString(string, arrayList);
        }

        public final void xMQ(Function1 transform) {
            List list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                List list2 = (List) transform.invoke(MutableRange.t((MutableRange) list.get(i2), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(MutableRange.INSTANCE.n((Range) list2.get(i3)));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public /* synthetic */ Builder(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 16 : i2);
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            J2(annotatedString);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ExhaustiveAnnotation implements Annotation {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "item", "", TtmlNode.START, TtmlNode.END, "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", c.f62177j, "()Ljava/lang/Object;", "rl", "()I", "t", "nr", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "toString", "()Ljava/lang/String;", "hashCode", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "Uo", "I", "KN", "J2", "Ljava/lang/String;", "xMQ", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n114#2,8:1608\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n*L\n386#1:1608,8\n*E\n"})
    public static final /* data */ class Range<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object item;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
        private final String tag;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        public Range(Object obj, int i2, int i3, String str) {
            this.item = obj;
            this.start = i2;
            this.end = i3;
            this.tag = str;
            if (i2 <= i3) {
                return;
            }
            InlineClassHelperKt.n("Reversed range is not supported");
        }

        public static /* synthetic */ Range O(Range range, Object obj, int i2, int i3, String str, int i5, Object obj2) {
            if ((i5 & 1) != 0) {
                obj = range.item;
            }
            if ((i5 & 2) != 0) {
                i2 = range.start;
            }
            if ((i5 & 4) != 0) {
                i3 = range.end;
            }
            if ((i5 & 8) != 0) {
                str = range.tag;
            }
            return range.nr(obj, i2, i3, str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return Intrinsics.areEqual(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.areEqual(this.tag, range.tag);
        }

        public int hashCode() {
            Object obj = this.item;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public final Object n() {
            return this.item;
        }

        public final Range nr(Object item, int start, int end, String tag) {
            return new Range(item, start, end, tag);
        }

        public final int rl() {
            return this.start;
        }

        public final int t() {
            return this.end;
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: KN, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: Uo, reason: from getter */
        public final Object getItem() {
            return this.item;
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public Range(Object obj, int i2, int i3) {
            this(obj, i2, i3, "");
        }
    }

    public AnnotatedString(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                Range range = (Range) list.get(i2);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listSortedWith = arrayList2 != null ? CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) obj).getStart()), Integer.valueOf(((AnnotatedString.Range) obj2).getStart()));
            }
        }) : null;
        if (listSortedWith == null || listSortedWith.isEmpty()) {
            return;
        }
        MutableIntList mutableIntListO = IntListKt.O(((Range) CollectionsKt.first(listSortedWith)).getEnd());
        int size2 = listSortedWith.size();
        for (int i3 = 1; i3 < size2; i3++) {
            Range range2 = (Range) listSortedWith.get(i3);
            while (true) {
                if (mutableIntListO._size == 0) {
                    break;
                }
                int iMUb = mutableIntListO.mUb();
                if (range2.getStart() >= iMUb) {
                    mutableIntListO.ck(mutableIntListO._size - 1);
                } else if (!(range2.getEnd() <= iMUb)) {
                    InlineClassHelperKt.n("Paragraph overlap not allowed, end " + range2.getEnd() + " should be less than or equal to " + iMUb);
                }
            }
            mutableIntListO.qie(range2.getEnd());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) other;
        return Intrinsics.areEqual(this.text, annotatedString.text) && Intrinsics.areEqual(this.annotations, annotatedString.annotations);
    }

    public final boolean HI(String tag, int start, int end) {
        List list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Range range = (Range) list.get(i2);
                if ((range.getItem() instanceof StringAnnotation) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedStringKt.xMQ(start, end, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AnnotatedString Ik(AnnotatedString other) {
        Builder builder = new Builder(this);
        builder.J2(other);
        return builder.ty();
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final List getParagraphStylesOrNull() {
        return this.paragraphStylesOrNull;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final List getSpanStylesOrNull() {
        return this.spanStylesOrNull;
    }

    public final List O(int start, int end) {
        List listEmptyList;
        List list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                Range range = (Range) obj;
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.xMQ(start, end, range.getStart(), range.getEnd())) {
                    listEmptyList.add(obj);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listEmptyList;
    }

    public final List Uo() {
        List list = this.spanStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final boolean az(AnnotatedString other) {
        return Intrinsics.areEqual(this.annotations, other.annotations);
    }

    public final AnnotatedString ck(Function1 transform) {
        Builder builder = new Builder(this);
        builder.mUb(transform);
        return builder.ty();
    }

    public final List gh(int start, int end) {
        List listEmptyList;
        List list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                Range range = (Range) obj;
                if ((range.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.xMQ(start, end, range.getStart(), range.getEnd())) {
                    listEmptyList.add(obj);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listEmptyList;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List list = this.annotations;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final AnnotatedString n(Function1 transform) {
        Builder builder = new Builder(this);
        builder.xMQ(transform);
        return builder.ty();
    }

    public int nr() {
        return this.text.length();
    }

    public final List qie(int start, int end) {
        List listEmptyList;
        List list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                Range range = (Range) obj;
                if ((range.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.xMQ(start, end, range.getStart(), range.getEnd())) {
                    listEmptyList.add(obj);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listEmptyList;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AnnotatedString subSequence(int startIndex, int endIndex) {
        if (!(startIndex <= endIndex)) {
            InlineClassHelperKt.n("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')');
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new AnnotatedString(AnnotatedStringKt.J2(this.annotations, startIndex, endIndex), strSubstring);
    }

    public char rl(int index) {
        return this.text.charAt(index);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getAnnotations() {
        return this.annotations;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    public final boolean ty(int start, int end) {
        List list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Range range = (Range) list.get(i2);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.xMQ(start, end, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final List xMQ(String tag, int start, int end) {
        List list = this.annotations;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Range range = (Range) list.get(i2);
            if ((range.getItem() instanceof StringAnnotation) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedStringKt.xMQ(start, end, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotationKt.n(range));
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return rl(i2);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return nr();
    }

    public final AnnotatedString o(long range) {
        return subSequence(TextRange.qie(range), TextRange.gh(range));
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public AnnotatedString(String str, List list, List list2) {
        this(AnnotatedStringKt.nr(list, list2), str);
    }

    public /* synthetic */ AnnotatedString(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public AnnotatedString(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
