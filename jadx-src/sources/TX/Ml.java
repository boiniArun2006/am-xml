package TX;

import android.content.Context;
import com.alightcreative.app.motion.activities.main.newfeature.NewFeatureInfo;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w6.values().length];
            try {
                iArr[w6.f10515t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.f10512O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List n(w6 w6Var, Context context, nYs.Ml getAlightSettingsUseCase) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        int i2 = j.$EnumSwitchMapping$0[w6Var.ordinal()];
        if (i2 == 1) {
            String string = context.getString(2132019719);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(2132019720);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            NewFeatureInfo newFeatureInfo = new NewFeatureInfo(string, string2, 2131951630);
            String string3 = context.getString(2132019721);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = context.getString(2132019722);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            NewFeatureInfo newFeatureInfo2 = new NewFeatureInfo(string3, string4, 2131951631);
            String string5 = context.getString(2132019723);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = context.getString(2132019724);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return CollectionsKt.listOf((Object[]) new NewFeatureInfo[]{newFeatureInfo, newFeatureInfo2, new NewFeatureInfo(string5, string6, 2131951632)});
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string7 = context.getString(2132017414);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = context.getString(2132017409);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        NewFeatureInfo newFeatureInfo3 = new NewFeatureInfo(string7, string8, 2131951616);
        String string9 = context.getString(2132017413);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        String string10 = context.getString(2132017408);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        NewFeatureInfo newFeatureInfo4 = new NewFeatureInfo(string9, string10, 2131951617);
        String string11 = context.getString(2132017412);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        String string12 = context.getString(2132017407);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        List listListOf = CollectionsKt.listOf((Object[]) new NewFeatureInfo[]{newFeatureInfo3, newFeatureInfo4, new NewFeatureInfo(string11, string12, 2131951618)});
        nYs.j jVarInvoke = getAlightSettingsUseCase.invoke();
        if (jVarInvoke != null && jVarInvoke.J2()) {
            String string13 = context.getString(2132017410);
            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
            String string14 = context.getString(2132017405);
            Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
            listListOf = CollectionsKt.plus((Collection<? extends NewFeatureInfo>) listListOf, new NewFeatureInfo(string13, string14, 2131951619));
        }
        String string15 = context.getString(2132017411);
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        String string16 = context.getString(2132017406);
        Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
        return CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf(new NewFeatureInfo(string15, string16, 2131951620)));
    }
}
