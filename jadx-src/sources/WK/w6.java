package WK;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 {
    public static final List n(JSONArray jSONArray, Function1 transform) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object objInvoke = transform.invoke(Integer.valueOf(jSONArray.getInt(i2)));
            if (objInvoke != null) {
                listCreateListBuilder.add(objInvoke);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public static final List rl(JSONArray jSONArray, Function1 transform) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            Object objInvoke = transform.invoke(jSONObject);
            if (objInvoke != null) {
                listCreateListBuilder.add(objInvoke);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public static final List t(JSONArray jSONArray, Function1 transform) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Object objInvoke = transform.invoke(string);
            if (objInvoke != null) {
                listCreateListBuilder.add(objInvoke);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
