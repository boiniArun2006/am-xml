package f;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.ActivityResult;
import com.alightcreative.app.motion.activities.survey.SurveyActivity;
import f.Z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import xAo.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class afx {
    public static final ci nr(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONArray jSONArrayN = Ln.n(jSONObject, "questions");
        if (jSONArrayN == null) {
            jSONArrayN = new JSONArray();
        }
        JSONObject jSONObjectRl = Ln.rl(jSONObject, "localization");
        if (jSONObjectRl == null) {
            jSONObjectRl = new JSONObject();
        }
        return new ci(jSONArrayN, jSONObjectRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(sqD.w6 w6Var, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            w6Var.t(Z.j.f64008n);
        } else {
            w6Var.t(Z.n.f64009n);
        }
        return Unit.INSTANCE;
    }

    public static final Object rl(Context context, final sqD.w6 w6Var, ci ciVar, xAo.n nVar, Continuation continuation) {
        sqD.CN3 cn3Rl = w6Var.rl();
        Intent intent = new Intent(context, (Class<?>) SurveyActivity.class);
        intent.putExtra("hook", cn3Rl.getValue());
        intent.putExtras(ciVar.n());
        Object objRl = nVar.rl(intent, new Function1() { // from class: f.g9s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return afx.t(w6Var, (ActivityResult) obj);
            }
        }, continuation);
        if (objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objRl;
        }
        return Unit.INSTANCE;
    }
}
