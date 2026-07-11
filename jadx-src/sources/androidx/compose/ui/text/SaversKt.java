package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0080\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\b2.\u0010\u000f\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b¢\u0006\u0002\b\u000e2#\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\".\u0010\u001f\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001d0\u001c\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018\".\u0010#\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001d\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u0012\u0004\b!\u0010\"\" \u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018\"&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010\u0018\u0012\u0004\b)\u0010\"\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018\" \u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0018\"&\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b2\u0010\u001a\"&\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010\u0018\u001a\u0004\b5\u0010\u001a\"&\u0010:\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010\u0018\u001a\u0004\b9\u0010\u001a\" \u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0018\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0018\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0018\" \u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0018\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0018\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0018\" \u0010O\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0018\" \u0010S\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\" \u0010V\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010R\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010R\" \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0018\" \u0010_\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0018\" \u0010a\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0018\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u0000*\u00020b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010c\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u0000*\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010f\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u0000*\u00020g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010h\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010j\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010l\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u0000*\u00020m8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010n\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u0000*\u00020o8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010p\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\b0\u0000*\u00020q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010r\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u0000*\u00020s8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010t\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u0000*\u00020u8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010v\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u0000*\u00020w8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010x\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\b0\u0000*\u00020y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010z\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\b0\u0000*\u00020{8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010|¨\u0006}"}, d2 = {"Landroidx/compose/runtime/saveable/Saver;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Original", "Saveable", "value", "saver", "Landroidx/compose/runtime/saveable/SaverScope;", "scope", "", "nY", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/ui/text/NonNullValueClassSaver;", c.f62177j, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/NonNullValueClassSaver;", "ViF", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/runtime/saveable/Saver;", "KN", "()Landroidx/compose/runtime/saveable/Saver;", "AnnotatedStringSaver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "rl", "AnnotationRangeListSaver", "t", "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "nr", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/UrlAnnotation;", "O", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "J2", "LinkSaver", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "Uo", "ClickableSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "xMQ", "ParagraphStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "WPU", "SpanStyleSaver", "Landroidx/compose/ui/text/TextLinkStyles;", "mUb", "aYN", "TextLinkStylesSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "gh", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "qie", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextIndent;", "az", "TextIndentSaver", "Landroidx/compose/ui/text/font/FontWeight;", "ty", "FontWeightSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "HI", "BaselineShiftSaver", "Landroidx/compose/ui/text/TextRange;", "ck", "TextRangeSaver", "Landroidx/compose/ui/graphics/Shadow;", "Ik", "ShadowSaver", "Landroidx/compose/ui/graphics/Color;", "r", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "ColorSaver", "Landroidx/compose/ui/unit/TextUnit;", "o", "TextUnitSaver", "Landroidx/compose/ui/geometry/Offset;", "Z", "OffsetSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "XQ", "LocaleListSaver", "Landroidx/compose/ui/text/intl/Locale;", "S", "LocaleSaver", "Landroidx/compose/ui/text/style/LineHeightStyle;", "LineHeightStyleSaver", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "(Landroidx/compose/ui/text/style/LineHeightStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
public final class SaversKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Saver f33427n = SaverKt.n(new Function2<SaverScope, AnnotatedString, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, AnnotatedString annotatedString) {
            return CollectionsKt.arrayListOf(SaversKt.ViF(annotatedString.getText()), SaversKt.nY(annotatedString.getAnnotations(), SaversKt.rl, saverScope));
        }
    }, new Function1<Object, AnnotatedString>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AnnotatedString invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(1);
            Saver saver = SaversKt.rl;
            List list2 = ((!Intrinsics.areEqual(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (List) saver.rl(obj2) : null;
            Object obj3 = list.get(0);
            String str = obj3 != null ? (String) obj3 : null;
            Intrinsics.checkNotNull(str);
            return new AnnotatedString(list2, str);
        }
    });
    private static final Saver rl = SaverKt.n(new Function2<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, List list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(SaversKt.nY((AnnotatedString.Range) list.get(i2), SaversKt.f33430t, saverScope));
            }
            return arrayList;
        }
    }, new Function1<Object, List<? extends AnnotatedString.Range<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                Saver saver = SaversKt.f33430t;
                AnnotatedString.Range range = null;
                if ((!Intrinsics.areEqual(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                    range = (AnnotatedString.Range) saver.rl(obj2);
                }
                Intrinsics.checkNotNull(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Saver f33430t = SaverKt.n(new Function2<SaverScope, AnnotatedString.Range<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.f33365n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.f33368t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.f33361O.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.J2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.f33367r.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.f33366o.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.f33363Z.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, AnnotatedString.Range range) {
            AnnotationType annotationType;
            Object objNY;
            Object item = range.getItem();
            if (item instanceof ParagraphStyle) {
                annotationType = AnnotationType.f33365n;
            } else if (item instanceof SpanStyle) {
                annotationType = AnnotationType.f33368t;
            } else if (item instanceof VerbatimTtsAnnotation) {
                annotationType = AnnotationType.f33361O;
            } else if (item instanceof UrlAnnotation) {
                annotationType = AnnotationType.J2;
            } else if (item instanceof LinkAnnotation.Url) {
                annotationType = AnnotationType.f33367r;
            } else if (item instanceof LinkAnnotation.Clickable) {
                annotationType = AnnotationType.f33366o;
            } else if (item instanceof StringAnnotation) {
                annotationType = AnnotationType.f33363Z;
            } else {
                throw new UnsupportedOperationException();
            }
            switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
                case 1:
                    Object item2 = range.getItem();
                    Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    objNY = SaversKt.nY((ParagraphStyle) item2, SaversKt.xMQ(), saverScope);
                    break;
                case 2:
                    Object item3 = range.getItem();
                    Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    objNY = SaversKt.nY((SpanStyle) item3, SaversKt.WPU(), saverScope);
                    break;
                case 3:
                    Object item4 = range.getItem();
                    Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    objNY = SaversKt.nY((VerbatimTtsAnnotation) item4, SaversKt.nr, saverScope);
                    break;
                case 4:
                    Object item5 = range.getItem();
                    Intrinsics.checkNotNull(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    objNY = SaversKt.nY((UrlAnnotation) item5, SaversKt.f33424O, saverScope);
                    break;
                case 5:
                    Object item6 = range.getItem();
                    Intrinsics.checkNotNull(item6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    objNY = SaversKt.nY((LinkAnnotation.Url) item6, SaversKt.J2, saverScope);
                    break;
                case 6:
                    Object item7 = range.getItem();
                    Intrinsics.checkNotNull(item7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    objNY = SaversKt.nY((LinkAnnotation.Clickable) item7, SaversKt.Uo, saverScope);
                    break;
                case 7:
                    Object item8 = range.getItem();
                    Intrinsics.checkNotNull(item8, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                    objNY = SaversKt.ViF(((StringAnnotation) item8).getValue());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return CollectionsKt.arrayListOf(SaversKt.ViF(annotationType), objNY, SaversKt.ViF(Integer.valueOf(range.getStart())), SaversKt.ViF(Integer.valueOf(range.getEnd())), SaversKt.ViF(range.getTag()));
        }
    }, new Function1<Object, AnnotatedString.Range<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.f33365n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.f33368t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.f33361O.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.J2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.f33367r.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.f33366o.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.f33363Z.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AnnotatedString.Range invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ParagraphStyle paragraphStyle = null;
            clickable = null;
            LinkAnnotation.Clickable clickable = null;
            url = null;
            LinkAnnotation.Url url = null;
            urlAnnotation = null;
            UrlAnnotation urlAnnotation = null;
            verbatimTtsAnnotation = null;
            VerbatimTtsAnnotation verbatimTtsAnnotation = null;
            spanStyle = null;
            SpanStyle spanStyle = null;
            paragraphStyle = null;
            AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
            Intrinsics.checkNotNull(annotationType);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            Intrinsics.checkNotNull(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            Intrinsics.checkNotNull(str);
            switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
                case 1:
                    Object obj6 = list.get(1);
                    Saver saverXMQ = SaversKt.xMQ();
                    if ((!Intrinsics.areEqual(obj6, Boolean.FALSE) || (saverXMQ instanceof NonNullValueClassSaver)) && obj6 != null) {
                        paragraphStyle = (ParagraphStyle) saverXMQ.rl(obj6);
                    }
                    Intrinsics.checkNotNull(paragraphStyle);
                    return new AnnotatedString.Range(paragraphStyle, iIntValue, iIntValue2, str);
                case 2:
                    Object obj7 = list.get(1);
                    Saver saverWPU = SaversKt.WPU();
                    if ((!Intrinsics.areEqual(obj7, Boolean.FALSE) || (saverWPU instanceof NonNullValueClassSaver)) && obj7 != null) {
                        spanStyle = (SpanStyle) saverWPU.rl(obj7);
                    }
                    Intrinsics.checkNotNull(spanStyle);
                    return new AnnotatedString.Range(spanStyle, iIntValue, iIntValue2, str);
                case 3:
                    Object obj8 = list.get(1);
                    Saver saver = SaversKt.nr;
                    if ((!Intrinsics.areEqual(obj8, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj8 != null) {
                        verbatimTtsAnnotation = (VerbatimTtsAnnotation) saver.rl(obj8);
                    }
                    Intrinsics.checkNotNull(verbatimTtsAnnotation);
                    return new AnnotatedString.Range(verbatimTtsAnnotation, iIntValue, iIntValue2, str);
                case 4:
                    Object obj9 = list.get(1);
                    Saver saver2 = SaversKt.f33424O;
                    if ((!Intrinsics.areEqual(obj9, Boolean.FALSE) || (saver2 instanceof NonNullValueClassSaver)) && obj9 != null) {
                        urlAnnotation = (UrlAnnotation) saver2.rl(obj9);
                    }
                    Intrinsics.checkNotNull(urlAnnotation);
                    return new AnnotatedString.Range(urlAnnotation, iIntValue, iIntValue2, str);
                case 5:
                    Object obj10 = list.get(1);
                    Saver saver3 = SaversKt.J2;
                    if ((!Intrinsics.areEqual(obj10, Boolean.FALSE) || (saver3 instanceof NonNullValueClassSaver)) && obj10 != null) {
                        url = (LinkAnnotation.Url) saver3.rl(obj10);
                    }
                    Intrinsics.checkNotNull(url);
                    return new AnnotatedString.Range(url, iIntValue, iIntValue2, str);
                case 6:
                    Object obj11 = list.get(1);
                    Saver saver4 = SaversKt.Uo;
                    if ((!Intrinsics.areEqual(obj11, Boolean.FALSE) || (saver4 instanceof NonNullValueClassSaver)) && obj11 != null) {
                        clickable = (LinkAnnotation.Clickable) saver4.rl(obj11);
                    }
                    Intrinsics.checkNotNull(clickable);
                    return new AnnotatedString.Range(clickable, iIntValue, iIntValue2, str);
                case 7:
                    Object obj12 = list.get(1);
                    String str2 = obj12 != null ? (String) obj12 : null;
                    Intrinsics.checkNotNull(str2);
                    return new AnnotatedString.Range(StringAnnotation.n(StringAnnotation.rl(str2)), iIntValue, iIntValue2, str);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    });
    private static final Saver nr = SaverKt.n(new Function2<SaverScope, VerbatimTtsAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return SaversKt.ViF(verbatimTtsAnnotation.getVerbatim());
        }
    }, new Function1<Object, VerbatimTtsAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final VerbatimTtsAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            Intrinsics.checkNotNull(str);
            return new VerbatimTtsAnnotation(str);
        }
    });

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Saver f33424O = SaverKt.n(new Function2<SaverScope, UrlAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
            return SaversKt.ViF(urlAnnotation.getUrl());
        }
    }, new Function1<Object, UrlAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final UrlAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            Intrinsics.checkNotNull(str);
            return new UrlAnnotation(str);
        }
    });
    private static final Saver J2 = SaverKt.n(new Function2<SaverScope, LinkAnnotation.Url, Object>() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, LinkAnnotation.Url url) {
            return CollectionsKt.arrayListOf(SaversKt.ViF(url.getUrl()), SaversKt.nY(url.getStyles(), SaversKt.aYN(), saverScope));
        }
    }, new Function1<Object, LinkAnnotation.Url>() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final LinkAnnotation.Url invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextLinkStyles textLinkStyles = null;
            String str = obj2 != null ? (String) obj2 : null;
            Intrinsics.checkNotNull(str);
            Object obj3 = list.get(1);
            Saver saverAYN = SaversKt.aYN();
            if ((!Intrinsics.areEqual(obj3, Boolean.FALSE) || (saverAYN instanceof NonNullValueClassSaver)) && obj3 != null) {
                textLinkStyles = (TextLinkStyles) saverAYN.rl(obj3);
            }
            return new LinkAnnotation.Url(str, textLinkStyles, null, 4, null);
        }
    });
    private static final Saver Uo = SaverKt.n(new Function2<SaverScope, LinkAnnotation.Clickable, Object>() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, LinkAnnotation.Clickable clickable) {
            return CollectionsKt.arrayListOf(SaversKt.ViF(clickable.getTag()), SaversKt.nY(clickable.getStyles(), SaversKt.aYN(), saverScope));
        }
    }, new Function1<Object, LinkAnnotation.Clickable>() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final LinkAnnotation.Clickable invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            String str = obj2 != null ? (String) obj2 : null;
            Intrinsics.checkNotNull(str);
            Object obj3 = list.get(1);
            Saver saverAYN = SaversKt.aYN();
            return new LinkAnnotation.Clickable(str, ((!Intrinsics.areEqual(obj3, Boolean.FALSE) || (saverAYN instanceof NonNullValueClassSaver)) && obj3 != null) ? (TextLinkStyles) saverAYN.rl(obj3) : null, null);
        }
    });
    private static final Saver KN = SaverKt.n(new Function2<SaverScope, ParagraphStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
            return CollectionsKt.arrayListOf(SaversKt.ViF(TextAlign.KN(paragraphStyle.getTextAlign())), SaversKt.ViF(TextDirection.Uo(paragraphStyle.getTextDirection())), SaversKt.nY(TextUnit.rl(paragraphStyle.getLineHeight()), SaversKt.S(TextUnit.INSTANCE), saverScope), SaversKt.nY(paragraphStyle.getTextIndent(), SaversKt.XQ(TextIndent.INSTANCE), saverScope), SaversKt.nY(paragraphStyle.getPlatformStyle(), Savers_androidKt.n(PlatformParagraphStyle.INSTANCE), saverScope), SaversKt.nY(paragraphStyle.getLineHeightStyle(), SaversKt.r(LineHeightStyle.INSTANCE), saverScope), SaversKt.nY(LineBreak.t(paragraphStyle.getLineBreak()), Savers_androidKt.rl(LineBreak.INSTANCE), saverScope), SaversKt.ViF(Hyphens.nr(paragraphStyle.getHyphens())), SaversKt.nY(paragraphStyle.getTextMotion(), Savers_androidKt.t(TextMotion.INSTANCE), saverScope));
        }
    }, new Function1<Object, ParagraphStyle>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ParagraphStyle invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextMotion textMotion = null;
            TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
            Intrinsics.checkNotNull(textAlign);
            int value = textAlign.getValue();
            Object obj3 = list.get(1);
            TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
            Intrinsics.checkNotNull(textDirection);
            int value2 = textDirection.getValue();
            Object obj4 = list.get(2);
            Saver saverS = SaversKt.S(TextUnit.INSTANCE);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnit = ((!Intrinsics.areEqual(obj4, bool) || (saverS instanceof NonNullValueClassSaver)) && obj4 != null) ? (TextUnit) saverS.rl(obj4) : null;
            Intrinsics.checkNotNull(textUnit);
            long packedValue = textUnit.getPackedValue();
            Object obj5 = list.get(3);
            Saver saverXQ = SaversKt.XQ(TextIndent.INSTANCE);
            TextIndent textIndent = ((!Intrinsics.areEqual(obj5, bool) || (saverXQ instanceof NonNullValueClassSaver)) && obj5 != null) ? (TextIndent) saverXQ.rl(obj5) : null;
            Object obj6 = list.get(4);
            Saver saverN = Savers_androidKt.n(PlatformParagraphStyle.INSTANCE);
            PlatformParagraphStyle platformParagraphStyle = ((!Intrinsics.areEqual(obj6, bool) || (saverN instanceof NonNullValueClassSaver)) && obj6 != null) ? (PlatformParagraphStyle) saverN.rl(obj6) : null;
            Object obj7 = list.get(5);
            Saver saverR = SaversKt.r(LineHeightStyle.INSTANCE);
            LineHeightStyle lineHeightStyle = ((!Intrinsics.areEqual(obj7, bool) || (saverR instanceof NonNullValueClassSaver)) && obj7 != null) ? (LineHeightStyle) saverR.rl(obj7) : null;
            Object obj8 = list.get(6);
            Saver saverRl = Savers_androidKt.rl(LineBreak.INSTANCE);
            LineBreak lineBreak = ((!Intrinsics.areEqual(obj8, bool) || (saverRl instanceof NonNullValueClassSaver)) && obj8 != null) ? (LineBreak) saverRl.rl(obj8) : null;
            Intrinsics.checkNotNull(lineBreak);
            int mask = lineBreak.getMask();
            Object obj9 = list.get(7);
            Hyphens hyphens = obj9 != null ? (Hyphens) obj9 : null;
            Intrinsics.checkNotNull(hyphens);
            int value3 = hyphens.getValue();
            Object obj10 = list.get(8);
            Saver saverT = Savers_androidKt.t(TextMotion.INSTANCE);
            if ((!Intrinsics.areEqual(obj10, bool) || (saverT instanceof NonNullValueClassSaver)) && obj10 != null) {
                textMotion = (TextMotion) saverT.rl(obj10);
            }
            return new ParagraphStyle(value, value2, packedValue, textIndent, platformParagraphStyle, lineHeightStyle, mask, value3, textMotion, null);
        }
    });
    private static final Saver xMQ = SaverKt.n(new Function2<SaverScope, SpanStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, SpanStyle spanStyle) {
            Color colorXMQ = Color.xMQ(spanStyle.Uo());
            Color.Companion companion = Color.INSTANCE;
            Object objNY = SaversKt.nY(colorXMQ, SaversKt.gh(companion), saverScope);
            TextUnit textUnitRl = TextUnit.rl(spanStyle.getFontSize());
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            return CollectionsKt.arrayListOf(objNY, SaversKt.nY(textUnitRl, SaversKt.S(companion2), saverScope), SaversKt.nY(spanStyle.getFontWeight(), SaversKt.ty(FontWeight.INSTANCE), saverScope), SaversKt.ViF(spanStyle.getFontStyle()), SaversKt.ViF(spanStyle.getFontSynthesis()), SaversKt.ViF(-1), SaversKt.ViF(spanStyle.getFontFeatureSettings()), SaversKt.nY(TextUnit.rl(spanStyle.getLetterSpacing()), SaversKt.S(companion2), saverScope), SaversKt.nY(spanStyle.getBaselineShift(), SaversKt.Ik(BaselineShift.INSTANCE), saverScope), SaversKt.nY(spanStyle.getTextGeometricTransform(), SaversKt.Z(TextGeometricTransform.INSTANCE), saverScope), SaversKt.nY(spanStyle.getLocaleList(), SaversKt.ck(LocaleList.INSTANCE), saverScope), SaversKt.nY(Color.xMQ(spanStyle.getBackground()), SaversKt.gh(companion), saverScope), SaversKt.nY(spanStyle.getTextDecoration(), SaversKt.o(TextDecoration.INSTANCE), saverScope), SaversKt.nY(spanStyle.getShadow(), SaversKt.qie(Shadow.INSTANCE), saverScope));
        }
    }, new Function1<Object, SpanStyle>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 androidx.compose.ui.text.SpanStyle, still in use, count: 2, list:
              (r1v1 androidx.compose.ui.text.SpanStyle) from 0x00d8: MOVE (r16v2 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle) (LINE:218)
              (r1v1 androidx.compose.ui.text.SpanStyle) from 0x00d0: MOVE (r16v7 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle) (LINE:210)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.SpanStyle invoke(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2.invoke(java.lang.Object):androidx.compose.ui.text.SpanStyle");
        }
    });
    private static final Saver mUb = SaverKt.n(new Function2<SaverScope, TextLinkStyles, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, TextLinkStyles textLinkStyles) {
            return CollectionsKt.arrayListOf(SaversKt.nY(textLinkStyles.getStyle(), SaversKt.WPU(), saverScope), SaversKt.nY(textLinkStyles.getFocusedStyle(), SaversKt.WPU(), saverScope), SaversKt.nY(textLinkStyles.getHoveredStyle(), SaversKt.WPU(), saverScope), SaversKt.nY(textLinkStyles.getPressedStyle(), SaversKt.WPU(), saverScope));
        }
    }, new Function1<Object, TextLinkStyles>() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextLinkStyles invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver saverWPU = SaversKt.WPU();
            Boolean bool = Boolean.FALSE;
            SpanStyle spanStyle = null;
            SpanStyle spanStyle2 = ((!Intrinsics.areEqual(obj2, bool) || (saverWPU instanceof NonNullValueClassSaver)) && obj2 != null) ? (SpanStyle) saverWPU.rl(obj2) : null;
            Object obj3 = list.get(1);
            Saver saverWPU2 = SaversKt.WPU();
            SpanStyle spanStyle3 = ((!Intrinsics.areEqual(obj3, bool) || (saverWPU2 instanceof NonNullValueClassSaver)) && obj3 != null) ? (SpanStyle) saverWPU2.rl(obj3) : null;
            Object obj4 = list.get(2);
            Saver saverWPU3 = SaversKt.WPU();
            SpanStyle spanStyle4 = ((!Intrinsics.areEqual(obj4, bool) || (saverWPU3 instanceof NonNullValueClassSaver)) && obj4 != null) ? (SpanStyle) saverWPU3.rl(obj4) : null;
            Object obj5 = list.get(3);
            Saver saverWPU4 = SaversKt.WPU();
            if ((!Intrinsics.areEqual(obj5, bool) || (saverWPU4 instanceof NonNullValueClassSaver)) && obj5 != null) {
                spanStyle = (SpanStyle) saverWPU4.rl(obj5);
            }
            return new TextLinkStyles(spanStyle2, spanStyle3, spanStyle4, spanStyle);
        }
    });
    private static final Saver gh = SaverKt.n(new Function2<SaverScope, TextDecoration, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, TextDecoration textDecoration) {
            return Integer.valueOf(textDecoration.getMask());
        }
    }, new Function1<Object, TextDecoration>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextDecoration invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return new TextDecoration(((Integer) obj).intValue());
        }
    });
    private static final Saver qie = SaverKt.n(new Function2<SaverScope, TextGeometricTransform, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
            return CollectionsKt.arrayListOf(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }, new Function1<Object, TextGeometricTransform>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextGeometricTransform invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });
    private static final Saver az = SaverKt.n(new Function2<SaverScope, TextIndent, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
            TextUnit textUnitRl = TextUnit.rl(textIndent.getFirstLine());
            TextUnit.Companion companion = TextUnit.INSTANCE;
            return CollectionsKt.arrayListOf(SaversKt.nY(textUnitRl, SaversKt.S(companion), saverScope), SaversKt.nY(TextUnit.rl(textIndent.getRestLine()), SaversKt.S(companion), saverScope));
        }
    }, new Function1<Object, TextIndent>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextIndent invoke(Object obj) {
            Intrinsics.checkNotNull(obj, LHbnkhI.GKCro);
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextUnit.Companion companion = TextUnit.INSTANCE;
            Saver saverS = SaversKt.S(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnit = null;
            TextUnit textUnit2 = ((!Intrinsics.areEqual(obj2, bool) || (saverS instanceof NonNullValueClassSaver)) && obj2 != null) ? (TextUnit) saverS.rl(obj2) : null;
            Intrinsics.checkNotNull(textUnit2);
            long packedValue = textUnit2.getPackedValue();
            Object obj3 = list.get(1);
            Saver saverS2 = SaversKt.S(companion);
            if ((!Intrinsics.areEqual(obj3, bool) || (saverS2 instanceof NonNullValueClassSaver)) && obj3 != null) {
                textUnit = (TextUnit) saverS2.rl(obj3);
            }
            Intrinsics.checkNotNull(textUnit);
            return new TextIndent(packedValue, textUnit.getPackedValue(), null);
        }
    });
    private static final Saver ty = SaverKt.n(new Function2<SaverScope, FontWeight, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.qie());
        }
    }, new Function1<Object, FontWeight>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final FontWeight invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return new FontWeight(((Integer) obj).intValue());
        }
    });
    private static final Saver HI = SaverKt.n(new Function2<SaverScope, BaselineShift, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, BaselineShift baselineShift) {
            return n(saverScope, baselineShift.getMultiplier());
        }

        public final Object n(SaverScope saverScope, float f3) {
            return Float.valueOf(f3);
        }
    }, new Function1<Object, BaselineShift>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final BaselineShift invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            return BaselineShift.rl(BaselineShift.t(((Float) obj).floatValue()));
        }
    });
    private static final Saver ck = SaverKt.n(new Function2<SaverScope, TextRange, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        /* JADX WARN: Multi-variable type inference failed */
        public final Object n(SaverScope saverScope, long j2) {
            return CollectionsKt.arrayListOf(SaversKt.ViF(Integer.valueOf(TextRange.ty(j2))), SaversKt.ViF(Integer.valueOf(TextRange.xMQ(j2))));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextRange textRange) {
            return n(saverScope, textRange.getPackedValue());
        }
    }, new Function1<Object, TextRange>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextRange invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            Intrinsics.checkNotNull(num2);
            return TextRange.rl(TextRangeKt.rl(iIntValue, num2.intValue()));
        }
    });
    private static final Saver Ik = SaverKt.n(new Function2<SaverScope, Shadow, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, Shadow shadow) {
            return CollectionsKt.arrayListOf(SaversKt.nY(Color.xMQ(shadow.getColor()), SaversKt.gh(Color.INSTANCE), saverScope), SaversKt.nY(Offset.nr(shadow.getOffset()), SaversKt.mUb(Offset.INSTANCE), saverScope), SaversKt.ViF(Float.valueOf(shadow.getBlurRadius())));
        }
    }, new Function1<Object, Shadow>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Shadow invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver saverGh = SaversKt.gh(Color.INSTANCE);
            Boolean bool = Boolean.FALSE;
            Color color = ((!Intrinsics.areEqual(obj2, bool) || (saverGh instanceof NonNullValueClassSaver)) && obj2 != null) ? (Color) saverGh.rl(obj2) : null;
            Intrinsics.checkNotNull(color);
            long value = color.getValue();
            Object obj3 = list.get(1);
            Saver saverMUb = SaversKt.mUb(Offset.INSTANCE);
            Offset offset = ((!Intrinsics.areEqual(obj3, bool) || (saverMUb instanceof NonNullValueClassSaver)) && obj3 != null) ? (Offset) saverMUb.rl(obj3) : null;
            Intrinsics.checkNotNull(offset);
            long packedValue = offset.getPackedValue();
            Object obj4 = list.get(2);
            Float f3 = obj4 != null ? (Float) obj4 : null;
            Intrinsics.checkNotNull(f3);
            return new Shadow(value, packedValue, f3.floatValue(), null);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final NonNullValueClassSaver f33429r = n(new Function2<SaverScope, Color, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Color color) {
            return n(saverScope, color.getValue());
        }

        public final Object n(SaverScope saverScope, long j2) {
            return j2 == 16 ? Boolean.FALSE : Integer.valueOf(ColorKt.mUb(j2));
        }
    }, new Function1<Object, Color>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Color invoke(Object obj) {
            if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                return Color.xMQ(Color.INSTANCE.Uo());
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return Color.xMQ(ColorKt.rl(((Integer) obj).intValue()));
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final NonNullValueClassSaver f33428o = n(new Function2<SaverScope, TextUnit, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextUnit textUnit) {
            return n(saverScope, textUnit.getPackedValue());
        }

        public final Object n(SaverScope saverScope, long j2) {
            return TextUnit.O(j2, TextUnit.INSTANCE.n()) ? Boolean.FALSE : CollectionsKt.arrayListOf(SaversKt.ViF(Float.valueOf(TextUnit.KN(j2))), SaversKt.ViF(TextUnitType.nr(TextUnit.Uo(j2))));
        }
    }, new Function1<Object, TextUnit>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextUnit invoke(Object obj) {
            if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                return TextUnit.rl(TextUnit.INSTANCE.n());
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f3 = obj2 != null ? (Float) obj2 : null;
            Intrinsics.checkNotNull(f3);
            float fFloatValue = f3.floatValue();
            Object obj3 = list.get(1);
            TextUnitType textUnitType = obj3 != null ? (TextUnitType) obj3 : null;
            Intrinsics.checkNotNull(textUnitType);
            return TextUnit.rl(TextUnitKt.n(fFloatValue, textUnitType.getType()));
        }
    });

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final NonNullValueClassSaver f33426Z = n(new Function2<SaverScope, Offset, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Offset offset) {
            return n(saverScope, offset.getPackedValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object n(SaverScope saverScope, long j2) {
            return Offset.mUb(j2, Offset.INSTANCE.rl()) ? Boolean.FALSE : CollectionsKt.arrayListOf(SaversKt.ViF(Float.valueOf(Float.intBitsToFloat((int) (j2 >> 32)))), SaversKt.ViF(Float.valueOf(Float.intBitsToFloat((int) (j2 & 4294967295L)))));
        }
    }, new Function1<Object, Offset>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Offset invoke(Object obj) {
            if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                return Offset.nr(Offset.INSTANCE.rl());
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f3 = obj2 != null ? (Float) obj2 : null;
            Intrinsics.checkNotNull(f3);
            float fFloatValue = f3.floatValue();
            Object obj3 = list.get(1);
            Float f4 = obj3 != null ? (Float) obj3 : null;
            Intrinsics.checkNotNull(f4);
            return Offset.nr(Offset.O((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L)));
        }
    });
    private static final Saver XQ = SaverKt.n(new Function2<SaverScope, LocaleList, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, LocaleList localeList) {
            List localeList2 = localeList.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList2.size());
            int size = localeList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(SaversKt.nY((Locale) localeList2.get(i2), SaversKt.HI(Locale.INSTANCE), saverScope));
            }
            return arrayList;
        }
    }, new Function1<Object, LocaleList>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final LocaleList invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                Saver saverHI = SaversKt.HI(Locale.INSTANCE);
                Locale locale = null;
                if ((!Intrinsics.areEqual(obj2, Boolean.FALSE) || (saverHI instanceof NonNullValueClassSaver)) && obj2 != null) {
                    locale = (Locale) saverHI.rl(obj2);
                }
                Intrinsics.checkNotNull(locale);
                arrayList.add(locale);
            }
            return new LocaleList(arrayList);
        }
    });

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Saver f33425S = SaverKt.n(new Function2<SaverScope, Locale, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, Locale locale) {
            return locale.rl();
        }
    }, new Function1<Object, Locale>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Locale invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            return new Locale((String) obj);
        }
    });
    private static final Saver WPU = SaverKt.n(new Function2<SaverScope, LineHeightStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SaverScope saverScope, LineHeightStyle lineHeightStyle) {
            return CollectionsKt.arrayListOf(SaversKt.ViF(LineHeightStyle.Alignment.t(lineHeightStyle.getAlignment())), SaversKt.ViF(LineHeightStyle.Trim.t(lineHeightStyle.getTrim())), SaversKt.ViF(LineHeightStyle.Mode.t(lineHeightStyle.getMode())));
        }
    }, new Function1<Object, LineHeightStyle>() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final LineHeightStyle invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            LineHeightStyle.Alignment alignment = obj2 != null ? (LineHeightStyle.Alignment) obj2 : null;
            Intrinsics.checkNotNull(alignment);
            float topRatio = alignment.getTopRatio();
            Object obj3 = list.get(1);
            LineHeightStyle.Trim trim = obj3 != null ? (LineHeightStyle.Trim) obj3 : null;
            Intrinsics.checkNotNull(trim);
            int value = trim.getValue();
            Object obj4 = list.get(2);
            LineHeightStyle.Mode mode = obj4 != null ? (LineHeightStyle.Mode) obj4 : null;
            Intrinsics.checkNotNull(mode);
            return new LineHeightStyle(topRatio, value, mode.getValue(), null);
        }
    });

    public static final Object ViF(Object obj) {
        return obj;
    }

    public static final Saver HI(Locale.Companion companion) {
        return f33425S;
    }

    public static final Saver Ik(BaselineShift.Companion companion) {
        return HI;
    }

    public static final Saver KN() {
        return f33427n;
    }

    public static final Saver S(TextUnit.Companion companion) {
        return f33428o;
    }

    public static final Saver WPU() {
        return xMQ;
    }

    public static final Saver XQ(TextIndent.Companion companion) {
        return az;
    }

    public static final Saver Z(TextGeometricTransform.Companion companion) {
        return qie;
    }

    public static final Saver aYN() {
        return mUb;
    }

    public static final Saver az(TextRange.Companion companion) {
        return ck;
    }

    public static final Saver ck(LocaleList.Companion companion) {
        return XQ;
    }

    public static final Saver gh(Color.Companion companion) {
        return f33429r;
    }

    public static final Saver mUb(Offset.Companion companion) {
        return f33426Z;
    }

    private static final NonNullValueClassSaver n(final Function2 function2, final Function1 function1) {
        return new NonNullValueClassSaver<Object, Object>() { // from class: androidx.compose.ui.text.SaversKt$NonNullValueClassSaver$1
            @Override // androidx.compose.runtime.saveable.Saver
            public Object n(SaverScope saverScope, Object obj) {
                return function2.invoke(saverScope, obj);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Object rl(Object value) {
                return function1.invoke(value);
            }
        };
    }

    public static final Object nY(Object obj, Saver saver, SaverScope saverScope) {
        Object objN;
        return (obj == null || (objN = saver.n(saverScope, obj)) == null) ? Boolean.FALSE : objN;
    }

    public static final Saver o(TextDecoration.Companion companion) {
        return gh;
    }

    public static final Saver qie(Shadow.Companion companion) {
        return Ik;
    }

    public static final Saver r(LineHeightStyle.Companion companion) {
        return WPU;
    }

    public static final Saver ty(FontWeight.Companion companion) {
        return ty;
    }

    public static final Saver xMQ() {
        return KN;
    }
}
