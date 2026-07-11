package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0014\u0010 R \u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultStyle", "KN", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/ParagraphStyle;", c.f62177j, "Landroidx/compose/ui/text/AnnotatedString;", "nr", "()Landroidx/compose/ui/text/AnnotatedString;", "rl", "Ljava/util/List;", "Uo", "()Ljava/util/List;", "", "t", "Lkotlin/Lazy;", "O", "()F", "minIntrinsicWidth", "maxIntrinsicWidth", "Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "J2", "infoList", "", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,157:1\n1245#2:158\n1247#2:166\n1246#2,3:167\n150#3,3:159\n34#3,4:162\n39#3:170\n153#3:171\n102#3,2:172\n34#3,6:174\n104#3:180\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n98#1:158\n98#1:166\n98#1:167,3\n98#1:159,3\n98#1:162,4\n98#1:170\n98#1:171\n125#1:172,2\n125#1:174,6\n125#1:180\n*E\n"})
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final List infoList;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString annotatedString;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Lazy maxIntrinsicWidth;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List placeholders;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy minIntrinsicWidth;

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List list, Density density, FontFamily.Resolver resolver) {
        this.annotatedString = annotatedString;
        this.placeholders = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.minIntrinsicWidth = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                Object obj;
                ParagraphIntrinsics intrinsics;
                List infoList = this.f33404n.getInfoList();
                if (infoList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = infoList.get(0);
                    float fO = ((ParagraphIntrinsicInfo) obj2).getIntrinsics().O();
                    int lastIndex = CollectionsKt.getLastIndex(infoList);
                    int i2 = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            Object obj3 = infoList.get(i2);
                            float fO2 = ((ParagraphIntrinsicInfo) obj3).getIntrinsics().O();
                            if (Float.compare(fO, fO2) < 0) {
                                obj2 = obj3;
                                fO = fO2;
                            }
                            if (i2 == lastIndex) {
                                break;
                            }
                            i2++;
                        }
                    }
                    obj = obj2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
                return Float.valueOf((paragraphIntrinsicInfo == null || (intrinsics = paragraphIntrinsicInfo.getIntrinsics()) == null) ? 0.0f : intrinsics.O());
            }
        });
        this.maxIntrinsicWidth = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                Object obj;
                ParagraphIntrinsics intrinsics;
                List infoList = this.f33403n.getInfoList();
                if (infoList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = infoList.get(0);
                    float fN = ((ParagraphIntrinsicInfo) obj2).getIntrinsics().n();
                    int lastIndex = CollectionsKt.getLastIndex(infoList);
                    int i2 = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            Object obj3 = infoList.get(i2);
                            float fN2 = ((ParagraphIntrinsicInfo) obj3).getIntrinsics().n();
                            if (Float.compare(fN, fN2) < 0) {
                                obj2 = obj3;
                                fN = fN2;
                            }
                            if (i2 == lastIndex) {
                                break;
                            }
                            i2++;
                        }
                    }
                    obj = obj2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
                return Float.valueOf((paragraphIntrinsicInfo == null || (intrinsics = paragraphIntrinsicInfo.getIntrinsics()) == null) ? 0.0f : intrinsics.n());
            }
        });
        ParagraphStyle paragraphStyleV = textStyle.v();
        List listMUb = AnnotatedStringKt.mUb(annotatedString, paragraphStyleV);
        ArrayList arrayList = new ArrayList(listMUb.size());
        int size = listMUb.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listMUb.get(i2);
            AnnotatedString annotatedStringGh = AnnotatedStringKt.gh(annotatedString, range.getStart(), range.getEnd());
            ParagraphStyle paragraphStyleKN = KN((ParagraphStyle) range.getItem(), paragraphStyleV);
            String text = annotatedStringGh.getText();
            TextStyle textStyleN = textStyle.N(paragraphStyleKN);
            List annotations = annotatedStringGh.getAnnotations();
            if (annotations == null) {
                annotations = CollectionsKt.emptyList();
            }
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.n(text, textStyleN, annotations, density, resolver, MultiParagraphIntrinsicsKt.rl(getPlaceholders(), range.getStart(), range.getEnd())), range.getStart(), range.getEnd()));
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final List getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float O() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final List getPlaceholders() {
        return this.placeholders;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float n() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean rl() {
        List list = this.infoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ParagraphIntrinsicInfo) list.get(i2)).getIntrinsics().rl()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle KN(ParagraphStyle style, ParagraphStyle defaultStyle) {
        if (!TextDirection.mUb(style.getTextDirection(), TextDirection.INSTANCE.J2())) {
            return style;
        }
        return ParagraphStyle.rl(style, 0, defaultStyle.getTextDirection(), 0L, null, null, null, 0, 0, null, 509, null);
    }
}
