package i;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: i.Wre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC2166Wre {
    public static final C2165Ml rl(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            mapCreateMapBuilder.put(next, n(jSONObject2));
        }
        return new C2165Ml(MapsKt.build(mapCreateMapBuilder));
    }

    private static final C2169w6 n(JSONObject jSONObject) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            mapCreateMapBuilder.put(next, jSONObject.getString(next));
        }
        return new C2169w6(MapsKt.build(mapCreateMapBuilder));
    }
}
