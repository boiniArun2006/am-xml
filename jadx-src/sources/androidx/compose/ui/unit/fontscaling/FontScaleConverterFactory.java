package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0082\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001cR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R.\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010$\u0012\u0004\b)\u0010\u0003\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,¨\u0006."}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;", "", "<init>", "()V", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", TtmlNode.START, TtmlNode.END, "", "interpolationPoint", c.f62177j, "(Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "fontScale", "", "nr", "(F)I", "key", "O", "(I)F", "scaleKey", "fontScaleConverter", "", "Uo", "(FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V", "Landroidx/collection/SparseArrayCompat;", "table", "KN", "(Landroidx/collection/SparseArrayCompat;FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V", "t", "(F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "", "J2", "(F)Z", "rl", "", "[F", "CommonFontSizes", "Landroidx/collection/SparseArrayCompat;", "getSLookupTables", "()Landroidx/collection/SparseArrayCompat;", "setSLookupTables", "(Landroidx/collection/SparseArrayCompat;)V", "getSLookupTables$annotations", "sLookupTables", "", "[Ljava/lang/Object;", "LookupTablesWriteLock", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension({"SMAP\nFontScaleConverterFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,228:1\n52#2,5:229\n*S KotlinDebug\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n*L\n99#1:229,5\n*E\n"})
public final class FontScaleConverterFactory {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f34170O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FontScaleConverterFactory f34171n;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final Object[] LookupTablesWriteLock;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float[] CommonFontSizes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static volatile SparseArrayCompat sLookupTables;

    private final float O(int key) {
        return key / 100.0f;
    }

    private final int nr(float fontScale) {
        return (int) (fontScale * 100.0f);
    }

    public final boolean J2(float fontScale) {
        return fontScale >= 1.03f;
    }

    public final FontScaleConverter rl(float fontScale) {
        FontScaleConverter fontScaleConverterTable;
        if (!J2(fontScale)) {
            return null;
        }
        FontScaleConverter fontScaleConverterT = f34171n.t(fontScale);
        if (fontScaleConverterT != null) {
            return fontScaleConverterT;
        }
        int iXMQ = sLookupTables.xMQ(nr(fontScale));
        if (iXMQ >= 0) {
            return (FontScaleConverter) sLookupTables.Ik(iXMQ);
        }
        int i2 = -(iXMQ + 1);
        int i3 = i2 - 1;
        float fO = 1.0f;
        if (i2 >= sLookupTables.ck()) {
            FontScaleConverterTable fontScaleConverterTable2 = new FontScaleConverterTable(new float[]{1.0f}, new float[]{fontScale});
            Uo(fontScale, fontScaleConverterTable2);
            return fontScaleConverterTable2;
        }
        if (i3 < 0) {
            float[] fArr = CommonFontSizes;
            fontScaleConverterTable = new FontScaleConverterTable(fArr, fArr);
        } else {
            fO = O(sLookupTables.qie(i3));
            fontScaleConverterTable = (FontScaleConverter) sLookupTables.Ik(i3);
        }
        FontScaleConverter fontScaleConverterN = n(fontScaleConverterTable, (FontScaleConverter) sLookupTables.Ik(i2), MathUtils.f34175n.n(0.0f, 1.0f, fO, O(sLookupTables.qie(i2)), fontScale));
        Uo(fontScale, fontScaleConverterN);
        return fontScaleConverterN;
    }

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        f34171n = fontScaleConverterFactory;
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        sLookupTables = new SparseArrayCompat(0, 1, null);
        Object[] objArr = new Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            fontScaleConverterFactory.KN(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            fontScaleConverterFactory.KN(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            fontScaleConverterFactory.KN(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            fontScaleConverterFactory.KN(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            fontScaleConverterFactory.KN(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.INSTANCE;
        }
        if (!(fontScaleConverterFactory.O(sLookupTables.qie(0)) - 0.01f > 1.03f)) {
            InlineClassHelperKt.rl("You should only apply non-linear scaling to font scales > 1");
        }
        f34170O = 8;
    }

    private final void Uo(float scaleKey, FontScaleConverter fontScaleConverter) {
        synchronized (LookupTablesWriteLock) {
            SparseArrayCompat sparseArrayCompatClone = sLookupTables.clone();
            f34171n.KN(sparseArrayCompatClone, scaleKey, fontScaleConverter);
            sLookupTables = sparseArrayCompatClone;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final FontScaleConverter n(FontScaleConverter start, FontScaleConverter end, float interpolationPoint) {
        float[] fArr = CommonFontSizes;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = CommonFontSizes[i2];
            fArr2[i2] = MathUtils.f34175n.rl(start.rl(f3), end.rl(f3), interpolationPoint);
        }
        return new FontScaleConverterTable(CommonFontSizes, fArr2);
    }

    private final FontScaleConverter t(float scaleKey) {
        return (FontScaleConverter) sLookupTables.O(nr(scaleKey));
    }

    private FontScaleConverterFactory() {
    }

    private final void KN(SparseArrayCompat table, float scaleKey, FontScaleConverter fontScaleConverter) {
        table.az(nr(scaleKey), fontScaleConverter);
    }
}
