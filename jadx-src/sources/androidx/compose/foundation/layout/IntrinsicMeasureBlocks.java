package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "<init>", "()V", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "availableHeight", "mainAxisSpacing", "nr", "(Ljava/util/List;II)I", "KN", "availableWidth", "t", "Uo", "rl", "J2", c.f62177j, "O", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,707:1\n421#2,5:708\n426#2,7:717\n434#2:725\n435#2,3:727\n447#2,5:730\n452#2,15:739\n470#2,6:755\n469#2,27:762\n447#2,5:789\n452#2,15:798\n470#2,6:814\n469#2,27:821\n421#2,5:848\n426#2,7:857\n434#2:865\n435#2,3:867\n421#2,5:870\n426#2,7:879\n434#2:887\n435#2,3:889\n447#2,5:892\n452#2,15:901\n470#2,6:917\n469#2,27:924\n447#2,5:951\n452#2,15:960\n470#2,6:976\n469#2,27:983\n421#2,5:1010\n426#2,7:1019\n434#2:1027\n435#2,3:1029\n34#3,4:713\n39#3:726\n34#3,4:735\n39#3:754\n34#3,4:794\n39#3:813\n34#3,4:853\n39#3:866\n34#3,4:875\n39#3:888\n34#3,4:897\n39#3:916\n34#3,4:956\n39#3:975\n34#3,4:1015\n39#3:1028\n26#4:724\n26#4:761\n26#4:820\n26#4:864\n26#4:886\n26#4:923\n26#4:982\n26#4:1026\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n*L\n311#1:708,5\n311#1:717,7\n311#1:725\n311#1:727,3\n324#1:730,5\n324#1:739,15\n324#1:755,6\n324#1:762,27\n338#1:789,5\n338#1:798,15\n338#1:814,6\n338#1:821,27\n352#1:848,5\n352#1:857,7\n352#1:865\n352#1:867,3\n365#1:870,5\n365#1:879,7\n365#1:887\n365#1:889,3\n378#1:892,5\n378#1:901,15\n378#1:917,6\n378#1:924,27\n392#1:951,5\n392#1:960,15\n392#1:976,6\n392#1:983,27\n406#1:1010,5\n406#1:1019,7\n406#1:1027\n406#1:1029,3\n311#1:713,4\n311#1:726\n324#1:735,4\n324#1:754\n338#1:794,4\n338#1:813\n352#1:853,4\n352#1:866\n365#1:875,4\n365#1:888\n378#1:897,4\n378#1:916\n392#1:956,4\n392#1:975\n406#1:1015,4\n406#1:1028\n311#1:724\n324#1:761\n338#1:820\n352#1:864\n365#1:886\n378#1:923\n392#1:982\n406#1:1026\n*E\n"})
public final class IntrinsicMeasureBlocks {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final IntrinsicMeasureBlocks f17694n = new IntrinsicMeasureBlocks();

    private IntrinsicMeasureBlocks() {
    }

