package z;

import android.content.res.AssetManager;
import com.alightcreative.gl.ShaderSourceLoader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: z.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2477n implements ShaderSourceLoader {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AssetManager f76321n;
    private final String rl;

    public C2477n(AssetManager assetManager, String root) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f76321n = assetManager;
        this.rl = root;
    }

    @Override // com.alightcreative.gl.ShaderSourceLoader
    public String getSource(String shaderName) throws IOException {
        String str;
        Intrinsics.checkNotNullParameter(shaderName, "shaderName");
        if (StringsKt.isBlank(this.rl) || StringsKt.endsWith$default(this.rl, "/", false, 2, (Object) null)) {
            str = this.rl;
        } else {
            str = this.rl + "/";
        }
        InputStream inputStreamOpen = this.f76321n.open(str + shaderName);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return text;
        } finally {
        }
    }
}
