package z8;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: z8.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC2488aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f76366n = new LinkedHashMap();

    public static final String n(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Map map = f76366n;
        Object objTrim = map.get(property);
        if (objTrim == null) {
            try {
                InputStream inputStream = Runtime.getRuntime().exec("getprop " + property).getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                try {
                    objTrim = StringsKt.trim(TextStreamsKt.readText(inputStreamReader), ' ', '\t', '\n', '\r');
                    CloseableKt.closeFinally(inputStreamReader, null);
                } finally {
                }
            } catch (IOException unused) {
                objTrim = "";
            }
            map.put(property, objTrim);
        }
        return (String) objTrim;
    }
}
