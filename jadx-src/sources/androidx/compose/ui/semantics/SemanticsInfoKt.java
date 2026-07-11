package androidx.compose.ui.semantics;

import androidx.collection.MutableObjectList;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", c.f62177j, "(Landroidx/compose/ui/semantics/SemanticsInfo;)Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsInfo.kt\nandroidx/compose/ui/semantics/SemanticsInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,104:1\n1#2:105\n80#3:106\n*S KotlinDebug\n*F\n+ 1 SemanticsInfo.kt\nandroidx/compose/ui/semantics/SemanticsInfoKt\n*L\n88#1:106\n*E\n"})
public final class SemanticsInfoKt {
    public static final SemanticsConfiguration n(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfigurationD = semanticsInfo.D();
        if (semanticsConfigurationD != null && semanticsConfigurationD.getIsMergingSemanticsOfDescendants() && !semanticsConfigurationD.getIsClearingSemantics()) {
            semanticsConfigurationD = semanticsConfigurationD.KN();
            MutableObjectList mutableObjectList = new MutableObjectList(semanticsInfo.a().size());
            mutableObjectList.r(semanticsInfo.a());
            while (mutableObjectList.KN()) {
                SemanticsInfo semanticsInfo2 = (SemanticsInfo) mutableObjectList.g(mutableObjectList._size - 1);
                SemanticsConfiguration semanticsConfigurationD2 = semanticsInfo2.D();
                if (semanticsConfigurationD2 != null && !semanticsConfigurationD2.getIsMergingSemanticsOfDescendants()) {
                    semanticsConfigurationD.HI(semanticsConfigurationD2);
                    if (!semanticsConfigurationD2.getIsClearingSemantics()) {
                        mutableObjectList.r(semanticsInfo2.a());
                    }
                }
            }
        }
        return semanticsConfigurationD;
    }
}