    public final int J2(List measurables, int availableHeight, int mainAxisSpacing) {
        int iRound;
        int iRound2;
        int i2;
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) measurables.get(i3);
            float fO = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable));
            if (fO == 0.0f) {
                if (availableHeight == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = availableHeight - iMin;
                }
                int iMin2 = Math.min(intrinsicMeasurable.g(Integer.MAX_VALUE), i2);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.Nxk(iMin2));
            } else if (fO > 0.0f) {
                f3 += fO;
            }
        }
        if (f3 == 0.0f) {
            iRound = 0;
        } else if (availableHeight == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(availableHeight - iMin, 0) / f3);
        }
        int size2 = measurables.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) measurables.get(i5);
            float fO2 = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable2));
            if (fO2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fO2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, intrinsicMeasurable2.Nxk(iRound2));
            }
        }
        return iMax;
    }

    public final int KN(List measurables, int availableHeight, int mainAxisSpacing) {
        int iRound;
        int iRound2;
        int i2;
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) measurables.get(i3);
            float fO = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable));
            if (fO == 0.0f) {
                if (availableHeight == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = availableHeight - iMin;
                }
                int iMin2 = Math.min(intrinsicMeasurable.g(Integer.MAX_VALUE), i2);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.GR(iMin2));
            } else if (fO > 0.0f) {
                f3 += fO;
            }
        }
        if (f3 == 0.0f) {
            iRound = 0;
        } else if (availableHeight == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(availableHeight - iMin, 0) / f3);
        }
        int size2 = measurables.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) measurables.get(i5);
            float fO2 = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable2));
            if (fO2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fO2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, intrinsicMeasurable2.GR(iRound2));
            }
        }
        return iMax;
    }

    public final int O(List measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i2 = 0;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) measurables.get(i3);
            float fO = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable));
            int iG = intrinsicMeasurable.g(availableWidth);
            if (fO == 0.0f) {
                i2 += iG;
            } else if (fO > 0.0f) {
                f3 += fO;
                iMax = Math.max(iMax, Math.round(iG / fO));
            }
        }
        return Math.round(iMax * f3) + i2 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int Uo(List measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i2 = 0;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) measurables.get(i3);
            float fO = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable));
            int iFX = intrinsicMeasurable.FX(availableWidth);
            if (fO == 0.0f) {
                i2 += iFX;
            } else if (fO > 0.0f) {
                f3 += fO;
                iMax = Math.max(iMax, Math.round(iFX / fO));
            }
        }
        return Math.round(iMax * f3) + i2 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int n(List measurables, int availableWidth, int mainAxisSpacing) {
        int iRound;
        int iRound2;
        int i2;
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) measurables.get(i3);
            float fO = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable));
            if (fO == 0.0f) {
                if (availableWidth == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = availableWidth - iMin;
                }
                int iMin2 = Math.min(intrinsicMeasurable.Nxk(Integer.MAX_VALUE), i2);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.g(iMin2));
            } else if (fO > 0.0f) {
                f3 += fO;
            }
        }
        if (f3 == 0.0f) {
            iRound = 0;
        } else if (availableWidth == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(availableWidth - iMin, 0) / f3);
        }
        int size2 = measurables.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) measurables.get(i5);
            float fO2 = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable2));
            if (fO2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fO2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, intrinsicMeasurable2.g(iRound2));
            }
        }
        return iMax;
    }

    public final int nr(List measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i2 = 0;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) measurables.get(i3);
            float fO = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable));
            int iGR = intrinsicMeasurable.GR(availableHeight);
            if (fO == 0.0f) {
                i2 += iGR;
            } else if (fO > 0.0f) {
                f3 += fO;
                iMax = Math.max(iMax, Math.round(iGR / fO));
            }
        }
        return Math.round(iMax * f3) + i2 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int rl(List measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i2 = 0;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) measurables.get(i3);
            float fO = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable));
            int iNxk = intrinsicMeasurable.Nxk(availableHeight);
            if (fO == 0.0f) {
                i2 += iNxk;
            } else if (fO > 0.0f) {
                f3 += fO;
                iMax = Math.max(iMax, Math.round(iNxk / fO));
            }
        }
        return Math.round(iMax * f3) + i2 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int t(List measurables, int availableWidth, int mainAxisSpacing) {
        int iRound;
        int iRound2;
        int i2;
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) measurables.get(i3);
            float fO = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable));
            if (fO == 0.0f) {
                if (availableWidth == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = availableWidth - iMin;
                }
                int iMin2 = Math.min(intrinsicMeasurable.Nxk(Integer.MAX_VALUE), i2);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.FX(iMin2));
            } else if (fO > 0.0f) {
                f3 += fO;
            }
        }
        if (f3 == 0.0f) {
            iRound = 0;
        } else if (availableWidth == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(availableWidth - iMin, 0) / f3);
        }
        int size2 = measurables.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) measurables.get(i5);
            float fO2 = RowColumnImplKt.O(RowColumnImplKt.t(intrinsicMeasurable2));
            if (fO2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fO2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, intrinsicMeasurable2.FX(iRound2));
            }
        }
        return iMax;
    }
}
