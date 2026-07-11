package f;

import android.content.Context;
import android.content.Intent;
import androidx.core.os.BundleKt;
import com.alightcreative.app.motion.activities.MyAccountActivity;
import com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity;
import com.safedk.android.utils.Logger;
import f.AbstractC1980aC;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: f.Dsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class AbstractC1974Dsr {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    /* JADX INFO: renamed from: f.Dsr$j */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1973CN3.values().length];
            try {
                iArr[EnumC1973CN3.f63962n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1973CN3.f63963t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void n(Context context, sqD.w6 action, C1983fuX experience, nYs.Ml getAlightSettingsUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        int i2 = j.$EnumSwitchMapping$0[experience.rl().ordinal()];
        if (i2 == 1) {
            Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[0], 0);
            Intent intent = new Intent(context, (Class<?>) MyAccountActivity.class);
            intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            action.t(AbstractC1980aC.j.f64010n);
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(new Pair[]{TuplesKt.to("NEW_FEATURE_INFO_LIST_KEY", TX.Ml.n(TX.w6.f10512O, context, getAlightSettingsUseCase))}, 1);
        Intent intent2 = new Intent(context, (Class<?>) NewFeaturePagerActivity.class);
        intent2.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
    }

    public static final C1983fuX rl(JSONObject jSONObject) {
        EnumC1973CN3 enumC1973CN3;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String strO = bIo.Wre.O(jSONObject, "destination");
        if (Intrinsics.areEqual(strO, "my_account")) {
            enumC1973CN3 = EnumC1973CN3.f63962n;
        } else {
            if (!Intrinsics.areEqual(strO, "v5_carousel")) {
                return null;
            }
            enumC1973CN3 = EnumC1973CN3.f63963t;
        }
        return new C1983fuX(enumC1973CN3);
    }
}
